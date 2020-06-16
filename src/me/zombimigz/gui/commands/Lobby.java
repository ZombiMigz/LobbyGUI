package me.zombimigz.gui.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.zombimigz.gui.Main;

public class Lobby implements CommandExecutor{
	
	Main plugin;
	public Lobby(Main instance){
		plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("lobby"))
			if (!(sender instanceof Player)) {
				sender.sendMessage("console cannot use this command");
				return true;
			}
			Player p = (Player) sender;
			p.openInventory(plugin.inv);
		return false;
	}
	
}
