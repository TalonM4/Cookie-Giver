package io.github.talonm4.tasks;

import io.github.talonm4.CookieGiver;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.scheduler.BukkitRunnable;


import java.util.ArrayList;
import java.util.List;

public class CookieLotteryTask extends BukkitRunnable {

    CookieGiver plugin;
    public CookieLotteryTask(CookieGiver plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        List<String> players = new ArrayList<String>();
        for (Player p : org.bukkit.Bukkit.getOnlinePlayers()) {
            PlayerInventory inventory = p.getInventory();
            inventory.addItem(new ItemStack(Material.COOKIE));
            p.sendMessage("This action was performed by a bot.");
        }
}
}
