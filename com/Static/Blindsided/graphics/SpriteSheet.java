/*     */ package com.Static.Blindsided.graphics;
/*     */ 
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import javax.imageio.ImageIO;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SpriteSheet
/*     */ {
/*     */   private String path;
/*     */   public final int SIZE;
/*     */   public final int SPRITE_WIDTH;
/*     */   public final int SPRITE_HEIGHT;
/*     */   private int width;
/*     */   private int height;
/*     */   public int[] pixels;
/*  21 */   public static SpriteSheet cutscene1 = new SpriteSheet("/textures/cutscene1.png", 400, 225);
/*  22 */   public static SpriteSheet spawn_level = new SpriteSheet("/textures/sheets/spritesheet.png", 256);
/*  23 */   public static SpriteSheet projectile_player = new SpriteSheet("/textures/sheets/projectiles/proj.png", 48);
/*  24 */   public static SpriteSheet speed_orb = new SpriteSheet("/textures/sheets/projectiles/speed_orb.png", 16);
/*  25 */   public static SpriteSheet temp_orb = new SpriteSheet("/textures/sheets/projectiles/temp_orb.png", 16);
/*  26 */   public static SpriteSheet health_orb = new SpriteSheet("/textures/sheets/projectiles/health_orb.png", 16);
/*     */   
/*  28 */   public static SpriteSheet player = new SpriteSheet("/textures/sheets/player_sheet.png", 256, 96);
/*  29 */   public static SpriteSheet player_down = new SpriteSheet(player, 0, 0, 1, 3, 32);
/*  30 */   public static SpriteSheet player_up = new SpriteSheet(player, 1, 0, 1, 3, 32);
/*  31 */   public static SpriteSheet player_left = new SpriteSheet(player, 2, 0, 1, 3, 32);
/*  32 */   public static SpriteSheet player_right = new SpriteSheet(player, 3, 0, 1, 3, 32);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  41 */   public static SpriteSheet ghoul = new SpriteSheet("/textures/sheets/player_sheet.png", 256, 96);
/*  42 */   public static SpriteSheet ghoul_down = new SpriteSheet(ghoul, 4, 0, 1, 3, 32);
/*  43 */   public static SpriteSheet ghoul_up = new SpriteSheet(ghoul, 5, 0, 1, 3, 32);
/*  44 */   public static SpriteSheet ghoul_left = new SpriteSheet(ghoul, 6, 0, 1, 3, 32);
/*  45 */   public static SpriteSheet ghoul_right = new SpriteSheet(ghoul, 7, 0, 1, 3, 32);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Sprite[] sprites;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SpriteSheet(SpriteSheet sheet, int x, int y, int width, int height, int spriteSize) {
/*  56 */     int xx = x * spriteSize;
/*  57 */     int yy = y * spriteSize;
/*  58 */     int w = width * spriteSize;
/*  59 */     int h = height * spriteSize;
/*     */     
/*  61 */     if (width == height) { this.SIZE = width; }
/*  62 */     else { this.SIZE = -1; }
/*  63 */      this.SPRITE_WIDTH = w;
/*  64 */     this.SPRITE_HEIGHT = h;
/*  65 */     this.pixels = new int[w * h];
/*  66 */     for (int y0 = 0; y0 < h; y0++) {
/*  67 */       int yp = yy + y0;
/*     */       
/*  69 */       for (int x0 = 0; x0 < w; x0++) {
/*  70 */         int xp = xx + x0;
/*  71 */         this.pixels[x0 + y0 * w] = sheet.pixels[xp + yp * sheet.SPRITE_WIDTH];
/*     */       } 
/*     */     } 
/*     */     
/*  75 */     int frame = 0;
/*  76 */     this.sprites = new Sprite[width * height];
/*  77 */     for (int ya = 0; ya < height; ya++) {
/*  78 */       for (int xa = 0; xa < width; xa++) {
/*  79 */         int[] spritePixels = new int[spriteSize * spriteSize];
/*  80 */         for (int i = 0; i < spriteSize; i++) {
/*  81 */           for (int x0 = 0; x0 < spriteSize; x0++) {
/*  82 */             spritePixels[x0 + i * spriteSize] = this.pixels[x0 + xa * spriteSize + (i + ya * spriteSize) * this.SPRITE_WIDTH];
/*     */           }
/*     */         } 
/*     */         
/*  86 */         Sprite sprite = new Sprite(spritePixels, spriteSize, spriteSize);
/*  87 */         this.sprites[frame++] = sprite;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpriteSheet(String path, int size) {
/*  95 */     this.path = path;
/*  96 */     this.SIZE = size;
/*  97 */     this.SPRITE_WIDTH = size;
/*  98 */     this.SPRITE_HEIGHT = size;
/*  99 */     this.pixels = new int[this.SIZE * this.SIZE];
/* 100 */     load();
/*     */   }
/*     */   
/*     */   public SpriteSheet(String path, int width, int height) {
/* 104 */     this.path = path;
/* 105 */     this.SIZE = -1;
/* 106 */     this.SPRITE_WIDTH = width;
/* 107 */     this.SPRITE_HEIGHT = height;
/* 108 */     this.pixels = new int[this.SPRITE_WIDTH * this.SPRITE_HEIGHT];
/* 109 */     load();
/*     */   }
/*     */   
/*     */   public Sprite[] getSprites() {
/* 113 */     return this.sprites;
/*     */   }
/*     */   
/*     */   public int getWidth() {
/* 117 */     return this.width;
/*     */   }
/*     */   
/*     */   public int getHeight() {
/* 121 */     return this.height;
/*     */   }
/*     */   
/*     */   public int[] getPixels() {
/* 125 */     return this.pixels;
/*     */   }
/*     */   
/*     */   private void load() {
/*     */     try {
/* 130 */       System.out.print("Trying to load: " + this.path + "...");
/* 131 */       BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(this.path));
/* 132 */       System.out.println(" succeeded");
/* 133 */       this.width = image.getWidth();
/* 134 */       this.height = image.getHeight();
/* 135 */       this.pixels = new int[this.width * this.height];
/* 136 */       image.getRGB(0, 0, this.width, this.height, this.pixels, 0, this.width);
/*     */     }
/* 138 */     catch (IOException e) {
/* 139 */       e.printStackTrace();
/* 140 */     } catch (Exception e) {
/* 141 */       System.out.println(" failed");
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\graphics\SpriteSheet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */