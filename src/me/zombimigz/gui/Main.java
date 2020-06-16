package me.zombimigz.gui;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import me.zombimigz.gui.commands.Lobby;
import me.zombimigz.gui.events.InventoryClick;

public class Main extends JavaPlugin implements Listener{
	
	public Inventory inv;
		
	
	@Override
	public void onEnable(){
		this.getCommand("Lobby").setExecutor(new Lobby(this));
		this.getServer().getPluginManager().registerEvents(new InventoryClick(this), this);
		createInv();
	}
	@Override
	public void onDisable() {
		
	}
	
	
	
	
	
	
	
	
	public void createInv() {
		inv = Bukkit.createInventory(null, 9, ChatColor.GOLD+""+ChatColor.BOLD+"Select A Team");
		
		ItemStack item = new ItemStack(Material.IRON_BLOCK);
		ItemMeta meta = item.getItemMeta();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.DARK_PURPLE + "Click to change server");
		
		meta.setDisplayName(ChatColor.BLUE + "City Server");
		meta.setLore(lore);
		item.setItemMeta(meta);
		inv.setItem(0, item);
		
		meta.setDisplayName(ChatColor.GOLD + "Medieval Server");
		item.setType(Material.WOODEN_SWORD);
		meta.setLore(lore);
		item.setItemMeta(meta);
		inv.setItem(1, item);
		
	}
}
