package me.devdekku.eggbuilder;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;



public class BridgeEgg implements Listener
{
    private EggBuilder plugin;
    
    public BridgeEgg(final EggBuilder plugin) {
        this.plugin = plugin;
    }
    
    
    
    
    

    
    @SuppressWarnings("deprecation")
	@EventHandler
    public void onItemDrop(final PlayerDropItemEvent e) {
    	Player p = e.getPlayer();
    	
    	Item drop = e.getItemDrop();
    	
    	

    	
    	// Item Stacks:
    	//Norte:
    	ItemStack Norte = new ItemStack(Material.EGG);
    	ItemMeta NorteMeta = Norte.getItemMeta();
    	
    	NorteMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7&lNORTH &f&lEGG"));
    	
    	ArrayList<String> NorteLore = new ArrayList<String>();
        NorteLore.add("Spawn bridge");

        NorteMeta.setLore(NorteLore);

        Norte.setItemMeta(NorteMeta);
    	
    	//Obten norte:
    	if(drop.getItemStack().getTypeId() == 1) {
    		p.getInventory().addItem(Norte);
    	}
    	
    	//Este:
    	ItemStack Este = new ItemStack(Material.EGG);
    	ItemMeta EsteMeta = Este.getItemMeta();
    	
    	EsteMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7&lEAST &f&lEGG"));
    	
    	ArrayList<String> EsteLore = new ArrayList<String>();
        EsteLore.add("Spawn bridge");

        EsteMeta.setLore(EsteLore);

        Este.setItemMeta(EsteMeta);
    	
    	//Obten Este:
    	if(drop.getItemStack().getTypeId() == 2) {
    		p.getInventory().addItem(Este);
    	}
    	
    	
    	//Oste:
    	ItemStack OEste = new ItemStack(Material.EGG);
    	ItemMeta OEsteMeta = OEste.getItemMeta();
    	
    	OEsteMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7&lWEAST &f&lEGG"));
    	
    	ArrayList<String> OEsteLore = new ArrayList<String>();
        OEsteLore.add("Spawn bridge");

        OEsteMeta.setLore(OEsteLore);

        OEste.setItemMeta(OEsteMeta);
    	
    	//Obten OEste:
    	if(drop.getItemStack().getTypeId() == 3) {
    		p.getInventory().addItem(OEste);
    	}
    	
    	//Sur:
    	ItemStack Sur = new ItemStack(Material.EGG);
    	ItemMeta SurMeta = Sur.getItemMeta();
    	
    	SurMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7&lSOUTH &f&lEGG"));
    	
    	ArrayList<String> SurLore = new ArrayList<String>();
        SurLore.add("Spawn bridge");

        SurMeta.setLore(SurLore);

        Sur.setItemMeta(SurMeta);
    	
    	//Obten OEste:
    	if(drop.getItemStack().getTypeId() == 4) {
    		p.getInventory().addItem(Sur);
    	}
    	
        
    	if (drop.getItemStack().equals(OEste)) {
        	e.setCancelled(true);
        	
        	p.getInventory().removeItem(OEste); 
            
            Location l = p.getLocation();
            
         
            double newC = l.getX()-1;
            l.setX(newC);
            l.getBlock().setType(Material.COBBLESTONE);
            newC = l.getX()-1;
            l.setX(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getX()-1;
            l.setX(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getX()-1;
            l.setX(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getX()-1;
            l.setX(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getX()-1;
            l.setX(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getX()-1;
            l.setX(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getX()-1;
            l.setX(newC);
            l.getBlock().setType(Material.COBBLESTONE); 
            
            
            
            
            
            
        } else {
        
        }
        
        
        
        if (drop.getItemStack().equals(Este)) {
        	e.setCancelled(true);
        	
        	p.getInventory().removeItem(Este); 
            
            Location l = p.getLocation();
            
         
            double newC = l.getX()+1;
            l.setX(newC);
            l.getBlock().setType(Material.COBBLESTONE);
            newC = l.getX()+1;
            l.setX(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getX()+1;
            l.setX(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getX()+1;
            l.setX(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getX()+1;
            l.setX(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getX()+1;
            l.setX(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getX()+1;
            l.setX(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getX()+1;
            l.setX(newC);
            l.getBlock().setType(Material.COBBLESTONE); 
            
            
            
            
            
            
        } else {
        
        }
        
        if (drop.getItemStack().equals(Sur)) {
        	e.setCancelled(true);
        	
        	p.getInventory().removeItem(Sur); 
            
            Location l = p.getLocation();
            
         
            double newC = l.getZ()+1;
            l.setZ(newC);
            l.getBlock().setType(Material.COBBLESTONE);
            newC = l.getZ()+1;
            l.setZ(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getZ()+1;
            l.setZ(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getZ()+1;
            l.setZ(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getZ()+1;
            l.setZ(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getZ()+1;
            l.setZ(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getZ()+1;
            l.setZ(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getZ()+1;
            l.setZ(newC);
            l.getBlock().setType(Material.COBBLESTONE); 
            
            
            
            
            
            
        } else {
        
        }
        
        if (drop.getItemStack().equals(Norte)) {
        	e.setCancelled(true);
        	
        	p.getInventory().removeItem(Norte); 
        	
            
            Location l = p.getLocation();
            
         
            double newC = l.getZ()-1;
            l.setZ(newC);
            l.getBlock().setType(Material.COBBLESTONE);
            newC = l.getZ()-1;
            l.setZ(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getZ()-1;
            l.setZ(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getZ()-1;
            l.setZ(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getZ()-1;
            l.setZ(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getZ()-1;
            l.setZ(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getZ()-1;
            l.setZ(newC);
            l.getBlock().setType(Material.BRICK);
            newC = l.getZ()-1;
            l.setZ(newC);
            l.getBlock().setType(Material.COBBLESTONE); 
            
            
            
            
            
            
        } else {
        
        }
   
}
    	
    	
    }
