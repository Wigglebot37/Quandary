/*     */ package com.Static.Blindsided.entity.mob;
/*     */ 
/*     */ import com.Static.Blindsided.graphics.AnimatedSprite;
/*     */ import com.Static.Blindsided.graphics.Screen;
/*     */ import com.Static.Blindsided.graphics.Sprite;
/*     */ import com.Static.Blindsided.graphics.SpriteSheet;
/*     */ 
/*     */ public class Ghoul
/*     */   extends EnemyMob {
/*  10 */   private AnimatedSprite down = new AnimatedSprite(SpriteSheet.ghoul_down, 32, 32, 3);
/*  11 */   private AnimatedSprite up = new AnimatedSprite(SpriteSheet.ghoul_up, 32, 32, 3);
/*  12 */   private AnimatedSprite left = new AnimatedSprite(SpriteSheet.ghoul_left, 32, 32, 3);
/*  13 */   private AnimatedSprite right = new AnimatedSprite(SpriteSheet.ghoul_right, 32, 32, 3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  19 */   private AnimatedSprite animSprite = this.down;
/*  20 */   private int time = 0;
/*  21 */   private int xa = 0;
/*  22 */   private int ya = 0;
/*     */   
/*     */   public Ghoul(int x, int y) {
/*  25 */     this.x = (x << 4);
/*  26 */     this.y = (y << 4);
/*     */     
/*  28 */     this.sprite = Sprite.ghoul;
/*     */   }
/*     */ 
/*     */   
/*     */   public void update() {
/*  33 */     Player p = this.level.getClientPlayer();
/*     */     
/*  35 */     double dx = p.getX() - this.x;
/*  36 */     double dy = p.getY() - this.y;
/*  37 */     double direct = Math.atan2(dy, dx);
/*  38 */     shoot(this.x, this.y, direct);
/*     */ 
/*     */     
/*  41 */     this.time++;
/*     */     
/*  43 */     if (this.time % (this.random.nextInt(50) + 30) == 0) {
/*     */ 
/*     */       
/*  46 */       this.xa = this.random.nextInt(3) - 1;
/*     */ 
/*     */ 
/*     */       
/*  50 */       this.ya = this.random.nextInt(3) - 1;
/*  51 */       if (this.random.nextInt(3) == 0) {
/*  52 */         this.xa = 0;
/*  53 */         this.ya = 0;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  58 */     if (this.walking) { this.animSprite.update(); }
/*  59 */     else { this.animSprite.setFrame(0); }
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
/*  73 */     if (this.ya < 0) {
/*  74 */       this.dir = EnemyMob.Direction.UP;
/*  75 */       this.animSprite = this.up;
/*  76 */     }  if (this.ya > 0) {
/*  77 */       this.dir = EnemyMob.Direction.DOWN;
/*  78 */       this.animSprite = this.down;
/*  79 */     }  if (this.xa < 0) {
/*  80 */       this.dir = EnemyMob.Direction.LEFT;
/*  81 */       this.animSprite = this.left;
/*  82 */     }  if (this.xa > 0) {
/*  83 */       this.dir = EnemyMob.Direction.RIGHT;
/*  84 */       this.animSprite = this.right;
/*     */     } 
/*  86 */     if (this.xa != 0 || this.ya != 0) {
/*     */       
/*  88 */       move(this.xa, this.ya);
/*  89 */       this.walking = true;
/*     */     } else {
/*  91 */       this.walking = false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void render(Screen screen) {
/*  98 */     this.sprite = this.animSprite.getSprite();
/*     */     
/* 100 */     screen.renderMob((int)this.x - 16, (int)this.y - 16, this.sprite, 0);
/*     */   }
/*     */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\entity\mob\Ghoul.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */