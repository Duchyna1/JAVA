package items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Items extends JavaPlugin {
    void gap(){
        // item (item)
        ItemStack item = new ItemStack(Material.GOLDEN_APPLE);
        //get meta from item
        ItemMeta meta = item.getItemMeta();

        // set item display name (color + name)
        meta.setDisplayName(ChatColor.GOLD + "Gap");
        // apply new meta
        item.setItemMeta(meta);
        // add enchantments (enchantment, level)
        // item.addEnchantment(Enchantment.KNOCKBACK, 2);

        // key
        NamespacedKey key = new NamespacedKey(this, "golden_apple");
        // recipe
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        // recipe shape
        recipe.shape(" g ", "gag", " g ");
        // recipe ingredients (position from shape, material)
        recipe.setIngredient('g', Material.GOLD_INGOT);
        recipe.setIngredient('a', Material.APPLE);
        // adding recipe
        getServer().addRecipe(recipe);
    }

    void notch(){
        // item (item)
        ItemStack item = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
        //get meta from item
        ItemMeta meta = item.getItemMeta();

        // set item display name (color + name)
        meta.setDisplayName(ChatColor.MAGIC + "Notch apple");
        // apply new meta
        item.setItemMeta(meta);
        // add enchantments (enchantment, level)
        // item.addEnchantment(Enchantment.VANISHING_CURSE, 1);

        // key
        NamespacedKey key = new NamespacedKey(this, "notch_apple");
        // recipe
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        // recipe shape
        recipe.shape(" b ", "bab", " b ");
        // recipe ingredients (position from shape, material)
        recipe.setIngredient('b', Material.GOLD_BLOCK);
        recipe.setIngredient('a', Material.APPLE);
        // adding recipe
        getServer().addRecipe(recipe);
    }

    void epic_mec(){
        // item (item)
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        //get meta from item
        ItemMeta meta = item.getItemMeta();

        // set item display name (color + name)
        meta.setDisplayName(ChatColor.BLUE + "Epic Sword");
        // apply new meta
        item.setItemMeta(meta);
        // add enchantments (enchantment, level)
        item.addEnchantment(Enchantment.KNOCKBACK, 2);
        item.addEnchantment(Enchantment.DAMAGE_ALL, 5);
        item.addEnchantment(Enchantment.FIRE_ASPECT, 2);
        item.addEnchantment(Enchantment.SWEEPING_EDGE, 1);

        // key
        NamespacedKey key = new NamespacedKey(this, "epic_sword");
        // recipe
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        // recipe shape
        recipe.shape(" d ", " g ", " s ");
        // recipe ingredients (position from shape, material)
        recipe.setIngredient('d', Material.DIAMOND_BLOCK);
        recipe.setIngredient('g', Material.GOLD_BLOCK);
        recipe.setIngredient('s', Material.STICK);
        // adding recipe
        getServer().addRecipe(recipe);
    }

    void addRecipes(){
        gap();
        notch();
        epic_mec();
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        addRecipes();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
