/*    */ package com.Static.Blindsided.input;
/*    */ 
/*    */ import java.awt.event.MouseEvent;
/*    */ import java.awt.event.MouseListener;
/*    */ import java.awt.event.MouseMotionListener;
/*    */ 
/*    */ public class Mouse
/*    */   implements MouseListener, MouseMotionListener
/*    */ {
/* 10 */   private static int mouseX = -1;
/* 11 */   private static int mouseY = -1;
/* 12 */   private static int mouseB = -1;
/*    */   
/*    */   public static int getX() {
/* 15 */     return mouseX;
/*    */   }
/*    */   
/*    */   public static int getY() {
/* 19 */     return mouseY;
/*    */   }
/*    */   
/*    */   public static int getButton() {
/* 23 */     return mouseB;
/*    */   }
/*    */   
/*    */   public void mouseDragged(MouseEvent e) {
/* 27 */     mouseX = e.getX();
/* 28 */     mouseY = e.getY();
/*    */   }
/*    */   
/*    */   public void mouseMoved(MouseEvent e) {
/* 32 */     mouseX = e.getX();
/* 33 */     mouseY = e.getY();
/*    */   }
/*    */ 
/*    */   
/*    */   public void mouseClicked(MouseEvent e) {}
/*    */ 
/*    */   
/*    */   public void mouseEntered(MouseEvent e) {}
/*    */ 
/*    */   
/*    */   public void mouseExited(MouseEvent e) {}
/*    */   
/*    */   public void mousePressed(MouseEvent e) {
/* 46 */     mouseB = e.getButton();
/*    */   }
/*    */   
/*    */   public void mouseReleased(MouseEvent e) {
/* 50 */     mouseB = 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\input\Mouse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */