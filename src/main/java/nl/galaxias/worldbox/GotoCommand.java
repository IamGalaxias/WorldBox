package nl.galaxias.worldbox;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Galaxias on 12-04-15 (16:41).
 * This file is part of WorldBox in the package nl.galaxias.worldbox.
 */
public class GotoCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("goto")) {
            if (args.length == 0) {
                if (sender.hasPermission("worldbox.goto")) {
                    String worldname = args[0];

                    player.teleport(Bukkit.getServer().getWorld(worldname).getSpawnLocation());
                }
                else if (!(sender.hasPermission("worldbox.goto"))) {
                    sender.sendMessage(WorldBox.getNoPermission());
                }
            }
            else {
                sender.sendMessage(WorldBox.getPrefix() + ChatColor.RED + "/goto name");
            }
            return true;
        }
        return false;
    }
}