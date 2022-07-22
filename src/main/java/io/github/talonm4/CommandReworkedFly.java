package io.github.talonm4;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandReworkedFly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if(sender instanceof Player) {
        if (sender.hasPermission("allow.fly")) {
            if (args.length == 0) {
                Player selfcast = (Player) sender;
                if(selfcast.getAllowFlight() == true){
                    selfcast.setAllowFlight(false);
                    selfcast.sendMessage("You disabled your own flight");}
                else{
                    selfcast.setAllowFlight(true);
                    selfcast.sendMessage("You enabled your own flight");}}

            else{
                Player target = Bukkit.getPlayerExact(args[0]);
                Player giver = (Player) sender;
                if(target.getAllowFlight() == true){
                    target.setAllowFlight(false);
                    target.sendMessage("Your flight has been disabled");
                    giver.sendMessage("You disabled flight for " + target.getName());}
                else{target.setAllowFlight(true);
                target.sendMessage("Your flight has been enabled");
                giver.sendMessage("You have enabled flight for " + target.getName());}
                }
            }
        }
    else{
        Player target = Bukkit.getPlayerExact(args[0]);
        if(target.getAllowFlight() == true){
            target.setAllowFlight(false);
            target.sendMessage("Your flight has been disabled");}
        else{target.setAllowFlight(true);
            target.sendMessage("Your flight has been enabled");}
    }return true;
    }

}
