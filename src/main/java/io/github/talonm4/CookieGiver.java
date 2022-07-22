package io.github.talonm4;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;


public final class CookieGiver extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        // Plugin startup logic
        // BukkitTask cookieLotteryTask = new CookieLotteryTask(this).runTaskTimer(this, 0L,100L);
        // BukkitTask cookieTrollTask = new CookieTrollTask(this).runTaskLater(this, 500L);
        getLogger().info("I love grass");
        getCommand("cookie").setExecutor(new CommandCookie());
        getCommand("cookieparty").setExecutor(new CommandCookieParty());
        getCommand("fly").setExecutor(new CommandReworkedFly());
        Bukkit.getPluginManager().registerEvents(this, this);
        }



}

