/*    */ package com.Static.Blindsided.level;
/*    */ 
/*    */ import com.Static.Blindsided.util.Vector2i;
/*    */ 
/*    */ public class Node {
/*    */   public Vector2i tile;
/*    */   public Node parent;
/*    */   public double fCost;
/*    */   public double gCost;
/*    */   public double hCost;
/*    */   
/*    */   public Node(Vector2i tile, Node parent, double gCost, double hCost) {
/* 13 */     this.tile = tile;
/* 14 */     this.parent = parent;
/* 15 */     this.gCost = gCost;
/*    */ 
/*    */     
/* 18 */     this.hCost = hCost;
/*    */     
/* 20 */     this.fCost = this.gCost + this.hCost;
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\level\Node.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */