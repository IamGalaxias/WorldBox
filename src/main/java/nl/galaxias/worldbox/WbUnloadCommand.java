package nl.galaxias.worldbox;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by Galaxias on 12-04-15 (16:39).
 * This file is part of WorldBox in the package nl.galaxias.worldbox.
 */
public class WbUnloadCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("wbunload")) {
            if (args.length == 0) {
                if (sender.hasPermission("worldbox.unload")) {
                    String worldname = args[0];

                    Bukkit.getServer().unloadWorld(worldname, true);
                }
                else if (!(sender.hasPermission("worldbox.unload"))) {
                    sender.sendMessage(WorldBox.getNoPermission());

                    return false;
                }
            }
            else {
                sender.sendMessage(WorldBox.getPrefix() + ChatColor.RED + "/wbunload name");
            }
            return true;
        }
        return false;
    }
}