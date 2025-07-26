package com.soulevents.listeners;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class PlayerKillListener implements Listener {

    public static HashMap<UUID, Integer> soulKills = new HashMap<>();

    @EventHandler
    public void onPlayerKill(PlayerDeathEvent event) {
        if (event.getEntity().getKiller() instanceof Player) {
            Player killer = event.getEntity().getKiller();
            UUID uuid = killer.getUniqueId();
            soulKills.put(uuid, soulKills.getOrDefault(uuid, 0) + 1);
            killer.sendMessage("§d+1 dusza! Twoje dusze: §b" + soulKills.get(uuid));
        }
    }
}
