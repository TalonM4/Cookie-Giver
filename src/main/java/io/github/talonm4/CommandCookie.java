package io.github.talonm4;


import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.ItemStack;



public class CommandCookie implements CommandExecutor {
    @Override
    public  boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(sender instanceof Player){
            Player player = (Player) sender;
            PlayerInventory inventory = player.getInventory();
            inventory.addItem(new ItemStack(Material.COOKIE));
            player.sendMessage("You got a cookie!");

        }return true;
    }
}
