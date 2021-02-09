package net.aindrigo.ainTweaks.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TweakCommand implements CommandExecutor {
    private String commandName;
    public static HashMap<String,TweakCommand> commands = new HashMap<String,TweakCommand>();
    public TweakCommand(String commandName){
        this.commandName = commandName;
        commands.put(this.commandName,this);
    }
    public TweakCommand(String commandName, boolean addToCommandMap){
        this.commandName = commandName;
        if(addToCommandMap){
            commands.put(this.commandName,this);
        }
    }
    public static void registerCommands(JavaPlugin plugin){
        Iterator it = commands.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            plugin.getCommand((String) entry.getKey()).setExecutor((CommandExecutor) entry.getValue());
        }
    }
    public String getCommandName() {
        return commandName;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        onRun(!(sender instanceof Player), (args.length > 1),((Player) sender).isOp(),sender, args);
        return !(sender instanceof Player);
    }

    public void onRun(boolean isConsole, boolean hasArgs, boolean isOp, CommandSender commandSender, String[] args){};
}
