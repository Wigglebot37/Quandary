/*    */ package com.Static.Blindsided.level.tile.spawn_level;
/*    */ 
/*    */ import com.Static.Blindsided.graphics.Screen;
/*    */ import com.Static.Blindsided.graphics.Sprite;
/*    */ import com.Static.Blindsided.level.tile.Tile;
/*    */ 
/*    */ public class SpawnStartpadTile
/*    */   extends Tile {
/*    */   public SpawnStartpadTile(Sprite sprite) {
/* 10 */     super(sprite);
/*    */   }
/*    */   
/*    */   public void render(int x, int y, Screen screen) {
/* 14 */     screen.renderTile(x << 4, y << 4, this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\level\tile\spawn_level\SpawnStartpadTile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */