package commnads;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;

public class CMD_start implements CommandExecutor {

    void elytra(Player player){
        ItemStack elytra = new ItemStack(Material.ELYTRA);

        elytra.setDurability((short) 1);

        player.getInventory().setChestplate(elytra);
    }

    void pickaxe(Player player){
        ItemStack item = new ItemStack(Material.STONE_PICKAXE);
        item.addEnchantment(Enchantment.DIG_SPEED, 1);
        player.getInventory().addItem(item);
    }

    void axe(Player player){
        ItemStack item = new ItemStack(Material.STONE_AXE);
        item.addEnchantment(Enchantment.DIG_SPEED, 1);
        player.getInventory().addItem(item);
    }

    void shovel(Player player){
        ItemStack item = new ItemStack(Material.STONE_SHOVEL);
        item.addEnchantment(Enchantment.DIG_SPEED, 1);
        player.getInventory().addItem(item);
    }

    void food(Player player){
        ItemStack item = new ItemStack(Material.GOLDEN_CARROT, 16);
        player.getInventory().addItem(item);
    }

    void removeGlass(World world){
        List<Location> locations = new ArrayList<>();
        // TODO add locations
        locations.add(new Location(world, 10.0, 22.0, 10.0));
        locations.add(new Location(world, 10.0, 22.0, -10.0));
        locations.add(new Location(world, -10.0, 22.0, 10.0));
        locations.add(new Location(world, -10.0, 22.0, -10.0));

        for (Location location : locations){
            Block block = world.getBlockAt(location);
            block.setType(Material.AIR);
        }
    }

    void border(World world){
        WorldBorder border = world.getWorldBorder();
        border.setSize(750.0);
        border.setSize(3.0, 60*30);
    }

    void nightVision(Player player){
        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1728000, 1));
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player op = (Player) sender;
            // gets players
            List<Player> onlinePlayers = new ArrayList<>(Bukkit.getOnlinePlayers());
            for (Player player : onlinePlayers){
                nightVision(player);
                elytra(player);
                pickaxe(player);
                axe(player);
                shovel(player);
                food(player);
                player.setGameMode(GameMode.SURVIVAL);
            }
            removeGlass(op.getWorld());
            border(op.getWorld());
        }

        return true;
    }
}
