/*    */ package com.Static.Blindsided.entity.particle;
/*    */ 
/*    */ import com.Static.Blindsided.entity.Entity;
/*    */ import com.Static.Blindsided.graphics.Screen;
/*    */ import com.Static.Blindsided.graphics.Sprite;
/*    */ 
/*    */ public class Particle
/*    */   extends Entity {
/*    */   private Sprite sprite;
/*    */   private int life;
/*    */   private int time;
/*    */   protected double xx;
/*    */   protected double yy;
/*    */   protected double zz;
/*    */   protected double xa;
/*    */   protected double ya;
/*    */   protected double za;
/*    */   
/*    */   public Particle(double x, double y, int life) {
/* 20 */     this.x = x;
/* 21 */     this.y = y;
/* 22 */     this.xx = x;
/* 23 */     this.yy = y;
/* 24 */     this.life = life + this.random.nextInt(20) - 10;
/*    */     
/* 26 */     this.sprite = Sprite.particle_enemy;
/*    */     
/* 28 */     this.xa = this.random.nextGaussian();
/*    */     
/* 30 */     this.ya = this.random.nextGaussian();
/* 31 */     this.zz = this.random.nextFloat() + 2.0D;
/*    */   }
/*    */ 
/*    */   
/*    */   public void update() {
/* 36 */     this.time++;
/* 37 */     if (this.time >= 7400) this.time = 0; 
/* 38 */     if (this.time > this.life) remove(); 
/* 39 */     this.za -= 0.1D;
/* 40 */     if (this.zz < 0.0D) {
/* 41 */       this.zz = 0.0D;
/* 42 */       this.za *= -0.65D;
/*    */       
/* 44 */       this.xa *= 0.4D;
/* 45 */       this.ya *= 0.4D;
/*    */     } 
/*    */ 
/*    */     
/* 49 */     move(this.xx + this.xa, this.yy + this.ya + this.zz + this.za);
/*    */   }
/*    */   
/*    */   private void move(double x, double y) {
/* 53 */     if (collision(x, y)) {
/* 54 */       this.xa *= -0.5D;
/* 55 */       this.ya *= -0.5D;
/* 56 */       this.za *= -0.5D;
/*    */     } 
/*    */     
/* 59 */     this.xx += this.xa;
/* 60 */     this.yy += this.ya;
/* 61 */     this.zz += this.za;
/*    */   }
/*    */   
/*    */   public boolean collision(double x, double y) {
/* 65 */     boolean solid = false;
/* 66 */     for (int c = 0; c < 4; c++) {
/* 67 */       double xt = (x - (c % 2 * 16)) / 16.0D;
/*    */ 
/*    */ 
/*    */       
/* 71 */       double yt = (y - (c / 2 * 16)) / 16.0D;
/* 72 */       int ix = (int)Math.ceil(xt);
/*    */       
/* 74 */       int iy = (int)Math.ceil(yt);
/* 75 */       if (c % 2 == 0) ix = (int)Math.floor(xt); 
/* 76 */       if (c / 2 == 0) iy = (int)Math.floor(yt); 
/* 77 */       if (this.level.getTile(ix, iy).solid()) solid = true; 
/*    */     } 
/* 79 */     return solid;
/*    */   }
/*    */   
/*    */   public void render(Screen screen) {
/* 83 */     screen.renderSprite((int)this.xx - 1, (int)this.yy - (int)this.zz - 1, this.sprite, true);
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\entity\particle\Particle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */