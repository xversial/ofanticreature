/*    */ package org.example.commands;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ import org.example.OFAntiCreature;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.command.TabCompleter;
/*    */ 
/*    */ public class AntiCreatureCommandCompleter
/*    */   implements TabCompleter
/*    */ {
/* 14 */   public List<String> emptyList = new ArrayList<>();
/*    */ 
/*    */   
/*    */   public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
/* 18 */     if (sender.isOp() || sender.hasPermission(OFAntiCreature.PERMISSION)) {
/* 19 */       return this.emptyList;
/*    */     }
/*    */     
/* 22 */     if (args.length == 1)
/* 23 */       return Arrays.asList(new String[] { "reload", "enable", "disable" }); 
/* 24 */     if (args.length == 2) {
/* 25 */       return Arrays.asList(new String[] { "iron_golem", "snowman", "wither" });
/*    */     }
/* 27 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\Downloads\OFAntiCreature-0.1.0.jar!\me\orbitium\ofanticreature\commands\AntiCreatureCommandCompleter.class
 * Java compiler version: 14 (58.0)
 * JD-Core Version:       1.1.3
 */