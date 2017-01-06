package me.baneofsmite.craftclean;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public static String prefix = ChatColor.GOLD + "CraftClean" + ChatColor.DARK_GRAY + " >";
	public static boolean craftclean = false;

	@Override
	public void onEnable() {
		getCommand("craftclean").setExecutor(new Cmd());
		getServer().getPluginManager().registerEvents((Listener) new CraftClean(), this);
		ItemStack cci = new ItemStack(Material.IRON_INGOT, 8);
		ItemStack ccg = new ItemStack(Material.GOLD_INGOT, 8);
		ItemStack ccb = new ItemStack(Material.COOKED_BEEF, 8);
		ItemStack ccr = new ItemStack(Material.COOKED_RABBIT, 8);
		ItemStack ccm = new ItemStack(Material.COOKED_MUTTON, 8);
		ItemStack ccp = new ItemStack(Material.GRILLED_PORK, 8);
		ItemStack ccc = new ItemStack(Material.COOKED_CHICKEN, 8);
		ShapedRecipe ccci = new ShapedRecipe(cci);
		ShapedRecipe cccg = new ShapedRecipe(ccg);
		ShapedRecipe cccb = new ShapedRecipe(ccb);
		ShapedRecipe cccr = new ShapedRecipe(ccr);
		ShapedRecipe cccm = new ShapedRecipe(ccm);
		ShapedRecipe cccp = new ShapedRecipe(ccp);
		ShapedRecipe cccc = new ShapedRecipe(ccc);
		ccci.shape("AAA", "ABA", "AAA");
		cccg.shape("AAA", "ABA", "AAA");
		cccb.shape("AAA", "ABA", "AAA");
		cccr.shape("AAA", "ABA", "AAA");
		cccm.shape("AAA", "ABA", "AAA");
		cccp.shape("AAA", "ABA", "AAA");
		cccc.shape("AAA", "ABA", "AAA");
		ccci.setIngredient('A', Material.IRON_ORE);
		cccg.setIngredient('A', Material.GOLD_ORE);
		cccb.setIngredient('A', Material.RAW_BEEF);
		cccr.setIngredient('A', Material.RABBIT);
		cccm.setIngredient('A', Material.MUTTON);
		cccp.setIngredient('A', Material.PORK);
		cccc.setIngredient('A', Material.RAW_CHICKEN);
		ccci.setIngredient('B', Material.COAL);
		cccg.setIngredient('B', Material.COAL);
		cccb.setIngredient('B', Material.COAL);
		cccr.setIngredient('B', Material.COAL);
		cccm.setIngredient('B', Material.COAL);
		cccp.setIngredient('B', Material.COAL);
		cccc.setIngredient('B', Material.COAL);
		Bukkit.addRecipe(ccci);
		Bukkit.addRecipe(cccg);
		Bukkit.addRecipe(cccm);
		Bukkit.addRecipe(cccr);
		Bukkit.addRecipe(cccc);
		Bukkit.addRecipe(cccp);
		Bukkit.addRecipe(cccb);
	}

	public static String getPrefix() {
		return prefix;
	}

	public static boolean getCraftclean() {
		return craftclean;
	}
}
