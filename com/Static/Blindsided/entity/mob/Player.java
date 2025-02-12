/*     */ package com.Static.Blindsided.entity.mob;
/*     */ 
/*     */ import com.Static.Blindsided.entity.Entity;
/*     */ import com.Static.Blindsided.entity.Spawner.ParticleSpawner;
/*     */ import com.Static.Blindsided.entity.projectile.PlayerProjectile;
/*     */ import com.Static.Blindsided.entity.projectile.Projectile;
/*     */ import com.Static.Blindsided.graphics.AnimatedSprite;
/*     */ import com.Static.Blindsided.graphics.Screen;
/*     */ import com.Static.Blindsided.graphics.Sprite;
/*     */ import com.Static.Blindsided.graphics.SpriteSheet;
/*     */ import com.Static.Blindsided.input.Keyboard;
/*     */ import com.Static.Blindsided.level.Level;
/*     */ import com.Static.Blindsided.level.SpawnLevel;
/*     */ 
/*     */ public class Player
/*     */   extends Mob {
/*     */   private String name;
/*     */   private Keyboard input;
/*     */   private Sprite sprite;
/*  20 */   public static double speed = 1.8D; public static boolean respawn = false; public static boolean respawn2 = false; public static boolean restart = false;
/*     */   public static boolean levelrst = false;
/*  22 */   private AnimatedSprite down = new AnimatedSprite(SpriteSheet.player_down, 32, 32, 3);
/*  23 */   private AnimatedSprite up = new AnimatedSprite(SpriteSheet.player_up, 32, 32, 3);
/*  24 */   private AnimatedSprite left = new AnimatedSprite(SpriteSheet.player_left, 32, 32, 3);
/*  25 */   private AnimatedSprite right = new AnimatedSprite(SpriteSheet.player_right, 32, 32, 3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  32 */   private AnimatedSprite animSprite = this.down;
/*     */   
/*  34 */   private int fireRate = 0;
/*     */   
/*     */   @Deprecated
/*     */   public Player(String name, Keyboard input) {
/*  38 */     this.name = name;
/*  39 */     this.input = input;
/*  40 */     this.sprite = Sprite.player_forward;
/*     */   }
/*     */   
/*     */   public Player(String name, int x, int y, Keyboard input) {
/*  44 */     this.name = name;
/*  45 */     this.x = x;
/*  46 */     this.y = y;
/*  47 */     this.input = input;
/*  48 */     this.sprite = Sprite.player_forward;
/*  49 */     this.fireRate = PlayerProjectile.FIRE_RATE;
/*     */   }
/*     */   
/*     */   public String getName() {
/*  53 */     return this.name;
/*     */   }
/*     */   
/*     */   public void update() {
/*  57 */     if (Keyboard.respawner) {
/*  58 */       respawn = true;
/*  59 */       SpawnLevel.freeze = false;
/*  60 */       SpawnLevel.restartfrz = true;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  65 */     if (this.walking) { this.animSprite.update(); }
/*  66 */     else { this.animSprite.setFrame(0); }
/*  67 */      if (this.fireRate > 0) this.fireRate--; 
/*  68 */     double xa = 0.0D, ya = 0.0D;
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
/*  83 */     if (this.input.up) {
/*  84 */       ya -= speed;
/*  85 */       this.animSprite = this.up;
/*  86 */     }  if (this.input.down) {
/*  87 */       ya += speed;
/*  88 */       this.animSprite = this.down;
/*  89 */     }  if (this.input.left) {
/*  90 */       xa -= speed;
/*  91 */       this.animSprite = this.left;
/*  92 */     }  if (this.input.right) {
/*  93 */       xa += speed;
/*  94 */       this.animSprite = this.right;
/*     */     } 
/*     */     
/*  97 */     if (xa != 0.0D || ya != 0.0D) {
/*     */       
/*  99 */       move(xa, ya);
/* 100 */       this.walking = true;
/*     */     } else {
/* 102 */       this.walking = false;
/*     */     } 
/* 104 */     clear();
/* 105 */     updateShooting();
/*     */     
/* 107 */     if (respawn) {
/* 108 */       if (Level.rborb) {
/* 109 */         this.x = (SpawnLevel.orbx * 16);
/* 110 */         this.y = (SpawnLevel.orby * 16);
/* 111 */       } else if (Level.rborb2) {
/* 112 */         this.x = (SpawnLevel.orbx2 * 16);
/* 113 */         this.y = (SpawnLevel.orby2 * 16);
/* 114 */       } else if (Level.rborb3) {
/* 115 */         this.x = (SpawnLevel.orbx3 * 16);
/* 116 */         this.y = (SpawnLevel.orby3 * 16);
/* 117 */       } else if (Level.rborb4) {
/* 118 */         this.x = (SpawnLevel.orbx4 * 16);
/* 119 */         this.y = (SpawnLevel.orby4 * 16);
/* 120 */       } else if (Level.rborb5) {
/* 121 */         this.x = (SpawnLevel.orbx5 * 16);
/* 122 */         this.y = (SpawnLevel.orby5 * 16);
/* 123 */       } else if (Level.rborb6) {
/* 124 */         this.x = (SpawnLevel.orbx6 * 16);
/* 125 */         this.y = (SpawnLevel.orby6 * 16);
/* 126 */       } else if (Level.rborb7) {
/* 127 */         this.x = (SpawnLevel.orbx7 * 16);
/* 128 */         this.y = (SpawnLevel.orby7 * 16);
/* 129 */       } else if (Level.rborb8) {
/* 130 */         this.x = (SpawnLevel.orbx8 * 16);
/* 131 */         this.y = (SpawnLevel.orby8 * 16);
/* 132 */       } else if (Level.rborb9) {
/* 133 */         this.x = (SpawnLevel.orbx9 * 16);
/* 134 */         this.y = (SpawnLevel.orby9 * 16);
/* 135 */       } else if (Level.rborb10) {
/* 136 */         this.x = (SpawnLevel.orbx10 * 16);
/* 137 */         this.y = (SpawnLevel.orby10 * 16);
/* 138 */       } else if (Level.rborb11) {
/* 139 */         this.x = (SpawnLevel.orbx11 * 16);
/* 140 */         this.y = (SpawnLevel.orby11 * 16);
/* 141 */       } else if (Level.chkpt1) {
/* 142 */         this.x = (SpawnLevel.x10 * 16);
/* 143 */         this.y = (SpawnLevel.y10 * 16);
/* 144 */       } else if (Level.chkpt2) {
/* 145 */         this.x = (SpawnLevel.x20 * 16);
/* 146 */         this.y = (SpawnLevel.y20 * 16);
/* 147 */       } else if (Level.chkpt3) {
/* 148 */         this.x = (SpawnLevel.x30 * 16);
/* 149 */         this.y = (SpawnLevel.y30 * 16);
/* 150 */       } else if (Level.chkpt4) {
/* 151 */         this.x = (SpawnLevel.x40 * 16);
/* 152 */         this.y = (SpawnLevel.y40 * 16);
/* 153 */       } else if (Level.chkpt5) {
/* 154 */         this.x = (SpawnLevel.x50 * 16);
/* 155 */         this.y = (SpawnLevel.y50 * 16);
/* 156 */       } else if (Level.chkpt6) {
/* 157 */         this.x = (SpawnLevel.x60 * 16);
/* 158 */         this.y = (SpawnLevel.y60 * 16);
/* 159 */       } else if (Level.chkpt7) {
/* 160 */         this.x = (SpawnLevel.x70 * 16);
/* 161 */         this.y = (SpawnLevel.y70 * 16);
/* 162 */       } else if (Level.chkpt8) {
/* 163 */         this.x = (SpawnLevel.x80 * 16);
/* 164 */         this.y = (SpawnLevel.y80 * 16);
/* 165 */       } else if (Level.chkpt9) {
/* 166 */         this.x = (SpawnLevel.x90 * 16);
/* 167 */         this.y = (SpawnLevel.y90 * 16);
/* 168 */       } else if (Level.chkpt10) {
/* 169 */         this.x = (SpawnLevel.x11 * 16);
/* 170 */         this.y = (SpawnLevel.y11 * 16);
/*     */       } 
/* 172 */       SpawnLevel.health = SpawnLevel.maxhealth;
/* 173 */       temprst();
/* 174 */       Level.rborb = false;
/* 175 */       Level.rborb2 = false;
/* 176 */       Level.rborb3 = false;
/* 177 */       Level.rborb4 = false;
/* 178 */       Level.rborb5 = false;
/* 179 */       Level.rborb6 = false;
/* 180 */       Level.rborb7 = false;
/* 181 */       Level.rborb8 = false;
/* 182 */       Level.rborb9 = false;
/* 183 */       Level.rborb10 = false;
/* 184 */       Level.rborb11 = false;
/* 185 */       SpawnLevel.freeze = false;
/* 186 */       SpawnLevel.restartfrz = true;
/* 187 */       levelrst = true;
/* 188 */       Level.bossswitch = false;
/* 189 */       Level.burn = false;
/* 190 */       Level.stop = 0;
/* 191 */       respawn2 = true;
/* 192 */       respawn = false;
/* 193 */       SpawnLevel.buttonsoff();
/* 194 */       this.level.add((Entity)new ParticleSpawner((int)this.x, (int)this.y, 30, 15, this.level));
/*     */     } 
/* 196 */     if (restart) {
/* 197 */       this.x = (SpawnLevel.x10 * 16);
/* 198 */       this.y = (SpawnLevel.y10 * 16);
/* 199 */       restart = false;
/* 200 */       levelrst = true;
/* 201 */       Level.rborb = false;
/* 202 */       Level.rborb2 = false;
/* 203 */       Level.rborb3 = false;
/* 204 */       Level.rborb4 = false;
/* 205 */       Level.rborb5 = false;
/* 206 */       Level.rborb6 = false;
/* 207 */       Level.rborb7 = false;
/* 208 */       Level.rborb8 = false;
/* 209 */       Level.rborb9 = false;
/* 210 */       Level.rborb10 = false;
/* 211 */       Level.rborb11 = false;
/* 212 */       Level.butcollrd = false;
/* 213 */       temprst();
/* 214 */       SpawnLevel.freeze = false;
/* 215 */       SpawnLevel.restartfrz = true;
/* 216 */       Level.bossswitch = false;
/* 217 */       Level.burn = false;
/* 218 */       Level.stop = 0;
/* 219 */       SpawnLevel.buttonsoff();
/* 220 */       this.level.add((Entity)new ParticleSpawner((int)this.x, (int)this.y, 30, 15, this.level));
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void temprst() {
/* 225 */     Level.temp = SpawnLevel.maxtemp / 2;
/* 226 */     SpawnLevel.ui.removePanel(Level.hot);
/* 227 */     SpawnLevel.ui.removePanel(Level.hot2);
/* 228 */     SpawnLevel.ui.removePanel(Level.hot3);
/* 229 */     SpawnLevel.ui.removePanel(Level.cold);
/* 230 */     SpawnLevel.ui.removePanel(Level.cold2);
/* 231 */     SpawnLevel.ui.removePanel(Level.cold3);
/*     */   }
/*     */   
/*     */   public void updateShooting() {
/* 235 */     if (SpawnLevel.firerate <= 0) {
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
/*     */ 
/*     */ 
/*     */       
/* 256 */       if (Level.burn) {
/* 257 */         SpawnLevel.firerate = PlayerProjectile.FIRE_RATE + 10;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 268 */       SpawnLevel.firerate = PlayerProjectile.FIRE_RATE;
/* 269 */       shoot(656.0D, 1446.0D, 0.0D);
/* 270 */       shoot(1261.6D, 1046.0D, 3.14D);
/* 271 */       shoot(1136.0D, 1030.0D, 0.0D);
/* 272 */       shoot(1152.0D, 1014.0D, 0.0D);
/* 273 */       shoot(912.0D, 918.0D, 0.0D);
/* 274 */       shoot(1040.0D, 918.0D, 0.0D);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void clear() {
/* 279 */     for (int i = 0; i < this.level.getProjectiles().size(); i++) {
/* 280 */       Projectile p = this.level.getProjectiles().get(i);
/* 281 */       if (p.isRemoved()) this.level.getProjectiles().remove(i);
/*     */     
/*     */     } 
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void render(Screen screen) {
/* 311 */     int flip = 0;
/* 312 */     this.sprite = this.animSprite.getSprite();
/* 313 */     screen.renderMob((int)this.x - 16, (int)this.y - 16, this.sprite, flip);
/*     */   }
/*     */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\entity\mob\Player.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */