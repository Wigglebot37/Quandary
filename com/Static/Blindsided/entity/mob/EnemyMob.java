/*     */ package com.Static.Blindsided.entity.mob;
/*     */ 
/*     */ import com.Static.Blindsided.entity.Entity;
/*     */ import com.Static.Blindsided.entity.projectile.EnemyProjectile;
/*     */ import com.Static.Blindsided.graphics.Screen;
/*     */ 
/*     */ public abstract class EnemyMob extends Entity {
/*     */   protected boolean moving;
/*     */   
/*     */   public EnemyMob() {
/*  11 */     this.moving = false;
/*  12 */     this.walking = false;
/*     */   }
/*     */   protected boolean walking; protected Direction dir;
/*  15 */   protected enum Direction { UP, DOWN, LEFT, RIGHT; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void move(double xa, double ya) {
/*  23 */     if (xa != 0.0D && ya != 0.0D) {
/*  24 */       move(xa, 0.0D);
/*  25 */       move(0.0D, ya);
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/*  33 */     if (xa > 0.0D) this.dir = Direction.RIGHT; 
/*  34 */     if (xa < 0.0D) this.dir = Direction.LEFT; 
/*  35 */     if (ya > 0.0D) this.dir = Direction.DOWN; 
/*  36 */     if (ya < 0.0D) this.dir = Direction.UP;
/*     */ 
/*     */     
/*  39 */     while (xa != 0.0D) {
/*  40 */       if (Math.abs(xa) > 1.0D) {
/*     */         
/*  42 */         if (!collision(abs(xa), ya) && !sep2collision(abs(xa), ya)) {
/*  43 */           this.x += abs(xa);
/*     */         }
/*  45 */         xa -= abs(xa); continue;
/*     */       } 
/*  47 */       if (!collision(abs(xa), ya) && !sep2collision(abs(xa), ya)) {
/*  48 */         this.x += xa;
/*     */       }
/*  50 */       xa = 0.0D;
/*     */     } 
/*     */ 
/*     */     
/*  54 */     while (ya != 0.0D) {
/*  55 */       if (Math.abs(ya) > 1.0D) {
/*     */         
/*  57 */         if (!collision(xa, abs(ya)) && !sep2collision(xa, abs(ya))) {
/*  58 */           this.y += abs(ya);
/*     */         }
/*  60 */         ya -= abs(ya); continue;
/*     */       } 
/*  62 */       if (!collision(xa, abs(ya)) && !sep2collision(xa, abs(ya))) {
/*  63 */         this.y += ya;
/*     */       }
/*  65 */       ya = 0.0D;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int abs(double value) {
/*  74 */     if (value < 0.0D) return -1; 
/*  75 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public abstract void update();
/*     */ 
/*     */   
/*     */   public abstract void render(Screen paramScreen);
/*     */   
/*     */   protected void shoot(double x, double y, double dir) {
/*  85 */     EnemyProjectile enemyProjectile = new EnemyProjectile((int)x, (int)y, dir);
/*  86 */     this.level.add((Entity)enemyProjectile);
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean collision(double xa, double ya) {
/*  91 */     boolean solid = false;
/*  92 */     for (int c = 0; c < 4; c++) {
/*  93 */       double xt = (this.x + xa + (c % 2 * 11) - 6.0D) / 16.0D;
/*  94 */       double yt = (this.y + ya + (c / 2 * 10) + 5.0D) / 16.0D;
/*     */ 
/*     */       
/*  97 */       int ix = (int)xt;
/*     */       
/*  99 */       int iy = (int)yt;
/* 100 */       if (c % 2 == 0) ix = (int)Math.floor(xt); 
/* 101 */       if (c / 2 == 0) iy = (int)Math.floor(yt); 
/* 102 */       if (this.level.getTile(ix, iy).solid()) solid = true;
/*     */     
/*     */     } 
/*     */     
/* 106 */     return solid;
/*     */   }
/*     */   private boolean sep2collision(double xa, double ya) {
/* 109 */     boolean sep2 = false;
/* 110 */     for (int c = 0; c < 4; c++) {
/* 111 */       double xt = (this.x + xa + (c % 2 * 11) - 6.0D) / 16.0D;
/* 112 */       double yt = (this.y + ya + (c / 2 * 10) + 5.0D) / 16.0D;
/*     */ 
/*     */ 
/*     */       
/* 116 */       int ix = (int)xt;
/*     */       
/* 118 */       int iy = (int)yt;
/* 119 */       if (c % 2 == 0) ix = (int)Math.floor(xt); 
/* 120 */       if (c / 2 == 0) iy = (int)Math.floor(yt); 
/* 121 */       if (this.level.getTile(ix, iy).sep2()) sep2 = true;
/*     */     
/*     */     } 
/*     */     
/* 125 */     return sep2;
/*     */   }
/*     */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\entity\mob\EnemyMob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */