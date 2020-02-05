package commnads;

import org.bukkit.Effect;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_spawn implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
                Player player = (Player) sender;
                player.getWorld().playEffect(player.getLocation(), Effect.SMOKE, 0);

                // teleport player to spawn
                player.teleport(player.getWorld().getSpawnLocation());

                player.getWorld().playEffect(player.getLocation(), Effect.PORTAL_TRAVEL, 0);
        }
        return true;
    }
}
