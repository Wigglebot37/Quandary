/*     */ package com.Static.Blindsided.entity.mob;
/*     */ 
/*     */ import com.Static.Blindsided.graphics.AnimatedSprite;
/*     */ import com.Static.Blindsided.graphics.Screen;
/*     */ import com.Static.Blindsided.graphics.Sprite;
/*     */ import com.Static.Blindsided.graphics.SpriteSheet;
/*     */ import com.Static.Blindsided.level.Node;
/*     */ import com.Static.Blindsided.util.Vector2i;
/*     */ import java.util.List;
/*     */ 
/*     */ public class Star
/*     */   extends Mob {
/*  13 */   private AnimatedSprite down = new AnimatedSprite(SpriteSheet.ghoul_down, 32, 32, 3);
/*  14 */   private AnimatedSprite up = new AnimatedSprite(SpriteSheet.ghoul_up, 32, 32, 3);
/*  15 */   private AnimatedSprite left = new AnimatedSprite(SpriteSheet.ghoul_left, 32, 32, 3);
/*  16 */   private AnimatedSprite right = new AnimatedSprite(SpriteSheet.ghoul_right, 32, 32, 3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  23 */   private AnimatedSprite animSprite = this.down;
/*     */   
/*  25 */   private double xa = 0.0D;
/*  26 */   private double ya = 0.0D;
/*  27 */   private List<Node> path = null;
/*  28 */   private int time = 0;
/*     */   
/*     */   public Star(int x, int y) {
/*  31 */     this.x = (x << 4);
/*  32 */     this.y = (y << 4);
/*  33 */     this.sprite = Sprite.ghoul;
/*     */   }
/*     */   
/*     */   private void move() {
/*  37 */     this.xa = 0.0D;
/*  38 */     this.ya = 0.0D;
/*  39 */     double speed = 0.5D;
/*     */ 
/*     */     
/*  42 */     int px = this.level.getPlayerAt(0).getX();
/*  43 */     int py = this.level.getPlayerAt(0).getY();
/*  44 */     Vector2i start = new Vector2i(getX() >> 4, getY() >> 4);
/*  45 */     Vector2i destination = new Vector2i(px >> 4, py >> 4);
/*  46 */     if (this.time % 3 == 0) this.path = this.level.findPath(start, destination); 
/*  47 */     if (this.path != null && 
/*  48 */       this.path.size() > 0) {
/*  49 */       Vector2i vec = ((Node)this.path.get(this.path.size() - 1)).tile;
/*     */       
/*  51 */       if (this.x < (vec.getX() << 4)) this.xa += speed; 
/*  52 */       if (this.x > (vec.getX() << 4)) this.xa -= speed; 
/*  53 */       if (this.y < (vec.getY() << 4)) this.ya += speed; 
/*  54 */       if (this.y > (vec.getY() << 4)) this.ya -= speed;
/*     */     
/*     */     } 
/*     */     
/*  58 */     if (this.xa != 0.0D || this.ya != 0.0D) {
/*     */       
/*  60 */       move(this.xa, this.ya);
/*  61 */       this.walking = true;
/*     */     } else {
/*  63 */       this.walking = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void update() {
/*  68 */     move();
/*  69 */     if (this.walking) { this.animSprite.update(); }
/*  70 */     else { this.animSprite.setFrame(0); }
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
/*  84 */     if (this.ya < 0.0D) {
/*  85 */       this.dir = Mob.Direction.UP;
/*  86 */       this.animSprite = this.up;
/*  87 */     } else if (this.ya > 0.0D) {
/*  88 */       this.dir = Mob.Direction.DOWN;
/*  89 */       this.animSprite = this.down;
/*  90 */     } else if (this.xa < 0.0D) {
/*  91 */       this.dir = Mob.Direction.LEFT;
/*  92 */       this.animSprite = this.left;
/*  93 */     } else if (this.xa > 0.0D) {
/*  94 */       this.dir = Mob.Direction.RIGHT;
/*  95 */       this.animSprite = this.right;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void render(Screen screen) {
/* 100 */     this.sprite = this.animSprite.getSprite();
/* 101 */     screen.renderMob((int)this.x - 16, (int)this.y - 16, this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\entity\mob\Star.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */