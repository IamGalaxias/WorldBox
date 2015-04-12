package nl.galaxias.worldbox;

import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Galaxias on 12-04-15 (16:08).
 * This file is part of WorldBox in the package nl.galaxias.worldbox.
 */
public class WorldBox extends JavaPlugin {
    private static Plugin plugin;
    private static String prefix = ChatColor.WHITE + "[" + ChatColor.AQUA + "WorldBox" + ChatColor.WHITE + "]" + " ";
    private static String nopermission = prefix + ChatColor.RED + "You do not have permission to execute this command!";

    public void onEnable() {
        plugin = this;
    }

    public void onDisable() {
        plugin = null;
    }

    public static Plugin getPlugin() {
        return plugin;
    }

    public static String getPrefix() {
        return prefix;
    }

    public static String getNoPermission() {
        return nopermission;
    }
}