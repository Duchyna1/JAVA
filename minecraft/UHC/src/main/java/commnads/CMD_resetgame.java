package commnads;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class CMD_resetgame implements CommandExecutor {

    void border(World world){
        WorldBorder border = world.getWorldBorder();
        border.setSize(750.0);
    }

    void addGlass(World world){
        List<Location> locations = new ArrayList<>();
        // TODO add locations
        locations.add(new Location(world, 10.0, 22.0, 10.0));
        locations.add(new Location(world, 10.0, 22.0, -10.0));
        locations.add(new Location(world, -10.0, 22.0, 10.0));
        locations.add(new Location(world, -10.0, 22.0, -10.0));

        for (Location location : locations){
            Block block = world.getBlockAt(location);
            if (location.getBlockX() > 0 && location.getBlockY() > 0){
                block.setType(Material.RED_STAINED_GLASS);
            } else if (location.getBlockX() < 0 && location.getBlockY() > 0) {
                block.setType(Material.BLUE_STAINED_GLASS);
            } else if (location.getBlockX() > 0 && location.getBlockY() < 0) {
                block.setType(Material.GREEN_STAINED_GLASS);
            } else if (location.getBlockX() < 0 && location.getBlockY() < 0) {
                block.setType(Material.PURPLE_STAINED_GLASS);
            }
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player op = (Player) sender;

            // setting world border
            border(op.getWorld());

            // reset spawns
            addGlass(op.getWorld());

            List<Player> onlinePlayers = new ArrayList<>(Bukkit.getOnlinePlayers());
            for (Player player : onlinePlayers){
                player.getInventory().clear();
                player.teleport(player.getWorld().getSpawnLocation());
                player.setGameMode(GameMode.ADVENTURE);
            }
        }
        return true;
    }
}
