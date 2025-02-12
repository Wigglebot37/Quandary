/*    */ package com.Static.Blindsided.graphics;
/*    */ 
/*    */ public class Font
/*    */ {
/*  5 */   private static SpriteSheet font = new SpriteSheet("/fonts/arial.png", 16);
/*  6 */   private static Sprite[] characters = Sprite.split(font);
/*    */   
/*  8 */   private static String charIndex = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz,./\\[]{}()-=+_^<>?“”:;*&%'!@#0123456789";
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void render(int x, int y, String text, Screen screen) {
/* 20 */     render(x, y, 0, 0, text, screen);
/*    */   }
/*    */   public void render(int x, int y, int color, String text, Screen screen) {
/* 23 */     render(x, y, 0, color, text, screen);
/*    */   }
/*    */   
/*    */   public void render(int x, int y, int spacing, int color, String text, Screen screen) {
/* 27 */     int xOffset = 0;
/* 28 */     int line = 0;
/* 29 */     for (int i = 0; i < text.length(); i++) {
/* 30 */       xOffset += 16 + spacing;
/* 31 */       int yOffset = 0;
/* 32 */       char currentChar = text.charAt(i);
/*    */       
/* 34 */       if (currentChar == 'g' || currentChar == 'y' || currentChar == 'p' || currentChar == 'j' || currentChar == 'q' || currentChar == ',') yOffset = 4; 
/* 35 */       if (currentChar == '\n') {
/* 36 */         line++;
/* 37 */         xOffset = 0;
/*    */       } 
/* 39 */       int index = charIndex.indexOf(currentChar);
/* 40 */       if (index != -1)
/* 41 */         screen.renderTextChar(x + xOffset, y + line * 20 + yOffset, characters[index], color, false); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\graphics\Font.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */