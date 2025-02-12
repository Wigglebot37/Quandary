/*    */ package com.Static.Blindsided.graphics.UI;
/*    */ 
/*    */ import com.Static.Blindsided.util.Vector2i;
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ import org.w3c.dom.ranges.RangeException;
/*    */ 
/*    */ 
/*    */ public class UIBars
/*    */   extends UIComponent
/*    */ {
/*    */   private double progress;
/*    */   private Color foregroundCol;
/*    */   
/*    */   public UIBars(Vector2i position, Vector2i size) {
/* 16 */     super(position);
/* 17 */     this.size = size;
/* 18 */     this.foregroundCol = new Color(0);
/*    */   }
/*    */   
/*    */   public void setProgress(double progress) {
/* 22 */     if (progress < 0.0D || progress > 1.0D)
/* 23 */       throw new RangeException((short)1, "must be between 0 and 1.0"); 
/* 24 */     this.progress = progress;
/*    */   }
/*    */   
/*    */   public void setForegroundColor(int color) {
/* 28 */     this.foregroundCol = new Color(color);
/*    */   }
/*    */   
/*    */   public double getProgress() {
/* 32 */     return this.progress;
/*    */   }
/*    */ 
/*    */   
/*    */   public void update() {}
/*    */ 
/*    */   
/*    */   public void render(Graphics g) {
/* 40 */     g.setColor(this.color);
/* 41 */     g.fillRect(this.position.x + this.offset.x, this.position.y + this.offset.y, this.size.x, this.size.y);
/*    */     
/* 43 */     g.setColor(this.foregroundCol);
/* 44 */     g.fillRect(this.position.x + this.offset.x, this.position.y + this.offset.y, (int)(this.progress * this.size.x), this.size.y);
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\graphics\UI\UIBars.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */