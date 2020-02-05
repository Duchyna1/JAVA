import commnads.CMD_resetgame;
import commnads.CMD_start;

import eventHandlers.DeathSpectator;
import eventHandlers.Teleportation;
import items.craftings;

import org.bukkit.*;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // TODO add map
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "UHC Enabled!");

        // adding classes
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new Teleportation(), this);
        getServer().getPluginManager().registerEvents(new DeathSpectator(), this);

        craftings addCrafting = new craftings();
        addCrafting.addRecipes(getServer());

        // commands
        getCommand("start").setExecutor(new CMD_start());
        getCommand("resetgame").setExecutor(new CMD_resetgame());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "UHC Disabled!");
    }
}
