package items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class craftings implements Listener {

    /*
     TODO books
     TODO totem of undying
     TODO unbreaking rod
     TODO apples
    */

    void gap(Server server){
        // item (item)
        ItemStack item = new ItemStack(Material.GOLDEN_APPLE);
        //get meta from item
        ItemMeta meta = item.getItemMeta();

        // set item display name (color + name)
        meta.setDisplayName(ChatColor.GOLD + "Gap");
        // apply new meta
        item.setItemMeta(meta);

        // recipe
        ShapedRecipe recipe = new ShapedRecipe(item);
        // recipe shape
        recipe.shape(" g ", "gag", " g ");
        // recipe ingredients (position from shape, material)
        recipe.setIngredient('g', Material.GOLD_INGOT);
        recipe.setIngredient('a', Material.APPLE);
        // adding recipe
        server.addRecipe(recipe);
    }

    void notch(Server server){
        // item (item)
        ItemStack item = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
        //get meta from item
        ItemMeta meta = item.getItemMeta();

        // set item display name (color + name)
        meta.setDisplayName(ChatColor.DARK_PURPLE + "Notch apple");
        // apply new meta
        item.setItemMeta(meta);

        // recipe
        ShapedRecipe recipe = new ShapedRecipe(item);
        // recipe shape
        recipe.shape(" b ", "bab", " b ");
        // recipe ingredients (position from shape, material)
        recipe.setIngredient('b', Material.GOLD_BLOCK);
        recipe.setIngredient('a', Material.APPLE);
        // adding recipe
        server.addRecipe(recipe);
    }

    void goldIngot(Server server){
        // item (item)
        ItemStack item = new ItemStack(Material.GOLD_INGOT, 16);

        // recipe
        ShapedRecipe recipe = new ShapedRecipe(item);
        // recipe shape
        recipe.shape("ggg", "gcg", "ggg");
        // recipe ingredients (position from shape, material)
        recipe.setIngredient('g', Material.GOLD_INGOT);
        recipe.setIngredient('c', Material.COAL);
        // adding recipe
        server.addRecipe(recipe);
    }

    void ironIngot(Server server){
        // item (item)
        ItemStack item = new ItemStack(Material.IRON_INGOT, 16);

        // recipe
        ShapedRecipe recipe = new ShapedRecipe(item);
        // recipe shape
        recipe.shape("iii", "ici", "iii");
        // recipe ingredients (position from shape, material)
        recipe.setIngredient('i', Material.IRON_INGOT);
        recipe.setIngredient('c', Material.COAL);
        // adding recipe
        server.addRecipe(recipe);
    }

    void ironPickaxe(Server server){
        // item (item)
        ItemStack item = new ItemStack(Material.IRON_PICKAXE);

        // add enchantments (enchantment, level)
        item.addEnchantment(Enchantment.DIG_SPEED, 1);
        item.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);

        // recipe
        ShapedRecipe recipe = new ShapedRecipe(item);
        // recipe shape
        recipe.shape("iii", " s ", " s ");
        // recipe ingredients (position from shape, material)
        recipe.setIngredient('i', Material.IRON_INGOT);
        recipe.setIngredient('s', Material.STICK);
        // adding recipe
        server.addRecipe(recipe);
    }

    void diamondPickaxe(Server server){
        // item (item)
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);

        // add enchantments (enchantment, level)
        item.addEnchantment(Enchantment.DIG_SPEED, 1);
        item.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);

        // recipe
        ShapedRecipe recipe = new ShapedRecipe(item);
        // recipe shape
        recipe.shape("ddd", " s ", " s ");
        // recipe ingredients (position from shape, material)
        recipe.setIngredient('d', Material.DIAMOND);
        recipe.setIngredient('s', Material.STICK);
        // adding recipe
        server.addRecipe(recipe);
    }

    void ironAxe(Server server){
        // item (item)
        ItemStack item = new ItemStack(Material.IRON_AXE);

        // add enchantments (enchantment, level)
        item.addEnchantment(Enchantment.DIG_SPEED, 1);

        // recipe
        ShapedRecipe recipe = new ShapedRecipe(item);
        // recipe shape
        recipe.shape("ii ", "is ", " s ");
        // recipe ingredients (position from shape, material)
        recipe.setIngredient('i', Material.IRON_INGOT);
        recipe.setIngredient('s', Material.STICK);
        // adding recipe
        server.addRecipe(recipe);
    }

    void diamondAxe(Server server){
        // item (item)
        ItemStack item = new ItemStack(Material.DIAMOND_AXE);

        // add enchantments (enchantment, level)
        item.addEnchantment(Enchantment.DIG_SPEED, 1);

        // recipe
        ShapedRecipe recipe = new ShapedRecipe(item);
        // recipe shape
        recipe.shape("dd ", "ds ", " s ");
        // recipe ingredients (position from shape, material)
        recipe.setIngredient('d', Material.DIAMOND);
        recipe.setIngredient('s', Material.STICK);
        // adding recipe
        server.addRecipe(recipe);
    }

    void ironShovel(Server server){
        // item (item)
        ItemStack item = new ItemStack(Material.IRON_SHOVEL);

        // add enchantments (enchantment, level)
        item.addEnchantment(Enchantment.DIG_SPEED, 1);

        // recipe
        ShapedRecipe recipe = new ShapedRecipe(item);
        // recipe shape
        recipe.shape(" i ", " s ", " s ");
        // recipe ingredients (position from shape, material)
        recipe.setIngredient('i', Material.IRON_INGOT);
        recipe.setIngredient('s', Material.STICK);
        // adding recipe
        server.addRecipe(recipe);
    }

    void diamondShovel(Server server){
        // item (item)
        ItemStack item = new ItemStack(Material.DIAMOND_SHOVEL);

        // add enchantments (enchantment, level)
        item.addEnchantment(Enchantment.DIG_SPEED, 1);

        // recipe
        ShapedRecipe recipe = new ShapedRecipe(item);
        // recipe shape
        recipe.shape(" d ", " s ", " s ");
        // recipe ingredients (position from shape, material)
        recipe.setIngredient('d', Material.DIAMOND);
        recipe.setIngredient('s', Material.STICK);
        // adding recipe
        server.addRecipe(recipe);
    }

    void book(Server server){
        // item (item)
        ItemStack item = new ItemStack(Material.BOOK);

        // recipe
        ShapedRecipe recipe = new ShapedRecipe(item);
        // recipe ingredients
        recipe.setIngredient('p', Material.PAPER);
        recipe.setIngredient('l', Material.LEATHER);
        // adding recipe
        server.addRecipe(recipe);
    }

    public void addRecipes(Server server) {
        gap(server);
        notch(server);

        goldIngot(server);
        ironIngot(server);

        ironPickaxe(server);
        ironAxe(server);
        ironShovel(server);

        diamondPickaxe(server);
        diamondAxe(server);
        diamondShovel(server);

        // book(server);
    }
}
