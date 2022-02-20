package br.com.maggovix.mfapi;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MFapi implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args) {

        if(!(sender instanceof Player)) return false;
        Player player = (Player) sender;

        if (!player.hasPermission("mf.admin")) {
            sender.sendMessage("Sem permissão.");
            return true;
        }

        if(cmd.getName().equalsIgnoreCase("MFapi")) {
            player.sendMessage("§6[§aMine§cForja§6] Versão: 1.0");
            return true;
        }
        return false;
        }
}
