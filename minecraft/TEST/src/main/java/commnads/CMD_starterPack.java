package commnads;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class CMD_starterPack implements CommandExecutor {

    static void sword(Player player){
        // getting items and metas
        ItemStack sword = new ItemStack(Material.STONE_SWORD, 1);
        ItemMeta swordMeta = sword.getItemMeta();

        // setting name
        swordMeta.setDisplayName(ChatColor.GRAY + "YEET SWORD");

        // setting lore
        ArrayList<String> swordLore = new ArrayList<String>();
        swordLore.add("THAT'S A LOT OF DAMAGE");
        swordMeta.setLore(swordLore);

        // setting meta
        sword.setItemMeta(swordMeta);

        // adding enchantments
        sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);

        // adding items to inventory
        player.getInventory().addItem(sword);
    }

    static void pickaxe(Player player){
        // getting items and metas
        ItemStack pickaxe = new ItemStack(Material.STONE_PICKAXE, 1);
        ItemMeta pickaxeMeta = pickaxe.getItemMeta();

        // setting name
        pickaxeMeta.setDisplayName(ChatColor.GRAY + "YEET PICKAXE");

        // setting lore
        ArrayList<String> pickaxeLore = new ArrayList<String>();
        pickaxeLore.add("FREE KLADIVKO");
        pickaxeMeta.setLore(pickaxeLore);

        // setting meta
        pickaxe.setItemMeta(pickaxeMeta);

        // adding enchantments
        pickaxe.addEnchantment(Enchantment.DIG_SPEED, 1);

        // adding items to inventory
        player.getInventory().addItem(pickaxe);
    }

    static void shovel(Player player){
        // getting items and metas
        ItemStack shovel = new ItemStack(Material.STONE_SHOVEL, 1);
        ItemMeta shovelMeta = shovel.getItemMeta();

        // setting name
        shovelMeta.setDisplayName(ChatColor.GRAY + "YEET SHOVEL");

        // setting lore
        ArrayList<String> shovelLore = new ArrayList<String>();
        shovelLore.add("FREE LYZICKA");
        shovelMeta.setLore(shovelLore);

        // setting meta
        shovel.setItemMeta(shovelMeta);

        // adding enchantments
        shovel.addEnchantment(Enchantment.DIG_SPEED, 1);

        // adding items to inventory
        player.getInventory().addItem(shovel);
    }

    static void axe(Player player){
        // getting items and metas
        ItemStack axe = new ItemStack(Material.STONE_AXE, 1);
        ItemMeta axeMeta = axe.getItemMeta();

        // setting name
        axeMeta.setDisplayName(ChatColor.GRAY + "YEET AXE");

        // setting lore
        ArrayList<String> axeLore = new ArrayList<String>();
        axeLore.add("FREE VRECKOVY MOZAX");
        axeMeta.setLore(axeLore);

        // setting meta
        axe.setItemMeta(axeMeta);

        // adding enchantments
        axe.addEnchantment(Enchantment.DIG_SPEED, 1);

        // adding items to inventory
        player.getInventory().addItem(axe);
    }

    static void food(Player player){
        // getting items and metas
        ItemStack food = new ItemStack(Material.GOLDEN_CARROT, 16);
        ItemMeta foodMeta = food.getItemMeta();

        // setting name
        foodMeta.setDisplayName(ChatColor.GRAY + "FREE FOOD");

        // setting lore
        ArrayList<String> foodLore = new ArrayList<String>();
        foodLore.add("FREE KEPAB");
        foodMeta.setLore(foodLore);

        // setting meta
        food.setItemMeta(foodMeta);

        // adding items to inventory
        player.getInventory().addItem(food);
    }

    static void head(Player player){
        // getting items and metas
        ItemStack head = new ItemStack(Material.DRAGON_HEAD, 1);
        ItemMeta headMeta = head.getItemMeta();

        // setting name
        headMeta.setDisplayName(ChatColor.DARK_PURPLE + "DRAGON BRO");

        // setting lore
        ArrayList<String> headLore = new ArrayList<String>();
        headLore.add("HLAVA KRALA POTKANA");
        headMeta.setLore(headLore);

        // hiding information
        headMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        // setting meta
        head.setItemMeta(headMeta);

        // adding enchantments
        head.addEnchantment(Enchantment.BINDING_CURSE, 1);

        // adding items to inventory
        player.getInventory().setHelmet(head);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player){
            sword(player);
            pickaxe(player);
            shovel(player);
            axe(player);
            food(player);
            head(player);
        }
        return true;
    }
}
