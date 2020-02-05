package eventHandlers;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class pandaDamage implements Listener {
    @EventHandler
    public void onDammage(EntityDamageByEntityEvent event){
        EntityType entity = event.getEntityType();

        if (entity.equals(EntityType.PANDA)){
            if (event.getDamager() instanceof Player){
                Player player = (Player) event.getDamager();
                player.sendMessage(ChatColor.RED + "Don't hurt pandas you donkey!!!!");
            }
        }
    }
}
