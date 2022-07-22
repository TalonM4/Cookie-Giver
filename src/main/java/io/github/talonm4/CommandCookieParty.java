package io.github.talonm4;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class CommandCookieParty implements CommandExecutor {
    @Override
    public  boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("cookielord.party")){
                for (Player p : org.bukkit.Bukkit.getOnlinePlayers()) {
                    PlayerInventory inventory = p.getInventory();
                    inventory.addItem(new ItemStack(Material.COOKIE, 16 ));
                    inventory.addItem(new ItemStack(Material.MILK_BUCKET));
                    p.sendMessage("Talon has gifted you with the power of cookies and milk");
            }}

            else{sender.sendMessage("SMH trying to give out free cookies"); }
        }return true;
    }
}
