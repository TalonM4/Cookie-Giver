package io.github.talonm4.tasks;

import io.github.talonm4.CookieGiver;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.scheduler.BukkitRunnable;


import java.util.ArrayList;
import java.util.List;

public class CookieBottleTrollTask extends BukkitRunnable {

    CookieGiver plugin;
    public CookieBottleTrollTask(CookieGiver plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        List<String> players = new ArrayList<String>();
        for (Player p : org.bukkit.Bukkit.getOnlinePlayers()) {
            if (p.getPlayerListName().equals("EDDIEGlows56")) {
                Inventory inventory = p.getInventory();
                inventory.addItem(new ItemStack(Material.COOKIE));
                p.sendMessage("[§bDiscord §f|§5 Top Donator For 9 Months in a Row§f] TalonM4 >> Do you need anything?");
            }
        }
    }
}