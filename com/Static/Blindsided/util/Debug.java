/*    */ package com.Static.Blindsided.util;
/*    */ 
/*    */ import com.Static.Blindsided.graphics.Screen;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Debug
/*    */ {
/*    */   public static void drawRect(Screen screen, int x, int y, int width, int height, boolean fixed) {
/* 11 */     drawRect(screen, x, y, width, height, 16711680, fixed);
/*    */   }
/*    */   
/*    */   public static void drawRect(Screen screen, int x, int y, int width, int height, int col, boolean fixed) {
/* 15 */     screen.drawRect(x, y, width, height, col, fixed);
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindside\\util\Debug.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */