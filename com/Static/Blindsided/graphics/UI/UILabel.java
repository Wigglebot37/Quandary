/*    */ package com.Static.Blindsided.graphics.UI;
/*    */ 
/*    */ import com.Static.Blindsided.util.Vector2i;
/*    */ import java.awt.Color;
/*    */ import java.awt.Font;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ public class UILabel
/*    */   extends UIComponent
/*    */ {
/*    */   public String text;
/*    */   private Font font;
/*    */   public boolean dropShadow = false;
/* 14 */   public int dropShadowOffset = 2;
/*    */ 
/*    */   
/*    */   public UILabel(Vector2i position, String text) {
/* 18 */     super(position);
/* 19 */     this.font = new Font("Arial", 0, 32);
/* 20 */     this.text = text;
/* 21 */     this.color = new Color(9884816);
/*    */   }
/*    */   
/*    */   public UILabel setFont(Font font) {
/* 25 */     this.font = font;
/* 26 */     return this;
/*    */   }
/*    */   
/*    */   public void render(Graphics g) {
/* 30 */     if (this.dropShadow) {
/* 31 */       g.setColor(Color.BLACK);
/* 32 */       g.setFont(new Font(this.font.getFontName(), 1, this.font.getSize()));
/* 33 */       g.drawString(this.text, this.position.x + this.offset.x + this.dropShadowOffset, this.position.y + this.offset.y - this.dropShadowOffset);
/*    */     } 
/*    */     
/* 36 */     g.setColor(this.color);
/* 37 */     g.setFont(this.font);
/* 38 */     g.drawString(this.text, this.position.x + this.offset.x, this.position.y + this.offset.y);
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\graphics\UI\UILabel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */