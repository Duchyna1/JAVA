import commnads.CMD_heal;
import commnads.CMD_pet;
import commnads.CMD_spawn;
import commnads.CMD_starterPack;
import eventHandlers.joinMessage;
import eventHandlers.pandaDamage;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // terminal output
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "TEST Enabled!");

        // adding class
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new joinMessage(), this);
        getServer().getPluginManager().registerEvents(new pandaDamage(), this);

        // adding commands
        getCommand("spawn").setExecutor(new CMD_spawn());
        getCommand("starterpack").setExecutor(new CMD_starterPack());
        getCommand("heal").setExecutor(new CMD_heal());
        getCommand("pet").setExecutor(new CMD_pet());
    }

    @Override
    public void onDisable(){
        // terminal output
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Disabled!");
    }
}
