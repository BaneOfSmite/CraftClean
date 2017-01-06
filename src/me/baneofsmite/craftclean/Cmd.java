package me.baneofsmite.craftclean;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.baneofsmite.craftclean.Main;

public class Cmd implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String cmdlabel, String[] args) {
		Player p = (Player) sender;
		if (args.length == 1) {
			if (args[0].equalsIgnoreCase("enable")) {
				p.sendMessage(Main.getPrefix() + ChatColor.GRAY + " You Enabled CraftClean!");
				Main.craftclean = true;
			} else if (args[0].equalsIgnoreCase("disable")) {
				p.sendMessage(Main.getPrefix() + ChatColor.GRAY + " You Disabled CraftClean!");
				Main.craftclean = false;
			}
		}
		return true;
	}

}
