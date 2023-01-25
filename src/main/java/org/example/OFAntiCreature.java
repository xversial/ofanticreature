/*    */ package org.example;
/*    */ 
/*    */ import java.util.logging.Level;
/*    */ import org.example.commands.AntiCreatureCommandCompleter;
/*    */ import org.example.commands.AntiCreatureCommandExecutor;
/*    */ import org.example.database.CreatureManager;
/*    */ import org.example.listener.CreatureListener;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.TabCompleter;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ public final class OFAntiCreature extends JavaPlugin {
/* 15 */   public static final String PERMISSION = "anticreature.commands";
/*    */   
/*    */   public static OFAntiCreature instance;
/*    */ 
/*    */   
/*    */   public void onEnable() {
/* 21 */     instance = this;
/* 22 */     saveDefaultConfig();
/* 23 */     CreatureManager.load();
/* 24 */     getServer().getPluginManager().registerEvents((Listener)new CreatureListener(), (Plugin)this);
/* 25 */     getCommand("anticreature").setExecutor((CommandExecutor)new AntiCreatureCommandExecutor());
/* 26 */     getCommand("anticreature").setTabCompleter((TabCompleter)new AntiCreatureCommandCompleter());
/* 27 */     getLogger().log(Level.FINE, "OFAntiCreature has loaded!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void onDisable() {
/* 33 */     saveConfig();
/*    */   }
/*    */   
/*    */   public static OFAntiCreature getInstance() {
/* 37 */     return instance;
/*    */   }
/*    */ }


/* Location:              D:\Downloads\OFAntiCreature-0.1.0.jar!\me\orbitium\ofanticreature\OFAntiCreature.class
 * Java compiler version: 14 (58.0)
 * JD-Core Version:       1.1.3
 */