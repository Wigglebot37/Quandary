/*    */ package com.Static.Blindsided.util;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Vector2i
/*    */ {
/*    */   public int x;
/*    */   public int y;
/*    */   
/*    */   public Vector2i() {
/* 11 */     set(0, 0);
/*    */   }
/*    */   
/*    */   public Vector2i(Vector2i vector) {
/* 15 */     set(vector.x, vector.y);
/*    */   }
/*    */   
/*    */   public Vector2i(int x, int y) {
/* 19 */     set(x, y);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void set(int x, int y) {
/* 25 */     this.x = x;
/* 26 */     this.y = y;
/*    */   }
/*    */ 
/*    */   
/*    */   public void test() {
/* 31 */     Vector2i player_position = (new Vector2i(80, 40)).setX(15);
/* 32 */     Vector2i mob_position = (new Vector2i(player_position)).setX(50);
/*    */   }
/*    */   
/*    */   public int getX() {
/* 36 */     return this.x;
/*    */   }
/*    */   
/*    */   public int getY() {
/* 40 */     return this.y;
/*    */   }
/*    */   
/*    */   public Vector2i add(Vector2i vector) {
/* 44 */     this.x += vector.x;
/* 45 */     this.y += vector.y;
/* 46 */     return this;
/*    */   }
/*    */   
/*    */   public Vector2i add(int value) {
/* 50 */     this.x += value;
/* 51 */     this.y += value;
/* 52 */     return this;
/*    */   }
/*    */   
/*    */   public Vector2i subtract(Vector2i vector) {
/* 56 */     this.x -= vector.x;
/* 57 */     this.y -= vector.y;
/* 58 */     return this;
/*    */   }
/*    */   
/*    */   public Vector2i setX(int x) {
/* 62 */     this.x = x;
/* 63 */     return this;
/*    */   }
/*    */   
/*    */   public Vector2i setY(int y) {
/* 67 */     this.y = y;
/* 68 */     return this;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object object) {
/* 79 */     if (!(object instanceof Vector2i)) return false; 
/* 80 */     Vector2i vec = (Vector2i)object;
/* 81 */     if (vec.getX() == getX() && vec.getY() == getY()) return true; 
/* 82 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindside\\util\Vector2i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */