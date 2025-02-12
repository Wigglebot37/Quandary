/*    */ package com.Static.Blindsided.entity.projectile;
/*    */ 
/*    */ import com.Static.Blindsided.entity.Entity;
/*    */ import com.Static.Blindsided.graphics.Sprite;
/*    */ import com.Static.Blindsided.level.Level;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Projectile
/*    */   extends Entity
/*    */ {
/*    */   protected final double xOrigin;
/*    */   protected final double yOrigin;
/*    */   protected double angle;
/*    */   protected Sprite sprite;
/*    */   protected double x;
/*    */   protected double y;
/* 19 */   protected final Random random = new Random(); protected double nx; protected double ny; protected double distance; protected double speed; protected double range; protected double damage; protected double life;
/*    */   
/*    */   public Projectile(double x, double y, double dir) {
/* 22 */     this.xOrigin = x;
/* 23 */     this.yOrigin = y;
/* 24 */     this.angle = dir;
/* 25 */     this.x = x;
/* 26 */     this.y = y;
/*    */   }
/*    */ 
/*    */   
/*    */   public Sprite getSprite() {
/* 31 */     return this.sprite;
/*    */   }
/*    */   
/*    */   public void update2() {
/* 35 */     if ((this.level.getClientPlayer().getX() / 16) - this.x / 16.0D - 0.5D < 0.6D && (this.level.getClientPlayer().getX() / 16) - this.x / 16.0D - 0.5D > -0.65D && ((
/* 36 */       this.level.getClientPlayer().getY() - 1) / 16 + 1) - this.y / 16.0D - 0.5D <= 0.125D && ((this.level.getClientPlayer().getY() - 1) / 16 + 1) - this.y / 16.0D - 0.5D > 0.117D) {
/* 37 */       if (Level.health >= 151) Level.health -= 150; 
/* 38 */       if (Level.health < 151) Level.health = 0;
/*    */     
/*    */     } 
/*    */   }
/*    */   
/*    */   public int getSpriteSize() {
/* 44 */     return this.sprite.SIZE;
/*    */   }
/*    */   
/*    */   protected void move() {}
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\entity\projectile\Projectile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */