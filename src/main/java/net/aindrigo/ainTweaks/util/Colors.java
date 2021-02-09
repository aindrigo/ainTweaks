package net.aindrigo.ainTweaks.util;

import org.bukkit.ChatColor;

public class Colors {
    private static ChatColor regularColor = ChatColor.BLUE;
    private static ChatColor errorColor = ChatColor.DARK_RED;
    private static ChatColor successColor = ChatColor.GREEN;

    public static ChatColor getErrorColor() {
        return errorColor;
    }

    public static ChatColor getRegularColor() {
        return regularColor;
    }

    public static ChatColor getSuccessColor() {
        return successColor;
    }
}
