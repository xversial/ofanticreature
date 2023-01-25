/*    */ package org.example.commands;
/*    */ 
/*    */ import org.example.OFAntiCreature;
/*    */ import org.example.database.CreatureManager;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ 
/*    */ public class AntiCreatureCommandExecutor
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
/* 14 */     if (!sender.isOp() && !sender.hasPermission(OFAntiCreature.PERMISSION)) {
/* 15 */       sender.sendMessage("" + ChatColor.RED + "You can't use that command");
/* 16 */       return true;
/*    */     } 
/* 18 */     if (args.length == 1 && args[0].equals("reload")) {
/* 19 */       OFAntiCreature.getInstance().reloadConfig();
/* 20 */       CreatureManager.load();
/* 21 */       sender.sendMessage("" + ChatColor.GREEN + "Reload complete [custom version]");
/*    */ 
/*    */     
/*    */     }
/* 25 */     else if (args.length == 2) {
/* 26 */       if (args[0].equals("enable")) {
/* 27 */         if (!CreatureManager.creatures.containsKey(args[1])) {
/* 28 */           sender.sendMessage("" + ChatColor.RED + "Invalid creature name!");
/* 29 */           return true;
/*    */         } 
/*    */         
/* 32 */         CreatureManager.creatures.put(args[1], Boolean.valueOf(true));
/* 33 */         OFAntiCreature.getInstance().getConfig().set(args[1], Boolean.valueOf(true));
/* 34 */         sender.sendMessage("" + ChatColor.GREEN + ChatColor.GREEN + " enabled!");
/*    */       } 
/* 36 */       if (args[0].equals("disable")) {
/* 37 */         if (!CreatureManager.creatures.containsKey(args[1])) {
/* 38 */           sender.sendMessage("" + ChatColor.RED + "Invalid creature name!");
/* 39 */           return true;
/*    */         } 
/*    */         
/* 42 */         CreatureManager.creatures.put(args[1], Boolean.valueOf(false));
/* 43 */         OFAntiCreature.getInstance().getConfig().set(args[1], Boolean.valueOf(false));
/* 44 */         sender.sendMessage("" + ChatColor.GREEN + ChatColor.GREEN + " disabled!");
/*    */       } 
/*    */     } 
/* 47 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\Downloads\OFAntiCreature-0.1.0.jar!\me\orbitium\ofanticreature\commands\AntiCreatureCommandExecutor.class
 * Java compiler version: 14 (58.0)
 * JD-Core Version:       1.1.3
 */
