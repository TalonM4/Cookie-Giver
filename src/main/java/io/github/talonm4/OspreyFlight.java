package io.github.talonm4;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OspreyFlight implements CommandExecutor {
    @Override
    public  boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
            if(sender.hasPermission("cookielord.fly")){
                for(Player p : org.bukkit.Bukkit.getOnlinePlayers()) {
                    if (p.getDisplayName().equals(args)){
                        p.setFlying(!p.getAllowFlight());
                    }
                }
            }return true;
    }
}

