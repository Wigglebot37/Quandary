/*    */ package com.Static.Blindsided.entity.Spawner;
/*    */ import com.Static.Blindsided.entity.Entity;
/*    */ import com.Static.Blindsided.level.Level;
/*    */ 
/*    */ public abstract class Spawner extends Entity {
/*    */   private Type type;
/*    */   
/*    */   public enum Type {
/*  9 */     MOB, PARTICLE;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Spawner(double x, double y, Type type, int amount, Level level) {
/* 16 */     init(level);
/* 17 */     this.x = x;
/* 18 */     this.y = y;
/* 19 */     this.type = type;
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\entity\Spawner\Spawner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */