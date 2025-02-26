package dev.boofdev.blarium.permissions;

import net.minecraft.server.network.ServerPlayerEntity;

public class PlayerPermissionHandler {
    public static boolean hasPermission(ServerPlayerEntity player, String permission) {
        // Check OP levels first
        if (player.hasPermissionLevel(4)) return true; // Admins
        if (player.hasPermissionLevel(2) && permission.startsWith("blarium.command.give")) return true;
        
        // Check LuckPerms if available
        try {
            Class<?> luckPerms = Class.forName("net.luckperms.api.LuckPerms");
            return checkLuckPerms(player, permission);
        } catch (ClassNotFoundException e) {
            // Fallback to default permissions
            return switch (permission) {
                case "blarium.command.base" -> true;
                case "blarium.command.give.disc" -> true;
                default -> false;
            };
        }
    }

    private static boolean checkLuckPerms(ServerPlayerEntity player, String permission) {
        try {
            Object luckPermsApi = Class.forName("net.luckperms.api.LuckPermsProvider")
                                      .getMethod("get")
                                      .invoke(null);
            
            Object user = luckPermsApi.getClass()
                                     .getMethod("getUserManager")
                                     .invoke(luckPermsApi)
                                     .getClass()
                                     .getMethod("getUser", java.util.UUID.class)
                                     .invoke(null, player.getUuid());
            
            return (boolean) user.getClass()
                                .getMethod("hasPermission", String.class)
                                .invoke(user, permission);
        } catch (Exception e) {
            return false;
        }
    }
}