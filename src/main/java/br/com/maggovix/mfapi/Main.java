package br.com.maggovix.mfapi;

import br.com.maggovix.mfapi.Events.Events;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        registerEvents();
        getCommand("MFapi").setExecutor((CommandExecutor) new MFapi());
    }

    @Override
    public void onLoad(){
        logMsg();
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("[MineForja] O plugin acaba de ser encerrado");
    }

    public void registerEvents(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new Events(), this);
    }

    public void logMsg(){
        Bukkit.getConsoleSender().sendMessage("[MineForja] Plugin Foi iniciado com sucesso.");
        Bukkit.getConsoleSender().sendMessage("[MineForja] Versão atual: 1.0-Alpha         ");
        Bukkit.getConsoleSender().sendMessage("§6____________________________________________");
        Bukkit.getConsoleSender().sendMessage("§6|§a              ____");
        Bukkit.getConsoleSender().sendMessage("§6|§a            ,'  , `.    §c    ,---,.");
        Bukkit.getConsoleSender().sendMessage("§6|§a         ,-+-,.' _ |    §c  ,'  .' |");
        Bukkit.getConsoleSender().sendMessage("§6|§a      ,-+-. ;   , ||    §c,---.'   |");
        Bukkit.getConsoleSender().sendMessage("§6|§a     ,--.'|'   |  ;|    §c|   |   .'");
        Bukkit.getConsoleSender().sendMessage("§6|§a    |   |  ,', |  ':    §c:   :  :");
        Bukkit.getConsoleSender().sendMessage("§6|§a    |   | /  | |  ||    §c:   |  |-,");
        Bukkit.getConsoleSender().sendMessage("§6|§a    '   | :  | :  |,    §c|   :  ;/|");
        Bukkit.getConsoleSender().sendMessage("§6|§a    ;   . |  ; |--'     §c|   |   .'");
        Bukkit.getConsoleSender().sendMessage("§6|§a    |   : |  | ,        §c'   :  '");
        Bukkit.getConsoleSender().sendMessage("§6|§a    |   : '  |/         §c|   |  |");
        Bukkit.getConsoleSender().sendMessage("§6|§a    ;   | |`-'          §c|   :  |");
        Bukkit.getConsoleSender().sendMessage("§6|§a    |   ;/              §c|   | ,'");
        Bukkit.getConsoleSender().sendMessage("§6|§a    '---'               §c`----'");
        Bukkit.getConsoleSender().sendMessage("§6|___________________________________________");
    }
}