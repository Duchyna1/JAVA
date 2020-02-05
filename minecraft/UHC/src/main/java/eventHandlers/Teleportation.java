package eventHandlers;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Teleportation implements Listener {
//        TODO add team spawns

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        Action action = event.getAction();

        Location redSpawn = new Location(player.getWorld(), 10.0, 23.0, 10.0);
        Location blueSpawn = new Location(player.getWorld(), -10.0, 23.0, 10.0);
        Location greenSpawn = new Location(player.getWorld(), 10.0, 23.0, -10.0);
        Location purpleSpawn = new Location(player.getWorld(), -10.0, 23.0, -10.0);

        if (action.equals(Action.RIGHT_CLICK_BLOCK)){
            Material material = block.getType();

            if (material.equals(Material.RED_CONCRETE)){
                player.teleport(redSpawn);
            }
            if (material.equals(Material.BLUE_CONCRETE)){
                player.teleport(blueSpawn);
            }
            if (material.equals(Material.GREEN_CONCRETE)){
                player.teleport(greenSpawn);
            }
            if (material.equals(Material.PURPLE_CONCRETE)){
                player.teleport(purpleSpawn);
            }
        }
    }
}
