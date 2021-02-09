package net.aindrigo.ainTweaks.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand extends TweakCommand{

    public FlyCommand() {
        super("fly");
    }

    @Override
    public void onRun(boolean isConsole, boolean hasArgs, boolean isOp, CommandSender commandSender, String[] args) {
        if(isOp){
            Player player = (Player) commandSender;
            player.setFlying(!(player.isFlying()));
        }
    }
}
