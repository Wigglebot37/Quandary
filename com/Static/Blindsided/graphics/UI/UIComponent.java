/*    */ package com.Static.Blindsided.graphics.UI;
/*    */ 
/*    */ import com.Static.Blindsided.util.Vector2i;
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ 
/*    */ public class UIComponent
/*    */ {
/*    */   public Vector2i position;
/*    */   public Vector2i size;
/*    */   protected Vector2i offset;
/*    */   public Color color;
/*    */   protected UIPanel panel;
/*    */   public boolean active = true;
/*    */   
/*    */   public UIComponent(Vector2i position) {
/* 18 */     this.position = position;
/* 19 */     this.offset = new Vector2i();
/*    */   }
/*    */   
/*    */   public UIComponent(Vector2i position, Vector2i size) {
/* 23 */     this.position = position;
/* 24 */     this.size = size;
/* 25 */     this.offset = new Vector2i();
/*    */   }
/*    */   
/*    */   void init(UIPanel panel) {
/* 29 */     this.panel = panel;
/*    */   }
/*    */   
/*    */   public UIComponent setColor(int color, boolean transparent) {
/* 33 */     this.color = new Color(color, transparent);
/* 34 */     return this;
/*    */   }
/*    */   
/*    */   void setOffset(Vector2i offset) {
/* 38 */     this.offset = offset;
/*    */   }
/*    */ 
/*    */   
/*    */   public void update() {}
/*    */ 
/*    */   
/*    */   public Vector2i getAbsolutePosition() {
/* 46 */     return (new Vector2i(this.position)).add(this.offset);
/*    */   }
/*    */   
/*    */   public void render(Graphics g) {}
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\graphics\UI\UIComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */