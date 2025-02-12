/*    */ package com.Static.Blindsided.input;
/*    */ 
/*    */ import java.awt.event.KeyEvent;
/*    */ import java.awt.event.KeyListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Keyboard
/*    */   implements KeyListener
/*    */ {
/*    */   private static final int NUM_KEYS = 512;
/* 14 */   private static boolean[] keys = new boolean[512]; public boolean up; public boolean down; public boolean left;
/* 15 */   private static boolean[] lastKeys = new boolean[512];
/*    */   
/*    */   public boolean right;
/*    */   public boolean upright;
/*    */   public boolean upleft;
/*    */   
/*    */   public void update() {
/* 22 */     this.up = !(!keys[38] && !keys[87]);
/* 23 */     this.down = !(!keys[40] && !keys[83]);
/* 24 */     this.left = !(!keys[37] && !keys[65]);
/* 25 */     this.right = !(!keys[39] && !keys[68]);
/*    */     
/* 27 */     this.upright = !((!keys[39] || !keys[38]) && (!keys[68] || !keys[87]));
/* 28 */     this.upleft = !((!keys[37] || !keys[38]) && (!keys[65] || !keys[87]));
/* 29 */     this.downright = !((!keys[39] || !keys[40]) && (!keys[68] || !keys[83]));
/* 30 */     this.downleft = !((!keys[37] || !keys[40]) && (!keys[65] || !keys[83]));
/*    */     
/* 32 */     this.stop = !((!keys[37] || !keys[39]) && (!keys[65] || !keys[68]) && (
/* 33 */       !keys[38] || !keys[40]) && (!keys[87] || !keys[83]));
/*    */     
/* 35 */     pausekey = !((!keys[27] || lastKeys[27]) && (!keys[80] || lastKeys[80]));
/* 36 */     spacebar = (keys[32] && !lastKeys[32]);
/* 37 */     respawner = (keys[82] && !lastKeys[82]);
/*    */     
/* 39 */     for (int i = 0; i < keys.length; i++)
/* 40 */       lastKeys[i] = keys[i]; 
/*    */   }
/*    */   public boolean downright; public boolean downleft;
/*    */   public boolean stop;
/*    */   public static boolean pausekey;
/*    */   public static boolean spacebar;
/*    */   public static boolean respawner;
/*    */   
/*    */   public void keyPressed(KeyEvent e) {
/* 49 */     keys[e.getKeyCode()] = true;
/*    */   }
/*    */   
/*    */   public void keyReleased(KeyEvent e) {
/* 53 */     keys[e.getKeyCode()] = false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void keyTyped(KeyEvent e) {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   public static boolean isDown(int keyCode) {
/* 68 */     return keys[keyCode];
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   public static boolean wasPressed(int keyCode) {
/* 78 */     return (isDown(keyCode) && !lastKeys[keyCode]);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   public static boolean wasReleased(int keyCode) {
/* 89 */     return (!isDown(keyCode) && lastKeys[keyCode]);
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\input\Keyboard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */