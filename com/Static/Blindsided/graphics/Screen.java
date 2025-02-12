/*     */ package com.Static.Blindsided.graphics;
/*     */ 
/*     */ import com.Static.Blindsided.entity.mob.EnemyMob;
/*     */ import com.Static.Blindsided.entity.mob.Mob;
/*     */ import com.Static.Blindsided.entity.projectile.Projectile;
/*     */ import com.Static.Blindsided.level.tile.Tile;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Screen
/*     */ {
/*     */   public int width;
/*     */   public int height;
/*     */   public int[] pixels;
/*  16 */   public final int MAP_SIZE = 64;
/*  17 */   public final int MAP_SIZE_MASK = 63;
/*     */   public int xOffset;
/*  19 */   public int[] tiles = new int[4096]; public int yOffset;
/*  20 */   private Random random = new Random();
/*  21 */   private final int ALPHA_COL = -16711681;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Screen(int width, int height) {
/*  27 */     this.width = width;
/*  28 */     this.height = height;
/*  29 */     this.pixels = new int[width * height];
/*     */     
/*  31 */     for (int i = 0; i < 4096; i++) {
/*  32 */       this.tiles[i] = this.random.nextInt(16777215);
/*  33 */       this.tiles[0] = 0;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void clear() {
/*  38 */     for (int i = 0; i < this.pixels.length; i++) {
/*  39 */       this.pixels[i] = 0;
/*     */     }
/*     */   }
/*     */   
/*     */   public void renderSheet(int xp, int yp, SpriteSheet sheet, boolean fixed) {
/*  44 */     if (fixed) {
/*  45 */       xp -= this.xOffset;
/*  46 */       yp -= this.yOffset;
/*     */     } 
/*  48 */     for (int y = 0; y < sheet.SPRITE_HEIGHT; y++) {
/*  49 */       int ya = y + yp;
/*  50 */       for (int x = 0; x < sheet.SPRITE_WIDTH; x++) {
/*  51 */         int xa = x + xp;
/*  52 */         if (xa >= 0 && xa < this.width && ya >= 0 && ya < this.height)
/*  53 */           this.pixels[xa + ya * this.width] = sheet.pixels[x + y * sheet.SPRITE_WIDTH]; 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void renderTextChar(int xp, int yp, Sprite sprite, int color, boolean fixed) {
/*  59 */     if (fixed) {
/*  60 */       xp -= this.xOffset;
/*  61 */       yp -= this.yOffset;
/*     */     } 
/*  63 */     for (int y = 0; y < sprite.getHeight(); y++) {
/*  64 */       int ya = y + yp;
/*  65 */       for (int x = 0; x < sprite.getWidth(); x++) {
/*  66 */         int xa = x + xp;
/*  67 */         if (xa >= 0 && xa < this.width && ya >= 0 && ya < this.height) {
/*  68 */           int col = sprite.pixels[x + y * sprite.getWidth()];
/*  69 */           if (col != -16711681) this.pixels[xa + ya * this.width] = color; 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public void renderSprite(int xp, int yp, Sprite sprite, boolean fixed) {
/*  75 */     if (fixed) {
/*  76 */       xp -= this.xOffset;
/*  77 */       yp -= this.yOffset;
/*     */     } 
/*  79 */     for (int y = 0; y < sprite.getHeight(); y++) {
/*  80 */       int ya = y + yp;
/*  81 */       for (int x = 0; x < sprite.getWidth(); x++) {
/*  82 */         int xa = x + xp;
/*  83 */         if (xa >= 0 && xa < this.width && ya >= 0 && ya < this.height) {
/*  84 */           int col = sprite.pixels[x + y * sprite.getWidth()];
/*  85 */           if (col != -16711681) this.pixels[xa + ya * this.width] = col; 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void renderTile(int xp, int yp, Tile tile) {
/*  92 */     xp -= this.xOffset;
/*  93 */     yp -= this.yOffset;
/*  94 */     for (int y = 0; y < tile.sprite.SIZE; y++) {
/*  95 */       int ya = y + yp;
/*  96 */       for (int x = 0; x < tile.sprite.SIZE; x++) {
/*  97 */         int xa = x + xp;
/*  98 */         if (xa < -tile.sprite.SIZE || xa >= this.width || ya < 0 || ya >= this.height)
/*     */           break; 
/* 100 */         if (xa < 0) xa = 0; 
/* 101 */         this.pixels[xa + ya * this.width] = tile.sprite.pixels[x + y * tile.sprite.SIZE];
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void renderProjectile(int xp, int yp, Projectile p) {
/* 107 */     xp -= this.xOffset;
/* 108 */     yp -= this.yOffset;
/* 109 */     for (int y = 0; y < p.getSpriteSize(); y++) {
/* 110 */       int ya = y + yp;
/* 111 */       for (int x = 0; x < p.getSpriteSize(); x++) {
/* 112 */         int xa = x + xp;
/* 113 */         if (xa < -p.getSpriteSize() || xa >= this.width || ya < 0 || ya >= this.height)
/* 114 */           break;  if (xa < 0) xa = 0; 
/* 115 */         int col = (p.getSprite()).pixels[x + y * (p.getSprite()).SIZE];
/* 116 */         if (col != -16711681) this.pixels[xa + ya * this.width] = col; 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void renderMob(int xp, int yp, Mob mob) {
/* 122 */     xp -= this.xOffset;
/* 123 */     yp -= this.yOffset;
/* 124 */     for (int y = 0; y < 32; y++) {
/* 125 */       int ya = y + yp;
/* 126 */       int ys = y;
/* 127 */       for (int x = 0; x < 32; x++) {
/* 128 */         int xa = x + xp;
/* 129 */         int xs = x;
/* 130 */         if (xa < -32 || xa >= this.width || ya < 0 || ya >= this.height)
/* 131 */           break;  if (xa < 0) xa = 0; 
/* 132 */         int col = (mob.getSprite()).pixels[xs + ys * 32];
/*     */ 
/*     */ 
/*     */         
/* 136 */         if (mob instanceof com.Static.Blindsided.entity.mob.Star && col == 255) col = -858832; 
/* 137 */         if (col != -16711681) this.pixels[xa + ya * this.width] = col; 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void renderEnemyMob(int xp, int yp, EnemyMob mob) {
/* 143 */     xp -= this.xOffset;
/* 144 */     yp -= this.yOffset;
/* 145 */     for (int y = 0; y < 32; y++) {
/* 146 */       int ya = y + yp;
/* 147 */       int ys = y;
/* 148 */       for (int x = 0; x < 32; x++) {
/* 149 */         int xa = x + xp;
/* 150 */         int xs = x;
/* 151 */         if (xa < -32 || xa >= this.width || ya < 0 || ya >= this.height)
/* 152 */           break;  if (xa < 0) xa = 0; 
/* 153 */         int col = (mob.getSprite()).pixels[xs + ys * 32];
/*     */         
/* 155 */         if (mob instanceof com.Static.Blindsided.entity.mob.Blitzkrieg && col == 255) col = -858832;
/*     */ 
/*     */         
/* 158 */         if (col != -16711681) this.pixels[xa + ya * this.width] = col; 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void renderMob(int xp, int yp, Sprite sprite, int flip) {
/* 164 */     xp -= this.xOffset;
/* 165 */     yp -= this.yOffset;
/* 166 */     for (int y = 0; y < 32; y++) {
/* 167 */       int ya = y + yp;
/* 168 */       int ys = y;
/* 169 */       if (flip == 2 || flip == 3) ys = 31 - y;
/*     */ 
/*     */       
/* 172 */       for (int x = 0; x < 32; x++) {
/* 173 */         int xa = x + xp;
/* 174 */         int xs = x;
/* 175 */         if (flip == 1 || flip == 3) xs = 31 - x;
/*     */         
/* 177 */         if (xa < -32 || xa >= this.width || ya < 0 || ya >= this.height)
/*     */           break; 
/* 179 */         if (xa < 0) xa = 0; 
/* 180 */         int col = sprite.pixels[xs + ys * 32];
/* 181 */         if (col != -16711681) this.pixels[xa + ya * this.width] = col; 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void renderSwitch(int xp, int yp, Sprite sprite) {
/* 187 */     xp -= this.xOffset;
/* 188 */     yp -= this.yOffset;
/* 189 */     for (int y = 0; y < 16; y++) {
/* 190 */       int ya = y + yp;
/* 191 */       int ys = y;
/*     */ 
/*     */       
/* 194 */       for (int x = 0; x < 16; x++) {
/* 195 */         int xa = x + xp;
/* 196 */         int xs = x;
/*     */         
/* 198 */         if (xa < -16 || xa >= this.width || ya < 0 || ya >= this.height)
/*     */           break; 
/* 200 */         if (xa < 0) xa = 0; 
/* 201 */         int col = sprite.pixels[xs + ys * 16];
/* 202 */         if (col != -16711681) this.pixels[xa + ya * this.width] = col; 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void setOffset(int xOffset, int yOffset) {
/* 208 */     this.xOffset = xOffset;
/* 209 */     this.yOffset = yOffset;
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawRect(int xp, int yp, int width, int height, int color, boolean fixed) {
/* 214 */     if (fixed) {
/* 215 */       xp -= this.xOffset;
/* 216 */       yp -= this.yOffset;
/*     */     } 
/* 218 */     for (int y = yp; y <= yp + height; y++) {
/* 219 */       if (xp < this.width && y >= 0 && y < this.height) {
/* 220 */         if (xp > 0) this.pixels[xp + y * this.width] = color; 
/* 221 */         if (xp + width < this.width && 
/* 222 */           xp + width > 0) this.pixels[xp + width + y * this.width] = color; 
/*     */       } 
/* 224 */     }  for (int x = xp; x < xp + width; x++) {
/* 225 */       if (x >= 0 && x < this.width && yp < this.height) {
/* 226 */         if (yp > 0) this.pixels[x + yp * this.width] = color; 
/* 227 */         if (yp + height < this.height && 
/* 228 */           yp + height > 0) this.pixels[x + (yp + height) * this.width] = color; 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\graphics\Screen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */