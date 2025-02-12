/*     */ package com.Static.Blindsided.graphics;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Sprite
/*     */ {
/*     */   public final int SIZE;
/*     */   private int x;
/*     */   private int y;
/*     */   private int width;
/*     */   private int height;
/*     */   public int[] pixels;
/*     */   protected SpriteSheet sheet;
/*  16 */   public static Sprite voidsprite = new Sprite(16, 0);
/*  17 */   public static Sprite white = new Sprite(16, 8, 1, SpriteSheet.spawn_level);
/*  18 */   public static Sprite nosprite = new Sprite(16, 0, 7, SpriteSheet.spawn_level);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  24 */   public static Sprite spawn_floor = new Sprite(16, 0, 1, SpriteSheet.spawn_level);
/*  25 */   public static Sprite spawn_floor2 = new Sprite(16, 0, 0, SpriteSheet.spawn_level);
/*  26 */   public static Sprite spawn_floor3 = new Sprite(16, 0, 2, SpriteSheet.spawn_level);
/*  27 */   public static Sprite spawn_tube = new Sprite(16, 3, 2, SpriteSheet.spawn_level);
/*  28 */   public static Sprite spawn_flamebl = new Sprite(16, 6, 1, SpriteSheet.spawn_level);
/*  29 */   public static Sprite spawn_flamegr = new Sprite(16, 6, 0, SpriteSheet.spawn_level);
/*  30 */   public static Sprite spawn_flamerd = new Sprite(16, 7, 0, SpriteSheet.spawn_level);
/*  31 */   public static Sprite spawn_flameemp = new Sprite(16, 7, 1, SpriteSheet.spawn_level);
/*  32 */   public static Sprite spawn_flamedoor = new Sprite(16, 7, 4, SpriteSheet.spawn_level);
/*  33 */   public static Sprite spawn_sign = new Sprite(16, 3, 3, SpriteSheet.spawn_level);
/*  34 */   public static Sprite spawn_signred = new Sprite(16, 11, 2, SpriteSheet.spawn_level);
/*  35 */   public static Sprite spawn_signgold = new Sprite(16, 0, 6, SpriteSheet.spawn_level);
/*  36 */   public static Sprite spawn_buttongr = new Sprite(16, 1, 0, SpriteSheet.spawn_level);
/*  37 */   public static Sprite spawn_buttondowngr = new Sprite(16, 2, 0, SpriteSheet.spawn_level);
/*  38 */   public static Sprite spawn_buttonbl = new Sprite(16, 1, 4, SpriteSheet.spawn_level);
/*  39 */   public static Sprite spawn_buttondownbl = new Sprite(16, 2, 4, SpriteSheet.spawn_level);
/*  40 */   public static Sprite spawn_buttonrd = new Sprite(16, 3, 4, SpriteSheet.spawn_level);
/*  41 */   public static Sprite spawn_buttondownrd = new Sprite(16, 4, 4, SpriteSheet.spawn_level);
/*  42 */   public static Sprite spawn_buttonyl = new Sprite(16, 5, 4, SpriteSheet.spawn_level);
/*  43 */   public static Sprite spawn_buttondownyl = new Sprite(16, 6, 4, SpriteSheet.spawn_level);
/*  44 */   public static Sprite spawn_opendoorgr = new Sprite(16, 2, 1, SpriteSheet.spawn_level);
/*  45 */   public static Sprite spawn_opendoorgr2 = new Sprite(16, 1, 3, SpriteSheet.spawn_level);
/*  46 */   public static Sprite spawn_opendoorbl = new Sprite(16, 2, 5, SpriteSheet.spawn_level);
/*  47 */   public static Sprite spawn_opendoorbl2 = new Sprite(16, 1, 7, SpriteSheet.spawn_level);
/*  48 */   public static Sprite spawn_opendoorrd = new Sprite(16, 4, 5, SpriteSheet.spawn_level);
/*  49 */   public static Sprite spawn_opendoorrd2 = new Sprite(16, 3, 7, SpriteSheet.spawn_level);
/*  50 */   public static Sprite spawn_opendooryl = new Sprite(16, 6, 5, SpriteSheet.spawn_level);
/*  51 */   public static Sprite spawn_opendooryl2 = new Sprite(16, 5, 7, SpriteSheet.spawn_level);
/*  52 */   public static Sprite spawn_wall1 = new Sprite(16, 0, 3, SpriteSheet.spawn_level);
/*  53 */   public static Sprite spawn_wall2 = new Sprite(16, 0, 4, SpriteSheet.spawn_level);
/*  54 */   public static Sprite spawn_wall3 = new Sprite(16, 10, 3, SpriteSheet.spawn_level);
/*  55 */   public static Sprite spawn_wall4 = new Sprite(16, 10, 4, SpriteSheet.spawn_level);
/*  56 */   public static Sprite spawn_leftproj = new Sprite(16, 3, 1, SpriteSheet.spawn_level);
/*  57 */   public static Sprite spawn_rightproj = new Sprite(16, 3, 6, SpriteSheet.spawn_level);
/*  58 */   public static Sprite spawn_sep = new Sprite(16, 3, 0, SpriteSheet.spawn_level);
/*  59 */   public static Sprite spawn_sep2 = new Sprite(16, 5, 6, SpriteSheet.spawn_level);
/*  60 */   public static Sprite spawn_tubebrk = new Sprite(16, 0, 5, SpriteSheet.spawn_level);
/*  61 */   public static Sprite spawn_tubebrk2 = new Sprite(16, 1, 6, SpriteSheet.spawn_level);
/*  62 */   public static Sprite spawn_closedoorgr = new Sprite(16, 1, 1, SpriteSheet.spawn_level);
/*  63 */   public static Sprite spawn_closedoorgr2 = new Sprite(16, 2, 2, SpriteSheet.spawn_level);
/*  64 */   public static Sprite spawn_closedoorbl = new Sprite(16, 1, 5, SpriteSheet.spawn_level);
/*  65 */   public static Sprite spawn_closedoorbl2 = new Sprite(16, 2, 6, SpriteSheet.spawn_level);
/*  66 */   public static Sprite spawn_closedoorrd = new Sprite(16, 3, 5, SpriteSheet.spawn_level);
/*  67 */   public static Sprite spawn_closedoorrd2 = new Sprite(16, 4, 6, SpriteSheet.spawn_level);
/*  68 */   public static Sprite spawn_closedooryl = new Sprite(16, 5, 5, SpriteSheet.spawn_level);
/*  69 */   public static Sprite spawn_closedooryl2 = new Sprite(16, 6, 6, SpriteSheet.spawn_level);
/*  70 */   public static Sprite exit = new Sprite(16, 8, 5, SpriteSheet.spawn_level);
/*  71 */   public static Sprite exit2 = new Sprite(16, 9, 5, SpriteSheet.spawn_level);
/*  72 */   public static Sprite light = new Sprite(16, 6, 9, SpriteSheet.spawn_level);
/*  73 */   public static Sprite light2 = new Sprite(16, 7, 9, SpriteSheet.spawn_level);
/*  74 */   public static Sprite light3 = new Sprite(16, 8, 9, SpriteSheet.spawn_level);
/*  75 */   public static Sprite light4 = new Sprite(16, 9, 9, SpriteSheet.spawn_level);
/*  76 */   public static Sprite light5 = new Sprite(16, 7, 10, SpriteSheet.spawn_level);
/*  77 */   public static Sprite light6 = new Sprite(16, 8, 10, SpriteSheet.spawn_level);
/*     */   
/*  79 */   public static Sprite wall_end = new Sprite(16, 1, 2, SpriteSheet.spawn_level);
/*  80 */   public static Sprite wall_end2 = new Sprite(16, 11, 3, SpriteSheet.spawn_level);
/*  81 */   public static Sprite wall_end3 = new Sprite(16, 8, 8, SpriteSheet.spawn_level);
/*  82 */   public static Sprite wall_end4 = new Sprite(16, 9, 8, SpriteSheet.spawn_level);
/*  83 */   public static Sprite wall_end5 = new Sprite(16, 11, 4, SpriteSheet.spawn_level);
/*  84 */   public static Sprite wall_end6 = new Sprite(16, 7, 11, SpriteSheet.spawn_level);
/*  85 */   public static Sprite wall_endgr = new Sprite(16, 2, 3, SpriteSheet.spawn_level);
/*  86 */   public static Sprite wall_endbl = new Sprite(16, 2, 7, SpriteSheet.spawn_level);
/*  87 */   public static Sprite wall_endrd = new Sprite(16, 4, 7, SpriteSheet.spawn_level);
/*  88 */   public static Sprite wall_endyl = new Sprite(16, 6, 7, SpriteSheet.spawn_level);
/*     */   
/*  90 */   public static Sprite spawn_startpad1tl = new Sprite(16, 4, 0, SpriteSheet.spawn_level);
/*  91 */   public static Sprite spawn_startpad1tr = new Sprite(16, 5, 0, SpriteSheet.spawn_level);
/*  92 */   public static Sprite spawn_startpad1bl = new Sprite(16, 4, 1, SpriteSheet.spawn_level);
/*  93 */   public static Sprite spawn_startpad1br = new Sprite(16, 5, 1, SpriteSheet.spawn_level);
/*     */   
/*  95 */   public static Sprite spawn_startpad2tl = new Sprite(16, 4, 2, SpriteSheet.spawn_level);
/*  96 */   public static Sprite spawn_startpad2tr = new Sprite(16, 5, 2, SpriteSheet.spawn_level);
/*  97 */   public static Sprite spawn_startpad2bl = new Sprite(16, 4, 3, SpriteSheet.spawn_level);
/*  98 */   public static Sprite spawn_startpad2br = new Sprite(16, 5, 3, SpriteSheet.spawn_level);
/*     */   
/* 100 */   public static Sprite spawn_startpad3tl = new Sprite(16, 6, 2, SpriteSheet.spawn_level);
/* 101 */   public static Sprite spawn_startpad3tr = new Sprite(16, 7, 2, SpriteSheet.spawn_level);
/* 102 */   public static Sprite spawn_startpad3bl = new Sprite(16, 6, 3, SpriteSheet.spawn_level);
/* 103 */   public static Sprite spawn_startpad3br = new Sprite(16, 7, 3, SpriteSheet.spawn_level);
/*     */ 
/*     */ 
/*     */   
/* 107 */   public static Sprite player_forward = new Sprite(32, 0, 0, SpriteSheet.player_down);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 125 */   public static Sprite ghoul = new Sprite(32, 0, 0, SpriteSheet.ghoul_down);
/*     */   
/* 127 */   public static Sprite lock = new Sprite(16, 8, 6, SpriteSheet.spawn_level);
/* 128 */   public static Sprite key = new Sprite(16, 9, 6, SpriteSheet.spawn_level);
/*     */ 
/*     */   
/* 131 */   public static Sprite projectile_player = new Sprite(16, 0, 0, SpriteSheet.projectile_player);
/* 132 */   public static Sprite projectile_enemy = new Sprite(16, 1, 0, SpriteSheet.projectile_player);
/* 133 */   public static Sprite speed_orb = new Sprite(16, 0, 0, SpriteSheet.speed_orb);
/* 134 */   public static Sprite temp_orb = new Sprite(16, 0, 0, SpriteSheet.temp_orb);
/* 135 */   public static Sprite health_orb = new Sprite(16, 0, 0, SpriteSheet.health_orb);
/* 136 */   public static Sprite rb_orb = new Sprite(16, 7, 5, SpriteSheet.spawn_level);
/* 137 */   public static Sprite end_orb = new Sprite(16, 7, 4, SpriteSheet.spawn_level);
/* 138 */   public static Sprite empty = new Sprite(16, 7, 7, SpriteSheet.spawn_level);
/*     */ 
/*     */   
/* 141 */   public static Sprite particle_enemy = new Sprite(3, 4511231);
/*     */   
/* 143 */   public static Sprite particle_player = new Sprite(3, 6411379);
/* 144 */   public static Sprite square = new Sprite(2, 16711680);
/* 145 */   public static Sprite border1 = new Sprite(16, 9, 1, SpriteSheet.spawn_level);
/* 146 */   public static Sprite border2 = new Sprite(16, 10, 1, SpriteSheet.spawn_level);
/* 147 */   public static Sprite border3 = new Sprite(16, 10, 2, SpriteSheet.spawn_level);
/*     */ 
/*     */   
/* 150 */   public static Sprite enemy = new Sprite(16, 10, 5, SpriteSheet.spawn_level);
/* 151 */   public static Sprite enemy2 = new Sprite(16, 11, 5, SpriteSheet.spawn_level);
/* 152 */   public static Sprite enemy3 = new Sprite(16, 12, 5, SpriteSheet.spawn_level);
/* 153 */   public static Sprite enemy4 = new Sprite(16, 13, 5, SpriteSheet.spawn_level);
/* 154 */   public static Sprite enemy5 = new Sprite(16, 14, 5, SpriteSheet.spawn_level);
/* 155 */   public static Sprite enemy6 = new Sprite(16, 10, 6, SpriteSheet.spawn_level);
/* 156 */   public static Sprite enemy7 = new Sprite(16, 11, 6, SpriteSheet.spawn_level);
/* 157 */   public static Sprite enemy8 = new Sprite(16, 12, 6, SpriteSheet.spawn_level);
/* 158 */   public static Sprite enemy9 = new Sprite(16, 13, 6, SpriteSheet.spawn_level);
/* 159 */   public static Sprite enemy10 = new Sprite(16, 14, 6, SpriteSheet.spawn_level);
/* 160 */   public static Sprite enemy11 = new Sprite(16, 10, 7, SpriteSheet.spawn_level);
/* 161 */   public static Sprite enemy12 = new Sprite(16, 11, 7, SpriteSheet.spawn_level);
/* 162 */   public static Sprite enemy13 = new Sprite(16, 12, 7, SpriteSheet.spawn_level);
/* 163 */   public static Sprite enemy14 = new Sprite(16, 13, 7, SpriteSheet.spawn_level);
/* 164 */   public static Sprite enemy15 = new Sprite(16, 14, 7, SpriteSheet.spawn_level);
/* 165 */   public static Sprite enemy16 = new Sprite(16, 10, 8, SpriteSheet.spawn_level);
/* 166 */   public static Sprite enemy17 = new Sprite(16, 11, 8, SpriteSheet.spawn_level);
/* 167 */   public static Sprite enemy18 = new Sprite(16, 12, 8, SpriteSheet.spawn_level);
/* 168 */   public static Sprite enemy19 = new Sprite(16, 13, 8, SpriteSheet.spawn_level);
/* 169 */   public static Sprite enemy20 = new Sprite(16, 14, 8, SpriteSheet.spawn_level);
/* 170 */   public static Sprite enemy21 = new Sprite(16, 10, 9, SpriteSheet.spawn_level);
/* 171 */   public static Sprite enemy22 = new Sprite(16, 11, 9, SpriteSheet.spawn_level);
/* 172 */   public static Sprite enemy23 = new Sprite(16, 12, 9, SpriteSheet.spawn_level);
/* 173 */   public static Sprite enemy24 = new Sprite(16, 13, 9, SpriteSheet.spawn_level);
/* 174 */   public static Sprite enemy25 = new Sprite(16, 14, 9, SpriteSheet.spawn_level);
/*     */   
/* 176 */   public static Sprite e2enemy = new Sprite(16, 10, 10, SpriteSheet.spawn_level);
/* 177 */   public static Sprite e2enemy2 = new Sprite(16, 11, 10, SpriteSheet.spawn_level);
/* 178 */   public static Sprite e2enemy3 = new Sprite(16, 12, 10, SpriteSheet.spawn_level);
/* 179 */   public static Sprite e2enemy4 = new Sprite(16, 13, 10, SpriteSheet.spawn_level);
/* 180 */   public static Sprite e2enemy5 = new Sprite(16, 14, 10, SpriteSheet.spawn_level);
/* 181 */   public static Sprite e2enemy6 = new Sprite(16, 10, 11, SpriteSheet.spawn_level);
/* 182 */   public static Sprite e2enemy7 = new Sprite(16, 11, 11, SpriteSheet.spawn_level);
/* 183 */   public static Sprite e2enemy8 = new Sprite(16, 12, 11, SpriteSheet.spawn_level);
/* 184 */   public static Sprite e2enemy9 = new Sprite(16, 13, 11, SpriteSheet.spawn_level);
/* 185 */   public static Sprite e2enemy10 = new Sprite(16, 14, 11, SpriteSheet.spawn_level);
/* 186 */   public static Sprite e2enemy11 = new Sprite(16, 10, 12, SpriteSheet.spawn_level);
/* 187 */   public static Sprite e2enemy12 = new Sprite(16, 11, 12, SpriteSheet.spawn_level);
/* 188 */   public static Sprite e2enemy13 = new Sprite(16, 12, 12, SpriteSheet.spawn_level);
/* 189 */   public static Sprite e2enemy14 = new Sprite(16, 13, 12, SpriteSheet.spawn_level);
/* 190 */   public static Sprite e2enemy15 = new Sprite(16, 14, 12, SpriteSheet.spawn_level);
/* 191 */   public static Sprite e2enemy16 = new Sprite(16, 10, 13, SpriteSheet.spawn_level);
/* 192 */   public static Sprite e2enemy17 = new Sprite(16, 11, 13, SpriteSheet.spawn_level);
/* 193 */   public static Sprite e2enemy18 = new Sprite(16, 12, 13, SpriteSheet.spawn_level);
/* 194 */   public static Sprite e2enemy19 = new Sprite(16, 13, 13, SpriteSheet.spawn_level);
/* 195 */   public static Sprite e2enemy20 = new Sprite(16, 14, 13, SpriteSheet.spawn_level);
/* 196 */   public static Sprite e2enemy21 = new Sprite(16, 10, 14, SpriteSheet.spawn_level);
/* 197 */   public static Sprite e2enemy22 = new Sprite(16, 11, 14, SpriteSheet.spawn_level);
/* 198 */   public static Sprite e2enemy23 = new Sprite(16, 12, 14, SpriteSheet.spawn_level);
/* 199 */   public static Sprite e2enemy24 = new Sprite(16, 13, 14, SpriteSheet.spawn_level);
/* 200 */   public static Sprite e2enemy25 = new Sprite(16, 14, 14, SpriteSheet.spawn_level);
/*     */ 
/*     */   
/*     */   protected Sprite(SpriteSheet sheet, int width, int height) {
/* 204 */     this.SIZE = (width == height) ? width : -1;
/*     */     
/* 206 */     this.width = width;
/* 207 */     this.height = height;
/* 208 */     this.sheet = sheet;
/*     */   }
/*     */   
/*     */   public Sprite(int size, int x, int y, SpriteSheet sheet) {
/* 212 */     this.SIZE = size;
/* 213 */     this.width = size;
/* 214 */     this.height = size;
/* 215 */     this.pixels = new int[this.SIZE * this.SIZE];
/* 216 */     this.x = x * size;
/* 217 */     this.y = y * size;
/* 218 */     this.sheet = sheet;
/* 219 */     load();
/*     */   }
/*     */   
/*     */   public Sprite(int width, int height, int color) {
/* 223 */     this.SIZE = -1;
/* 224 */     this.width = width;
/* 225 */     this.height = height;
/* 226 */     this.pixels = new int[width * height];
/* 227 */     setColor(color);
/*     */   }
/*     */   
/*     */   public Sprite(int size, int color) {
/* 231 */     this.SIZE = size;
/* 232 */     this.width = size;
/* 233 */     this.height = size;
/* 234 */     this.pixels = new int[this.SIZE * this.SIZE];
/* 235 */     setColor(color);
/*     */   }
/*     */   
/*     */   public Sprite(int[] pixels, int width, int height) {
/* 239 */     this.SIZE = (width == height) ? width : -1;
/* 240 */     this.width = width;
/* 241 */     this.height = height;
/* 242 */     this.pixels = new int[pixels.length];
/*     */     
/* 244 */     for (int i = 0; i < pixels.length; i++) {
/* 245 */       this.pixels[i] = pixels[i];
/*     */     }
/*     */   }
/*     */   
/*     */   public static Sprite rotate(Sprite sprite, double angle) {
/* 250 */     return new Sprite(rotate(sprite.pixels, sprite.width, sprite.height, angle), sprite.width, sprite.height);
/*     */   }
/*     */ 
/*     */   
/*     */   private static int[] rotate(int[] pixels, int width, int height, double angle) {
/* 255 */     int[] result = new int[width * height];
/*     */     
/* 257 */     double nx_x = rot_x(-angle, 1.0D, 0.0D);
/* 258 */     double nx_y = rot_y(-angle, 1.0D, 0.0D);
/* 259 */     double ny_x = rot_x(-angle, 0.0D, 1.0D);
/* 260 */     double ny_y = rot_y(-angle, 0.0D, 1.0D);
/*     */ 
/*     */     
/* 263 */     double x0 = rot_x(-angle, -width / 2.0D, -height / 2.0D) + width / 2.0D;
/* 264 */     double y0 = rot_y(-angle, -width / 2.0D, -height / 2.0D) + height / 2.0D;
/*     */     
/* 266 */     for (int y = 0; y < height; y++) {
/* 267 */       double x1 = x0;
/* 268 */       double y1 = y0;
/* 269 */       for (int x = 0; x < width; x++) {
/* 270 */         int xx = (int)x1;
/* 271 */         int yy = (int)y1;
/* 272 */         int col = 0;
/* 273 */         if (xx < 0 || xx >= width || yy < 0 || yy >= height) { col = -16711681; }
/* 274 */         else { col = pixels[xx + yy * width]; }
/* 275 */          result[x + y * width] = col;
/* 276 */         x1 += nx_x;
/* 277 */         y1 += nx_y;
/*     */       } 
/* 279 */       x0 += ny_x;
/* 280 */       y0 += ny_y;
/*     */     } 
/*     */     
/* 283 */     return result;
/*     */   }
/*     */   
/*     */   private static double rot_x(double angle, double x, double y) {
/* 287 */     double cos = Math.cos(angle - 1.5707963267948966D);
/* 288 */     double sin = Math.sin(angle - 1.5707963267948966D);
/* 289 */     return x * cos + y * -sin;
/*     */   }
/*     */   
/*     */   private static double rot_y(double angle, double x, double y) {
/* 293 */     double cos = Math.cos(angle - 1.5707963267948966D);
/* 294 */     double sin = Math.sin(angle - 1.5707963267948966D);
/* 295 */     return x * sin + y * cos;
/*     */   }
/*     */   
/*     */   public static Sprite[] split(SpriteSheet sheet) {
/* 299 */     int amount = sheet.getWidth() * sheet.getHeight() / sheet.SPRITE_WIDTH * sheet.SPRITE_HEIGHT;
/* 300 */     Sprite[] sprites = new Sprite[amount];
/* 301 */     int current = 0;
/* 302 */     int[] pixels = new int[sheet.SPRITE_WIDTH * sheet.SPRITE_HEIGHT];
/*     */     
/* 304 */     for (int yp = 0; yp < sheet.getHeight() / sheet.SPRITE_HEIGHT; yp++) {
/* 305 */       for (int xp = 0; xp < sheet.getWidth() / sheet.SPRITE_WIDTH; xp++) {
/*     */         
/* 307 */         for (int y = 0; y < sheet.SPRITE_HEIGHT; y++) {
/* 308 */           for (int x = 0; x < sheet.SPRITE_WIDTH; x++) {
/* 309 */             int xo = x + xp * sheet.SPRITE_WIDTH;
/* 310 */             int yo = y + yp * sheet.SPRITE_HEIGHT;
/* 311 */             pixels[x + y * sheet.SPRITE_WIDTH] = sheet.getPixels()[xo + yo * sheet.getWidth()];
/*     */           } 
/*     */         } 
/* 314 */         sprites[current++] = new Sprite(pixels, sheet.SPRITE_WIDTH, sheet.SPRITE_HEIGHT);
/*     */       } 
/*     */     } 
/*     */     
/* 318 */     return sprites;
/*     */   }
/*     */   
/*     */   public Sprite(int[] pixels, int size) {
/* 322 */     this.SIZE = this.width = this.height = size;
/* 323 */     this.pixels = pixels;
/*     */   }
/*     */   
/*     */   private void setColor(int color) {
/* 327 */     for (int i = 0; i < this.width * this.height; i++) {
/* 328 */       this.pixels[i] = color;
/*     */     }
/*     */   }
/*     */   
/*     */   public int getWidth() {
/* 333 */     return this.width;
/*     */   }
/*     */   
/*     */   public int getHeight() {
/* 337 */     return this.height;
/*     */   }
/*     */   
/*     */   private void load() {
/* 341 */     for (int y = 0; y < this.height; y++) {
/* 342 */       for (int x = 0; x < this.width; x++)
/* 343 */         this.pixels[x + y * this.width] = this.sheet.pixels[x + this.x + (y + this.y) * this.sheet.SPRITE_WIDTH]; 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\graphics\Sprite.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */