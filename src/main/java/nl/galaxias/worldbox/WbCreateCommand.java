package nl.galaxias.worldbox;

import org.bukkit.ChatColor;
import org.bukkit.WorldCreator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by Galaxias on 12-04-15 (16:14).
 * This file is part of WorldBox in the package nl.galaxias.worldbox.
 */
public class WbCreateCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("wbcreate")) {
            if (args.length == 1) {
                if (sender.hasPermission("worldbox.create")) {
                    String worldname = args[0];

                    WorldCreator.name(worldname).createWorld();
                }
                else if (!(sender.hasPermission("worldbox.create"))) {
                    sender.sendMessage(WorldBox.getNoPermission());
                }
            }
            else {
                sender.sendMessage(WorldBox.getPrefix() + ChatColor.RED + "/wbcreate name");
            }
            return true;
        }
        return false;
    }
}