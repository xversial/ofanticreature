/*    */ package org.example.listener;
/*    */ 
/*    */ import org.example.database.CreatureManager;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.CreatureSpawnEvent;
/*    */ 
/*    */ public class CreatureListener
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onMobSpawn(CreatureSpawnEvent event) {
/* 13 */     switch (event.getSpawnReason()) {
/*    */       case BUILD_IRONGOLEM:
/* 15 */         if (!((Boolean)CreatureManager.creatures.get("iron_golem")).booleanValue())
/* 16 */           event.setCancelled(true); 
/*    */         break;
/*    */       case BUILD_WITHER:
/* 19 */         if (!((Boolean)CreatureManager.creatures.get("wither")).booleanValue())
/* 20 */           event.setCancelled(true); 
/*    */         break;
/*    */       case BUILD_SNOWMAN:
/* 23 */         if (!((Boolean)CreatureManager.creatures.get("snowman")).booleanValue())
/* 24 */           event.setCancelled(true); 
/*    */         break;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Downloads\OFAntiCreature-0.1.0.jar!\me\orbitium\ofanticreature\listener\CreatureListener.class
 * Java compiler version: 14 (58.0)
 * JD-Core Version:       1.1.3
 */