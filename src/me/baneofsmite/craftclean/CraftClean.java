package me.baneofsmite.craftclean;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;

import me.baneofsmite.craftclean.Main;

public class CraftClean implements Listener {

	@EventHandler
	public void OnCraft(CraftItemEvent eve) {
		if (Main.getCraftclean() == false) {
			if (eve.getInventory().getResult() == null) {
				return;
			}
			Material gt = eve.getInventory().getResult().getType();
			Material centre = eve.getInventory().getMatrix()[4].getType();
			Player p = (Player) eve.getWhoClicked();
			if (gt == Material.IRON_INGOT || gt == Material.GOLD_INGOT || gt == Material.COOKED_BEEF
					|| gt == Material.COOKED_CHICKEN || gt == Material.COOKED_MUTTON || gt == Material.COOKED_RABBIT
					|| gt == Material.GRILLED_PORK) {
				if (centre == Material.COAL) {
					eve.getInventory().setResult(new ItemStack(Material.AIR, 1));
					p.sendMessage(Main.getPrefix() + ChatColor.RED + " CraftClean Is Disabled!");
				}
			}
		}
	}
}
