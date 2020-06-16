package me.zombimigz.gui.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.zombimigz.gui.Main;

public class InventoryClick implements Listener{
	
	
	Main plugin;
	public InventoryClick(Main instance) {
		plugin = instance;
	}


	@EventHandler()
	public void onClick(InventoryClickEvent event) {
		Player p = (Player) event.getWhoClicked();
		if (event.getClickedInventory() != plugin.inv) return;
		if (event.getCurrentItem().getType() == Material.IRON_BLOCK) {
			p.chat("/server city");
		}
		if (event.getCurrentItem().getType() == Material.WOODEN_SWORD) {
			event.getWhoClicked().sendMessage("You joined the blue team");
			p.chat("/server medieval");
		}
			
		
		event.setCancelled(true);
		event.getWhoClicked().closeInventory();
	}
}
