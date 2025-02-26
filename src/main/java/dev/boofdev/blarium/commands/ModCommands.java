package dev.boofdev.blarium.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import dev.boofdev.blarium.permissions.PlayerPermissionHandler;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.command.argument.IdentifierArgumentType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModCommands {
    
    private static final SuggestionProvider<ServerCommandSource> ITEM_SUGGESTIONS = 
        (context, builder) -> {
            Registries.ITEM.getIds().forEach(id -> builder.suggest(id.toString()));
            return CompletableFuture.completedFuture(builder.build());
        };

    public static class Permissions {
        public static final String BASE = "blarium.command.base";
        public static final String GIVE_DISC = "blarium.command.give.disc";
        public static final String GIVE_ALL = "blarium.command.give.all";
    }

    public static void init() {
        CommandRegistrationCallback.EVENT.register(ModCommands::registerCommands);
    }

    private static void registerCommands(CommandDispatcher<ServerCommandSource> dispatcher, 
                                       CommandRegistryAccess registryAccess,
                                       CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(CommandManager.literal("blarium")
            .requires(ModCommands::checkBasePermission)
            .then(CommandManager.literal("give")
                .then(CommandManager.argument("user", EntityArgumentType.player())
                    .then(CommandManager.argument("item", IdentifierArgumentType.identifier())
                        .suggests(ITEM_SUGGESTIONS)
                        .executes(context -> executeGiveCommand(context, 1))
                        .then(CommandManager.argument("count", IntegerArgumentType.integer(1))
                            .executes(context -> executeGiveCommand(
                                context, 
                                IntegerArgumentType.getInteger(context, "count")
                            ))
                        )
                    )
                )
            )
        );
    }

    private static boolean checkBasePermission(ServerCommandSource source) {
        return source.hasPermissionLevel(1) || 
               checkPermission(source, Permissions.BASE);
    }

    private static boolean checkPermission(ServerCommandSource source, String permission) {
        try {
            if (source.getPlayer() != null) {
                return PlayerPermissionHandler.hasPermission(source.getPlayer(), permission);
            }
            return true; // Allow non-players (console) by default
        } catch (Exception e) {
            return false;
        }
    }

    private static int executeGiveCommand(CommandContext<ServerCommandSource> context, int count) 
        throws CommandSyntaxException {
        
        ServerPlayerEntity target = EntityArgumentType.getPlayer(context, "user");
        Identifier itemId = IdentifierArgumentType.getIdentifier(context, "item");
        ServerPlayerEntity executor = context.getSource().getPlayer();
        Item item = Registries.ITEM.get(itemId);

        // Validate item exists
        if (item == Items.AIR) {
            context.getSource().sendError(Text.literal("Invalid item: " + itemId));
            return -1;
        }

        // Check permissions
        boolean isDisc = itemId.getPath().startsWith("disc_");
        String requiredPermission = isDisc ? Permissions.GIVE_DISC : Permissions.GIVE_ALL;
        
        if (!checkPermission(context.getSource(), requiredPermission)) {
            context.getSource().sendError(Text.literal(
                "You don't have permission to give " + (isDisc ? "discs" : "this item")
            ));
            return -1;
        }

        // Execute give command
        ItemStack stack = new ItemStack(item, count);
        target.giveItemStack(stack);

        context.getSource().sendFeedback(
            () -> Text.translatable("commands.blarium.give.success", count, item.getName(), target.getName()),
            true
        );
        return 1;
    }
}