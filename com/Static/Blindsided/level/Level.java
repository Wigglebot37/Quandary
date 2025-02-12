/*      */ package com.Static.Blindsided.level;
/*      */ 
/*      */ import com.Static.Blindsided.Game;
/*      */ import com.Static.Blindsided.entity.Entity;
/*      */ import com.Static.Blindsided.entity.mob.Blitzkrieg;
/*      */ import com.Static.Blindsided.entity.mob.Player;
/*      */ import com.Static.Blindsided.entity.particle.Particle;
/*      */ import com.Static.Blindsided.entity.projectile.Projectile;
/*      */ import com.Static.Blindsided.graphics.Screen;
/*      */ import com.Static.Blindsided.graphics.UI.UIActionListener;
/*      */ import com.Static.Blindsided.graphics.UI.UIBars;
/*      */ import com.Static.Blindsided.graphics.UI.UIButton;
/*      */ import com.Static.Blindsided.graphics.UI.UIButtonListener;
/*      */ import com.Static.Blindsided.graphics.UI.UIComponent;
/*      */ import com.Static.Blindsided.graphics.UI.UILabel;
/*      */ import com.Static.Blindsided.graphics.UI.UIPanel;
/*      */ import com.Static.Blindsided.graphics.UI.UI_Main;
/*      */ import com.Static.Blindsided.input.Keyboard;
/*      */ import com.Static.Blindsided.level.tile.Tile;
/*      */ import com.Static.Blindsided.util.ImageUtils;
/*      */ import com.Static.Blindsided.util.Vector2i;
/*      */ import java.awt.Font;
/*      */ import java.awt.image.BufferedImage;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collections;
/*      */ import java.util.Comparator;
/*      */ import java.util.List;
/*      */ import javax.imageio.ImageIO;
/*      */ 
/*      */ public class Level {
/*   33 */   public static UI_Main ui = Game.getUI_Main();
/*      */   public UIBars uiHealthBar;
/*      */   public UIBars uiTempBar;
/*   36 */   public int spacecol = -654245622;
/*   37 */   public int outercol = -436141814;
/*   38 */   public static int health = 1000;
/*   39 */   public static int temp = 600;
/*   40 */   public static int spaceadd = 0, goldadd = 0, msgadd2 = 0, msgadd3 = 0, msgadd4 = 0, msgadd5 = 0, buttonend = 0, buttonendr = 0, radd = 0;
/*   41 */   public static int tst = 1; public static int msgadd7 = 0; public static int msgadd8 = 0; public static int msgadd9 = 0; public static int msgadd10 = 0; public static int msgadd11 = 0; public static int msgadd12 = 0; public static int msgadd13 = 0; public static int msgadd14 = 0; public static int stop = 0; public static boolean soundswitch = false, restartfrz = false, enemyon = false, enemyon2 = false, burn = false, bossswitch = false; public static boolean cutscene = true, resumer = false, fileswitch = false, temprst = false, permswitch = true, butcollgr = false; public static boolean butcollbl = false; public static boolean butcollrd = false; public static boolean warnsw = false; public static boolean warnsw2 = false; public static boolean warnsw3 = false; public static boolean warnsw4 = false;
/*      */   public boolean orb1 = false;
/*      */   public boolean orb2 = false;
/*      */   public boolean orb3 = false;
/*      */   public static boolean chkpt1 = true, chkpt2 = false, chkpt3 = false, on = true, orboff = false, grpressed = false;
/*      */   public static boolean grpressed2 = false, blpressed = false, blpressed2 = false, rdpressed = false, rdpressed2 = false;
/*      */   public static boolean grfrzbut = false, blfrzbut = false, rdfrzbut = false, mobpressgr = false, mobpressbl = false, mobpressrd = false;
/*      */   public static boolean orboff2 = false, orboff3 = false, butcollyl = false, mobpressyl = false, ylpressed = false, ylpressed2 = false;
/*      */   public static boolean ylfrzbut = false, spaceswitch = false, flameblue = false, flamegreen = false, flamered = false, mapsw = true, rborb = false;
/*      */   public static boolean rborbsw = false, rborb2 = false, rborb3 = false, rborb4 = false, chkpt4 = false, chkpt5 = false, chkpt6 = false, chkpt7 = false;
/*      */   public static boolean chkpt8 = false, chkpt9 = false, chkpt10 = false, rborb5 = false, rborb6 = false, rborb7 = false, rborb8 = false, rborb9 = false;
/*      */   public static boolean rborb10 = false;
/*      */   public static boolean rborb11 = false;
/*   54 */   public static int mapsw2 = 0; public static int mapsw3 = 0; public static int mapsw4 = 0; public static int mapsw5 = 0; public static int mapsw6 = 0; public static int mapsw7 = 0; public static int mapsw8 = 0;
/*      */   
/*   56 */   public static UIPanel cold = (UIPanel)(new UIPanel(new Vector2i(809, 554), new Vector2i(96, 96))).setColor(8702688, true);
/*   57 */   public static UIPanel cold2 = (UIPanel)(new UIPanel(new Vector2i(0, 0), new Vector2i(930, 675))).setColor(646236896, true);
/*   58 */   public static UIPanel cold3 = (UIPanel)(new UIPanel(new Vector2i(0, 0), new Vector2i(930, 675))).setColor(864340704, true);
/*   59 */   public static UIPanel hot = (UIPanel)(new UIPanel(new Vector2i(0, 0), new Vector2i(930, 675))).setColor(450902072, true);
/*   60 */   public static UIPanel hot2 = (UIPanel)(new UIPanel(new Vector2i(809, 554), new Vector2i(96, 96))).setColor(14694456, true);
/*   61 */   public static UIPanel hot3 = (UIPanel)(new UIPanel(new Vector2i(0, 0), new Vector2i(930, 675))).setColor(870332472, true);
/*   62 */   public static UIPanel frozen = (UIPanel)(new UIPanel(new Vector2i(697, 554), new Vector2i(96, 96))).setColor(8702688, true);
/*      */   
/*   64 */   public static UIPanel charwarn = (UIPanel)(new UIPanel(new Vector2i(433, 257), new Vector2i(16, 16))).setColor(8702688, true);
/*   65 */   public static UIPanel charwarn2 = (UIPanel)(new UIPanel(new Vector2i(465, 257), new Vector2i(16, 16))).setColor(8702688, true);
/*      */   
/*   67 */   UIPanel pausemenu = (UIPanel)(new UIPanel(new Vector2i(375, 60), new Vector2i(450, 600))).setColor(2633535, false);
/*   68 */   UIPanel panel = (UIPanel)(new UIPanel(new Vector2i(930, 0), new Vector2i(270, 675))).setColor(5197647, false);
/*   69 */   UIPanel spacebar = (UIPanel)(new UIPanel(new Vector2i(125, 0), new Vector2i(680, 144))).setColor(-1728053248, true);
/*   70 */   UIPanel respawning = (UIPanel)(new UIPanel(new Vector2i(125, 0), new Vector2i(680, 144))).setColor(-1728053248, true);
/*   71 */   UIPanel gold = (UIPanel)(new UIPanel(new Vector2i(125, 0), new Vector2i(680, 144))).setColor(-1728053248, true);
/*   72 */   UIPanel msg2 = (UIPanel)(new UIPanel(new Vector2i(125, 0), new Vector2i(680, 144))).setColor(-1728053248, true);
/*   73 */   UIPanel msg3 = (UIPanel)(new UIPanel(new Vector2i(125, 0), new Vector2i(680, 144))).setColor(-1728053248, true);
/*   74 */   UIPanel msg4 = (UIPanel)(new UIPanel(new Vector2i(125, 0), new Vector2i(680, 144))).setColor(-1728053248, true);
/*   75 */   UIPanel msg5 = (UIPanel)(new UIPanel(new Vector2i(125, 0), new Vector2i(680, 144))).setColor(-1728053248, true);
/*   76 */   UIPanel msg7 = (UIPanel)(new UIPanel(new Vector2i(125, 0), new Vector2i(680, 144))).setColor(-1728053248, true);
/*   77 */   UIPanel msg8 = (UIPanel)(new UIPanel(new Vector2i(125, 0), new Vector2i(680, 144))).setColor(-1728053248, true);
/*   78 */   UIPanel msg9 = (UIPanel)(new UIPanel(new Vector2i(125, 0), new Vector2i(680, 144))).setColor(-1728053248, true);
/*   79 */   UIPanel msg10 = (UIPanel)(new UIPanel(new Vector2i(125, 0), new Vector2i(680, 144))).setColor(-1728053248, true);
/*   80 */   UIPanel msg11 = (UIPanel)(new UIPanel(new Vector2i(125, 0), new Vector2i(680, 144))).setColor(-1728053248, true);
/*   81 */   UIPanel msg12 = (UIPanel)(new UIPanel(new Vector2i(125, 0), new Vector2i(680, 144))).setColor(-1728053248, true);
/*   82 */   UIPanel msg13 = (UIPanel)(new UIPanel(new Vector2i(125, 0), new Vector2i(680, 144))).setColor(-1728053248, true);
/*   83 */   UIPanel msg14 = (UIPanel)(new UIPanel(new Vector2i(125, 265), new Vector2i(680, 144))).setColor(-1728053248, true);
/*      */   
/*   85 */   UIPanel outer = (UIPanel)(new UIPanel(new Vector2i(0, 0), new Vector2i(930, 144))).setColor(this.outercol, true);
/*   86 */   UIPanel outer2 = (UIPanel)(new UIPanel(new Vector2i(0, 528), new Vector2i(930, 148))).setColor(this.outercol, true);
/*   87 */   UIPanel outer3 = (UIPanel)(new UIPanel(new Vector2i(0, 144), new Vector2i(209, 384))).setColor(this.outercol, true);
/*   88 */   UIPanel outer4 = (UIPanel)(new UIPanel(new Vector2i(721, 144), new Vector2i(209, 384))).setColor(this.outercol, true);
/*      */   
/*   90 */   UIPanel space = (UIPanel)(new UIPanel(new Vector2i(208, 144), new Vector2i(514, 144))).setColor(this.spacecol, true);
/*   91 */   UIPanel space2 = (UIPanel)(new UIPanel(new Vector2i(208, 384), new Vector2i(514, 144))).setColor(this.spacecol, true);
/*   92 */   UIPanel space3 = (UIPanel)(new UIPanel(new Vector2i(208, 288), new Vector2i(209, 96))).setColor(this.spacecol, true);
/*   93 */   UIPanel space4 = (UIPanel)(new UIPanel(new Vector2i(513, 288), new Vector2i(208, 96))).setColor(this.spacecol, true);
/*      */   
/*   95 */   UIPanel corner = (UIPanel)(new UIPanel(new Vector2i(417, 288), new Vector2i(10, 10))).setColor(this.spacecol, true);
/*   96 */   UIPanel corner2 = (UIPanel)(new UIPanel(new Vector2i(503, 288), new Vector2i(10, 10))).setColor(this.spacecol, true);
/*   97 */   UIPanel corner3 = (UIPanel)(new UIPanel(new Vector2i(417, 374), new Vector2i(10, 10))).setColor(this.spacecol, true);
/*   98 */   UIPanel corner4 = (UIPanel)(new UIPanel(new Vector2i(503, 374), new Vector2i(10, 10))).setColor(this.spacecol, true);
/*      */   
/*  100 */   UIPanel blur = new UIPanel(new Vector2i(0, 0), new Vector2i(1200, 675)); public BufferedImage image; public BufferedImage image2; public BufferedImage image3;
/*      */   public BufferedImage image4;
/*      */   public BufferedImage image5;
/*      */   public BufferedImage image6;
/*      */   public BufferedImage map;
/*      */   public BufferedImage map2;
/*      */   public BufferedImage map3;
/*      */   public BufferedImage map4;
/*      */   public BufferedImage map5;
/*      */   public BufferedImage map6;
/*      */   public BufferedImage map7;
/*      */   public BufferedImage image7;
/*  112 */   private List<Blitzkrieg> followers = new ArrayList<>(); public BufferedImage spimg; public BufferedImage rimg; public BufferedImage imgred; public BufferedImage imggreen; public BufferedImage imgblue; public BufferedImage empty;
/*      */   public BufferedImage warn;
/*  114 */   private List<Projectile> projectiles = new ArrayList<>(); public BufferedImage trns; public static boolean freeze = false; public static boolean pause = false; protected int width; protected int height; protected int[] tilesInt; protected int[] tiles; protected int tile_size;
/*  115 */   private List<Particle> particles = new ArrayList<>();
/*      */   
/*  117 */   private List<Player> scientist = new ArrayList<>();
/*      */   
/*  119 */   static final ProcessBuilder p = new ProcessBuilder(new String[] { "Notepad.exe", "res/CONTROLS.txt" });
/*  120 */   static final ProcessBuilder credit = new ProcessBuilder(new String[] { "Notepad.exe", "res/CREDITS.txt" });
/*      */   
/*  122 */   private Comparator<Node> nodeSorter = new Comparator<Node>()
/*      */     {
/*      */       public int compare(Node n0, Node n1) {
/*  125 */         if (n1.fCost < n0.fCost) return 1; 
/*  126 */         if (n1.fCost > n0.fCost) return -1; 
/*  127 */         return 0;
/*      */       }
/*      */     };
/*      */   
/*  131 */   public static Level spawn = new SpawnLevel("/levels/spawn2.png");
/*      */   
/*      */   public Level(int width, int height) {
/*  134 */     this.width = width;
/*  135 */     this.height = height;
/*  136 */     this.tilesInt = new int[width * height];
/*  137 */     generateLevel();
/*      */   }
/*      */   
/*      */   public Level(String path) {
/*  141 */     loadLevel(path);
/*  142 */     generateLevel();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void generateLevel() {
/*  150 */     for (int y = 0; y < 64; y++) {
/*  151 */       for (int x = 0; x < 64; x++) {
/*  152 */         getTile(x, y);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void loadLevel(String path) {}
/*      */   
/*      */   public void update() {
/*      */     int i;
/*  161 */     for (i = 0; i < this.followers.size(); i++) {
/*  162 */       ((Blitzkrieg)this.followers.get(i)).update();
/*      */     }
/*  164 */     for (i = 0; i < this.projectiles.size(); i++) {
/*  165 */       ((Projectile)this.projectiles.get(i)).update();
/*      */     }
/*  167 */     for (i = 0; i < this.particles.size(); i++) {
/*  168 */       ((Particle)this.particles.get(i)).update();
/*      */     }
/*  170 */     for (i = 0; i < this.scientist.size(); i++) {
/*  171 */       ((Player)this.scientist.get(i)).update();
/*      */     }
/*  173 */     for (i = 0; i < this.projectiles.size(); i++) {
/*  174 */       ((Projectile)this.projectiles.get(i)).update2();
/*      */     }
/*  176 */     remove();
/*      */   }
/*      */   public void freezeUpdate() {
/*      */     int i;
/*  180 */     for (i = 0; i < this.scientist.size(); i++) {
/*  181 */       ((Player)this.scientist.get(i)).update();
/*      */     }
/*  183 */     for (i = 0; i < this.projectiles.size(); i++) {
/*  184 */       ((Projectile)this.projectiles.get(i)).update2();
/*      */     }
/*  186 */     remove();
/*      */   }
/*      */   public void remove() {
/*      */     int i;
/*  190 */     for (i = 0; i < this.followers.size(); i++) {
/*  191 */       if (((Blitzkrieg)this.followers.get(i)).isRemoved()) this.followers.remove(i); 
/*      */     } 
/*  193 */     for (i = 0; i < this.projectiles.size(); i++) {
/*  194 */       if (((Projectile)this.projectiles.get(i)).isRemoved()) this.projectiles.remove(i); 
/*      */     } 
/*  196 */     for (i = 0; i < this.particles.size(); i++) {
/*  197 */       if (((Particle)this.particles.get(i)).isRemoved()) this.particles.remove(i); 
/*      */     } 
/*  199 */     for (i = 0; i < this.scientist.size(); i++) {
/*  200 */       if (((Player)this.scientist.get(i)).isRemoved()) this.scientist.remove(i); 
/*      */     } 
/*      */   }
/*      */   
/*      */   public List<Projectile> getProjectiles() {
/*  205 */     return this.projectiles;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void time() {}
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean tileCollision(int x, int y, int size, int xOffset, int yOffset) {
/*  215 */     boolean solid = false;
/*  216 */     for (int c = 0; c < 4; c++) {
/*      */       
/*  218 */       int xt = x - c % 2 * size + xOffset >> 4;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  223 */       int yt = y - c / 2 * size + yOffset >> 4;
/*  224 */       if (getTile(xt, yt).solid()) solid = true; 
/*      */     } 
/*  226 */     return solid;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void render(int xScroll, int yScroll, Screen screen) {
/*  236 */     screen.setOffset(xScroll, yScroll);
/*  237 */     int x0 = xScroll - 16 >> 4;
/*      */ 
/*      */     
/*  240 */     int x1 = xScroll + screen.width + 16 >> 4;
/*      */     
/*  242 */     int y0 = yScroll - 16 >> 4;
/*  243 */     int y1 = yScroll + screen.height + 16 >> 4;
/*      */     
/*  245 */     for (int y = y0; y < y1; y++) {
/*  246 */       for (int x = x0; x < x1; x++)
/*  247 */         getTile(x, y).render(x, y, screen); 
/*      */     } 
/*      */     int i;
/*  250 */     for (i = 0; i < this.followers.size(); i++) {
/*  251 */       ((Blitzkrieg)this.followers.get(i)).render(screen);
/*      */     }
/*  253 */     for (i = 0; i < this.projectiles.size(); i++) {
/*  254 */       ((Projectile)this.projectiles.get(i)).render(screen);
/*      */     }
/*  256 */     for (i = 0; i < this.particles.size(); i++) {
/*  257 */       ((Particle)this.particles.get(i)).render(screen);
/*      */     }
/*  259 */     for (i = 0; i < this.scientist.size(); i++) {
/*  260 */       ((Player)this.scientist.get(i)).render(screen);
/*      */     }
/*      */   }
/*      */   
/*      */   public void add(Entity e) {
/*  265 */     e.init(this);
/*      */     
/*  267 */     if (e instanceof Particle) {
/*  268 */       this.particles.add((Particle)e);
/*  269 */     } else if (e instanceof Projectile) {
/*  270 */       this.projectiles.add((Projectile)e);
/*  271 */     } else if (e instanceof Player) {
/*  272 */       this.scientist.add((Player)e);
/*  273 */     } else if (e instanceof Blitzkrieg) {
/*  274 */       this.followers.add((Blitzkrieg)e);
/*      */     } 
/*      */   }
/*      */   
/*      */   public List<Player> getPlayers() {
/*  279 */     return this.scientist;
/*      */   }
/*      */   
/*      */   public Player getPlayerAt(int index) {
/*  283 */     return this.scientist.get(index);
/*      */   }
/*      */   
/*      */   public Player getClientPlayer() {
/*  287 */     return this.scientist.get(0);
/*      */   }
/*      */   
/*      */   public List<Blitzkrieg> getBlitzkrieg() {
/*  291 */     return this.followers;
/*      */   }
/*      */   
/*      */   public Blitzkrieg getBlitzkriegAt(int index) {
/*  295 */     return this.followers.get(index);
/*      */   }
/*      */   
/*      */   public Blitzkrieg getClientBlitzkrieg() {
/*  299 */     return this.followers.get(0);
/*      */   }
/*      */   
/*      */   public void addfreeze() {
/*  303 */     ui.addPanel(frozen);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removefreeze() {
/*  323 */     ui.removePanel(frozen);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void orbs() {
/*      */     try {
/*  343 */       this.imggreen = ImageIO.read(new File("res/textures/green.png"));
/*  344 */       this.empty = ImageIO.read(new File("res/textures/empty.png"));
/*  345 */     } catch (IOException e) {
/*  346 */       e.printStackTrace();
/*      */     } 
/*  348 */     UIButton greenbut = new UIButton(new Vector2i(95, 370), this.empty, new UIActionListener()
/*      */         {
/*      */           public void perform() {}
/*      */         });
/*      */     
/*      */     try {
/*  354 */       this.imgred = ImageIO.read(new File("res/textures/red.png"));
/*  355 */     } catch (IOException e) {
/*  356 */       e.printStackTrace();
/*      */     } 
/*  358 */     UIButton redbut = new UIButton(new Vector2i(95, 460), this.empty, new UIActionListener()
/*      */         {
/*      */           public void perform() {}
/*      */         });
/*      */     
/*      */     try {
/*  364 */       this.imgblue = ImageIO.read(new File("res/textures/blue.png"));
/*  365 */     } catch (IOException e) {
/*  366 */       e.printStackTrace();
/*      */     } 
/*  368 */     UIButton bluebut = new UIButton(new Vector2i(95, 550), this.empty, new UIActionListener()
/*      */         {
/*      */           public void perform() {}
/*      */         });
/*      */     
/*      */     try {
/*  374 */       this.warn = ImageIO.read(new File("res/textures/caution.png"));
/*  375 */       this.trns = ImageIO.read(new File("res/textures/transparent.png"));
/*  376 */     } catch (IOException e) {
/*  377 */       e.printStackTrace();
/*      */     } 
/*  379 */     UIButton warning = new UIButton(new Vector2i(0, 236), this.trns, new UIActionListener()
/*      */         {
/*      */           public void perform() {}
/*      */         });
/*      */     
/*  384 */     UIButton warning2 = new UIButton(new Vector2i(0, 296), this.trns, new UIActionListener()
/*      */         {
/*      */           public void perform() {}
/*      */         });
/*      */ 
/*      */     
/*  390 */     if (tst == 1) {
/*  391 */       this.panel.addComponent((UIComponent)greenbut);
/*  392 */       this.panel.addComponent((UIComponent)redbut);
/*  393 */       this.panel.addComponent((UIComponent)bluebut);
/*  394 */       this.panel.addComponent((UIComponent)warning);
/*  395 */       this.panel.addComponent((UIComponent)warning2);
/*  396 */       tst = 2;
/*      */     } 
/*  398 */     if ((temp == 0 || temp == SpawnLevel.maxtemp) && !warnsw3) {
/*  399 */       this.panel.removeComponent((UIComponent)warning);
/*  400 */       warning.setImage(this.warn);
/*  401 */       this.panel.addComponent((UIComponent)warning);
/*  402 */       warnsw3 = true;
/*  403 */       warnsw4 = false;
/*  404 */     } else if (temp > 0 && temp < SpawnLevel.maxtemp && !warnsw4) {
/*  405 */       this.panel.removeComponent((UIComponent)warning);
/*  406 */       warning.setImage(this.trns);
/*  407 */       this.panel.addComponent((UIComponent)warning);
/*  408 */       warnsw4 = true;
/*  409 */       warnsw3 = false;
/*      */     } 
/*  411 */     if ((temp <= SpawnLevel.maxtemp / 8 * 2 || temp >= SpawnLevel.maxtemp / 8 * 6) && !warnsw) {
/*  412 */       this.panel.removeComponent((UIComponent)warning2);
/*  413 */       warning2.setImage(this.warn);
/*  414 */       this.panel.addComponent((UIComponent)warning2);
/*  415 */       warnsw = true;
/*  416 */       warnsw2 = false;
/*  417 */     } else if (temp > SpawnLevel.maxtemp / 8 * 2 && temp < SpawnLevel.maxtemp / 8 * 6 && !warnsw2) {
/*      */       
/*  419 */       this.panel.removeComponent((UIComponent)warning2);
/*  420 */       warning2.setImage(this.trns);
/*  421 */       this.panel.addComponent((UIComponent)warning2);
/*  422 */       warnsw2 = true;
/*  423 */       warnsw = false;
/*      */     } 
/*      */     
/*  426 */     if (orboff && !this.orb1) {
/*  427 */       this.panel.removeComponent((UIComponent)greenbut);
/*  428 */       greenbut.setImage(this.imggreen);
/*  429 */       this.panel.addComponent((UIComponent)greenbut);
/*  430 */       this.orb1 = true;
/*      */     } 
/*  432 */     if (orboff2 && !this.orb2) {
/*  433 */       this.panel.removeComponent((UIComponent)bluebut);
/*  434 */       bluebut.setImage(this.imgblue);
/*  435 */       this.panel.addComponent((UIComponent)bluebut);
/*  436 */       this.orb2 = true;
/*      */     } 
/*  438 */     if (orboff3 && !this.orb3) {
/*  439 */       this.panel.removeComponent((UIComponent)redbut);
/*  440 */       redbut.setImage(this.imgred);
/*  441 */       this.panel.addComponent((UIComponent)redbut);
/*  442 */       this.orb3 = true;
/*      */     } 
/*  444 */     greenbut.setButtonListener(new UIButtonListener()
/*      */         {
/*      */           public void entered(UIButton button) {}
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           public void exited(UIButton button) {}
/*      */ 
/*      */ 
/*      */           
/*      */           public void pressed(UIButton button) {}
/*      */ 
/*      */ 
/*      */           
/*      */           public void released(UIButton button) {}
/*      */         });
/*  461 */     redbut.setButtonListener(new UIButtonListener()
/*      */         {
/*      */           public void entered(UIButton button) {}
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           public void exited(UIButton button) {}
/*      */ 
/*      */ 
/*      */           
/*      */           public void pressed(UIButton button) {}
/*      */ 
/*      */ 
/*      */           
/*      */           public void released(UIButton button) {}
/*      */         });
/*  478 */     bluebut.setButtonListener(new UIButtonListener()
/*      */         {
/*      */           public void entered(UIButton button) {}
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           public void exited(UIButton button) {}
/*      */ 
/*      */ 
/*      */           
/*      */           public void pressed(UIButton button) {}
/*      */ 
/*      */ 
/*      */           
/*      */           public void released(UIButton button) {}
/*      */         });
/*  495 */     warning.setButtonListener(new UIButtonListener()
/*      */         {
/*      */           public void entered(UIButton button) {}
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           public void exited(UIButton button) {}
/*      */ 
/*      */ 
/*      */           
/*      */           public void pressed(UIButton button) {}
/*      */ 
/*      */ 
/*      */           
/*      */           public void released(UIButton button) {}
/*      */         });
/*  512 */     warning2.setButtonListener(new UIButtonListener()
/*      */         {
/*      */           public void entered(UIButton button) {}
/*      */ 
/*      */ 
/*      */           
/*      */           public void exited(UIButton button) {}
/*      */ 
/*      */ 
/*      */           
/*      */           public void pressed(UIButton button) {}
/*      */ 
/*      */ 
/*      */           
/*      */           public void released(UIButton button) {}
/*      */         });
/*      */   }
/*      */ 
/*      */   
/*      */   public void map() {
/*      */     try {
/*  533 */       this.map = ImageIO.read(new File("res/levels/minimap.png"));
/*  534 */       this.map2 = ImageIO.read(new File("res/levels/minimap2.png"));
/*  535 */       this.map3 = ImageIO.read(new File("res/levels/minimap3.png"));
/*  536 */       this.map4 = ImageIO.read(new File("res/levels/minimap4.png"));
/*  537 */       this.map5 = ImageIO.read(new File("res/levels/minimap5.png"));
/*  538 */       this.map6 = ImageIO.read(new File("res/levels/minimap6.png"));
/*  539 */       this.map7 = ImageIO.read(new File("res/levels/minimap7.png"));
/*  540 */     } catch (IOException e) {
/*  541 */       e.printStackTrace();
/*      */     } 
/*  543 */     UIButton minimap = new UIButton(new Vector2i(45, 30), this.map, new UIActionListener()
/*      */         {
/*      */           public void perform() {}
/*      */         });
/*      */     
/*  548 */     if (mapsw) {
/*  549 */       this.panel.addComponent((UIComponent)minimap);
/*  550 */       mapsw = false;
/*  551 */       mapsw2 = 1;
/*      */     } 
/*      */     
/*  554 */     if (getClientPlayer().getX() / 16 >= 0 && getClientPlayer().getX() / 16 <= 39 && 
/*  555 */       getClientPlayer().getY() / 16 >= 61 && getClientPlayer().getY() / 16 <= 100 && mapsw2 == 0) {
/*  556 */       minimap.setImage(this.map2);
/*  557 */       this.panel.removeComponent((UIComponent)minimap);
/*  558 */       this.panel.addComponent((UIComponent)minimap);
/*  559 */       mapsw2 = 1;
/*  560 */       mapsw3 = 0;
/*  561 */       mapsw4 = 0;
/*  562 */       mapsw5 = 0;
/*  563 */       mapsw6 = 0;
/*  564 */       mapsw7 = 0;
/*  565 */       mapsw8 = 0;
/*  566 */     } else if (getClientPlayer().getX() / 16 >= 40 && getClientPlayer().getX() / 16 <= 79 && 
/*  567 */       getClientPlayer().getY() / 16 >= 61 && getClientPlayer().getY() / 16 <= 100 && mapsw3 == 0) {
/*  568 */       minimap.setImage(this.map);
/*  569 */       this.panel.removeComponent((UIComponent)minimap);
/*  570 */       this.panel.addComponent((UIComponent)minimap);
/*  571 */       mapsw2 = 0;
/*  572 */       mapsw3 = 1;
/*  573 */       mapsw4 = 0;
/*  574 */       mapsw5 = 0;
/*  575 */       mapsw6 = 0;
/*  576 */       mapsw7 = 0;
/*  577 */       mapsw8 = 0;
/*  578 */     } else if (getClientPlayer().getX() / 16 >= 0 && getClientPlayer().getX() / 16 <= 39 && 
/*  579 */       getClientPlayer().getY() / 16 >= 21 && getClientPlayer().getY() / 16 <= 60 && mapsw4 == 0) {
/*  580 */       minimap.setImage(this.map3);
/*  581 */       this.panel.removeComponent((UIComponent)minimap);
/*  582 */       this.panel.addComponent((UIComponent)minimap);
/*  583 */       mapsw2 = 0;
/*  584 */       mapsw3 = 0;
/*  585 */       mapsw4 = 1;
/*  586 */       mapsw5 = 0;
/*  587 */       mapsw6 = 0;
/*  588 */       mapsw7 = 0;
/*  589 */       mapsw8 = 0;
/*  590 */     } else if (getClientPlayer().getX() / 16 >= 40 && getClientPlayer().getX() / 16 <= 79 && 
/*  591 */       getClientPlayer().getY() / 16 >= 21 && getClientPlayer().getY() / 16 <= 60 && mapsw5 == 0) {
/*  592 */       minimap.setImage(this.map4);
/*  593 */       this.panel.removeComponent((UIComponent)minimap);
/*  594 */       this.panel.addComponent((UIComponent)minimap);
/*  595 */       mapsw2 = 0;
/*  596 */       mapsw3 = 0;
/*  597 */       mapsw4 = 0;
/*  598 */       mapsw5 = 1;
/*  599 */       mapsw6 = 0;
/*  600 */       mapsw7 = 0;
/*  601 */       mapsw8 = 0;
/*  602 */     } else if (getClientPlayer().getX() / 16 >= 109 && getClientPlayer().getX() / 16 <= 139 && 
/*  603 */       getClientPlayer().getY() / 16 >= 49 && getClientPlayer().getY() / 16 <= 87 && mapsw6 == 0) {
/*  604 */       minimap.setImage(this.map5);
/*  605 */       this.panel.removeComponent((UIComponent)minimap);
/*  606 */       this.panel.addComponent((UIComponent)minimap);
/*  607 */       mapsw2 = 0;
/*  608 */       mapsw3 = 0;
/*  609 */       mapsw4 = 0;
/*  610 */       mapsw5 = 0;
/*  611 */       mapsw6 = 1;
/*  612 */       mapsw7 = 0;
/*  613 */       mapsw8 = 0;
/*  614 */     } else if (getClientPlayer().getX() / 16 >= 109 && getClientPlayer().getX() / 16 <= 139 && 
/*  615 */       getClientPlayer().getY() / 16 >= 9 && getClientPlayer().getY() / 16 <= 48 && mapsw7 == 0) {
/*  616 */       minimap.setImage(this.map6);
/*  617 */       this.panel.removeComponent((UIComponent)minimap);
/*  618 */       this.panel.addComponent((UIComponent)minimap);
/*  619 */       mapsw2 = 0;
/*  620 */       mapsw3 = 0;
/*  621 */       mapsw4 = 0;
/*  622 */       mapsw5 = 0;
/*  623 */       mapsw6 = 0;
/*  624 */       mapsw7 = 1;
/*  625 */       mapsw8 = 0;
/*  626 */     } else if (getClientPlayer().getX() / 16 >= 140 && mapsw8 == 0) {
/*  627 */       minimap.setImage(this.map7);
/*  628 */       this.panel.removeComponent((UIComponent)minimap);
/*  629 */       this.panel.addComponent((UIComponent)minimap);
/*  630 */       mapsw2 = 0;
/*  631 */       mapsw3 = 0;
/*  632 */       mapsw4 = 0;
/*  633 */       mapsw5 = 0;
/*  634 */       mapsw6 = 0;
/*  635 */       mapsw7 = 0;
/*  636 */       mapsw8 = 1;
/*      */     } 
/*  638 */     minimap.setButtonListener(new UIButtonListener()
/*      */         {
/*      */           public void entered(UIButton button) {}
/*      */ 
/*      */ 
/*      */           
/*      */           public void exited(UIButton button) {}
/*      */ 
/*      */ 
/*      */           
/*      */           public void pressed(UIButton button) {}
/*      */ 
/*      */ 
/*      */           
/*      */           public void released(UIButton button) {}
/*      */         });
/*      */   }
/*      */ 
/*      */   
/*      */   public void buttons() {
/*      */     try {
/*  659 */       this.image = ImageIO.read(new File("res/textures/resume_button.png"));
/*  660 */     } catch (IOException e) {
/*  661 */       e.printStackTrace();
/*      */     } 
/*      */     
/*  664 */     UIButton resume = new UIButton(new Vector2i(12, 12), this.image, new UIActionListener()
/*      */         {
/*      */           public void perform() {}
/*      */         });
/*      */     
/*      */     try {
/*  670 */       this.image2 = ImageIO.read(new File("res/textures/restart_button.png"));
/*  671 */     } catch (IOException e) {
/*  672 */       e.printStackTrace();
/*      */     } 
/*      */     
/*  675 */     UIButton restart = new UIButton(new Vector2i(12, 132), this.image2, new UIActionListener()
/*      */         {
/*      */           public void perform() {
/*  678 */             Player.restart = true;
/*      */           }
/*      */         });
/*      */     try {
/*  682 */       this.image3 = ImageIO.read(new File("res/textures/help_button.png"));
/*  683 */     } catch (IOException e) {
/*  684 */       e.printStackTrace();
/*      */     } 
/*      */     
/*  687 */     final UIButton help = new UIButton(new Vector2i(12, 252), this.image3, new UIActionListener() {
/*      */           public void perform() {
/*  689 */             if (!Level.fileswitch) {
/*      */               try {
/*  691 */                 Level.p.start();
/*  692 */               } catch (IOException e) {
/*  693 */                 e.printStackTrace();
/*      */               } 
/*      */             }
/*  696 */             Level.fileswitch = true;
/*      */           }
/*      */         });
/*      */     try {
/*  700 */       this.image4 = ImageIO.read(new File("res/textures/soundon_button.png"));
/*  701 */     } catch (IOException e) {
/*  702 */       e.printStackTrace();
/*      */     } 
/*  704 */     BufferedImage img = this.image4;
/*  705 */     if (!soundswitch) img = this.image4; 
/*  706 */     if (soundswitch) img = this.image6;
/*      */     
/*  708 */     final UIButton soundon = new UIButton(new Vector2i(12, 372), img, new UIActionListener()
/*      */         {
/*      */           public void perform() {}
/*      */         });
/*      */     
/*      */     try {
/*  714 */       this.image5 = ImageIO.read(new File("res/textures/exit_button.png"));
/*  715 */     } catch (IOException e) {
/*  716 */       e.printStackTrace();
/*      */     } 
/*      */     
/*  719 */     UIButton exit = new UIButton(new Vector2i(12, 492), this.image5, new UIActionListener() {
/*      */           public void perform() {
/*  721 */             System.exit(0);
/*      */           }
/*      */         });
/*      */     try {
/*  725 */       this.image6 = ImageIO.read(new File("res/textures/soundoff_button.png"));
/*  726 */     } catch (IOException e) {
/*  727 */       e.printStackTrace();
/*      */     } 
/*      */     
/*  730 */     resume.setButtonListener(new UIButtonListener() {
/*      */           public void entered(UIButton button) {
/*  732 */             button.setImage(ImageUtils.changebr(Level.this.image, 100));
/*      */           }
/*      */           
/*      */           public void exited(UIButton button) {
/*  736 */             button.setImage(Level.this.image);
/*      */           }
/*      */           
/*      */           public void pressed(UIButton button) {
/*  740 */             button.setImage(ImageUtils.changebr(Level.this.image, 50));
/*      */           }
/*      */           
/*      */           public void released(UIButton button) {
/*  744 */             button.setImage(Level.this.image);
/*  745 */             Level.resumer = true;
/*      */           }
/*      */         });
/*  748 */     restart.setButtonListener(new UIButtonListener() {
/*      */           public void entered(UIButton button) {
/*  750 */             button.setImage(ImageUtils.changebr(Level.this.image2, 100));
/*      */           }
/*      */           
/*      */           public void exited(UIButton button) {
/*  754 */             button.setImage(Level.this.image2);
/*      */           }
/*      */           
/*      */           public void pressed(UIButton button) {
/*  758 */             button.setImage(ImageUtils.changebr(Level.this.image2, 50));
/*      */           }
/*      */           
/*      */           public void released(UIButton button) {
/*  762 */             button.setImage(Level.this.image2);
/*  763 */             Level.resumer = true;
/*  764 */             Level.restartfrz = true;
/*  765 */             Level.freeze = false;
/*  766 */             Level.temprst = true;
/*  767 */             Level.temp = 600;
/*      */           }
/*      */         });
/*  770 */     help.setButtonListener(new UIButtonListener()
/*      */         {
/*      */           public void entered(UIButton button) {
/*  773 */             button.setImage(ImageUtils.changebr(Level.this.image3, 100));
/*      */           }
/*      */           
/*      */           public void exited(UIButton button) {
/*  777 */             button.setImage(Level.this.image3);
/*      */           }
/*      */           
/*      */           public void pressed(UIButton button) {
/*  781 */             button.setImage(ImageUtils.changebr(Level.this.image3, 50));
/*      */           }
/*      */           
/*      */           public void released(UIButton button) {
/*  785 */             button.setImage(Level.this.image3);
/*  786 */             entered(help);
/*      */           }
/*      */         });
/*  789 */     soundon.setButtonListener(new UIButtonListener() {
/*      */           public void released(UIButton button) {
/*  791 */             Level.soundswitch = !Level.soundswitch;
/*  792 */             if (!Level.soundswitch) {
/*  793 */               button.setImage(Level.this.image4);
/*  794 */               Game.c = 2;
/*      */             } else {
/*      */               
/*  797 */               button.setImage(Level.this.image6);
/*  798 */               Game.c = 1;
/*      */             } 
/*  800 */             entered(soundon);
/*      */           }
/*      */           public void entered(UIButton button) {
/*  803 */             if (!Level.soundswitch) { button.setImage(ImageUtils.changebr(Level.this.image4, 100)); }
/*  804 */             else { button.setImage(ImageUtils.changebr(Level.this.image6, 100)); }
/*      */           
/*      */           }
/*      */           public void exited(UIButton button) {
/*  808 */             if (!Level.soundswitch) { button.setImage(Level.this.image4); }
/*  809 */             else { button.setImage(Level.this.image6); }
/*      */           
/*      */           }
/*      */           public void pressed(UIButton button) {
/*  813 */             if (!Level.soundswitch) { button.setImage(ImageUtils.changebr(Level.this.image4, 50)); }
/*  814 */             else { button.setImage(ImageUtils.changebr(Level.this.image6, 50)); }
/*      */           
/*      */           }
/*      */         });
/*  818 */     exit.setButtonListener(new UIButtonListener() {
/*      */           public void entered(UIButton button) {
/*  820 */             button.setImage(ImageUtils.changebr(Level.this.image5, 100));
/*      */           }
/*      */           
/*      */           public void exited(UIButton button) {
/*  824 */             button.setImage(Level.this.image5);
/*      */           }
/*      */           
/*      */           public void pressed(UIButton button) {
/*  828 */             button.setImage(ImageUtils.changebr(Level.this.image5, 50));
/*      */           }
/*      */           
/*      */           public void released(UIButton button) {
/*  832 */             button.setImage(Level.this.image5);
/*      */           }
/*      */         });
/*  835 */     if (permswitch) {
/*  836 */       this.pausemenu.addComponent((UIComponent)resume);
/*  837 */       this.pausemenu.addComponent((UIComponent)restart);
/*  838 */       this.pausemenu.addComponent((UIComponent)help);
/*  839 */       this.pausemenu.addComponent((UIComponent)soundon);
/*  840 */       this.pausemenu.addComponent((UIComponent)exit);
/*  841 */       permswitch = false;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public List<Node> findPath(Vector2i start, Vector2i goal) {
/*  848 */     List<Node> openList = new ArrayList<>();
/*      */     
/*  850 */     List<Node> closedList = new ArrayList<>();
/*      */     
/*  852 */     Node current = new Node(start, null, 0.0D, getDistance(start, goal));
/*  853 */     openList.add(current);
/*      */     
/*  855 */     while (openList.size() > 0) {
/*  856 */       Collections.sort(openList, this.nodeSorter);
/*  857 */       current = openList.get(0);
/*  858 */       if (current.tile.equals(goal)) {
/*  859 */         List<Node> path = new ArrayList<>();
/*  860 */         while (current.parent != null) {
/*      */           
/*  862 */           path.add(current);
/*  863 */           current = current.parent;
/*      */         } 
/*  865 */         openList.clear();
/*  866 */         closedList.clear();
/*  867 */         return path;
/*      */       } 
/*  869 */       openList.remove(current);
/*  870 */       closedList.add(current);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  887 */       for (int i = 0; i < 9; i++) {
/*  888 */         if (i != 4) {
/*  889 */           int x = current.tile.getX();
/*  890 */           int y = current.tile.getY();
/*  891 */           int xi = i % 3 - 1;
/*  892 */           int yi = i / 3 - 1;
/*  893 */           Tile at = getTile(x + xi, y + yi);
/*  894 */           if (at != null && 
/*  895 */             !at.solid()) {
/*      */             
/*  897 */             Vector2i a = new Vector2i(x + xi, y + yi);
/*  898 */             double gCost = current.gCost + ((getDistance(current.tile, a) == 1.0D) ? 1.0D : 1.2D);
/*      */             
/*  900 */             double hCost = getDistance(a, goal);
/*  901 */             Node node = new Node(a, current, gCost, hCost);
/*      */             
/*  903 */             if (!vecInList(closedList, a) || gCost < node.gCost)
/*      */             {
/*  905 */               if (!vecInList(openList, a) || gCost < node.gCost) openList.add(node);  } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*  910 */     closedList.clear();
/*  911 */     return null;
/*      */   }
/*      */   
/*      */   private boolean vecInList(List<Node> list, Vector2i vector) {
/*  915 */     for (Node n : list) {
/*  916 */       if (n.tile.equals(vector)) return true; 
/*      */     } 
/*  918 */     return false;
/*      */   }
/*      */   
/*      */   private double getDistance(Vector2i tile, Vector2i goal) {
/*  922 */     double dx = (tile.getX() - goal.getX());
/*  923 */     double dy = (tile.getY() - goal.getY());
/*      */ 
/*      */     
/*  926 */     return Math.sqrt(dx * dx + dy * dy);
/*      */   }
/*      */   
/*      */   public List<Blitzkrieg> getBlitzkrieg(Entity e, int radius) {
/*  930 */     List<Blitzkrieg> result = new ArrayList<>();
/*  931 */     int ex = e.getX();
/*  932 */     int ey = e.getY();
/*  933 */     for (int i = 0; i < this.followers.size(); i++) {
/*  934 */       Blitzkrieg blitzkrieg = this.followers.get(i);
/*  935 */       int x = blitzkrieg.getX();
/*  936 */       int y = blitzkrieg.getY();
/*      */ 
/*      */       
/*  939 */       int dx = Math.abs(x - ex);
/*  940 */       int dy = Math.abs(y - ey);
/*      */ 
/*      */       
/*  943 */       double distance = Math.sqrt((dx * dx + dy * dy));
/*      */       
/*  945 */       if (distance <= radius) result.add(blitzkrieg); 
/*      */     } 
/*  947 */     return result;
/*      */   }
/*      */ 
/*      */   
/*      */   public List<Player> getPlayers(Entity e, int radius) {
/*  952 */     List<Player> result = new ArrayList<>();
/*  953 */     int ex = e.getX();
/*  954 */     int ey = e.getY();
/*  955 */     for (int i = 0; i < this.scientist.size(); i++) {
/*  956 */       Player player = this.scientist.get(i);
/*  957 */       int x = player.getX();
/*  958 */       int y = player.getY();
/*  959 */       int dx = Math.abs(x - ex);
/*  960 */       int dy = Math.abs(y - ey);
/*  961 */       double distance = Math.sqrt((dx * dx + dy * dy));
/*  962 */       if (distance <= radius) result.add(player); 
/*      */     } 
/*  964 */     return result;
/*      */   }
/*      */   
/*      */   public void spacebutton() {
/*      */     try {
/*  969 */       this.spimg = ImageIO.read(new File("res/textures/spacebar.png"));
/*  970 */     } catch (IOException e) {
/*  971 */       e.printStackTrace();
/*      */     } 
/*  973 */     UIButton spacebarimg = new UIButton(new Vector2i(22, 22), this.spimg, new UIActionListener()
/*      */         {
/*      */           public void perform() {}
/*      */         });
/*      */     
/*      */     try {
/*  979 */       this.rimg = ImageIO.read(new File("res/textures/r.png"));
/*  980 */     } catch (IOException e) {
/*  981 */       e.printStackTrace();
/*      */     } 
/*  983 */     UIButton rkeyimg = new UIButton(new Vector2i(52, 24), this.rimg, new UIActionListener()
/*      */         {
/*      */           public void perform() {}
/*      */         });
/*      */     
/*  988 */     spacebarimg.setButtonListener(new UIButtonListener() {
/*      */           public void entered(UIButton button) {
/*  990 */             button.setImage(Level.this.spimg);
/*      */           }
/*      */           
/*      */           public void exited(UIButton button) {
/*  994 */             button.setImage(Level.this.spimg);
/*      */           }
/*      */           
/*      */           public void pressed(UIButton button) {
/*  998 */             button.setImage(Level.this.spimg);
/*      */           }
/*      */           
/*      */           public void released(UIButton button) {
/* 1002 */             button.setImage(Level.this.spimg);
/*      */           }
/*      */         });
/* 1005 */     rkeyimg.setButtonListener(new UIButtonListener() {
/*      */           public void entered(UIButton button) {
/* 1007 */             button.setImage(Level.this.rimg);
/*      */           }
/*      */           
/*      */           public void exited(UIButton button) {
/* 1011 */             button.setImage(Level.this.rimg);
/*      */           }
/*      */           
/*      */           public void pressed(UIButton button) {
/* 1015 */             button.setImage(Level.this.rimg);
/*      */           }
/*      */           
/*      */           public void released(UIButton button) {
/* 1019 */             button.setImage(Level.this.rimg);
/*      */           }
/*      */         });
/* 1022 */     if (buttonend == 0) {
/* 1023 */       this.spacebar.addComponent((UIComponent)spacebarimg);
/*      */     }
/* 1025 */     if (buttonendr == 0) {
/* 1026 */       this.respawning.addComponent((UIComponent)rkeyimg);
/*      */     }
/* 1028 */     buttonendr = 1;
/* 1029 */     buttonend = 1;
/*      */   }
/*      */   
/*      */   public Tile getTile(int x, int y) {
/* 1033 */     UILabel spacebarlbl = new UILabel(new Vector2i(80, 70), "spacebar");
/* 1034 */     spacebarlbl.setColor(5987420, false);
/* 1035 */     spacebarlbl.setFont(new Font("Arial", 0, 40));
/* 1036 */     spacebarlbl.dropShadow = false;
/*      */     
/* 1038 */     UILabel rlbl = new UILabel(new Vector2i(87, 76), "R");
/* 1039 */     rlbl.setColor(5987420, false);
/* 1040 */     rlbl.setFont(new Font("Arial", 0, 40));
/* 1041 */     rlbl.dropShadow = false;
/*      */     
/* 1043 */     UILabel spclbldesc = new UILabel(new Vector2i(330, 90), "to freeze time");
/* 1044 */     spclbldesc.setColor(12632256, false);
/* 1045 */     spclbldesc.setFont(new Font("Arial", 0, 50));
/* 1046 */     spclbldesc.dropShadow = false;
/*      */     
/* 1048 */     UILabel rlbldesc = new UILabel(new Vector2i(175, 86), "to quick respawn");
/* 1049 */     rlbldesc.setColor(12632256, false);
/* 1050 */     rlbldesc.setFont(new Font("Arial", 0, 50));
/* 1051 */     rlbldesc.dropShadow = false;
/*      */     
/* 1053 */     UILabel text2 = new UILabel(new Vector2i(80, 90), "Nothing is broken.");
/* 1054 */     text2.setColor(12632256, false);
/* 1055 */     text2.setFont(new Font("Arial", 0, 60));
/* 1056 */     text2.dropShadow = false;
/*      */     
/* 1058 */     UILabel text3 = new UILabel(new Vector2i(70, 90), "Except the 4th wall.");
/* 1059 */     text3.setColor(12632256, false);
/* 1060 */     text3.setFont(new Font("Arial", 0, 60));
/* 1061 */     text3.dropShadow = false;
/*      */     
/* 1063 */     UILabel textgold = new UILabel(new Vector2i(90, 90), "Password? LINUX");
/* 1064 */     textgold.setColor(16760320, false);
/* 1065 */     textgold.setFont(new Font("Arial", 0, 60));
/* 1066 */     textgold.dropShadow = false;
/*      */     
/* 1068 */     UILabel text4 = new UILabel(new Vector2i(100, 90), "It's nothing(.rar)");
/* 1069 */     text4.setColor(16760320, false);
/* 1070 */     text4.setFont(new Font("Arial", 0, 60));
/* 1071 */     text4.dropShadow = false;
/*      */     
/* 1073 */     UILabel text5 = new UILabel(new Vector2i(100, 90), "\"Support Bot on.\"");
/* 1074 */     text5.setColor(12632256, false);
/* 1075 */     text5.setFont(new Font("Arial", 0, 60));
/* 1076 */     text5.dropShadow = false;
/*      */     
/* 1078 */     UILabel text7 = new UILabel(new Vector2i(120, 90), "Hello Traveler.");
/* 1079 */     text7.setColor(12632256, false);
/* 1080 */     text7.setFont(new Font("Arial", 0, 60));
/* 1081 */     text7.dropShadow = false;
/*      */     
/* 1083 */     UILabel text8 = new UILabel(new Vector2i(100, 90), "Do you remember?");
/* 1084 */     text8.setColor(12632256, false);
/* 1085 */     text8.setFont(new Font("Arial", 2, 60));
/* 1086 */     text8.dropShadow = false;
/*      */     
/* 1088 */     UILabel text9 = new UILabel(new Vector2i(90, 90), "\"It's a secret to everybody.\"");
/* 1089 */     text9.setColor(12632256, false);
/* 1090 */     text9.setFont(new Font("Arial", 0, 40));
/* 1091 */     text9.dropShadow = false;
/*      */     
/* 1093 */     UILabel text10 = new UILabel(new Vector2i(60, 90), "\"I am sworn to carry your burdens.\"");
/* 1094 */     text10.setColor(12632256, false);
/* 1095 */     text10.setFont(new Font("Arial", 0, 40));
/* 1096 */     text10.dropShadow = false;
/*      */     
/* 1098 */     UILabel text11 = new UILabel(new Vector2i(140, 90), "And so it ends.");
/* 1099 */     text11.setColor(12632256, false);
/* 1100 */     text11.setFont(new Font("Arial", 0, 60));
/* 1101 */     text11.dropShadow = false;
/*      */     
/* 1103 */     UILabel text12 = new UILabel(new Vector2i(20, 90), "Caution: Buttons are cold");
/* 1104 */     text12.setColor(12632256, false);
/* 1105 */     text12.setFont(new Font("Arial", 0, 55));
/* 1106 */     text12.dropShadow = false;
/*      */     
/* 1108 */     UILabel text13 = new UILabel(new Vector2i(100, 90), "If all orbs, go left.");
/* 1109 */     text13.setColor(12632256, false);
/* 1110 */     text13.setFont(new Font("Arial", 1, 60));
/* 1111 */     text13.dropShadow = false;
/*      */     
/* 1113 */     UILabel text14 = new UILabel(new Vector2i(120, 100), "QUANDARY");
/* 1114 */     text14.setColor(2202820, false);
/* 1115 */     text14.setFont(new Font("Arial", 1, 80));
/* 1116 */     text14.dropShadow = true;
/*      */ 
/*      */     
/* 1119 */     if (y < 0) return Tile.nosprite; 
/* 1120 */     if (y >= this.height) return Tile.voidTile; 
/* 1121 */     if (x < 0 || x >= this.width) {
/* 1122 */       if (y < 0 || y < 16) return Tile.nosprite; 
/* 1123 */       if (y >= this.height || y >= 16) return Tile.voidTile;
/*      */     
/*      */     } 
/* 1126 */     if (this.tiles[x + y * this.width] == -4210755 && freeze) {
/* 1127 */       if (!bossswitch) return Tile.spawn_floor; 
/* 1128 */       return Tile.spawn_floor2;
/*      */     } 
/* 1130 */     if (this.tiles[x + y * this.width] == -32884) return Tile.spawn_fakefloor; 
/* 1131 */     if (this.tiles[x + y * this.width] == -21) return Tile.nosprite; 
/* 1132 */     if (this.tiles[x + y * this.width] == -3223905) return Tile.nospritewall; 
/* 1133 */     if (this.tiles[x + y * this.width] == -9729) return Tile.blackwall; 
/* 1134 */     if (this.tiles[x + y * this.width] == -65281) return Tile.spawn_tube; 
/* 1135 */     if (this.tiles[x + y * this.width] == -28673) return Tile.spawn_tubebrk; 
/* 1136 */     if (this.tiles[x + y * this.width] == -22529) return Tile.spawn_tubebrk2; 
/* 1137 */     if (this.tiles[x + y * this.width] == -9350097) return Tile.exit; 
/* 1138 */     if (this.tiles[x + y * this.width] == -9350096) return Tile.exit2; 
/* 1139 */     if (this.tiles[x + y * this.width] == -4210753) return Tile.light; 
/* 1140 */     if (this.tiles[x + y * this.width] == -4210751) return Tile.light2; 
/* 1141 */     if (this.tiles[x + y * this.width] == -4210749) return Tile.light3; 
/* 1142 */     if (this.tiles[x + y * this.width] == -4210747) return Tile.light4; 
/* 1143 */     if (this.tiles[x + y * this.width] == -4210745) return Tile.light5; 
/* 1144 */     if (this.tiles[x + y * this.width] == -4210743) return Tile.light6; 
/* 1145 */     if (this.tiles[x + y * this.width] == -16318375) return Tile.border1; 
/* 1146 */     if (this.tiles[x + y * this.width] == -16318373) return Tile.border2; 
/* 1147 */     if (this.tiles[x + y * this.width] == -16318371) return Tile.border3; 
/* 1148 */     if (this.tiles[x + y * this.width] == -1642521) return Tile.white; 
/* 1149 */     if (this.tiles[x + y * this.width] == -2431761) {
/* 1150 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) {
/*      */         try {
/* 1152 */           credit.start();
/* 1153 */         } catch (IOException e) {
/* 1154 */           e.printStackTrace();
/*      */         } 
/* 1156 */         System.exit(0);
/*      */       } 
/* 1158 */       return Tile.white;
/*      */     } 
/*      */     
/* 1161 */     if (this.tiles[x + y * this.width] == -16760221) {
/* 1162 */       if (!flameblue)
/* 1163 */         return Tile.spawn_flameemp; 
/* 1164 */       if (flameblue) {
/* 1165 */         return Tile.spawn_flamebl;
/*      */       }
/*      */     } 
/* 1168 */     if (this.tiles[x + y * this.width] == -16729501) {
/* 1169 */       if (!flamegreen)
/* 1170 */         return Tile.spawn_flameemp; 
/* 1171 */       if (flamegreen) {
/* 1172 */         return Tile.spawn_flamegr;
/*      */       }
/*      */     } 
/* 1175 */     if (this.tiles[x + y * this.width] == -48541) {
/* 1176 */       if (!flamered)
/* 1177 */         return Tile.spawn_flameemp; 
/* 1178 */       if (flamered) {
/* 1179 */         return Tile.spawn_flamerd;
/*      */       }
/*      */     } 
/*      */     
/* 1183 */     if (this.tiles[x + y * this.width] == -9748609) {
/* 1184 */       if (flamegreen && flamered && flameblue) {
/* 1185 */         return Tile.spawn_flamedoordown;
/*      */       }
/* 1187 */       return Tile.spawn_flamedoor;
/*      */     } 
/*      */     
/* 1190 */     if (this.tiles[x + y * this.width] == -8454034) {
/* 1191 */       if (flamegreen && flamered && flameblue) {
/* 1192 */         return Tile.spawn_wall_end;
/*      */       }
/* 1194 */       return Tile.spawn_flamedoor;
/*      */     } 
/*      */     
/* 1197 */     if (Player.levelrst) {
/* 1198 */       ui.removePanel(this.spacebar);
/* 1199 */       this.spacebar.removeComponent((UIComponent)spacebarlbl);
/* 1200 */       this.spacebar.removeComponent((UIComponent)rlbl);
/* 1201 */       this.spacebar.removeComponent((UIComponent)spclbldesc);
/* 1202 */       this.spacebar.removeComponent((UIComponent)rlbldesc);
/* 1203 */       ui.removePanel(this.gold);
/* 1204 */       this.gold.removeComponent((UIComponent)textgold);
/* 1205 */       ui.removePanel(this.msg2);
/* 1206 */       this.msg2.removeComponent((UIComponent)text2);
/* 1207 */       ui.removePanel(this.msg3);
/* 1208 */       this.msg3.removeComponent((UIComponent)text3);
/* 1209 */       ui.removePanel(this.msg4);
/* 1210 */       this.msg4.removeComponent((UIComponent)text4);
/* 1211 */       ui.removePanel(this.msg5);
/* 1212 */       this.msg5.removeComponent((UIComponent)text5);
/* 1213 */       Player.levelrst = false;
/*      */     } 
/* 1215 */     if (this.tiles[x + y * this.width] == -5111553) return Tile.spawn_leftproj; 
/* 1216 */     if (this.tiles[x + y * this.width] == -6094593) return Tile.spawn_rightproj; 
/* 1217 */     if (this.tiles[x + y * this.width] == -5939418) {
/* 1218 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && spaceadd == 0) {
/* 1219 */         ui.addPanel(this.spacebar);
/* 1220 */         spacebutton();
/* 1221 */         this.spacebar.addComponent((UIComponent)spacebarlbl);
/* 1222 */         this.spacebar.addComponent((UIComponent)spclbldesc);
/* 1223 */         if (spaceadd < 2) spaceadd++; 
/* 1224 */       } else if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && spaceadd != 0) {
/* 1225 */         spaceadd = 1;
/*      */       } else {
/* 1227 */         ui.removePanel(this.spacebar);
/* 1228 */         this.spacebar.removeComponent((UIComponent)spacebarlbl);
/* 1229 */         this.spacebar.removeComponent((UIComponent)spclbldesc);
/* 1230 */         spaceadd = 0;
/*      */       } 
/* 1232 */       return Tile.spawn_sign;
/*      */     } 
/* 1234 */     if (this.tiles[x + y * this.width] == -16896) {
/* 1235 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && goldadd == 0) {
/* 1236 */         ui.addPanel(this.gold);
/* 1237 */         this.gold.addComponent((UIComponent)textgold);
/* 1238 */         if (goldadd < 2) goldadd++; 
/* 1239 */       } else if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && goldadd != 0) {
/* 1240 */         goldadd = 1;
/*      */       } else {
/* 1242 */         ui.removePanel(this.gold);
/* 1243 */         this.gold.removeComponent((UIComponent)textgold);
/* 1244 */         goldadd = 0;
/*      */       } 
/* 1246 */       return Tile.spawn_signgold;
/*      */     } 
/* 1248 */     if (this.tiles[x + y * this.width] == -5939374) {
/* 1249 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd2 == 0) {
/* 1250 */         ui.addPanel(this.msg2);
/* 1251 */         this.msg2.addComponent((UIComponent)text2);
/* 1252 */         if (msgadd2 < 2) msgadd2++; 
/* 1253 */       } else if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd2 != 0) {
/* 1254 */         msgadd2 = 1;
/*      */       } else {
/* 1256 */         ui.removePanel(this.msg2);
/* 1257 */         this.msg2.removeComponent((UIComponent)text2);
/* 1258 */         msgadd2 = 0;
/*      */       } 
/* 1260 */       return Tile.spawn_sign;
/*      */     } 
/* 1262 */     if (this.tiles[x + y * this.width] == -5939347) {
/* 1263 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd3 == 0) {
/* 1264 */         ui.addPanel(this.msg3);
/* 1265 */         this.msg3.addComponent((UIComponent)text3);
/* 1266 */         if (msgadd3 < 2) msgadd3++; 
/* 1267 */       } else if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd3 != 0) {
/* 1268 */         msgadd3 = 1;
/*      */       } else {
/* 1270 */         ui.removePanel(this.msg3);
/* 1271 */         this.msg3.removeComponent((UIComponent)text3);
/* 1272 */         msgadd3 = 0;
/*      */       } 
/* 1274 */       return Tile.spawn_sign;
/*      */     } 
/* 1276 */     if (this.tiles[x + y * this.width] == -5939336) {
/* 1277 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd4 == 0) {
/* 1278 */         ui.addPanel(this.msg4);
/* 1279 */         this.msg4.addComponent((UIComponent)text4);
/* 1280 */         if (msgadd4 < 2) msgadd4++; 
/* 1281 */       } else if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd4 != 0) {
/* 1282 */         msgadd4 = 1;
/*      */       } else {
/* 1284 */         ui.removePanel(this.msg4);
/* 1285 */         this.msg4.removeComponent((UIComponent)text4);
/* 1286 */         msgadd4 = 0;
/*      */       } 
/* 1288 */       return Tile.spawn_lock;
/*      */     } 
/* 1290 */     if (this.tiles[x + y * this.width] == -5939328) {
/* 1291 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd5 == 0) {
/* 1292 */         ui.addPanel(this.msg5);
/* 1293 */         this.msg5.addComponent((UIComponent)text5);
/* 1294 */         if (msgadd5 < 2) msgadd5++; 
/* 1295 */       } else if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd5 != 0) {
/* 1296 */         msgadd5 = 1;
/*      */       } else {
/* 1298 */         ui.removePanel(this.msg5);
/* 1299 */         this.msg5.removeComponent((UIComponent)text5);
/* 1300 */         msgadd5 = 0;
/*      */       } 
/* 1302 */       return Tile.spawn_sign;
/*      */     } 
/* 1304 */     if (this.tiles[x + y * this.width] == -5939326) {
/* 1305 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && radd == 0) {
/* 1306 */         ui.addPanel(this.respawning);
/* 1307 */         spacebutton();
/* 1308 */         this.respawning.addComponent((UIComponent)rlbl);
/* 1309 */         this.respawning.addComponent((UIComponent)rlbldesc);
/* 1310 */         if (radd < 2) radd++; 
/* 1311 */       } else if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && radd != 0) {
/* 1312 */         radd = 1;
/*      */       } else {
/* 1314 */         ui.removePanel(this.respawning);
/* 1315 */         this.respawning.removeComponent((UIComponent)rlbl);
/* 1316 */         this.respawning.removeComponent((UIComponent)rlbldesc);
/* 1317 */         radd = 0;
/*      */       } 
/* 1319 */       return Tile.spawn_sign;
/*      */     } 
/* 1321 */     if (this.tiles[x + y * this.width] == -5939324) {
/* 1322 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd7 == 0) {
/* 1323 */         ui.addPanel(this.msg7);
/* 1324 */         this.msg7.addComponent((UIComponent)text7);
/* 1325 */         if (msgadd7 < 2) msgadd7++; 
/* 1326 */       } else if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd7 != 0) {
/* 1327 */         msgadd5 = 1;
/*      */       } else {
/* 1329 */         ui.removePanel(this.msg7);
/* 1330 */         this.msg7.removeComponent((UIComponent)text7);
/* 1331 */         msgadd7 = 0;
/*      */       } 
/* 1333 */       return Tile.spawn_sign;
/*      */     } 
/* 1335 */     if (this.tiles[x + y * this.width] == -5939322) {
/* 1336 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd8 == 0) {
/* 1337 */         ui.addPanel(this.msg8);
/* 1338 */         this.msg8.addComponent((UIComponent)text8);
/* 1339 */         if (msgadd8 < 2) msgadd8++; 
/* 1340 */       } else if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd8 != 0) {
/* 1341 */         msgadd8 = 1;
/*      */       } else {
/* 1343 */         ui.removePanel(this.msg8);
/* 1344 */         this.msg8.removeComponent((UIComponent)text8);
/* 1345 */         msgadd8 = 0;
/*      */       } 
/* 1347 */       return Tile.spawn_sign;
/*      */     } 
/* 1349 */     if (this.tiles[x + y * this.width] == -5939320) {
/* 1350 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd9 == 0) {
/* 1351 */         ui.addPanel(this.msg9);
/* 1352 */         this.msg9.addComponent((UIComponent)text9);
/* 1353 */         if (msgadd9 < 2) msgadd9++; 
/* 1354 */       } else if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd9 != 0) {
/* 1355 */         msgadd9 = 1;
/*      */       } else {
/* 1357 */         ui.removePanel(this.msg9);
/* 1358 */         this.msg9.removeComponent((UIComponent)text9);
/* 1359 */         msgadd9 = 0;
/*      */       } 
/* 1361 */       return Tile.spawn_sign;
/*      */     } 
/* 1363 */     if (this.tiles[x + y * this.width] == -5939318) {
/* 1364 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd10 == 0) {
/* 1365 */         ui.addPanel(this.msg10);
/* 1366 */         this.msg10.addComponent((UIComponent)text10);
/* 1367 */         if (msgadd10 < 2) msgadd10++; 
/* 1368 */       } else if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd10 != 0) {
/* 1369 */         msgadd10 = 1;
/*      */       } else {
/* 1371 */         ui.removePanel(this.msg10);
/* 1372 */         this.msg10.removeComponent((UIComponent)text10);
/* 1373 */         msgadd10 = 0;
/*      */       } 
/* 1375 */       return Tile.spawn_sign;
/*      */     } 
/* 1377 */     if (this.tiles[x + y * this.width] == -5939316) {
/* 1378 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd11 == 0) {
/* 1379 */         ui.addPanel(this.msg11);
/* 1380 */         this.msg11.addComponent((UIComponent)text11);
/* 1381 */         if (msgadd11 < 2) msgadd11++;
/*      */       
/* 1383 */       } else if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd11 != 0) {
/* 1384 */         msgadd11 = 1;
/*      */       } else {
/* 1386 */         ui.removePanel(this.msg11);
/* 1387 */         this.msg11.removeComponent((UIComponent)text11);
/* 1388 */         msgadd11 = 0;
/*      */       } 
/* 1390 */       return Tile.spawn_sign;
/*      */     } 
/* 1392 */     if (this.tiles[x + y * this.width] == -6987360) {
/* 1393 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd12 == 0) {
/* 1394 */         ui.addPanel(this.msg12);
/* 1395 */         this.msg12.addComponent((UIComponent)text12);
/* 1396 */         if (msgadd12 < 2) msgadd12++;
/*      */       
/* 1398 */       } else if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd12 != 0) {
/* 1399 */         msgadd12 = 1;
/*      */       } else {
/* 1401 */         ui.removePanel(this.msg12);
/* 1402 */         this.msg12.removeComponent((UIComponent)text12);
/* 1403 */         msgadd12 = 0;
/*      */       } 
/* 1405 */       return Tile.spawn_sign;
/*      */     } 
/* 1407 */     if (this.tiles[x + y * this.width] == -6987358) {
/* 1408 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd13 == 0) {
/* 1409 */         ui.addPanel(this.msg13);
/* 1410 */         this.msg13.addComponent((UIComponent)text13);
/* 1411 */         if (msgadd13 < 2) msgadd13++;
/*      */       
/* 1413 */       } else if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd13 != 0) {
/* 1414 */         msgadd13 = 1;
/*      */       } else {
/* 1416 */         ui.removePanel(this.msg13);
/* 1417 */         this.msg13.removeComponent((UIComponent)text13);
/* 1418 */         msgadd13 = 0;
/*      */       } 
/* 1420 */       return Tile.spawn_sign;
/*      */     } 
/* 1422 */     if (this.tiles[x + y * this.width] == -6987362) {
/* 1423 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd14 == 0) {
/* 1424 */         ui.addPanel(this.msg14);
/* 1425 */         this.msg14.addComponent((UIComponent)text14);
/* 1426 */         if (msgadd14 < 2) msgadd14++;
/*      */       
/* 1428 */       } else if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && msgadd14 != 0) {
/* 1429 */         msgadd14 = 1;
/*      */       } else {
/* 1431 */         ui.removePanel(this.msg14);
/* 1432 */         this.msg14.removeComponent((UIComponent)text14);
/* 1433 */         msgadd14 = 0;
/*      */       } 
/* 1435 */       return Tile.spawn_sign;
/*      */     } 
/*      */     
/* 1438 */     if (burn) {
/* 1439 */       if (stop == 0) {
/* 1440 */         health = SpawnLevel.maxhealth;
/*      */         
/* 1442 */         stop = 1;
/* 1443 */         bossswitch = true;
/*      */       } 
/* 1445 */       if (!freeze) SpawnLevel.roomtemp = SpawnLevel.maxtemp; 
/*      */     } 
/* 1447 */     if (freeze) SpawnLevel.roomtemp = 0;
/*      */     
/* 1449 */     if (freeze && Keyboard.spacebar) {
/*      */       
/* 1451 */       if (this.tiles[x + y * this.width] == -11731200) {
/* 1452 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y) {
/* 1453 */           grfrzbut = true;
/* 1454 */           mobpressgr = false;
/*      */         } 
/* 1456 */       } else if (this.tiles[x + y * this.width] == -11796736) {
/* 1457 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y) {
/* 1458 */           grfrzbut = true;
/* 1459 */           mobpressgr = false;
/*      */         } 
/*      */       } else {
/* 1462 */         mobpressgr = true;
/*      */       } 
/* 1464 */       if (mobpressgr) {
/* 1465 */         if (this.tiles[x + y * this.width] == -11731200) {
/* 1466 */           grfrzbut = false;
/*      */         }
/* 1468 */         if (this.tiles[x + y * this.width] == -11796736) {
/* 1469 */           grfrzbut = false;
/*      */         }
/*      */       } 
/*      */       
/* 1473 */       if (this.tiles[x + y * this.width] == -11796225) {
/* 1474 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y) {
/* 1475 */           blfrzbut = true;
/* 1476 */           mobpressbl = false;
/*      */         } 
/* 1478 */       } else if (this.tiles[x + y * this.width] == -11861761) {
/* 1479 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y) {
/* 1480 */           blfrzbut = true;
/* 1481 */           mobpressbl = false;
/*      */         } 
/*      */       } else {
/* 1484 */         mobpressbl = true;
/*      */       } 
/* 1486 */       if (mobpressbl) {
/* 1487 */         if (this.tiles[x + y * this.width] == -11796225) {
/* 1488 */           blfrzbut = false;
/*      */         }
/* 1490 */         if (this.tiles[x + y * this.width] == -11861761) {
/* 1491 */           blfrzbut = false;
/*      */         }
/*      */       } 
/*      */       
/* 1495 */       if (this.tiles[x + y * this.width] == -65460) {
/* 1496 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y) {
/* 1497 */           rdfrzbut = true;
/* 1498 */           mobpressrd = false;
/*      */         } 
/* 1500 */       } else if (this.tiles[x + y * this.width] == -65461) {
/* 1501 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y) {
/* 1502 */           rdfrzbut = true;
/* 1503 */           mobpressrd = false;
/*      */         } 
/*      */       } else {
/* 1506 */         mobpressrd = true;
/*      */       } 
/* 1508 */       if (mobpressrd) {
/* 1509 */         if (this.tiles[x + y * this.width] == -65460) {
/* 1510 */           rdfrzbut = false;
/*      */         }
/* 1512 */         if (this.tiles[x + y * this.width] == -65461) {
/* 1513 */           rdfrzbut = false;
/*      */         }
/*      */       } 
/*      */       
/* 1517 */       if (this.tiles[x + y * this.width] == -180) {
/* 1518 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y) {
/* 1519 */           ylfrzbut = true;
/* 1520 */           mobpressyl = false;
/*      */         } 
/* 1522 */       } else if (this.tiles[x + y * this.width] == -181) {
/* 1523 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y) {
/* 1524 */           ylfrzbut = true;
/* 1525 */           mobpressyl = false;
/*      */         } 
/*      */       } else {
/* 1528 */         mobpressyl = true;
/*      */       } 
/* 1530 */       if (mobpressyl) {
/* 1531 */         if (this.tiles[x + y * this.width] == -180) {
/* 1532 */           ylfrzbut = false;
/*      */         }
/* 1534 */         if (this.tiles[x + y * this.width] == -181) {
/* 1535 */           ylfrzbut = false;
/*      */         }
/*      */       } 
/*      */     } 
/* 1539 */     if (freeze) {
/* 1540 */       if (this.tiles[x + y * this.width] == -4107437) {
/* 1541 */         return Tile.spawn_floor2;
/*      */       }
/* 1543 */       if (this.tiles[x + y * this.width] == -7286803) {
/* 1544 */         return Tile.spawn_floor3;
/*      */       }
/*      */     } 
/*      */     
/* 1548 */     if (!freeze) {
/* 1549 */       if (this.tiles[x + y * this.width] == -4210755) {
/* 1550 */         if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) SpawnLevel.roomtemp = SpawnLevel.maxtemp / 2; 
/* 1551 */         return Tile.spawn_floor;
/*      */       } 
/* 1553 */       if (this.tiles[x + y * this.width] == -2368551) {
/* 1554 */         if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) SpawnLevel.roomtemp = SpawnLevel.maxtemp / 2; 
/* 1555 */         return Tile.spawn_sep;
/*      */       } 
/* 1557 */       if (this.tiles[x + y * this.width] == -5921371) {
/* 1558 */         if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) SpawnLevel.roomtemp = SpawnLevel.maxtemp / 2; 
/* 1559 */         return Tile.spawn_sep2;
/*      */       } 
/* 1561 */       if (this.tiles[x + y * this.width] == -4107437) {
/* 1562 */         if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) SpawnLevel.roomtemp = SpawnLevel.maxtemp; 
/* 1563 */         return Tile.spawn_floor2;
/*      */       } 
/* 1565 */       if (this.tiles[x + y * this.width] == -7286803) {
/* 1566 */         if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) SpawnLevel.roomtemp = 0; 
/* 1567 */         return Tile.spawn_floor3;
/*      */       } 
/* 1569 */       if (this.tiles[x + y * this.width] == -11796225 && 
/* 1570 */         getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) {
/* 1571 */         SpawnLevel.roomtemp = 0;
/*      */       }
/*      */       
/* 1574 */       if (this.tiles[x + y * this.width] == -11861761 && 
/* 1575 */         getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) {
/* 1576 */         SpawnLevel.roomtemp = 0;
/*      */       }
/*      */       
/* 1579 */       if (this.tiles[x + y * this.width] == -11731200 && 
/* 1580 */         getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) {
/* 1581 */         SpawnLevel.roomtemp = 0;
/*      */       }
/*      */       
/* 1584 */       if (this.tiles[x + y * this.width] == -11796736 && 
/* 1585 */         getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) {
/* 1586 */         SpawnLevel.roomtemp = 0;
/*      */       }
/*      */       
/* 1589 */       if (this.tiles[x + y * this.width] == -65460 && 
/* 1590 */         getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) {
/* 1591 */         SpawnLevel.roomtemp = 0;
/*      */       }
/*      */       
/* 1594 */       if (this.tiles[x + y * this.width] == -65461 && 
/* 1595 */         getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) {
/* 1596 */         SpawnLevel.roomtemp = 0;
/*      */       }
/*      */       
/* 1599 */       if (this.tiles[x + y * this.width] == -180 && 
/* 1600 */         getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) {
/* 1601 */         SpawnLevel.roomtemp = 0;
/*      */       }
/*      */       
/* 1604 */       if (this.tiles[x + y * this.width] == -181 && 
/* 1605 */         getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) {
/* 1606 */         SpawnLevel.roomtemp = 0;
/*      */       }
/*      */ 
/*      */       
/* 1610 */       if (this.tiles[x + y * this.width] == -11731200) {
/* 1611 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y) {
/* 1612 */           butcollgr = true;
/* 1613 */           grpressed = true;
/* 1614 */           return Tile.spawn_buttondowngr;
/* 1615 */         }  if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) {
/* 1616 */           butcollgr = true;
/* 1617 */           grpressed = true;
/* 1618 */           return Tile.spawn_buttondowngr;
/* 1619 */         }  if (grpressed2 && grfrzbut) {
/* 1620 */           butcollgr = true;
/* 1621 */           grpressed = false;
/* 1622 */           return Tile.spawn_buttondowngr;
/*      */         } 
/* 1624 */         butcollgr = false;
/* 1625 */         grpressed = false;
/* 1626 */         return Tile.spawn_buttongr;
/*      */       } 
/* 1628 */       if (this.tiles[x + y * this.width] == -11796736) {
/* 1629 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y) {
/* 1630 */           butcollgr = true;
/* 1631 */           grpressed2 = true;
/* 1632 */           return Tile.spawn_buttondowngr;
/* 1633 */         }  if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) {
/* 1634 */           butcollgr = true;
/* 1635 */           grpressed2 = true;
/* 1636 */           return Tile.spawn_buttondowngr;
/* 1637 */         }  if (grpressed && grfrzbut) {
/* 1638 */           butcollgr = true;
/* 1639 */           grpressed2 = false;
/* 1640 */           return Tile.spawn_buttondowngr;
/*      */         } 
/* 1642 */         butcollgr = false;
/* 1643 */         grpressed2 = false;
/* 1644 */         return Tile.spawn_buttongr;
/*      */       } 
/* 1646 */       if (!grfrzbut && !freeze && Keyboard.spacebar) {
/* 1647 */         butcollgr = false;
/* 1648 */         grpressed2 = false;
/* 1649 */         grpressed = false;
/*      */       } 
/*      */ 
/*      */       
/* 1653 */       if (this.tiles[x + y * this.width] == -11796225) {
/* 1654 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y) {
/* 1655 */           butcollbl = true;
/* 1656 */           blpressed = true;
/* 1657 */           return Tile.spawn_buttondownbl;
/* 1658 */         }  if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) {
/* 1659 */           butcollbl = true;
/* 1660 */           blpressed = true;
/* 1661 */           return Tile.spawn_buttondownbl;
/* 1662 */         }  if (blpressed2) {
/* 1663 */           butcollbl = true;
/* 1664 */           blpressed = false;
/* 1665 */           return Tile.spawn_buttondownbl;
/*      */         } 
/* 1667 */         butcollbl = false;
/* 1668 */         blpressed = false;
/* 1669 */         return Tile.spawn_buttonbl;
/*      */       } 
/* 1671 */       if (this.tiles[x + y * this.width] == -11861761) {
/* 1672 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y) {
/* 1673 */           butcollbl = true;
/* 1674 */           blpressed2 = true;
/* 1675 */           return Tile.spawn_buttondownbl;
/* 1676 */         }  if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) {
/* 1677 */           butcollbl = true;
/* 1678 */           blpressed2 = true;
/* 1679 */           return Tile.spawn_buttondownbl;
/* 1680 */         }  if (blpressed) {
/* 1681 */           butcollbl = true;
/* 1682 */           blpressed2 = false;
/* 1683 */           return Tile.spawn_buttondownbl;
/*      */         } 
/* 1685 */         butcollbl = false;
/* 1686 */         blpressed2 = false;
/* 1687 */         return Tile.spawn_buttonbl;
/*      */       } 
/* 1689 */       if (!blfrzbut && !freeze && Keyboard.spacebar) {
/* 1690 */         butcollbl = false;
/* 1691 */         blpressed2 = false;
/* 1692 */         blpressed = false;
/*      */       } 
/*      */       
/* 1695 */       if (this.tiles[x + y * this.width] == -65460) {
/* 1696 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y && !rdpressed2) {
/* 1697 */           butcollrd = true;
/* 1698 */           rdpressed = true;
/* 1699 */           return Tile.spawn_buttondownrd;
/* 1700 */         }  if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !rdpressed2) {
/* 1701 */           butcollrd = true;
/* 1702 */           rdpressed = true;
/* 1703 */           return Tile.spawn_buttondownrd;
/* 1704 */         }  if (rdpressed2) {
/* 1705 */           butcollrd = true;
/* 1706 */           rdpressed = false;
/* 1707 */           return Tile.spawn_buttondownrd;
/*      */         } 
/* 1709 */         butcollrd = false;
/* 1710 */         rdpressed = false;
/* 1711 */         return Tile.spawn_buttonrd;
/*      */       } 
/* 1713 */       if (this.tiles[x + y * this.width] == -65461) {
/* 1714 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y && !rdpressed) {
/* 1715 */           butcollrd = true;
/* 1716 */           rdpressed2 = true;
/* 1717 */           return Tile.spawn_buttondownrd;
/* 1718 */         }  if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !rdpressed) {
/* 1719 */           butcollrd = true;
/* 1720 */           rdpressed2 = true;
/* 1721 */           return Tile.spawn_buttondownrd;
/* 1722 */         }  if (rdpressed) {
/* 1723 */           butcollrd = true;
/* 1724 */           rdpressed2 = false;
/* 1725 */           return Tile.spawn_buttondownrd;
/*      */         } 
/* 1727 */         butcollrd = false;
/* 1728 */         rdpressed2 = false;
/* 1729 */         return Tile.spawn_buttonrd;
/*      */       } 
/* 1731 */       if (!rdfrzbut && !freeze && Keyboard.spacebar) {
/* 1732 */         butcollrd = false;
/* 1733 */         rdpressed2 = false;
/* 1734 */         rdpressed = false;
/*      */       } 
/*      */       
/* 1737 */       if (this.tiles[x + y * this.width] == -180) {
/* 1738 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y) {
/* 1739 */           butcollyl = true;
/* 1740 */           ylpressed = true;
/* 1741 */           return Tile.spawn_buttondownyl;
/* 1742 */         }  if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) {
/* 1743 */           butcollyl = true;
/* 1744 */           ylpressed = true;
/* 1745 */           return Tile.spawn_buttondownyl;
/* 1746 */         }  if (ylpressed2) {
/* 1747 */           butcollyl = true;
/* 1748 */           ylpressed = false;
/* 1749 */           return Tile.spawn_buttondownyl;
/*      */         } 
/* 1751 */         butcollyl = false;
/* 1752 */         ylpressed = false;
/* 1753 */         return Tile.spawn_buttonyl;
/*      */       } 
/* 1755 */       if (this.tiles[x + y * this.width] == -181) {
/* 1756 */         if (getClientBlitzkrieg().getX() / 16 == x && (getClientBlitzkrieg().getY() - 1) / 16 + 1 == y) {
/* 1757 */           butcollyl = true;
/* 1758 */           ylpressed2 = true;
/* 1759 */           return Tile.spawn_buttondownyl;
/* 1760 */         }  if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) {
/* 1761 */           butcollyl = true;
/* 1762 */           ylpressed2 = true;
/* 1763 */           return Tile.spawn_buttondownyl;
/* 1764 */         }  if (ylpressed) {
/* 1765 */           butcollyl = true;
/* 1766 */           ylpressed2 = false;
/* 1767 */           return Tile.spawn_buttondownyl;
/*      */         } 
/* 1769 */         butcollyl = false;
/* 1770 */         ylpressed2 = false;
/* 1771 */         return Tile.spawn_buttonyl;
/*      */       } 
/* 1773 */       if (!ylfrzbut && !freeze && Keyboard.spacebar) {
/* 1774 */         butcollyl = false;
/* 1775 */         ylpressed2 = false;
/* 1776 */         ylpressed = false;
/*      */       } 
/*      */     } 
/*      */     
/* 1780 */     if (this.tiles[x + y * this.width] == -5864861) {
/* 1781 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !orboff && !freeze) {
/* 1782 */         orboff = true;
/* 1783 */         Player.speed = 2.4D;
/* 1784 */         flamegreen = true;
/* 1785 */         Player.temprst();
/* 1786 */         return Tile.empty;
/* 1787 */       }  if (!orboff) {
/* 1788 */         return Tile.speed_orb;
/*      */       }
/* 1790 */       return Tile.empty;
/*      */     } 
/*      */     
/* 1793 */     if (this.tiles[x + y * this.width] == -1723511) {
/* 1794 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !orboff2 && !freeze) {
/* 1795 */         orboff2 = true;
/* 1796 */         SpawnLevel.maxtemp = 1800;
/* 1797 */         flameblue = true;
/* 1798 */         Player.temprst();
/* 1799 */         return Tile.empty;
/* 1800 */       }  if (!orboff2) {
/* 1801 */         return Tile.temp_orb;
/*      */       }
/* 1803 */       return Tile.empty;
/*      */     } 
/*      */     
/* 1806 */     if (this.tiles[x + y * this.width] == -9414845) {
/* 1807 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !orboff3 && !freeze) {
/* 1808 */         orboff3 = true;
/* 1809 */         SpawnLevel.maxhealth = 1300;
/* 1810 */         health = 1300;
/* 1811 */         flamered = true;
/* 1812 */         Player.temprst();
/* 1813 */         return Tile.empty;
/* 1814 */       }  if (!orboff3) {
/* 1815 */         return Tile.health_orb;
/*      */       }
/* 1817 */       return Tile.empty;
/*      */     } 
/*      */     
/* 1820 */     if (this.tiles[x + y * this.width] == -38400) {
/* 1821 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !freeze && !rborbsw) {
/* 1822 */         health = SpawnLevel.maxhealth;
/* 1823 */         Player.temprst();
/* 1824 */         rborb = true;
/* 1825 */         Player.respawn = true;
/* 1826 */         rborbsw = true;
/* 1827 */         return Tile.end_orb;
/* 1828 */       }  if (!rborbsw)
/* 1829 */         return Tile.end_orb; 
/* 1830 */       if (rborbsw) {
/* 1831 */         return Tile.spawn_floor;
/*      */       }
/*      */     } 
/* 1834 */     if (this.tiles[x + y * this.width] == -37888) {
/* 1835 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !freeze) {
/* 1836 */         health = SpawnLevel.maxhealth;
/* 1837 */         Player.temprst();
/* 1838 */         rborb2 = true;
/* 1839 */         Player.respawn = true;
/* 1840 */         return Tile.end_orb;
/*      */       } 
/* 1842 */       return Tile.end_orb;
/*      */     } 
/*      */     
/* 1845 */     if (this.tiles[x + y * this.width] == -365568) {
/* 1846 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !freeze) {
/* 1847 */         health = SpawnLevel.maxhealth;
/* 1848 */         Player.temprst();
/* 1849 */         rborb3 = true;
/* 1850 */         Player.respawn = true;
/* 1851 */         return Tile.end_orb;
/*      */       } 
/* 1853 */       return Tile.end_orb;
/*      */     } 
/*      */     
/* 1856 */     if (this.tiles[x + y * this.width] == -37376) {
/* 1857 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !freeze) {
/* 1858 */         health = SpawnLevel.maxhealth;
/* 1859 */         Player.temprst();
/* 1860 */         rborb4 = true;
/* 1861 */         Player.respawn = true;
/* 1862 */         return Tile.end_orb;
/*      */       } 
/* 1864 */       return Tile.end_orb;
/*      */     } 
/*      */     
/* 1867 */     if (this.tiles[x + y * this.width] == -36864) {
/* 1868 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !freeze) {
/* 1869 */         health = SpawnLevel.maxhealth;
/* 1870 */         Player.temprst();
/* 1871 */         rborb5 = true;
/* 1872 */         Player.respawn = true;
/* 1873 */         return Tile.end_orb;
/*      */       } 
/* 1875 */       return Tile.end_orb;
/*      */     } 
/*      */     
/* 1878 */     if (this.tiles[x + y * this.width] == -36352) {
/* 1879 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !freeze) {
/* 1880 */         health = SpawnLevel.maxhealth;
/* 1881 */         Player.temprst();
/* 1882 */         rborb6 = true;
/* 1883 */         Player.respawn = true;
/* 1884 */         return Tile.end_orb;
/*      */       } 
/* 1886 */       return Tile.end_orb;
/*      */     } 
/*      */     
/* 1889 */     if (this.tiles[x + y * this.width] == -366080) {
/* 1890 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !freeze) {
/* 1891 */         health = SpawnLevel.maxhealth;
/* 1892 */         Player.temprst();
/* 1893 */         rborb7 = true;
/* 1894 */         Player.respawn = true;
/* 1895 */         return Tile.rb_orb;
/*      */       } 
/* 1897 */       return Tile.rb_orb;
/*      */     } 
/*      */     
/* 1900 */     if (this.tiles[x + y * this.width] == -37886) {
/* 1901 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !freeze) {
/* 1902 */         health = SpawnLevel.maxhealth;
/* 1903 */         Player.temprst();
/* 1904 */         rborb8 = true;
/* 1905 */         Player.respawn = true;
/* 1906 */         return Tile.rb_orb;
/*      */       } 
/* 1908 */       return Tile.rb_orb;
/*      */     } 
/*      */     
/* 1911 */     if (this.tiles[x + y * this.width] == -37884) {
/* 1912 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !freeze) {
/* 1913 */         health = SpawnLevel.maxhealth;
/* 1914 */         Player.temprst();
/* 1915 */         rborb9 = true;
/* 1916 */         Player.respawn = true;
/* 1917 */         return Tile.rb_orb;
/*      */       } 
/* 1919 */       return Tile.rb_orb;
/*      */     } 
/*      */     
/* 1922 */     if (this.tiles[x + y * this.width] == -37882) {
/* 1923 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !freeze) {
/* 1924 */         health = SpawnLevel.maxhealth;
/* 1925 */         Player.temprst();
/* 1926 */         rborb10 = true;
/* 1927 */         Player.respawn = true;
/* 1928 */         return Tile.rb_orb;
/*      */       } 
/* 1930 */       return Tile.rb_orb;
/*      */     } 
/*      */     
/* 1933 */     if (this.tiles[x + y * this.width] == -37880) {
/* 1934 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y && !freeze) {
/* 1935 */         health = SpawnLevel.maxhealth;
/* 1936 */         Player.temprst();
/* 1937 */         rborb11 = true;
/* 1938 */         Player.respawn = true;
/* 1939 */         return Tile.end_orb;
/*      */       } 
/* 1941 */       return Tile.end_orb;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1946 */     if (this.tiles[x + y * this.width] == -16744690) {
/* 1947 */       if (!butcollgr) return Tile.spawn_closedoorgr; 
/* 1948 */       if (butcollgr) return Tile.spawn_opendoorgr; 
/*      */     } 
/* 1950 */     if (this.tiles[x + y * this.width] == -16726514) {
/* 1951 */       if (butcollgr) return Tile.spawn_closedoorgr; 
/* 1952 */       if (!butcollgr) return Tile.spawn_opendoorgr; 
/*      */     } 
/* 1954 */     if (this.tiles[x + y * this.width] == -16711791) {
/* 1955 */       if (!butcollgr) return Tile.spawn_wall_endgr; 
/* 1956 */       if (butcollgr) return Tile.spawn_opendoorgr2; 
/*      */     } 
/* 1958 */     if (this.tiles[x + y * this.width] == -11731200) {
/* 1959 */       if (!butcollgr) return Tile.spawn_buttongr; 
/* 1960 */       if (butcollgr) return Tile.spawn_buttondowngr; 
/*      */     } 
/* 1962 */     if (this.tiles[x + y * this.width] == -11796736) {
/* 1963 */       if (!butcollgr) return Tile.spawn_buttongr; 
/* 1964 */       if (butcollgr) return Tile.spawn_buttondowngr; 
/*      */     } 
/* 1966 */     if (this.tiles[x + y * this.width] == -16744689) {
/* 1967 */       if (!butcollgr) return Tile.spawn_closedoorgr; 
/* 1968 */       if (butcollgr) {
/* 1969 */         if (!bossswitch) return Tile.spawn_wall_end; 
/* 1970 */         return Tile.spawn_wall_end2;
/*      */       } 
/*      */     } 
/* 1973 */     if (this.tiles[x + y * this.width] == -16726002) {
/* 1974 */       if (butcollgr) return Tile.spawn_closedoorgr; 
/* 1975 */       if (!butcollgr) {
/* 1976 */         if (!bossswitch) return Tile.spawn_wall_end; 
/* 1977 */         return Tile.spawn_wall_end2;
/*      */       } 
/*      */     } 
/* 1980 */     if (this.tiles[x + y * this.width] == -16711792) {
/* 1981 */       if (!butcollgr) return Tile.spawn_closedoorgr2; 
/* 1982 */       if (butcollgr) {
/* 1983 */         if (!bossswitch) return Tile.spawn_floor; 
/* 1984 */         return Tile.spawn_floor3;
/*      */       } 
/*      */     } 
/*      */     
/* 1988 */     if (this.tiles[x + y * this.width] == -16773761) {
/* 1989 */       if (!butcollbl) return Tile.spawn_closedoorbl; 
/* 1990 */       if (butcollbl) return Tile.spawn_opendoorbl; 
/*      */     } 
/* 1992 */     if (this.tiles[x + y * this.width] == -15447041) {
/* 1993 */       if (butcollbl) return Tile.spawn_closedoorbl; 
/* 1994 */       if (!butcollbl) return Tile.spawn_opendoorbl; 
/*      */     } 
/* 1996 */     if (this.tiles[x + y * this.width] == -16739585) {
/* 1997 */       if (!butcollbl) return Tile.spawn_wall_endbl; 
/* 1998 */       if (butcollbl) return Tile.spawn_opendoorbl2; 
/*      */     } 
/* 2000 */     if (this.tiles[x + y * this.width] == -11796225) {
/* 2001 */       if (!butcollbl) return Tile.spawn_buttonbl; 
/* 2002 */       if (butcollbl) return Tile.spawn_buttondownbl; 
/*      */     } 
/* 2004 */     if (this.tiles[x + y * this.width] == -11861761) {
/* 2005 */       if (!butcollbl) return Tile.spawn_buttonbl; 
/* 2006 */       if (butcollbl) return Tile.spawn_buttondownbl; 
/*      */     } 
/* 2008 */     if (this.tiles[x + y * this.width] == -16773505) {
/* 2009 */       if (!butcollbl) return Tile.spawn_closedoorbl; 
/* 2010 */       if (butcollbl) {
/* 2011 */         if (!bossswitch) return Tile.spawn_wall_end; 
/* 2012 */         return Tile.spawn_wall_end2;
/*      */       } 
/*      */     } 
/* 2015 */     if (this.tiles[x + y * this.width] == -15446785) {
/* 2016 */       if (butcollbl) return Tile.spawn_closedoorbl; 
/* 2017 */       if (!butcollbl) {
/* 2018 */         if (!bossswitch) return Tile.spawn_wall_end; 
/* 2019 */         return Tile.spawn_wall_end2;
/*      */       } 
/*      */     } 
/* 2022 */     if (this.tiles[x + y * this.width] == -16740097) {
/* 2023 */       if (!butcollbl) return Tile.spawn_closedoorbl2; 
/* 2024 */       if (butcollbl) {
/* 2025 */         if (!bossswitch) return Tile.spawn_floor; 
/* 2026 */         return Tile.spawn_floor3;
/*      */       } 
/*      */     } 
/*      */     
/* 2030 */     if (this.tiles[x + y * this.width] == -8450560) {
/* 2031 */       if (!butcollrd) return Tile.spawn_closedoorrd; 
/* 2032 */       if (butcollrd) return Tile.spawn_opendoorrd; 
/*      */     } 
/* 2034 */     if (this.tiles[x + y * this.width] == -65536) {
/* 2035 */       if (butcollrd) return Tile.spawn_closedoorrd; 
/* 2036 */       if (!butcollrd) return Tile.spawn_opendoorrd; 
/*      */     } 
/* 2038 */     if (this.tiles[x + y * this.width] == -65391) {
/* 2039 */       if (!butcollrd) return Tile.spawn_wall_endrd; 
/* 2040 */       if (butcollrd) return Tile.spawn_opendoorrd2; 
/*      */     } 
/* 2042 */     if (this.tiles[x + y * this.width] == -65460) {
/* 2043 */       if (!butcollrd) return Tile.spawn_buttonrd; 
/* 2044 */       if (butcollrd) return Tile.spawn_buttondownrd; 
/*      */     } 
/* 2046 */     if (this.tiles[x + y * this.width] == -65461) {
/* 2047 */       if (!butcollrd) return Tile.spawn_buttonrd; 
/* 2048 */       if (butcollrd) return Tile.spawn_buttondownrd; 
/*      */     } 
/* 2050 */     if (this.tiles[x + y * this.width] == -8450048) {
/* 2051 */       if (!butcollrd) return Tile.spawn_closedoorrd; 
/* 2052 */       if (butcollrd) {
/* 2053 */         if (!bossswitch) return Tile.spawn_wall_end; 
/* 2054 */         return Tile.spawn_wall_end2;
/*      */       } 
/*      */     } 
/* 2057 */     if (this.tiles[x + y * this.width] == -65024) {
/* 2058 */       if (butcollrd) return Tile.spawn_closedoorrd; 
/* 2059 */       if (!butcollrd) {
/* 2060 */         if (!bossswitch) return Tile.spawn_wall_end; 
/* 2061 */         return Tile.spawn_wall_end2;
/*      */       } 
/*      */     } 
/* 2064 */     if (this.tiles[x + y * this.width] == -65392) {
/* 2065 */       if (!butcollrd) return Tile.spawn_closedoorrd2; 
/* 2066 */       if (butcollrd) {
/* 2067 */         if (!bossswitch) return Tile.spawn_floor; 
/* 2068 */         return Tile.spawn_floor3;
/*      */       } 
/*      */     } 
/*      */     
/* 2072 */     if (this.tiles[x + y * this.width] == -82) {
/* 2073 */       if (butcollyl) return Tile.spawn_wall_endyl; 
/* 2074 */       if (!butcollyl) return Tile.spawn_opendooryl2; 
/*      */     } 
/* 2076 */     if (this.tiles[x + y * this.width] == -111) {
/* 2077 */       if (!butcollyl) return Tile.spawn_wall_endyl; 
/* 2078 */       if (butcollyl) return Tile.spawn_opendooryl2; 
/*      */     } 
/* 2080 */     if (this.tiles[x + y * this.width] == -180) {
/* 2081 */       if (!butcollyl) return Tile.spawn_buttonyl; 
/* 2082 */       if (butcollyl) return Tile.spawn_buttondownyl; 
/*      */     } 
/* 2084 */     if (this.tiles[x + y * this.width] == -181) {
/* 2085 */       if (!butcollyl) return Tile.spawn_buttonyl; 
/* 2086 */       if (butcollyl) return Tile.spawn_buttondownyl; 
/*      */     } 
/* 2088 */     if (this.tiles[x + y * this.width] == -81) {
/* 2089 */       if (butcollyl) return Tile.spawn_closedooryl2; 
/* 2090 */       if (!butcollyl) {
/* 2091 */         if (!bossswitch) return Tile.spawn_floor; 
/* 2092 */         return Tile.spawn_floor3;
/*      */       } 
/*      */     } 
/* 2095 */     if (this.tiles[x + y * this.width] == -112) {
/* 2096 */       if (!butcollyl) return Tile.spawn_closedooryl2; 
/* 2097 */       if (butcollyl) {
/* 2098 */         if (!bossswitch) return Tile.spawn_floor; 
/* 2099 */         return Tile.spawn_floor3;
/*      */       } 
/*      */     } 
/*      */     
/* 2103 */     if (this.tiles[x + y * this.width] == -16777216) {
/* 2104 */       if (!bossswitch) return Tile.spawn_wall1; 
/* 2105 */       return Tile.spawn_wall3;
/*      */     } 
/* 2107 */     if (this.tiles[x + y * this.width] == -12566464) {
/* 2108 */       if (!bossswitch) return Tile.spawn_wall2; 
/* 2109 */       return Tile.spawn_wall4;
/*      */     } 
/* 2111 */     if (this.tiles[x + y * this.width] == -2368551) return Tile.spawn_sep; 
/* 2112 */     if (this.tiles[x + y * this.width] == -5921371) return Tile.spawn_sep2; 
/* 2113 */     if (this.tiles[x + y * this.width] == -8355712) {
/* 2114 */       if (!bossswitch) return Tile.spawn_wall_end; 
/* 2115 */       return Tile.spawn_wall_end2;
/*      */     } 
/* 2117 */     if (this.tiles[x + y * this.width] == -8355710) {
/* 2118 */       if (!bossswitch) return Tile.spawn_wall_end3; 
/* 2119 */       return Tile.spawn_wall_end5;
/*      */     } 
/* 2121 */     if (this.tiles[x + y * this.width] == -8355708) return Tile.spawn_wall_end4; 
/* 2122 */     if (this.tiles[x + y * this.width] == -8355706) {
/* 2123 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) SpawnLevel.roomtemp = 0; 
/* 2124 */       return Tile.spawn_wall_end5;
/*      */     } 
/* 2126 */     if (this.tiles[x + y * this.width] == -8355704) {
/* 2127 */       if (getClientPlayer().getX() / 16 == x && (getClientPlayer().getY() - 1) / 16 + 1 == y) SpawnLevel.roomtemp = SpawnLevel.maxtemp; 
/* 2128 */       return Tile.spawn_wall_end6;
/*      */     } 
/*      */ 
/*      */     
/* 2132 */     if (this.tiles[x + y * this.width] == -12262144) {
/* 2133 */       if (chkpt1) {
/* 2134 */         if (!freeze) on = !on; 
/* 2135 */         if (on) return Tile.spawn_startpad1tl; 
/* 2136 */         if (!on) return Tile.spawn_startpad2tl; 
/*      */       } else {
/* 2138 */         return Tile.spawn_startpad3tl;
/*      */       } 
/*      */     }
/* 2141 */     if (this.tiles[x + y * this.width] == -12262143) {
/* 2142 */       if (chkpt1) {
/* 2143 */         if (on) return Tile.spawn_startpad1tr; 
/* 2144 */         if (!on) return Tile.spawn_startpad2tr; 
/*      */       } else {
/* 2146 */         return Tile.spawn_startpad3tr;
/*      */       } 
/*      */     }
/* 2149 */     if (this.tiles[x + y * this.width] == -12262142) {
/* 2150 */       if (chkpt1) {
/* 2151 */         if (on) return Tile.spawn_startpad1bl; 
/* 2152 */         if (!on) return Tile.spawn_startpad2bl; 
/*      */       } else {
/* 2154 */         return Tile.spawn_startpad3bl;
/*      */       } 
/*      */     }
/* 2157 */     if (this.tiles[x + y * this.width] == -12262141) {
/* 2158 */       if (chkpt1) {
/* 2159 */         if (on) return Tile.spawn_startpad1br; 
/* 2160 */         if (!on) return Tile.spawn_startpad2br; 
/*      */       } else {
/* 2162 */         return Tile.spawn_startpad3br;
/*      */       } 
/*      */     }
/*      */     
/* 2166 */     if (this.tiles[x + y * this.width] == -12259328) {
/* 2167 */       if (chkpt2) {
/* 2168 */         if (!freeze) on = !on; 
/* 2169 */         if (on) return Tile.spawn_startpad1tl; 
/* 2170 */         if (!on) return Tile.spawn_startpad2tl; 
/*      */       } else {
/* 2172 */         return Tile.spawn_startpad3tl;
/*      */       } 
/*      */     }
/* 2175 */     if (this.tiles[x + y * this.width] == -12259327) {
/* 2176 */       if (chkpt2) {
/* 2177 */         if (on) return Tile.spawn_startpad1tr; 
/* 2178 */         if (!on) return Tile.spawn_startpad2tr; 
/*      */       } else {
/* 2180 */         return Tile.spawn_startpad3tr;
/*      */       } 
/*      */     }
/* 2183 */     if (this.tiles[x + y * this.width] == -12259326) {
/* 2184 */       if (chkpt2) {
/* 2185 */         if (on) return Tile.spawn_startpad1bl; 
/* 2186 */         if (!on) return Tile.spawn_startpad2bl; 
/*      */       } else {
/* 2188 */         return Tile.spawn_startpad3bl;
/*      */       } 
/*      */     }
/* 2191 */     if (this.tiles[x + y * this.width] == -12259325) {
/* 2192 */       if (chkpt2) {
/* 2193 */         if (on) return Tile.spawn_startpad1br; 
/* 2194 */         if (!on) return Tile.spawn_startpad2br; 
/*      */       } else {
/* 2196 */         return Tile.spawn_startpad3br;
/*      */       } 
/*      */     }
/*      */     
/* 2200 */     if (this.tiles[x + y * this.width] == -12255488) {
/* 2201 */       if (chkpt3) {
/* 2202 */         if (!freeze) on = !on; 
/* 2203 */         if (on) return Tile.spawn_startpad1tl; 
/* 2204 */         if (!on) return Tile.spawn_startpad2tl; 
/*      */       } else {
/* 2206 */         return Tile.spawn_startpad3tl;
/*      */       } 
/*      */     }
/* 2209 */     if (this.tiles[x + y * this.width] == -12255487) {
/* 2210 */       if (chkpt3) {
/* 2211 */         if (on) return Tile.spawn_startpad1tr; 
/* 2212 */         if (!on) return Tile.spawn_startpad2tr; 
/*      */       } else {
/* 2214 */         return Tile.spawn_startpad3tr;
/*      */       } 
/*      */     }
/* 2217 */     if (this.tiles[x + y * this.width] == -12255486) {
/* 2218 */       if (chkpt3) {
/* 2219 */         if (on) return Tile.spawn_startpad1bl; 
/* 2220 */         if (!on) return Tile.spawn_startpad2bl; 
/*      */       } else {
/* 2222 */         return Tile.spawn_startpad3bl;
/*      */       } 
/*      */     }
/* 2225 */     if (this.tiles[x + y * this.width] == -12255485) {
/* 2226 */       if (chkpt3) {
/* 2227 */         if (on) return Tile.spawn_startpad1br; 
/* 2228 */         if (!on) return Tile.spawn_startpad2br; 
/*      */       } else {
/* 2230 */         return Tile.spawn_startpad3br;
/*      */       } 
/*      */     }
/*      */     
/* 2234 */     if (this.tiles[x + y * this.width] == -12255484) {
/* 2235 */       if (chkpt4) {
/* 2236 */         if (!freeze) on = !on; 
/* 2237 */         if (on) return Tile.spawn_startpad1tl; 
/* 2238 */         if (!on) return Tile.spawn_startpad2tl; 
/*      */       } else {
/* 2240 */         return Tile.spawn_startpad3tl;
/*      */       } 
/*      */     }
/* 2243 */     if (this.tiles[x + y * this.width] == -12255483) {
/* 2244 */       if (chkpt4) {
/* 2245 */         if (on) return Tile.spawn_startpad1tr; 
/* 2246 */         if (!on) return Tile.spawn_startpad2tr; 
/*      */       } else {
/* 2248 */         return Tile.spawn_startpad3tr;
/*      */       } 
/*      */     }
/* 2251 */     if (this.tiles[x + y * this.width] == -12255482) {
/* 2252 */       if (chkpt4) {
/* 2253 */         if (on) return Tile.spawn_startpad1bl; 
/* 2254 */         if (!on) return Tile.spawn_startpad2bl; 
/*      */       } else {
/* 2256 */         return Tile.spawn_startpad3bl;
/*      */       } 
/*      */     }
/* 2259 */     if (this.tiles[x + y * this.width] == -12255481) {
/* 2260 */       if (chkpt4) {
/* 2261 */         if (on) return Tile.spawn_startpad1br; 
/* 2262 */         if (!on) return Tile.spawn_startpad2br; 
/*      */       } else {
/* 2264 */         return Tile.spawn_startpad3br;
/*      */       } 
/*      */     }
/*      */     
/* 2268 */     if (this.tiles[x + y * this.width] == -12255472) {
/* 2269 */       if (chkpt5) {
/* 2270 */         if (!freeze) on = !on; 
/* 2271 */         if (on) return Tile.spawn_startpad1tl; 
/* 2272 */         if (!on) return Tile.spawn_startpad2tl; 
/*      */       } else {
/* 2274 */         return Tile.spawn_startpad3tl;
/*      */       } 
/*      */     }
/* 2277 */     if (this.tiles[x + y * this.width] == -12255471) {
/* 2278 */       if (chkpt5) {
/* 2279 */         if (on) return Tile.spawn_startpad1tr; 
/* 2280 */         if (!on) return Tile.spawn_startpad2tr; 
/*      */       } else {
/* 2282 */         return Tile.spawn_startpad3tr;
/*      */       } 
/*      */     }
/* 2285 */     if (this.tiles[x + y * this.width] == -12255470) {
/* 2286 */       if (chkpt5) {
/* 2287 */         if (on) return Tile.spawn_startpad1bl; 
/* 2288 */         if (!on) return Tile.spawn_startpad2bl; 
/*      */       } else {
/* 2290 */         return Tile.spawn_startpad3bl;
/*      */       } 
/*      */     }
/* 2293 */     if (this.tiles[x + y * this.width] == -12255469) {
/* 2294 */       if (chkpt5) {
/* 2295 */         if (on) return Tile.spawn_startpad1br; 
/* 2296 */         if (!on) return Tile.spawn_startpad2br; 
/*      */       } else {
/* 2298 */         return Tile.spawn_startpad3br;
/*      */       } 
/*      */     }
/*      */     
/* 2302 */     if (this.tiles[x + y * this.width] == -12255468) {
/* 2303 */       if (chkpt6) {
/* 2304 */         if (!freeze) on = !on; 
/* 2305 */         if (on) return Tile.spawn_startpad1tl; 
/* 2306 */         if (!on) return Tile.spawn_startpad2tl; 
/*      */       } else {
/* 2308 */         return Tile.spawn_startpad3tl;
/*      */       } 
/*      */     }
/* 2311 */     if (this.tiles[x + y * this.width] == -12255467) {
/* 2312 */       if (chkpt6) {
/* 2313 */         if (on) return Tile.spawn_startpad1tr; 
/* 2314 */         if (!on) return Tile.spawn_startpad2tr; 
/*      */       } else {
/* 2316 */         return Tile.spawn_startpad3tr;
/*      */       } 
/*      */     }
/* 2319 */     if (this.tiles[x + y * this.width] == -12255466) {
/* 2320 */       if (chkpt6) {
/* 2321 */         if (on) return Tile.spawn_startpad1bl; 
/* 2322 */         if (!on) return Tile.spawn_startpad2bl; 
/*      */       } else {
/* 2324 */         return Tile.spawn_startpad3bl;
/*      */       } 
/*      */     }
/* 2327 */     if (this.tiles[x + y * this.width] == -12255465) {
/* 2328 */       if (chkpt6) {
/* 2329 */         if (on) return Tile.spawn_startpad1br; 
/* 2330 */         if (!on) return Tile.spawn_startpad2br; 
/*      */       } else {
/* 2332 */         return Tile.spawn_startpad3br;
/*      */       } 
/*      */     }
/*      */     
/* 2336 */     if (this.tiles[x + y * this.width] == -12255456) {
/* 2337 */       if (chkpt7) {
/* 2338 */         if (!freeze) on = !on; 
/* 2339 */         if (on) return Tile.spawn_startpad1tl; 
/* 2340 */         if (!on) return Tile.spawn_startpad2tl; 
/*      */       } else {
/* 2342 */         return Tile.spawn_startpad3tl;
/*      */       } 
/*      */     }
/* 2345 */     if (this.tiles[x + y * this.width] == -12255455) {
/* 2346 */       if (chkpt7) {
/* 2347 */         if (on) return Tile.spawn_startpad1tr; 
/* 2348 */         if (!on) return Tile.spawn_startpad2tr; 
/*      */       } else {
/* 2350 */         return Tile.spawn_startpad3tr;
/*      */       } 
/*      */     }
/* 2353 */     if (this.tiles[x + y * this.width] == -12255454) {
/* 2354 */       if (chkpt7) {
/* 2355 */         if (on) return Tile.spawn_startpad1bl; 
/* 2356 */         if (!on) return Tile.spawn_startpad2bl; 
/*      */       } else {
/* 2358 */         return Tile.spawn_startpad3bl;
/*      */       } 
/*      */     }
/* 2361 */     if (this.tiles[x + y * this.width] == -12255453) {
/* 2362 */       if (chkpt7) {
/* 2363 */         if (on) return Tile.spawn_startpad1br; 
/* 2364 */         if (!on) return Tile.spawn_startpad2br; 
/*      */       } else {
/* 2366 */         return Tile.spawn_startpad3br;
/*      */       } 
/*      */     }
/*      */     
/* 2370 */     if (this.tiles[x + y * this.width] == -12255452) {
/* 2371 */       if (chkpt8) {
/* 2372 */         if (!freeze) on = !on; 
/* 2373 */         if (on) return Tile.spawn_startpad1tl; 
/* 2374 */         if (!on) return Tile.spawn_startpad2tl; 
/*      */       } else {
/* 2376 */         return Tile.spawn_startpad3tl;
/*      */       } 
/*      */     }
/* 2379 */     if (this.tiles[x + y * this.width] == -12255451) {
/* 2380 */       if (chkpt8) {
/* 2381 */         if (on) return Tile.spawn_startpad1tr; 
/* 2382 */         if (!on) return Tile.spawn_startpad2tr; 
/*      */       } else {
/* 2384 */         return Tile.spawn_startpad3tr;
/*      */       } 
/*      */     }
/* 2387 */     if (this.tiles[x + y * this.width] == -12255450) {
/* 2388 */       if (chkpt8) {
/* 2389 */         if (on) return Tile.spawn_startpad1bl; 
/* 2390 */         if (!on) return Tile.spawn_startpad2bl; 
/*      */       } else {
/* 2392 */         return Tile.spawn_startpad3bl;
/*      */       } 
/*      */     }
/* 2395 */     if (this.tiles[x + y * this.width] == -12255449) {
/* 2396 */       if (chkpt8) {
/* 2397 */         if (on) return Tile.spawn_startpad1br; 
/* 2398 */         if (!on) return Tile.spawn_startpad2br; 
/*      */       } else {
/* 2400 */         return Tile.spawn_startpad3br;
/*      */       } 
/*      */     }
/*      */     
/* 2404 */     if (this.tiles[x + y * this.width] == -12255440) {
/* 2405 */       if (chkpt9) {
/* 2406 */         if (!freeze) on = !on; 
/* 2407 */         if (on) return Tile.spawn_startpad1tl; 
/* 2408 */         if (!on) return Tile.spawn_startpad2tl; 
/*      */       } else {
/* 2410 */         return Tile.spawn_startpad3tl;
/*      */       } 
/*      */     }
/* 2413 */     if (this.tiles[x + y * this.width] == -12255439) {
/* 2414 */       if (chkpt9) {
/* 2415 */         if (on) return Tile.spawn_startpad1tr; 
/* 2416 */         if (!on) return Tile.spawn_startpad2tr; 
/*      */       } else {
/* 2418 */         return Tile.spawn_startpad3tr;
/*      */       } 
/*      */     }
/* 2421 */     if (this.tiles[x + y * this.width] == -12255438) {
/* 2422 */       if (chkpt9) {
/* 2423 */         if (on) return Tile.spawn_startpad1bl; 
/* 2424 */         if (!on) return Tile.spawn_startpad2bl; 
/*      */       } else {
/* 2426 */         return Tile.spawn_startpad3bl;
/*      */       } 
/*      */     }
/* 2429 */     if (this.tiles[x + y * this.width] == -12255437) {
/* 2430 */       if (chkpt9) {
/* 2431 */         if (on) return Tile.spawn_startpad1br; 
/* 2432 */         if (!on) return Tile.spawn_startpad2br; 
/*      */       } else {
/* 2434 */         return Tile.spawn_startpad3br;
/*      */       } 
/*      */     }
/*      */     
/* 2438 */     if (this.tiles[x + y * this.width] == -12255436) {
/* 2439 */       if (chkpt10) {
/* 2440 */         if (!freeze) on = !on; 
/* 2441 */         if (on) return Tile.spawn_startpad1tl; 
/* 2442 */         if (!on) return Tile.spawn_startpad2tl; 
/*      */       } else {
/* 2444 */         return Tile.spawn_startpad3tl;
/*      */       } 
/*      */     }
/* 2447 */     if (this.tiles[x + y * this.width] == -12255435) {
/* 2448 */       if (chkpt10) {
/* 2449 */         if (on) return Tile.spawn_startpad1tr; 
/* 2450 */         if (!on) return Tile.spawn_startpad2tr; 
/*      */       } else {
/* 2452 */         return Tile.spawn_startpad3tr;
/*      */       } 
/*      */     }
/* 2455 */     if (this.tiles[x + y * this.width] == -12255434) {
/* 2456 */       if (chkpt10) {
/* 2457 */         if (on) return Tile.spawn_startpad1bl; 
/* 2458 */         if (!on) return Tile.spawn_startpad2bl; 
/*      */       } else {
/* 2460 */         return Tile.spawn_startpad3bl;
/*      */       } 
/*      */     }
/* 2463 */     if (this.tiles[x + y * this.width] == -12255433) {
/* 2464 */       if (chkpt10) {
/* 2465 */         if (on) return Tile.spawn_startpad1br; 
/* 2466 */         if (!on) return Tile.spawn_startpad2br; 
/*      */       } else {
/* 2468 */         return Tile.spawn_startpad3br;
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/* 2473 */     if (getClientPlayer().getX() / 16 == 124 && (getClientPlayer().getY() - 1) / 16 + 1 == 64) enemyon2 = true; 
/* 2474 */     if (this.tiles[x + y * this.width] == -8416513 && 
/* 2475 */       enemyon2) {
/* 2476 */       if (!freeze) enemyon = !enemyon; 
/* 2477 */       if (enemyon) return Tile.enemy; 
/* 2478 */       if (!enemyon) return Tile.e2enemy; 
/*      */     } 
/* 2480 */     if (this.tiles[x + y * this.width] == -8416001 && 
/* 2481 */       enemyon2) {
/* 2482 */       if (enemyon) return Tile.enemy2; 
/* 2483 */       if (!enemyon) return Tile.e2enemy2; 
/*      */     } 
/* 2485 */     if (this.tiles[x + y * this.width] == -8415489 && 
/* 2486 */       enemyon2) {
/* 2487 */       if (enemyon) return Tile.enemy3; 
/* 2488 */       if (!enemyon) return Tile.e2enemy3; 
/*      */     } 
/* 2490 */     if (this.tiles[x + y * this.width] == -8414977 && 
/* 2491 */       enemyon2) {
/* 2492 */       if (enemyon) return Tile.enemy4; 
/* 2493 */       if (!enemyon) return Tile.e2enemy4; 
/*      */     } 
/* 2495 */     if (this.tiles[x + y * this.width] == -8414465 && 
/* 2496 */       enemyon2) {
/* 2497 */       if (enemyon) return Tile.enemy5; 
/* 2498 */       if (!enemyon) return Tile.e2enemy5; 
/*      */     } 
/* 2500 */     if (this.tiles[x + y * this.width] == -8413953 && 
/* 2501 */       enemyon2) {
/* 2502 */       if (enemyon) return Tile.enemy6; 
/* 2503 */       if (!enemyon) return Tile.e2enemy6; 
/*      */     } 
/* 2505 */     if (this.tiles[x + y * this.width] == -8413441 && 
/* 2506 */       enemyon2) {
/* 2507 */       if (enemyon) return Tile.enemy7; 
/* 2508 */       if (!enemyon) return Tile.e2enemy7; 
/*      */     } 
/* 2510 */     if (this.tiles[x + y * this.width] == -8412929 && 
/* 2511 */       enemyon2) {
/* 2512 */       if (enemyon) return Tile.enemy8; 
/* 2513 */       if (!enemyon) return Tile.e2enemy8; 
/*      */     } 
/* 2515 */     if (this.tiles[x + y * this.width] == -8412417 && 
/* 2516 */       enemyon2) {
/* 2517 */       if (enemyon) return Tile.enemy9; 
/* 2518 */       if (!enemyon) return Tile.e2enemy9; 
/*      */     } 
/* 2520 */     if (this.tiles[x + y * this.width] == -8411905 && 
/* 2521 */       enemyon2) {
/* 2522 */       if (enemyon) return Tile.enemy10; 
/* 2523 */       if (!enemyon) return Tile.e2enemy10; 
/*      */     } 
/* 2525 */     if (this.tiles[x + y * this.width] == -8411393 && 
/* 2526 */       enemyon2) {
/* 2527 */       if (enemyon) return Tile.enemy11; 
/* 2528 */       if (!enemyon) return Tile.e2enemy11; 
/*      */     } 
/* 2530 */     if (this.tiles[x + y * this.width] == -8410881 && 
/* 2531 */       enemyon2) {
/* 2532 */       if (enemyon) return Tile.enemy12; 
/* 2533 */       if (!enemyon) return Tile.e2enemy12; 
/*      */     } 
/* 2535 */     if (this.tiles[x + y * this.width] == -8410369 && 
/* 2536 */       enemyon2) {
/* 2537 */       if (enemyon) return Tile.enemy13; 
/* 2538 */       if (!enemyon) return Tile.e2enemy13; 
/*      */     } 
/* 2540 */     if (this.tiles[x + y * this.width] == -8409857 && 
/* 2541 */       enemyon2) {
/* 2542 */       if (enemyon) return Tile.enemy14; 
/* 2543 */       if (!enemyon) return Tile.e2enemy14; 
/*      */     } 
/* 2545 */     if (this.tiles[x + y * this.width] == -8409345 && 
/* 2546 */       enemyon2) {
/* 2547 */       if (enemyon) return Tile.enemy15; 
/* 2548 */       if (!enemyon) return Tile.e2enemy15; 
/*      */     } 
/* 2550 */     if (this.tiles[x + y * this.width] == -8408833 && 
/* 2551 */       enemyon2) {
/* 2552 */       if (enemyon) return Tile.enemy16; 
/* 2553 */       if (!enemyon) return Tile.e2enemy16; 
/*      */     } 
/* 2555 */     if (this.tiles[x + y * this.width] == -8408321 && 
/* 2556 */       enemyon2) {
/* 2557 */       if (enemyon) return Tile.enemy17; 
/* 2558 */       if (!enemyon) return Tile.e2enemy17; 
/*      */     } 
/* 2560 */     if (this.tiles[x + y * this.width] == -8407809 && 
/* 2561 */       enemyon2) {
/* 2562 */       if (enemyon) return Tile.enemy18; 
/* 2563 */       if (!enemyon) return Tile.e2enemy18; 
/*      */     } 
/* 2565 */     if (this.tiles[x + y * this.width] == -8407297 && 
/* 2566 */       enemyon2) {
/* 2567 */       if (enemyon) return Tile.enemy19; 
/* 2568 */       if (!enemyon) return Tile.e2enemy19; 
/*      */     } 
/* 2570 */     if (this.tiles[x + y * this.width] == -8406785 && 
/* 2571 */       enemyon2) {
/* 2572 */       if (enemyon) return Tile.enemy20; 
/* 2573 */       if (!enemyon) return Tile.e2enemy20; 
/*      */     } 
/* 2575 */     if (this.tiles[x + y * this.width] == -8406273 && 
/* 2576 */       enemyon2) {
/* 2577 */       if (enemyon) return Tile.enemy21; 
/* 2578 */       if (!enemyon) return Tile.e2enemy21; 
/*      */     } 
/* 2580 */     if (this.tiles[x + y * this.width] == -8405761 && 
/* 2581 */       enemyon2) {
/* 2582 */       if (enemyon) return Tile.enemy22; 
/* 2583 */       if (!enemyon) return Tile.e2enemy22; 
/*      */     } 
/* 2585 */     if (this.tiles[x + y * this.width] == -8405249 && 
/* 2586 */       enemyon2) {
/* 2587 */       if (enemyon) return Tile.enemy23; 
/* 2588 */       if (!enemyon) return Tile.e2enemy23; 
/*      */     } 
/* 2590 */     if (this.tiles[x + y * this.width] == -8404737 && 
/* 2591 */       enemyon2) {
/* 2592 */       if (enemyon) return Tile.enemy24; 
/* 2593 */       if (!enemyon) return Tile.e2enemy24; 
/*      */     } 
/* 2595 */     if (this.tiles[x + y * this.width] == -8404225 && 
/* 2596 */       enemyon2) {
/* 2597 */       if (enemyon) return Tile.enemy25; 
/* 2598 */       if (!enemyon) return Tile.e2enemy25;
/*      */     
/*      */     } 
/* 2601 */     return Tile.voidTile;
/*      */   }
/*      */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\level\Level.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */