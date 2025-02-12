/*    */ package com.Static.Blindsided.graphics.UI;
/*    */ 
/*    */ import java.awt.Graphics;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class UI_Main
/*    */ {
/*  9 */   private List<UIPanel> panels = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void addPanel(UIPanel panel) {
/* 16 */     this.panels.add(panel);
/*    */   }
/*    */   
/*    */   public void removePanel(UIPanel panel) {
/* 20 */     this.panels.remove(panel);
/*    */   }
/*    */   
/*    */   public void update() {
/* 24 */     for (UIPanel panel : this.panels) {
/* 25 */       panel.update();
/*    */     }
/*    */   }
/*    */   
/*    */   public void render(Graphics g) {
/* 30 */     for (UIPanel panel : this.panels)
/* 31 */       panel.render(g); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\graphics\UI\UI_Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */