package dev.boofdev.blarium.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
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
    
    // Suggestion provider for item IDs
    private static final SuggestionProvider<ServerCommandSource> ITEM_SUGGESTIONS = 
        (context, builder) -> {
            Registries.ITEM.getIds().forEach(id -> builder.suggest(id.toString()));
            return CompletableFuture.completedFuture(builder.build());
        };

    public static void init() {
        CommandRegistrationCallback.EVENT.register(ModCommands::registerCommands);
    }

    private static void registerCommands(CommandDispatcher<ServerCommandSource> dispatcher, 
                                       CommandRegistryAccess registryAccess,
                                       CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(CommandManager.literal("blarium")
            .requires(source -> source.hasPermissionLevel(2))
            .then(CommandManager.literal("give")
                .then(CommandManager.argument("user", EntityArgumentType.player())
                    .then(CommandManager.argument("item", IdentifierArgumentType.identifier())
                        .suggests(ITEM_SUGGESTIONS)
                        // Branch without count (defaults to 1)
                        .executes(context -> executeGiveCommand(context, 1))
                        // Branch with count
                        .then(CommandManager.argument("count", IntegerArgumentType.integer(1))
                            .executes(context -> executeGiveCommand(
                                context, 
                                IntegerArgumentType.getInteger(context, "count"))
                            ))
                    )
                )
            )
        );
    }

    private static int executeGiveCommand(CommandContext<ServerCommandSource> context, int count) 
        throws CommandSyntaxException {
        
        ServerPlayerEntity player = EntityArgumentType.getPlayer(context, "user");
        Identifier itemId = IdentifierArgumentType.getIdentifier(context, "item");
        Item item = Registries.ITEM.get(itemId);

        if (item == Items.AIR) {
            context.getSource().sendError(Text.literal("Invalid item: " + itemId));
            return -1;
        }

        ItemStack stack = new ItemStack(item, count);
        player.giveItemStack(stack);

        context.getSource().sendFeedback(
            () -> Text.translatable("commands.blarium.give.success", count, item.getName(), player.getName()),
            true
        );
        return 1;
    }
}