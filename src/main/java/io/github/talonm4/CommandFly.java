/*package io.github.talonm4;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("allow.fly")) {
                if (args.length == 0) {
                    Player selfcast = (Player) sender;
                    selfcast.setAllowFlight(!selfcast.getAllowFlight());
                    if (selfcast.getAllowFlight()) {
                        selfcast.sendMessage("You just enabled your own fly");
                    } else {
                        selfcast.sendMessage("You just disabled you own fly");
                    }
                } else {
                    Player target = Bukkit.getPlayerExact(args[0]);
                    target.setAllowFlight(!target.getAllowFlight());
                    Player activator = (Player) sender;
                    if (target.getAllowFlight()) {
                        target.sendMessage("Your flight has been enabled");
                        activator.sendMessage("You have enabled fly for " + target.getName());
                    } else {
                        activator.sendMessage("You have disabled fly for " + target.getName());
                        target.sendMessage("Your flight has been disabled");
                    }
                }
            }
            return true;
        }else{Player target = Bukkit.getPlayerExact(args[0]);
            target.setAllowFlight(!target.getAllowFlight());
            if (target.getAllowFlight()) {
                target.sendMessage("Your flight has been enabled");}
            else{target.sendMessage("Your flight has been disabled");}
    }return true;
}}

 */