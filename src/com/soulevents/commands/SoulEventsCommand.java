package com.soulevents.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SoulEventsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        sender.sendMessage("§dSoulEvents §7v1.0 §8- §fPlugin PvP Eventów Dusz");
        return true;
    }
}
