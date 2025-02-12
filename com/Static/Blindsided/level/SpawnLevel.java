/*     */ package com.Static.Blindsided.level;
/*     */ 
/*     */ import com.Static.Blindsided.entity.Entity;
/*     */ import com.Static.Blindsided.entity.mob.Blitzkrieg;
/*     */ import com.Static.Blindsided.entity.mob.Player;
/*     */ import com.Static.Blindsided.graphics.UI.UIActionListener;
/*     */ import com.Static.Blindsided.graphics.UI.UIBars;
/*     */ import com.Static.Blindsided.graphics.UI.UIButton;
/*     */ import com.Static.Blindsided.graphics.UI.UIComponent;
/*     */ import com.Static.Blindsided.graphics.UI.UILabel;
/*     */ import com.Static.Blindsided.input.Keyboard;
/*     */ import com.Static.Blindsided.util.Vector2i;
/*     */ import java.awt.Font;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import javax.imageio.ImageIO;
/*     */ 
/*     */ public class SpawnLevel
/*     */   extends Level
/*     */ {
/*     */   private UIButton button;
/*  23 */   public static int roomtemp = 600, tester = 0;
/*  24 */   public static int maxtemp = 1200;
/*  25 */   public static int maxhealth = 1000;
/*  26 */   public static int firerate = 0; public static boolean x1 = false; public static boolean x2 = false;
/*     */   public static boolean x3 = false;
/*     */   public BufferedImage flake;
/*  29 */   public static int orbx = 187, orby = 29; public BufferedImage flame; public BufferedImage time; public BufferedImage warning1; public BufferedImage warning2;
/*  30 */   public static int orbx2 = 3, orby2 = 78;
/*  31 */   public static int orbx3 = 33, orby3 = 77;
/*  32 */   public static int orbx4 = 12, orby4 = 47;
/*  33 */   public static int orbx5 = 125, orby5 = 84;
/*  34 */   public static int orbx6 = 14, orby6 = 32;
/*  35 */   public static int orbx7 = 69, orby7 = 49;
/*  36 */   public static int orbx8 = 24, orby8 = 67;
/*  37 */   public static int orbx9 = 77, orby9 = 40;
/*  38 */   public static int orbx10 = 43, orby10 = 72;
/*  39 */   public static int orbx11 = 77, orby11 = 30;
/*  40 */   public static int x10 = 49, y10 = 96;
/*  41 */   public static int x20 = 70, y20 = 69;
/*  42 */   public static int x30 = 58, y30 = 49;
/*  43 */   public static int x40 = 35, y40 = 77;
/*  44 */   public static int x50 = 3, y50 = 74;
/*  45 */   public static int x60 = 23, y60 = 51;
/*  46 */   public static int x70 = 26, y70 = 7;
/*  47 */   public static int x80 = 120, y80 = 62;
/*  48 */   public static int x90 = 41, y90 = 57;
/*  49 */   public static int x11 = 68, y11 = 33;
/*     */   public SpawnLevel(String path) {
/*  51 */     super(path);
/*  52 */     ui.addPanel(this.panel);
/*     */     
/*  54 */     UILabel resume = new UILabel(new Vector2i(150, 78), "Resume");
/*  55 */     resume.setColor(15395562, false);
/*  56 */     resume.setFont(new Font("Arial", 1, 60));
/*  57 */     resume.dropShadow = true;
/*  58 */     this.pausemenu.addComponent((UIComponent)resume);
/*     */     
/*  60 */     UILabel restart = new UILabel(new Vector2i(150, 198), "Restart");
/*  61 */     restart.setColor(15395562, false);
/*  62 */     restart.setFont(new Font("Arial", 1, 60));
/*  63 */     restart.dropShadow = true;
/*  64 */     this.pausemenu.addComponent((UIComponent)restart);
/*     */     
/*  66 */     UILabel help = new UILabel(new Vector2i(150, 318), "Help");
/*  67 */     help.setColor(15395562, false);
/*  68 */     help.setFont(new Font("Arial", 1, 60));
/*  69 */     help.dropShadow = true;
/*  70 */     this.pausemenu.addComponent((UIComponent)help);
/*     */     
/*  72 */     UILabel sound = new UILabel(new Vector2i(150, 438), "Sound");
/*  73 */     sound.setColor(15395562, false);
/*  74 */     sound.setFont(new Font("Arial", 1, 60));
/*  75 */     sound.dropShadow = true;
/*  76 */     this.pausemenu.addComponent((UIComponent)sound);
/*     */     
/*  78 */     UILabel exit = new UILabel(new Vector2i(150, 558), "Exit");
/*  79 */     exit.setColor(15395562, false);
/*  80 */     exit.setFont(new Font("Arial", 1, 60));
/*  81 */     exit.dropShadow = true;
/*  82 */     this.pausemenu.addComponent((UIComponent)exit);
/*     */     
/*  84 */     this.uiHealthBar = new UIBars(new Vector2i(30, 240), new Vector2i(230, 25));
/*  85 */     this.uiHealthBar.setColor(13290186, false);
/*  86 */     this.uiHealthBar.setForegroundColor(15746630);
/*  87 */     this.panel.addComponent((UIComponent)this.uiHealthBar);
/*     */     
/*  89 */     this.uiTempBar = new UIBars(new Vector2i(30, 300), new Vector2i(230, 25));
/*  90 */     this.uiTempBar.setColor(13290186, false);
/*  91 */     this.uiTempBar.setForegroundColor(2463162);
/*  92 */     this.panel.addComponent((UIComponent)this.uiTempBar);
/*     */     
/*  94 */     UILabel hplabel = new UILabel((new Vector2i(this.uiHealthBar.position)).add(new Vector2i(6, 18)), "HP");
/*  95 */     hplabel.setColor(16777215, false);
/*  96 */     hplabel.setFont(new Font("Arial", 0, 18));
/*  97 */     this.panel.addComponent((UIComponent)hplabel);
/*     */     
/*  99 */     UILabel templabel = new UILabel((new Vector2i(this.uiTempBar.position)).add(new Vector2i(6, 18)), "Temp");
/* 100 */     templabel.setColor(16777215, false);
/* 101 */     templabel.setFont(new Font("Arial", 0, 18));
/* 102 */     this.panel.addComponent((UIComponent)templabel);
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
/*     */   protected void loadLevel(String path) {
/*     */     try {
/* 126 */       BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
/* 127 */       int w = this.width = image.getWidth();
/* 128 */       int h = this.height = image.getHeight();
/* 129 */       this.tiles = new int[w * h];
/* 130 */       image.getRGB(0, 0, w, h, this.tiles, 0, w);
/* 131 */     } catch (IOException e) {
/* 132 */       e.printStackTrace();
/* 133 */       System.out.println("Exception! couldn't load level file.");
/*     */     } 
/* 135 */     for (int i = 0; i < 1; i++)
/*     */     {
/*     */ 
/*     */       
/* 139 */       add((Entity)new Blitzkrieg(Blitzkrieg.x10, Blitzkrieg.y10));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void generateLevel() {}
/*     */ 
/*     */   
/*     */   public void temperature() {
/*     */     try {
/* 149 */       this.flake = ImageIO.read(new File("res/textures/snowflake.png"));
/* 150 */       this.flame = ImageIO.read(new File("res/textures/fire.png"));
/* 151 */       this.time = ImageIO.read(new File("res/textures/time.png"));
/* 152 */       this.warning1 = ImageIO.read(new File("res/textures/caution.png"));
/* 153 */       this.warning2 = ImageIO.read(new File("res/textures/caution.png"));
/* 154 */     } catch (IOException e) {
/* 155 */       e.printStackTrace();
/*     */     } 
/* 157 */     UIButton snowflake = new UIButton(new Vector2i(0, 0), this.flake, new UIActionListener()
/*     */         {
/*     */           public void perform() {}
/*     */         });
/*     */     
/* 162 */     UIButton fire = new UIButton(new Vector2i(0, 0), this.flame, new UIActionListener()
/*     */         {
/*     */           public void perform() {}
/*     */         });
/*     */     
/* 167 */     UIButton froze = new UIButton(new Vector2i(0, 0), this.time, new UIActionListener()
/*     */         {
/*     */           public void perform() {}
/*     */         });
/*     */     
/* 172 */     UIButton warner1 = new UIButton(new Vector2i(0, 0), this.warning1, new UIActionListener()
/*     */         {
/*     */           public void perform() {}
/*     */         });
/*     */     
/* 177 */     UIButton warner2 = new UIButton(new Vector2i(0, 0), this.warning2, new UIActionListener()
/*     */         {
/*     */           public void perform() {}
/*     */         });
/*     */ 
/*     */     
/* 183 */     if (tester == 0) {
/* 184 */       cold.addComponent((UIComponent)snowflake);
/* 185 */       hot2.addComponent((UIComponent)fire);
/* 186 */       frozen.addComponent((UIComponent)froze);
/* 187 */       charwarn.addComponent((UIComponent)warner1);
/* 188 */       charwarn2.addComponent((UIComponent)warner2);
/* 189 */       tester = 1;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void buttonsoff() {
/* 194 */     butcollgr = false;
/* 195 */     butcollbl = false;
/* 196 */     butcollrd = false;
/* 197 */     grpressed = false;
/* 198 */     grpressed2 = false;
/* 199 */     blpressed = false;
/* 200 */     blpressed2 = false;
/* 201 */     rdpressed = false;
/* 202 */     rdpressed2 = false;
/* 203 */     grfrzbut = false;
/* 204 */     blfrzbut = false;
/* 205 */     rdfrzbut = false;
/* 206 */     ylfrzbut = false;
/* 207 */     mobpressgr = false;
/* 208 */     mobpressbl = false;
/* 209 */     mobpressrd = false;
/* 210 */     butcollyl = false;
/* 211 */     mobpressyl = false;
/* 212 */     ylpressed = false;
/* 213 */     ylpressed2 = false;
/*     */   }
/*     */   
/*     */   public void update() {
/* 217 */     temperature();
/* 218 */     map();
/* 219 */     orbs();
/* 220 */     if (!freeze && firerate > 0) firerate--;
/*     */     
/* 222 */     if ((getClientPlayer().getX() / 16 == x10 && (getClientPlayer().getY() - 1) / 16 + 1 == y10) || (
/* 223 */       getClientPlayer().getX() / 16 == x10 && (getClientPlayer().getY() - 1) / 16 + 2 == y10) || (
/* 224 */       getClientPlayer().getX() / 16 + 1 == x10 && (getClientPlayer().getY() - 1) / 16 + 1 == y10) || (
/* 225 */       getClientPlayer().getX() / 16 + 1 == x10 && (getClientPlayer().getY() - 1) / 16 + 2 == y10)) {
/* 226 */       chkpt1 = true;
/* 227 */       chkpt2 = false;
/* 228 */       chkpt3 = false;
/* 229 */       chkpt4 = false;
/* 230 */       chkpt5 = false;
/* 231 */       chkpt6 = false;
/* 232 */       chkpt7 = false;
/* 233 */       chkpt8 = false;
/* 234 */       chkpt9 = false;
/* 235 */       chkpt10 = false;
/* 236 */       health = maxhealth;
/* 237 */       Player.temprst();
/* 238 */       buttonsoff();
/* 239 */       Player.respawn2 = true;
/*     */     } 
/*     */     
/* 242 */     if ((getClientPlayer().getX() / 16 == x20 && (getClientPlayer().getY() - 1) / 16 + 1 == y20) || (
/* 243 */       getClientPlayer().getX() / 16 == x20 && (getClientPlayer().getY() - 1) / 16 + 2 == y20) || (
/* 244 */       getClientPlayer().getX() / 16 + 1 == x20 && (getClientPlayer().getY() - 1) / 16 + 1 == y20) || (
/* 245 */       getClientPlayer().getX() / 16 + 1 == x20 && (getClientPlayer().getY() - 1) / 16 + 2 == y20)) {
/* 246 */       chkpt1 = false;
/* 247 */       chkpt2 = true;
/* 248 */       chkpt3 = false;
/* 249 */       chkpt4 = false;
/* 250 */       chkpt5 = false;
/* 251 */       chkpt6 = false;
/* 252 */       chkpt7 = false;
/* 253 */       chkpt8 = false;
/* 254 */       chkpt9 = false;
/* 255 */       chkpt10 = false;
/* 256 */       health = maxhealth;
/* 257 */       Player.temprst();
/* 258 */       buttonsoff();
/* 259 */       Player.respawn2 = true;
/*     */     } 
/*     */     
/* 262 */     if ((getClientPlayer().getX() / 16 == x30 && (getClientPlayer().getY() - 1) / 16 + 1 == y30) || (
/* 263 */       getClientPlayer().getX() / 16 == x30 && (getClientPlayer().getY() - 1) / 16 + 2 == y30) || (
/* 264 */       getClientPlayer().getX() / 16 + 1 == x30 && (getClientPlayer().getY() - 1) / 16 + 1 == y30) || (
/* 265 */       getClientPlayer().getX() / 16 + 1 == x30 && (getClientPlayer().getY() - 1) / 16 + 2 == y30)) {
/* 266 */       chkpt1 = false;
/* 267 */       chkpt2 = false;
/* 268 */       chkpt3 = true;
/* 269 */       chkpt4 = false;
/* 270 */       chkpt5 = false;
/* 271 */       chkpt6 = false;
/* 272 */       chkpt7 = false;
/* 273 */       chkpt8 = false;
/* 274 */       chkpt9 = false;
/* 275 */       chkpt10 = false;
/* 276 */       health = maxhealth;
/* 277 */       Player.temprst();
/* 278 */       buttonsoff();
/* 279 */       Player.respawn2 = true;
/*     */     } 
/*     */     
/* 282 */     if ((getClientPlayer().getX() / 16 == x40 && (getClientPlayer().getY() - 1) / 16 + 1 == y40) || (
/* 283 */       getClientPlayer().getX() / 16 == x40 && (getClientPlayer().getY() - 1) / 16 + 2 == y40) || (
/* 284 */       getClientPlayer().getX() / 16 + 1 == x40 && (getClientPlayer().getY() - 1) / 16 + 1 == y40) || (
/* 285 */       getClientPlayer().getX() / 16 + 1 == x40 && (getClientPlayer().getY() - 1) / 16 + 2 == y40)) {
/* 286 */       chkpt1 = false;
/* 287 */       chkpt2 = false;
/* 288 */       chkpt3 = false;
/* 289 */       chkpt4 = true;
/* 290 */       chkpt5 = false;
/* 291 */       chkpt6 = false;
/* 292 */       chkpt7 = false;
/* 293 */       chkpt8 = false;
/* 294 */       chkpt9 = false;
/* 295 */       chkpt10 = false;
/* 296 */       health = maxhealth;
/* 297 */       Player.temprst();
/* 298 */       buttonsoff();
/* 299 */       Player.respawn2 = true;
/*     */     } 
/*     */     
/* 302 */     if ((getClientPlayer().getX() / 16 == x50 && (getClientPlayer().getY() - 1) / 16 + 1 == y50) || (
/* 303 */       getClientPlayer().getX() / 16 == x50 && (getClientPlayer().getY() - 1) / 16 + 2 == y50) || (
/* 304 */       getClientPlayer().getX() / 16 + 1 == x50 && (getClientPlayer().getY() - 1) / 16 + 1 == y50) || (
/* 305 */       getClientPlayer().getX() / 16 + 1 == x50 && (getClientPlayer().getY() - 1) / 16 + 2 == y50)) {
/* 306 */       chkpt1 = false;
/* 307 */       chkpt2 = false;
/* 308 */       chkpt3 = false;
/* 309 */       chkpt4 = false;
/* 310 */       chkpt5 = true;
/* 311 */       chkpt6 = false;
/* 312 */       chkpt7 = false;
/* 313 */       chkpt8 = false;
/* 314 */       chkpt9 = false;
/* 315 */       chkpt10 = false;
/* 316 */       health = maxhealth;
/* 317 */       Player.temprst();
/* 318 */       buttonsoff();
/* 319 */       Player.respawn2 = true;
/*     */     } 
/*     */     
/* 322 */     if ((getClientPlayer().getX() / 16 == x60 && (getClientPlayer().getY() - 1) / 16 + 1 == y60) || (
/* 323 */       getClientPlayer().getX() / 16 == x60 && (getClientPlayer().getY() - 1) / 16 + 2 == y60) || (
/* 324 */       getClientPlayer().getX() / 16 + 1 == x60 && (getClientPlayer().getY() - 1) / 16 + 1 == y60) || (
/* 325 */       getClientPlayer().getX() / 16 + 1 == x60 && (getClientPlayer().getY() - 1) / 16 + 2 == y60)) {
/* 326 */       chkpt1 = false;
/* 327 */       chkpt2 = false;
/* 328 */       chkpt3 = false;
/* 329 */       chkpt4 = false;
/* 330 */       chkpt5 = false;
/* 331 */       chkpt6 = true;
/* 332 */       chkpt7 = false;
/* 333 */       chkpt8 = false;
/* 334 */       chkpt9 = false;
/* 335 */       chkpt10 = false;
/* 336 */       health = maxhealth;
/* 337 */       Player.temprst();
/* 338 */       buttonsoff();
/* 339 */       Player.respawn2 = true;
/*     */     } 
/*     */     
/* 342 */     if ((getClientPlayer().getX() / 16 == x70 && (getClientPlayer().getY() - 1) / 16 + 1 == y70) || (
/* 343 */       getClientPlayer().getX() / 16 == x70 && (getClientPlayer().getY() - 1) / 16 + 2 == y70) || (
/* 344 */       getClientPlayer().getX() / 16 + 1 == x70 && (getClientPlayer().getY() - 1) / 16 + 1 == y70) || (
/* 345 */       getClientPlayer().getX() / 16 + 1 == x70 && (getClientPlayer().getY() - 1) / 16 + 2 == y70)) {
/* 346 */       chkpt1 = false;
/* 347 */       chkpt2 = false;
/* 348 */       chkpt3 = false;
/* 349 */       chkpt4 = false;
/* 350 */       chkpt5 = false;
/* 351 */       chkpt6 = false;
/* 352 */       chkpt7 = true;
/* 353 */       chkpt8 = false;
/* 354 */       chkpt9 = false;
/* 355 */       chkpt10 = false;
/* 356 */       health = maxhealth;
/* 357 */       Player.temprst();
/* 358 */       buttonsoff();
/* 359 */       Player.respawn2 = true;
/*     */     } 
/*     */     
/* 362 */     if ((getClientPlayer().getX() / 16 == x80 && (getClientPlayer().getY() - 1) / 16 + 1 == y80) || (
/* 363 */       getClientPlayer().getX() / 16 == x80 && (getClientPlayer().getY() - 1) / 16 + 2 == y80) || (
/* 364 */       getClientPlayer().getX() / 16 + 1 == x80 && (getClientPlayer().getY() - 1) / 16 + 1 == y80) || (
/* 365 */       getClientPlayer().getX() / 16 + 1 == x80 && (getClientPlayer().getY() - 1) / 16 + 2 == y80)) {
/* 366 */       chkpt1 = false;
/* 367 */       chkpt2 = false;
/* 368 */       chkpt3 = false;
/* 369 */       chkpt4 = false;
/* 370 */       chkpt5 = false;
/* 371 */       chkpt6 = false;
/* 372 */       chkpt7 = false;
/* 373 */       chkpt8 = true;
/* 374 */       chkpt9 = false;
/* 375 */       chkpt10 = false;
/* 376 */       health = maxhealth;
/* 377 */       Player.temprst();
/* 378 */       buttonsoff();
/* 379 */       Player.respawn2 = true;
/*     */     } 
/*     */     
/* 382 */     if ((getClientPlayer().getX() / 16 == x90 && (getClientPlayer().getY() - 1) / 16 + 1 == y90) || (
/* 383 */       getClientPlayer().getX() / 16 == x90 && (getClientPlayer().getY() - 1) / 16 + 2 == y90) || (
/* 384 */       getClientPlayer().getX() / 16 + 1 == x90 && (getClientPlayer().getY() - 1) / 16 + 1 == y90) || (
/* 385 */       getClientPlayer().getX() / 16 + 1 == x90 && (getClientPlayer().getY() - 1) / 16 + 2 == y90)) {
/* 386 */       chkpt1 = false;
/* 387 */       chkpt2 = false;
/* 388 */       chkpt3 = false;
/* 389 */       chkpt4 = false;
/* 390 */       chkpt5 = false;
/* 391 */       chkpt6 = false;
/* 392 */       chkpt7 = false;
/* 393 */       chkpt8 = false;
/* 394 */       chkpt9 = true;
/* 395 */       chkpt10 = false;
/* 396 */       health = maxhealth;
/* 397 */       Player.temprst();
/* 398 */       buttonsoff();
/* 399 */       Player.respawn2 = true;
/*     */     } 
/*     */     
/* 402 */     if ((getClientPlayer().getX() / 16 == x11 && (getClientPlayer().getY() - 1) / 16 + 1 == y11) || (
/* 403 */       getClientPlayer().getX() / 16 == x11 && (getClientPlayer().getY() - 1) / 16 + 2 == y11) || (
/* 404 */       getClientPlayer().getX() / 16 + 1 == x11 && (getClientPlayer().getY() - 1) / 16 + 1 == y11) || (
/* 405 */       getClientPlayer().getX() / 16 + 1 == x11 && (getClientPlayer().getY() - 1) / 16 + 2 == y11)) {
/* 406 */       chkpt1 = false;
/* 407 */       chkpt2 = false;
/* 408 */       chkpt3 = false;
/* 409 */       chkpt4 = false;
/* 410 */       chkpt5 = false;
/* 411 */       chkpt6 = false;
/* 412 */       chkpt7 = false;
/* 413 */       chkpt8 = false;
/* 414 */       chkpt9 = false;
/* 415 */       chkpt10 = true;
/* 416 */       health = maxhealth;
/* 417 */       Player.temprst();
/* 418 */       buttonsoff();
/* 419 */       Player.respawn2 = true;
/*     */     } 
/*     */     
/* 422 */     if (temprst) {
/* 423 */       ui.removePanel(hot);
/* 424 */       ui.removePanel(hot2);
/* 425 */       ui.removePanel(hot3);
/* 426 */       ui.removePanel(charwarn);
/* 427 */       ui.removePanel(charwarn2);
/* 428 */       ui.removePanel(cold);
/* 429 */       ui.removePanel(cold2);
/* 430 */       ui.removePanel(cold3);
/* 431 */       ui.removePanel(this.gold);
/* 432 */       ui.removePanel(this.msg2);
/* 433 */       ui.removePanel(this.msg3);
/* 434 */       ui.removePanel(this.msg4);
/* 435 */       ui.removePanel(this.msg5);
/* 436 */       ui.removePanel(this.msg7);
/* 437 */       ui.removePanel(this.msg9);
/* 438 */       ui.removePanel(this.msg10);
/* 439 */       ui.removePanel(this.msg11);
/* 440 */       temprst = false;
/*     */     } 
/* 442 */     if (!pause && health > 0 && (temp == 0 || temp == maxtemp)) {
/* 443 */       this.uiHealthBar.setProgress((health-- / maxhealth));
/* 444 */       ui.addPanel(charwarn2);
/*     */     } else {
/* 446 */       ui.removePanel(charwarn2);
/*     */     } 
/* 448 */     if (!pause && temp > 0 && 
/* 449 */       temp > roomtemp) {
/* 450 */       this.uiTempBar.setProgress((temp-- / maxtemp));
/* 451 */       if (temp == maxtemp / 8 * 6 - 1) {
/* 452 */         ui.removePanel(hot2);
/* 453 */         ui.removePanel(charwarn);
/*     */       } 
/* 455 */       if (temp == maxtemp / 8 * 2 + 1) {
/* 456 */         ui.addPanel(cold);
/* 457 */         ui.addPanel(charwarn);
/*     */       } 
/*     */     } 
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
/* 481 */     if (roomtemp == maxtemp / 2) {
/* 482 */       ui.removePanel(charwarn);
/* 483 */       ui.removePanel(charwarn2);
/*     */     } 
/* 485 */     if (!pause && !freeze && temp < roomtemp) {
/* 486 */       this.uiTempBar.setProgress((temp++ / maxtemp));
/* 487 */       if (temp == maxtemp / 8 * 6) {
/* 488 */         ui.addPanel(hot2);
/* 489 */         ui.addPanel(charwarn);
/*     */       } 
/* 491 */       if (temp == maxtemp / 8 * 2) {
/* 492 */         ui.removePanel(cold);
/* 493 */         ui.removePanel(charwarn);
/*     */       } 
/*     */     } 
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
/* 517 */     if (maxhealth == 1000) { this.uiHealthBar.setProgress(health / 1000.0D); }
/* 518 */     else if (maxhealth == 1300) { this.uiHealthBar.setProgress(health / 1300.0D); }
/* 519 */      if (maxtemp == 1200) { this.uiTempBar.setProgress(temp / 1200.0D); }
/* 520 */     else if (maxtemp == 1800) { this.uiTempBar.setProgress(temp / 1800.0D); }
/*     */     
/* 522 */     if (Keyboard.pausekey) pause = !pause; 
/* 523 */     if (Keyboard.pausekey && pause) {
/* 524 */       ui.addPanel(this.blur);
/* 525 */       ui.addPanel(this.pausemenu);
/*     */     } 
/* 527 */     if ((Keyboard.pausekey && !pause) || resumer) {
/* 528 */       ui.removePanel(this.blur);
/* 529 */       ui.removePanel(this.pausemenu);
/* 530 */       buttons();
/*     */     } 
/* 532 */     if (pause) {
/* 533 */       buttons();
/* 534 */       fileswitch = false;
/*     */     } 
/*     */     
/* 537 */     if (!pause && Keyboard.spacebar) freeze = !freeze; 
/* 538 */     if (!pause && Keyboard.spacebar && freeze) {
/* 539 */       addfreeze();
/* 540 */     } else if ((!pause && Keyboard.spacebar && !freeze) || restartfrz) {
/* 541 */       removefreeze();
/* 542 */       restartfrz = false;
/*     */     } 
/* 544 */     if ((!pause && !freeze) || resumer) {
/* 545 */       pause = false;
/* 546 */       resumer = false;
/* 547 */       if (!freeze) {
/* 548 */         super.update();
/*     */       }
/* 550 */     } else if (!pause && 
/* 551 */       freeze) {
/* 552 */       freezeUpdate();
/*     */     } 
/* 554 */     if (health == 0) {
/* 555 */       Player.respawn = true;
/* 556 */       health = maxhealth;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\level\SpawnLevel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */