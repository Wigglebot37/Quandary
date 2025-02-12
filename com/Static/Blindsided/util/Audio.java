/*     */ package com.Static.Blindsided.util;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import javax.sound.sampled.AudioInputStream;
/*     */ import javax.sound.sampled.AudioSystem;
/*     */ import javax.sound.sampled.Clip;
/*     */ import javax.sound.sampled.LineUnavailableException;
/*     */ import javax.sound.sampled.UnsupportedAudioFileException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Audio
/*     */ {
/*     */   Long currentFrame;
/*     */   Clip clip;
/*     */   String status;
/*     */   AudioInputStream audioInputStream;
/*     */   public static String filePath;
/*     */   
/*     */   public Audio() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
/*  29 */     this.audioInputStream = AudioSystem.getAudioInputStream((new File(filePath)).getAbsoluteFile());
/*     */ 
/*     */     
/*  32 */     this.clip = AudioSystem.getClip();
/*     */ 
/*     */     
/*  35 */     this.clip.open(this.audioInputStream);
/*     */     
/*  37 */     this.clip.loop(-1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void gotoChoice(int c) throws IOException, LineUnavailableException, UnsupportedAudioFileException {
/*  43 */     switch (c) {
/*     */       case 1:
/*  45 */         pause();
/*     */         break;
/*     */       case 2:
/*  48 */         resumeAudio();
/*     */         break;
/*     */       case 3:
/*  51 */         restart();
/*     */         break;
/*     */       case 4:
/*  54 */         stop();
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void play() {
/*  63 */     this.clip.start();
/*  64 */     this.status = "play";
/*     */   }
/*     */ 
/*     */   
/*     */   public void pause() {
/*  69 */     if (this.status.equals("paused")) {
/*     */       return;
/*     */     }
/*     */     
/*  73 */     this.currentFrame = Long.valueOf(this.clip.getMicrosecondPosition());
/*  74 */     this.clip.stop();
/*  75 */     this.status = "paused";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void resumeAudio() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
/*  82 */     if (this.status.equals("play")) {
/*     */       return;
/*     */     }
/*     */     
/*  86 */     this.clip.close();
/*  87 */     resetAudioStream();
/*  88 */     this.clip.setMicrosecondPosition(this.currentFrame.longValue());
/*  89 */     play();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void restart() throws IOException, LineUnavailableException, UnsupportedAudioFileException {
/*  96 */     this.clip.stop();
/*  97 */     this.clip.close();
/*  98 */     resetAudioStream();
/*  99 */     this.currentFrame = Long.valueOf(0L);
/* 100 */     this.clip.setMicrosecondPosition(0L);
/* 101 */     play();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void stop() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
/* 108 */     this.currentFrame = Long.valueOf(0L);
/* 109 */     this.clip.stop();
/* 110 */     this.clip.close();
/* 111 */     resetAudioStream();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void resetAudioStream() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
/* 118 */     this.audioInputStream = AudioSystem.getAudioInputStream((
/* 119 */         new File(filePath)).getAbsoluteFile());
/* 120 */     this.clip.open(this.audioInputStream);
/* 121 */     this.clip.loop(-1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindside\\util\Audio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */