/*    */ package com.Static.Blindsided.entity;
/*    */ 
/*    */ import com.Static.Blindsided.graphics.Screen;
/*    */ import com.Static.Blindsided.graphics.Sprite;
/*    */ import com.Static.Blindsided.level.Level;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class Entity
/*    */ {
/*    */   protected double x;
/*    */   protected double y;
/*    */   protected Sprite sprite;
/*    */   private boolean removed = false;
/*    */   protected Level level;
/* 16 */   protected final Random random = new Random();
/*    */ 
/*    */   
/*    */   public Entity() {}
/*    */   
/*    */   public Entity(int x, int y, Sprite sprite) {
/* 22 */     this.x = x;
/* 23 */     this.y = y;
/* 24 */     this.sprite = sprite;
/*    */   }
/*    */ 
/*    */   
/*    */   public void update() {}
/*    */   
/*    */   public void render(Screen screen) {
/* 31 */     if (this.sprite != null) screen.renderSprite((int)this.x, (int)this.y, this.sprite, true);
/*    */   
/*    */   }
/*    */   
/*    */   public void remove() {
/* 36 */     this.removed = true;
/*    */   }
/*    */   
/*    */   public int getX() {
/* 40 */     return (int)this.x;
/*    */   }
/*    */   
/*    */   public int getY() {
/* 44 */     return (int)this.y;
/*    */   }
/*    */   
/*    */   public Sprite getSprite() {
/* 48 */     return this.sprite;
/*    */   }
/*    */   
/*    */   public boolean isRemoved() {
/* 52 */     return this.removed;
/*    */   }
/*    */   
/*    */   public void init(Level level) {
/* 56 */     this.level = level;
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\entity\Entity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */