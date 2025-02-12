/*    */ package com.Static.Blindsided.graphics;
/*    */ 
/*    */ public class AnimatedSprite
/*    */   extends Sprite {
/*  5 */   private int frame = 0;
/*    */   private Sprite sprite;
/*  7 */   private int rate = 5;
/*  8 */   private int time = 0;
/*  9 */   private int length = -1;
/* 10 */   private int[] cycle = new int[] { 0, 1, 2 };
/* 11 */   private int frameIndex = 0;
/*    */   
/*    */   public AnimatedSprite(SpriteSheet sheet, int width, int height, int length) {
/* 14 */     super(sheet, width, height);
/* 15 */     this.length = length;
/* 16 */     this.sprite = sheet.getSprites()[0];
/* 17 */     if (length > (sheet.getSprites()).length) System.err.println("Animation length too long."); 
/*    */   }
/*    */   
/*    */   public void update() {
/* 21 */     this.time++;
/* 22 */     if (this.time % this.rate == 0) {
/* 23 */       if (this.frame >= this.length - 1) { this.frame = 0; }
/* 24 */       else { this.frame++; }
/* 25 */        this.frameIndex++;
/* 26 */       if (this.frameIndex > 3) this.frameIndex = 0; 
/* 27 */       this.sprite = this.sheet.getSprites()[this.cycle[this.frameIndex]];
/*    */     } 
/*    */   }
/*    */   
/*    */   public Sprite getSprite() {
/* 32 */     return this.sprite;
/*    */   }
/*    */   
/*    */   public void setFrameRate(int frames) {
/* 36 */     this.rate = frames;
/*    */   }
/*    */   
/*    */   public void setFrame(int index) {
/* 40 */     if (index > (this.sheet.getSprites()).length - 1) {
/* 41 */       System.err.println("Index out of bounds in " + this);
/*    */       return;
/*    */     } 
/* 44 */     this.sprite = this.sheet.getSprites()[index];
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\graphics\AnimatedSprite.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */