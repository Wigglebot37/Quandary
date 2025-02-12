/*    */ package com.Static.Blindsided.entity.projectile;
/*    */ 
/*    */ import com.Static.Blindsided.graphics.Screen;
/*    */ import com.Static.Blindsided.graphics.Sprite;
/*    */ 
/*    */ public class PlayerProjectile
/*    */   extends Projectile {
/*  8 */   public static int FIRE_RATE = 15;
/*    */ 
/*    */   
/*    */   public PlayerProjectile(double x, double y, double dir) {
/* 12 */     super(x, y, dir);
/*    */ 
/*    */     
/* 15 */     this.range = 200.0D;
/* 16 */     this.speed = 3.0D;
/* 17 */     this.life = 70.0D;
/* 18 */     this.damage = 0.0D;
/* 19 */     this.sprite = Sprite.projectile_enemy;
/*    */     
/* 21 */     this.nx = this.speed * Math.cos(this.angle);
/* 22 */     this.ny = this.speed * Math.sin(this.angle);
/*    */   }
/*    */   
/*    */   public void update() {
/* 26 */     if (this.level.tileCollision((int)(this.x + this.nx), (int)(this.y + this.ny), 6, 5, 4))
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 33 */       remove();
/*    */     }
/*    */     
/* 36 */     move();
/*    */   }
/*    */   
/*    */   public void move() {
/* 40 */     this.x += this.nx;
/* 41 */     this.y += this.ny;
/* 42 */     this.life--;
/* 43 */     if (distance() > this.range) remove();
/*    */   
/*    */   }
/*    */   
/*    */   private double distance() {
/* 48 */     double dist = 0.0D;
/* 49 */     dist = Math.sqrt(Math.pow(this.xOrigin - this.x, 2.0D) + Math.pow(this.yOrigin - this.y, 2.0D));
/*    */     
/* 51 */     return dist;
/*    */   }
/*    */   
/*    */   public void render(Screen screen) {
/* 55 */     screen.renderProjectile((int)this.x - 7, (int)this.y - 6, this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\entity\projectile\PlayerProjectile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */