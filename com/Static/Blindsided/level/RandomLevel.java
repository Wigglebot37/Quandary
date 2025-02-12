/*    */ package com.Static.Blindsided.level;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ public class RandomLevel
/*    */   extends Level {
/*  7 */   private static final Random random = new Random();
/*    */   
/*    */   public RandomLevel(int width, int height) {
/* 10 */     super(width, height);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void generateLevel() {
/* 15 */     for (int y = 0; y < this.height; y++) {
/* 16 */       for (int x = 0; x < this.width; x++)
/* 17 */         this.tilesInt[x + y * this.width] = random.nextInt(4); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\level\RandomLevel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */