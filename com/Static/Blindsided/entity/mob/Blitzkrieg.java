/*     */ package com.Static.Blindsided.entity.mob;
/*     */ 
/*     */ import com.Static.Blindsided.graphics.AnimatedSprite;
/*     */ import com.Static.Blindsided.graphics.Screen;
/*     */ import com.Static.Blindsided.graphics.Sprite;
/*     */ import com.Static.Blindsided.graphics.SpriteSheet;
/*     */ import com.Static.Blindsided.level.Level;
/*     */ import java.util.List;
/*     */ 
/*     */ public class Blitzkrieg
/*     */   extends EnemyMob
/*     */ {
/*  13 */   private AnimatedSprite down = new AnimatedSprite(SpriteSheet.ghoul_down, 32, 32, 3);
/*  14 */   private AnimatedSprite up = new AnimatedSprite(SpriteSheet.ghoul_up, 32, 32, 3);
/*  15 */   private AnimatedSprite left = new AnimatedSprite(SpriteSheet.ghoul_left, 32, 32, 3);
/*  16 */   private AnimatedSprite right = new AnimatedSprite(SpriteSheet.ghoul_right, 32, 32, 3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  22 */   private AnimatedSprite animSprite = this.down;
/*     */   
/*  24 */   public static double xa = 0.0D;
/*  25 */   public static double ya = 0.0D;
/*  26 */   public static double speed = 1.0D;
/*  27 */   public static int x10 = 49, y10 = 53;
/*  28 */   public static int x20 = 35, y20 = 88;
/*  29 */   public static int x30 = 8, y30 = 68;
/*  30 */   public static int x40 = 35, y40 = 44;
/*  31 */   public static int x50 = 78, y50 = 44;
/*     */   
/*     */   public Blitzkrieg(int x, int y) {
/*  34 */     this.x = (x << 4);
/*  35 */     this.y = (y << 4);
/*  36 */     this.sprite = Sprite.ghoul;
/*     */   }
/*     */   
/*     */   private void move() {
/*  40 */     xa = 0.0D;
/*  41 */     ya = 0.0D;
/*  42 */     List<Player> players = this.level.getPlayers(this, 135);
/*     */     
/*  44 */     if (players.size() > 0) {
/*  45 */       Player player = players.get(0);
/*  46 */       if (this.x < player.getX() && this.y < player.getY()) {
/*  47 */         xa += speed;
/*  48 */         ya += speed;
/*  49 */       } else if (this.x > player.getX() && this.y > player.getY()) {
/*  50 */         xa -= speed;
/*  51 */         ya -= speed;
/*  52 */       } else if (this.x < player.getX() && this.y > player.getY()) {
/*  53 */         xa += speed;
/*  54 */         ya -= speed;
/*  55 */       } else if (this.x > player.getX() && this.y < player.getY()) {
/*  56 */         xa -= speed;
/*  57 */         ya += speed;
/*     */       } else {
/*  59 */         if (this.x < (player.getX() - 12)) xa += speed;
/*     */         
/*  61 */         if (this.x > (player.getX() + 12)) xa -= speed; 
/*  62 */         if (this.y < (player.getY() - 12)) ya += speed; 
/*  63 */         if (this.y > (player.getY() + 12)) ya -= speed; 
/*     */       } 
/*     */     } 
/*  66 */     if (xa != 0.0D || ya != 0.0D) {
/*     */       
/*  68 */       move(xa, ya);
/*  69 */       this.walking = true;
/*     */     } else {
/*  71 */       this.walking = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void update() {
/*  76 */     move();
/*  77 */     if (this.walking) { this.animSprite.update(); }
/*  78 */     else { this.animSprite.setFrame(0); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  92 */     if (ya < 0.0D) {
/*  93 */       this.dir = EnemyMob.Direction.UP;
/*  94 */       this.animSprite = this.up;
/*  95 */     }  if (ya > 0.0D) {
/*  96 */       this.dir = EnemyMob.Direction.DOWN;
/*  97 */       this.animSprite = this.down;
/*  98 */     }  if (xa < 0.0D) {
/*  99 */       this.dir = EnemyMob.Direction.LEFT;
/* 100 */       this.animSprite = this.left;
/* 101 */     }  if (xa > 0.0D) {
/* 102 */       this.dir = EnemyMob.Direction.RIGHT;
/* 103 */       this.animSprite = this.right;
/*     */     } 
/* 105 */     if (Player.respawn2) {
/* 106 */       if (Level.chkpt1) {
/* 107 */         this.x = (x10 * 16);
/* 108 */         this.y = (y10 * 16);
/* 109 */       } else if (Level.chkpt2) {
/* 110 */         this.x = (x10 * 16);
/* 111 */         this.y = (y10 * 16);
/* 112 */       } else if (Level.chkpt3) {
/* 113 */         this.x = (x10 * 16);
/* 114 */         this.y = (y10 * 16);
/* 115 */       } else if (Level.chkpt4) {
/* 116 */         this.x = (x20 * 16);
/* 117 */         this.y = (y20 * 16);
/* 118 */       } else if (Level.chkpt5) {
/* 119 */         this.x = (x30 * 16);
/* 120 */         this.y = (y30 * 16);
/* 121 */       } else if (Level.chkpt6) {
/* 122 */         this.x = (x40 * 16);
/* 123 */         this.y = (y40 * 16);
/* 124 */       } else if (Level.chkpt7) {
/* 125 */         this.x = (x40 * 16);
/* 126 */         this.y = (y40 * 16);
/* 127 */       } else if (Level.chkpt8) {
/* 128 */         this.x = (x40 * 16);
/* 129 */         this.y = (y40 * 16);
/* 130 */       } else if (Level.chkpt9) {
/* 131 */         this.x = (x10 * 16);
/* 132 */         this.y = (y10 * 16);
/* 133 */       } else if (Level.chkpt10) {
/* 134 */         this.x = (x50 * 16);
/* 135 */         this.y = (y50 * 16);
/*     */       } 
/* 137 */       Player.respawn2 = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void render(Screen screen) {
/* 142 */     this.sprite = this.animSprite.getSprite();
/* 143 */     screen.renderEnemyMob((int)(this.x - 16.0D), (int)(this.y - 16.0D), this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\entity\mob\Blitzkrieg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */