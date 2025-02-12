/*     */ package com.Static.Blindsided.graphics.UI;
/*     */ 
/*     */ import com.Static.Blindsided.input.Mouse;
/*     */ import com.Static.Blindsided.util.Vector2i;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Image;
/*     */ import java.awt.Point;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.image.BufferedImage;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UIButton
/*     */   extends UIComponent
/*     */ {
/*     */   private UIButtonListener buttonlistener;
/*     */   private UIActionListener actionlistener;
/*     */   public UILabel label;
/*     */   private Image image;
/*     */   private boolean inside = false;
/*     */   private boolean pressed = false;
/*     */   private boolean ignorepress = false;
/*     */   private boolean ignoreaction = false;
/*     */   
/*     */   public UIButton(Vector2i position, Vector2i size, UIActionListener actionlistener) {
/*  27 */     super(position, size);
/*  28 */     this.actionlistener = actionlistener;
/*  29 */     Vector2i lp = new Vector2i(position);
/*  30 */     lp.x += 9;
/*  31 */     lp.y += size.y - 9;
/*     */     
/*  33 */     this.label = new UILabel(lp, "");
/*  34 */     this.label.setColor(6710886, false);
/*  35 */     this.label.active = false;
/*  36 */     init();
/*     */   }
/*     */   
/*     */   public UIButton(Vector2i position, BufferedImage image, UIActionListener actionlistener) {
/*  40 */     super(position, new Vector2i(image.getWidth(), image.getHeight()));
/*  41 */     this.actionlistener = actionlistener;
/*  42 */     setImage(image);
/*  43 */     init();
/*     */   }
/*     */   
/*     */   public UIButton(Vector2i position, BufferedImage image) {
/*  47 */     super(position, new Vector2i(image.getWidth(), image.getHeight()));
/*  48 */     setImage(image);
/*  49 */     init();
/*     */   }
/*     */   
/*     */   private void init() {
/*  53 */     setColor(11184810, false);
/*  54 */     this.buttonlistener = new UIButtonListener();
/*     */   }
/*     */   
/*     */   void init(UIPanel panel) {
/*  58 */     super.init(panel);
/*  59 */     if (this.label != null)
/*  60 */       panel.addComponent(this.label); 
/*     */   }
/*     */   
/*     */   public void setImage(Image image) {
/*  64 */     this.image = image;
/*     */   }
/*     */   
/*     */   public void setButtonListener(UIButtonListener buttonlistener) {
/*  68 */     this.buttonlistener = buttonlistener;
/*     */   }
/*     */   
/*     */   public void setText(String text) {
/*  72 */     if (text == "") {
/*  73 */       this.label.active = false;
/*     */     } else {
/*  75 */       this.label.text = text;
/*     */     } 
/*     */   }
/*     */   public void performAction() {
/*  79 */     this.actionlistener.perform();
/*  80 */     this.ignoreaction = true;
/*     */   }
/*     */   
/*     */   public void ignoreNextPress() {
/*  84 */     this.ignoreaction = true;
/*     */   }
/*     */   
/*     */   public void update() {
/*  88 */     Rectangle rect = new Rectangle((getAbsolutePosition()).x, (getAbsolutePosition()).y, this.size.x, this.size.y);
/*  89 */     boolean leftmousedown = (Mouse.getButton() == 1);
/*  90 */     if (rect.contains(new Point(Mouse.getX(), Mouse.getY()))) {
/*  91 */       if (!this.inside) {
/*  92 */         if (leftmousedown) {
/*  93 */           this.ignorepress = true;
/*     */         } else {
/*  95 */           this.ignorepress = false;
/*  96 */         }  this.buttonlistener.entered(this);
/*     */       } 
/*  98 */       this.inside = true;
/*     */       
/* 100 */       if (!this.pressed && leftmousedown && !this.ignorepress) {
/* 101 */         this.buttonlistener.pressed(this);
/* 102 */         this.pressed = true;
/* 103 */       } else if (Mouse.getButton() == 0) {
/* 104 */         if (this.pressed) {
/* 105 */           this.buttonlistener.released(this);
/* 106 */           this.pressed = false;
/* 107 */           if (!this.ignoreaction) {
/* 108 */             this.actionlistener.perform();
/*     */           } else {
/* 110 */             this.ignoreaction = false;
/*     */           } 
/* 112 */         }  this.ignorepress = false;
/*     */       } 
/*     */     } else {
/* 115 */       if (this.inside) {
/* 116 */         this.buttonlistener.exited(this);
/* 117 */         this.pressed = false;
/*     */       } 
/* 119 */       this.inside = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void render(Graphics g) {
/* 124 */     int x = this.position.x + this.offset.x;
/* 125 */     int y = this.position.y + this.offset.y;
/*     */     
/* 127 */     if (this.image != null) {
/* 128 */       g.drawImage(this.image, x, y, null);
/*     */     } else {
/* 130 */       g.setColor(this.color);
/* 131 */       g.fillRect(x, y, this.size.x, this.size.y);
/*     */       
/* 133 */       if (this.label != null)
/* 134 */         this.label.render(g); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\graphics\UI\UIButton.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */