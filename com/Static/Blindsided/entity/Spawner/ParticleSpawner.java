/*    */ package com.Static.Blindsided.entity.Spawner;
/*    */ 
/*    */ import com.Static.Blindsided.entity.Entity;
/*    */ import com.Static.Blindsided.entity.particle.Particle;
/*    */ import com.Static.Blindsided.level.Level;
/*    */ 
/*    */ public class ParticleSpawner
/*    */   extends Spawner {
/*    */   private int life;
/*    */   
/*    */   public ParticleSpawner(double x, double y, int life, int amount, Level level) {
/* 12 */     super(x, y, Spawner.Type.PARTICLE, amount, level);
/* 13 */     this.life = life;
/* 14 */     for (int i = 0; i < amount; i++)
/* 15 */       level.add((Entity)new Particle(x, y, life)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\entity\Spawner\ParticleSpawner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */