/*    */ package com.Static.Blindsided.util;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Mathutils
/*    */ {
/*    */   public static int min(int value, int min) {
/* 10 */     return (value < min) ? min : value;
/*    */   }
/*    */   
/*    */   public static int max(int value, int max) {
/* 14 */     return (value < max) ? max : value;
/*    */   }
/*    */   
/*    */   public static int clamp(int value, int min, int max) {
/* 18 */     if (value < min)
/* 19 */       return min; 
/* 20 */     if (value < max)
/* 21 */       return max; 
/* 22 */     return value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindside\\util\Mathutils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */