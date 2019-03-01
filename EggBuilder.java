package me.devdekku.eggbuilder;



import org.bukkit.plugin.java.*;

import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.event.*; 
import org.bukkit.plugin.*;
import org.bukkit.configuration.file.*;
import org.bukkit.configuration.*;
import java.io.*;

public class EggBuilder extends JavaPlugin
{
    public String rutaConfig;
    private PluginDescriptionFile pdfFile;
    private String version;
    private FileConfiguration messages;
    private File messagesFile;
    
    public EggBuilder() {
        this.pdfFile = this.getDescription();
        this.version = this.pdfFile.getVersion();
        this.messages = null;
        this.messagesFile = null;
    }
    

    public void onEnable() {
        this.registerCommands();
        this.registerEvents();
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&m-----------------"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&aThe plugin &dEggBuilder "+ version +" &ahas enabled"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&m-----------------"));
    }
    
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&m-----------------"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&aThe plugin &dEggBuilder "+ version + " &ahas disabled"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&m-----------------"));
    }
    public void registerCommands() {
       // this.getCommand("ythelp").setExecutor((CommandExecutor)new Help(this));
       
    }
    
    private void registerEvents() {
       final PluginManager pm = this.getServer().getPluginManager();
       pm.registerEvents((Listener)new BridgeEgg(this), (Plugin)this);
    }
}
