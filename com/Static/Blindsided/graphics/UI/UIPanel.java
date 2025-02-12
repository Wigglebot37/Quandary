/*    */ package com.Static.Blindsided.graphics.UI;
/*    */ 
/*    */ import com.Static.Blindsided.util.Vector2i;
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class UIPanel
/*    */   extends UIComponent
/*    */ {
/* 12 */   private List<UIComponent> components = new ArrayList<>();
/*    */   private Vector2i size;
/*    */   
/*    */   public UIPanel(Vector2i position, Vector2i size) {
/* 16 */     super(position);
/* 17 */     this.position = position;
/* 18 */     this.size = size;
/* 19 */     this.color = new Color(2143996618, true);
/*    */   }
/*    */   
/*    */   public void addComponent(UIComponent component) {
/* 23 */     component.init(this);
/* 24 */     this.components.add(component);
/*    */   }
/*    */   
/*    */   public void removeComponent(UIComponent component) {
/* 28 */     this.components.remove(component);
/*    */   }
/*    */   
/*    */   public void update() {
/* 32 */     for (UIComponent component : this.components) {
/* 33 */       component.setOffset(this.position);
/* 34 */       component.update();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void render(Graphics g) {
/* 39 */     g.setColor(this.color);
/* 40 */     g.fillRect(this.position.x, this.position.y, this.size.x, this.size.y);
/* 41 */     for (UIComponent component : this.components)
/* 42 */       component.render(g); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\graphics\UI\UIPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */