/*     */ package com.Static.Blindsided;
/*     */ import com.Static.Blindsided.entity.Entity;
/*     */ import com.Static.Blindsided.entity.mob.Player;
/*     */ import com.Static.Blindsided.graphics.Font;
/*     */ import com.Static.Blindsided.graphics.Screen;
/*     */ import com.Static.Blindsided.graphics.UI.UI_Main;
/*     */ import com.Static.Blindsided.input.Keyboard;
/*     */ import com.Static.Blindsided.input.Mouse;
/*     */ import com.Static.Blindsided.level.Level;
/*     */ import com.Static.Blindsided.level.SpawnLevel;
/*     */ import com.Static.Blindsided.level.TileCoordinate;
/*     */ import com.Static.Blindsided.util.Audio;
/*     */ import java.awt.Canvas;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.awt.event.MouseListener;
/*     */ import java.awt.event.MouseMotionListener;
/*     */ import java.awt.image.BufferStrategy;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.image.DataBufferInt;
/*     */ import javax.swing.JFrame;
/*     */ 
/*     */ public class Game extends Canvas implements Runnable {
/*  26 */   private static int width = 310; private static final long serialVersionUID = 1L;
/*  27 */   private static int height = 225;
/*     */   
/*  29 */   private static int scale = 3;
/*  30 */   public static String title = "Quandary";
/*  31 */   public static int c = 0;
/*     */   
/*     */   private Thread thread;
/*     */   
/*     */   private JFrame frame;
/*     */   
/*     */   private Keyboard key;
/*     */   
/*     */   private Level level;
/*     */   private Player player;
/*     */   private boolean running = false;
/*     */   private static UI_Main uiMain;
/*     */   private Screen screen;
/*     */   private Font font;
/*  45 */   private BufferedImage image = new BufferedImage(width, height, 1);
/*  46 */   private int[] pixels = ((DataBufferInt)this.image.getRaster().getDataBuffer()).getData();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Game() {
/*  53 */     Dimension size = new Dimension(width * scale + 270, height * scale);
/*  54 */     setPreferredSize(size);
/*     */     
/*  56 */     this.screen = new Screen(width, height);
/*  57 */     uiMain = new UI_Main();
/*  58 */     this.frame = new JFrame();
/*  59 */     this.key = new Keyboard();
/*  60 */     this.level = Level.spawn;
/*  61 */     TileCoordinate playerSpawn = new TileCoordinate(SpawnLevel.x10 - 4, SpawnLevel.y10 - 1);
/*     */ 
/*     */     
/*  64 */     this.player = new Player("Jimbo?", playerSpawn.x(), playerSpawn.y(), this.key);
/*     */     
/*  66 */     this.level.add((Entity)this.player);
/*  67 */     this.font = new Font();
/*     */     
/*  69 */     addKeyListener((KeyListener)this.key);
/*     */     
/*  71 */     Mouse mouse = new Mouse();
/*  72 */     addMouseListener((MouseListener)mouse);
/*  73 */     addMouseMotionListener((MouseMotionListener)mouse);
/*     */   }
/*     */   
/*     */   public static int getWindowWidth() {
/*  77 */     return width * scale;
/*     */   }
/*     */   
/*     */   public static int getWindowHeight() {
/*  81 */     return height * scale;
/*     */   }
/*     */   
/*     */   public static UI_Main getUI_Main() {
/*  85 */     return uiMain;
/*     */   }
/*     */   
/*     */   public synchronized void start() {
/*  89 */     this.thread = new Thread(this, "Display");
/*     */     
/*  91 */     this.thread.start();
/*  92 */     this.running = true;
/*     */   }
/*     */   
/*     */   public synchronized void stop() {
/*  96 */     this.running = false;
/*     */     try {
/*  98 */       this.thread.join();
/*  99 */     } catch (InterruptedException e) {
/* 100 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void run() {
/* 105 */     long lastTime = System.nanoTime();
/* 106 */     long timer = System.currentTimeMillis();
/*     */     
/* 108 */     double ns = 1.6666666666666666E7D;
/* 109 */     double delta = 0.0D;
/* 110 */     int frames = 0;
/* 111 */     int updates = 0;
/*     */ 
/*     */     
/* 114 */     requestFocus();
/* 115 */     while (this.running) {
/* 116 */       long now = System.nanoTime();
/* 117 */       delta += (now - lastTime) / 1.6666666666666666E7D;
/*     */       
/* 119 */       lastTime = now;
/* 120 */       while (delta >= 1.0D) {
/* 121 */         update();
/*     */ 
/*     */ 
/*     */         
/* 125 */         updates = updates++;
/* 126 */         delta--;
/*     */       } 
/* 128 */       render();
/*     */ 
/*     */       
/* 131 */       frames++;
/*     */       
/* 133 */       if (System.currentTimeMillis() - timer > 1000L) {
/* 134 */         timer += 1000L;
/*     */         
/* 136 */         this.frame.setTitle(String.valueOf(title) + " | " + updates + " ups, " + frames + " fps");
/* 137 */         updates = 0;
/* 138 */         frames = 0;
/*     */       } 
/*     */     } 
/* 141 */     stop();
/*     */   }
/*     */   
/*     */   public void update() {
/* 145 */     this.key.update();
/* 146 */     this.level.update();
/* 147 */     uiMain.update();
/*     */   }
/*     */   
/*     */   public void render() {
/* 151 */     BufferStrategy bs = getBufferStrategy();
/* 152 */     if (bs == null) {
/* 153 */       createBufferStrategy(3);
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 162 */     this.screen.clear();
/* 163 */     double xScroll = (this.player.getX() - this.screen.width / 2);
/* 164 */     double yScroll = (this.player.getY() - this.screen.height / 2);
/*     */     
/* 166 */     this.level.render((int)xScroll, (int)yScroll, this.screen);
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
/* 180 */     for (int i = 0; i < this.pixels.length; i++) {
/* 181 */       this.pixels[i] = this.screen.pixels[i];
/*     */     }
/*     */     
/* 184 */     Graphics g = bs.getDrawGraphics();
/*     */ 
/*     */ 
/*     */     
/* 188 */     g.drawImage(this.image, 0, 0, width * scale, height * scale, null);
/* 189 */     uiMain.render(g);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 196 */     g.dispose();
/* 197 */     bs.show();
/*     */   }
/*     */   
/*     */   public static void main(String[] args) {
/* 201 */     Game game = new Game();
/* 202 */     game.frame.setResizable(false);
/* 203 */     game.frame.setTitle(title);
/* 204 */     game.frame.add(game);
/* 205 */     game.frame.pack();
/* 206 */     game.frame.setDefaultCloseOperation(3);
/* 207 */     game.frame.setLocationRelativeTo((Component)null);
/* 208 */     game.frame.setVisible(true);
/*     */     
/* 210 */     game.start();
/*     */ 
/*     */     
/*     */     try {
/* 214 */       Audio.filePath = "res/audio/Quandary.wav";
/* 215 */       Audio audioPlayer = new Audio();
/* 216 */       audioPlayer.play();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       do {
/* 223 */         audioPlayer.gotoChoice(c);
/* 224 */       } while (c != 4);
/*     */     
/*     */     }
/* 227 */     catch (Exception ex) {
/* 228 */       System.out.println("Error with playing sound.");
/* 229 */       ex.printStackTrace();
/*     */     } 
/*     */     
/* 232 */     game.requestFocus();
/*     */   }
/*     */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\Game.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */