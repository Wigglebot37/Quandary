/*    */ package com.Static.Blindsided.level;
/*    */ 
/*    */ public class TileCoordinate {
/*    */   private int x;
/*    */   private int y;
/*  6 */   private final int TILE_SIZE = 16;
/*    */   
/*    */   public TileCoordinate(int x, int y) {
/*  9 */     this.x = x * 16;
/* 10 */     this.y = y * 16;
/*    */   }
/*    */   
/*    */   public int x() {
/* 14 */     return this.x;
/*    */   }
/*    */   
/*    */   public int y() {
/* 18 */     return this.y;
/*    */   }
/*    */   
/*    */   public int[] xy() {
/* 22 */     int[] r = new int[2];
/* 23 */     r[0] = this.x;
/* 24 */     r[1] = this.y;
/* 25 */     return r;
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\level\TileCoordinate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */