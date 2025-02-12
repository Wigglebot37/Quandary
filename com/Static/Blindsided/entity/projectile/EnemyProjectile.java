/*    */ package com.Static.Blindsided.entity.projectile;
/*    */ 
/*    */ import com.Static.Blindsided.entity.Entity;
/*    */ import com.Static.Blindsided.entity.Spawner.ParticleSpawner;
/*    */ import com.Static.Blindsided.graphics.Screen;
/*    */ import com.Static.Blindsided.graphics.Sprite;
/*    */ 
/*    */ public class EnemyProjectile extends Projectile {
/*  9 */   public static int FIRE_RATE = 10;
/*    */ 
/*    */   
/*    */   public EnemyProjectile(double x, double y, double dir) {
/* 13 */     super(x, y, dir);
/*    */ 
/*    */     
/* 16 */     this.range = 100.0D;
/* 17 */     this.speed = 3.0D;
/* 18 */     this.damage = 20.0D;
/* 19 */     this.sprite = Sprite.rotate(Sprite.projectile_enemy, this.angle);
/* 20 */     this.nx = this.speed * Math.cos(this.angle);
/* 21 */     this.ny = this.speed * Math.sin(this.angle);
/*    */   }
/*    */   
/*    */   public void update() {
/* 25 */     if (this.level.tileCollision((int)(this.x + this.nx), (int)(this.y + this.ny), 6, 5, 5)) {
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 30 */       this.level.add((Entity)new ParticleSpawner((int)this.x, (int)this.y, 30, 15, this.level));
/*    */       
/* 32 */       remove();
/*    */     } 
/* 34 */     move();
/*    */   }
/*    */   
/*    */   protected void move() {
/* 38 */     this.x += this.nx;
/* 39 */     this.y += this.ny;
/* 40 */     if (distance() > this.range) remove(); 
/*    */   }
/*    */   
/*    */   private double distance() {
/* 44 */     double dist = 0.0D;
/* 45 */     dist = Math.sqrt(Math.abs((this.xOrigin - this.x) * (this.xOrigin - this.x) + (this.yOrigin - this.y) * (this.yOrigin - this.y)));
/*    */     
/* 47 */     return dist;
/*    */   }
/*    */   
/*    */   public void render(Screen screen) {
/* 51 */     screen.renderProjectile((int)this.x - 7, (int)this.y - 6, this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\entity\projectile\EnemyProjectile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */