/*    */ package com.Static.Blindsided.util;
/*    */ 
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.awt.image.DataBufferByte;
/*    */ import java.awt.image.DataBufferInt;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ImageUtils
/*    */ {
/*    */   public static BufferedImage changebr(BufferedImage original, int amount) {
/* 18 */     BufferedImage result = new BufferedImage(original.getWidth(), original.getHeight(), 2);
/*    */     
/* 20 */     byte[] pixels = ((DataBufferByte)original.getRaster().getDataBuffer()).getData();
/* 21 */     int[] resultPixels = ((DataBufferInt)result.getRaster().getDataBuffer()).getData();
/*    */     
/* 23 */     int offset = 0;
/* 24 */     for (int yy = 0; yy < original.getHeight(); yy++) {
/* 25 */       for (int xx = 0; xx < original.getWidth(); xx++) {
/*    */         
/* 27 */         int a = Byte.toUnsignedInt(pixels[offset++]);
/* 28 */         int b = Byte.toUnsignedInt(pixels[offset++]);
/* 29 */         int g = Byte.toUnsignedInt(pixels[offset++]);
/* 30 */         int r = Byte.toUnsignedInt(pixels[offset++]);
/*    */         
/* 32 */         r = Mathutils.clamp(r + amount, 0, 255);
/* 33 */         g = Mathutils.clamp(g + amount, 0, 255);
/* 34 */         b = Mathutils.clamp(b + amount, 0, 255);
/*    */         
/* 36 */         resultPixels[xx + yy * result.getWidth()] = a << 24 | r << 16 | g << 8 | b;
/*    */       } 
/*    */     } 
/* 39 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindside\\util\ImageUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */