package net.aindrigo.ainTweaks.core;

import net.aindrigo.ainTweaks.commands.TweakCommand;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        preInit();
        duringInit();
        postInit();
    }

    @Override
    public void onDisable() {

    }

    // Initialize stages

    public void preInit(){

    }
    public void duringInit(){

    }
    public void postInit(){
        TweakCommand.registerCommands(this);
    }
}
