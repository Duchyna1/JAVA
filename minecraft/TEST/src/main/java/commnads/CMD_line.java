package commnads;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_line implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            Location location = player.getLocation();
            for (int t = 0; t<100; t++){
                player.getWorld().playEffect(location, Effect.FIREWORK_SHOOT, 0);
            }
        }
        return true;
    }
}
