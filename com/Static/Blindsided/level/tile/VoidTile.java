/*    */ package com.Static.Blindsided.level.tile;
/*    */ 
/*    */ import com.Static.Blindsided.graphics.Screen;
/*    */ import com.Static.Blindsided.graphics.Sprite;
/*    */ 
/*    */ public class VoidTile
/*    */   extends Tile {
/*    */   public VoidTile(Sprite sprite) {
/*  9 */     super(sprite);
/*    */   }
/*    */   
/*    */   public void render(int x, int y, Screen screen) {
/* 13 */     screen.renderTile(x << 4, y << 4, this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\level\tile\VoidTile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */