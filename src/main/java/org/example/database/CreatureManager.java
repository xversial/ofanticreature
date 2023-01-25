/*    */ package org.example.database;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
/*    */ import org.example.OFAntiCreature;
/*    */ 
/*    */ public class CreatureManager
/*    */ {
/* 10 */   public static Map<String, Boolean> creatures = new HashMap<>();
/*    */   
/*    */   public static void load() {
/* 13 */     creatures.put("iron_golem", Boolean.valueOf(false));
/* 14 */     creatures.put("snowman", Boolean.valueOf(false));
/* 15 */     creatures.put("wither", Boolean.valueOf(false));
/*    */     
/* 17 */     for (Map.Entry<String, Boolean> entry : creatures.entrySet()) {
/* 18 */       String data = OFAntiCreature.getInstance().getConfig().getString(entry.getKey()).toLowerCase(Locale.US);
/* 19 */       if (data.equals("disabled") || data.equals("false")) {
/* 20 */         entry.setValue(Boolean.valueOf(false)); continue;
/* 21 */       }  if (data.equals("enabled") || data.equals("true"))
/* 22 */         entry.setValue(Boolean.valueOf(true)); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Downloads\OFAntiCreature-0.1.0.jar!\me\orbitium\ofanticreature\database\CreatureManager.class
 * Java compiler version: 14 (58.0)
 * JD-Core Version:       1.1.3
 */