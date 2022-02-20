package br.com.maggovix.mfapi.Events;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginDescriptionFile;

public class Events implements Listener {
 //Join msg
    @EventHandler
    public void onEnty(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.setJoinMessage(null);
        Bukkit.broadcastMessage("§6Bem Vindo! §5" + p.getName());

    }
}
