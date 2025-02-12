/*     */ package com.Static.Blindsided.entity.mob;
/*     */ 
/*     */ import com.Static.Blindsided.entity.Entity;
/*     */ import com.Static.Blindsided.entity.projectile.PlayerProjectile;
/*     */ import com.Static.Blindsided.graphics.Screen;
/*     */ 
/*     */ public abstract class Mob extends Entity {
/*     */   protected boolean moving;
/*     */   
/*     */   public Mob() {
/*  11 */     this.moving = false;
/*  12 */     this.walking = false;
/*     */   }
/*     */   protected boolean walking; protected Direction dir;
/*  15 */   protected enum Direction { UP, DOWN, LEFT, RIGHT, UPRIGHT, UPLEFT, DOWNRIGHT, DOWNLEFT; }
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
/*     */       return;
/*     */     } 
/*  29 */     if (xa < 0.0D && ya < 0.0D) this.dir = Direction.UPRIGHT; 
/*  30 */     if (xa > 0.0D && ya < 0.0D) this.dir = Direction.UPLEFT; 
/*  31 */     if (xa < 0.0D && ya > 0.0D) this.dir = Direction.DOWNRIGHT; 
/*  32 */     if (xa > 0.0D && ya > 0.0D) this.dir = Direction.DOWNLEFT; 
/*  33 */     if (xa > 0.0D) this.dir = Direction.RIGHT; 
/*  34 */     if (xa < 0.0D) this.dir = Direction.LEFT; 
/*  35 */     if (ya > 0.0D) this.dir = Direction.DOWN; 
/*  36 */     if (ya < 0.0D) this.dir = Direction.UP;
/*     */ 
/*     */     
/*  39 */     while (xa != 0.0D) {
/*  40 */       if (Math.abs(xa) > 1.0D) {
/*     */         
/*  42 */         if (!collision(abs(xa), ya) && !sepcollision(abs(xa), ya)) {
/*  43 */           this.x += abs(xa);
/*     */         }
/*  45 */         xa -= abs(xa); continue;
/*     */       } 
/*  47 */       if (!collision(abs(xa), ya) && !sepcollision(abs(xa), ya)) {
/*  48 */         this.x += xa;
/*     */       }
/*  50 */       xa = 0.0D;
/*     */     } 
/*     */ 
/*     */     
/*  54 */     while (ya != 0.0D) {
/*  55 */       if (Math.abs(ya) > 1.0D) {
/*     */         
/*  57 */         if (!collision(xa, abs(ya)) && !sepcollision(xa, abs(ya))) {
/*  58 */           this.y += abs(ya);
/*     */         }
/*  60 */         ya -= abs(ya); continue;
/*     */       } 
/*  62 */       if (!collision(xa, abs(ya)) && !sepcollision(xa, abs(ya))) {
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
/*  85 */     PlayerProjectile playerProjectile = new PlayerProjectile((int)x, (int)y, dir);
/*  86 */     this.level.add((Entity)playerProjectile);
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
/*     */       
/*  98 */       int ix = (int)xt;
/*     */       
/* 100 */       int iy = (int)yt;
/* 101 */       if (c % 2 == 0) ix = (int)Math.floor(xt); 
/* 102 */       if (c / 2 == 0) iy = (int)Math.floor(yt); 
/* 103 */       if (this.level.getTile(ix, iy).solid()) solid = true;
/*     */     
/*     */     } 
/*     */     
/* 107 */     return solid;
/*     */   }
/*     */   private boolean sepcollision(double xa, double ya) {
/* 110 */     boolean sep = false;
/* 111 */     for (int c = 0; c < 4; c++) {
/* 112 */       double xt = (this.x + xa + (c % 2 * 11) - 6.0D) / 16.0D;
/* 113 */       double yt = (this.y + ya + (c / 2 * 10) + 5.0D) / 16.0D;
/*     */ 
/*     */ 
/*     */       
/* 117 */       int ix = (int)xt;
/*     */       
/* 119 */       int iy = (int)yt;
/* 120 */       if (c % 2 == 0) ix = (int)Math.floor(xt); 
/* 121 */       if (c / 2 == 0) iy = (int)Math.floor(yt); 
/* 122 */       if (this.level.getTile(ix, iy).sep()) sep = true;
/*     */     
/*     */     } 
/*     */     
/* 126 */     return sep;
/*     */   }
/*     */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\entity\mob\Mob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */