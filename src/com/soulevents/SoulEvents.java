package com.soulevents;

import org.bukkit.plugin.java.JavaPlugin;
import com.soulevents.listeners.PlayerKillListener;
import com.soulevents.commands.SoulEventsCommand;

public class SoulEvents extends JavaPlugin {

    private static SoulEvents instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("SoulEvents enabled!");
        getServer().getPluginManager().registerEvents(new PlayerKillListener(), this);
        getCommand("soulevents").setExecutor(new SoulEventsCommand());
        saveDefaultConfig();
    }

    public static SoulEvents getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        getLogger().info("SoulEvents disabled!");
    }
}
