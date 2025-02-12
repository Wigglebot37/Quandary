/*     */ package com.Static.Blindsided.level.tile;
/*     */ 
/*     */ import com.Static.Blindsided.graphics.Screen;
/*     */ import com.Static.Blindsided.graphics.Sprite;
/*     */ import com.Static.Blindsided.level.tile.spawn_level.SpawnButtonTile;
/*     */ import com.Static.Blindsided.level.tile.spawn_level.SpawnMetalTile;
/*     */ import com.Static.Blindsided.level.tile.spawn_level.SpawnOpendoorTile;
/*     */ import com.Static.Blindsided.level.tile.spawn_level.SpawnSep2Tile;
/*     */ import com.Static.Blindsided.level.tile.spawn_level.SpawnSepTile;
/*     */ import com.Static.Blindsided.level.tile.spawn_level.SpawnStartpadTile;
/*     */ import com.Static.Blindsided.level.tile.spawn_level.SpawnWallTile;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Tile
/*     */ {
/*     */   public Sprite sprite;
/*  22 */   public static Tile voidTile = new VoidTile(Sprite.voidsprite);
/*  23 */   public static Tile white = (Tile)new SpawnMetalTile(Sprite.white);
/*  24 */   public static Tile nosprite = new VoidTile(Sprite.nosprite);
/*  25 */   public static Tile blackwall = (Tile)new SpawnWallTile(Sprite.voidsprite);
/*  26 */   public static Tile nospritewall = (Tile)new SpawnWallTile(Sprite.nosprite);
/*     */   
/*  28 */   public static Tile spawn_floor = (Tile)new SpawnMetalTile(Sprite.spawn_floor);
/*  29 */   public static Tile spawn_fakefloor = (Tile)new SpawnWallTile(Sprite.spawn_floor);
/*     */   
/*  31 */   public static Tile spawn_floor2 = (Tile)new SpawnMetalTile(Sprite.spawn_floor2);
/*  32 */   public static Tile spawn_floor3 = (Tile)new SpawnMetalTile(Sprite.spawn_floor3);
/*  33 */   public static Tile spawn_tube = (Tile)new SpawnMetalTile(Sprite.spawn_tube);
/*  34 */   public static Tile spawn_flamebl = (Tile)new SpawnMetalTile(Sprite.spawn_flamebl);
/*  35 */   public static Tile spawn_flamegr = (Tile)new SpawnMetalTile(Sprite.spawn_flamegr);
/*  36 */   public static Tile spawn_flamerd = (Tile)new SpawnMetalTile(Sprite.spawn_flamerd);
/*  37 */   public static Tile spawn_flameemp = (Tile)new SpawnMetalTile(Sprite.spawn_flameemp);
/*  38 */   public static Tile spawn_flamedoor = (Tile)new SpawnWallTile(Sprite.spawn_flamedoor);
/*  39 */   public static Tile spawn_flamedoordown = (Tile)new SpawnMetalTile(Sprite.spawn_flamedoor);
/*  40 */   public static Tile spawn_sign = (Tile)new SpawnMetalTile(Sprite.spawn_sign);
/*  41 */   public static Tile spawn_signred = (Tile)new SpawnMetalTile(Sprite.spawn_signred);
/*  42 */   public static Tile spawn_lock = (Tile)new SpawnMetalTile(Sprite.lock);
/*  43 */   public static Tile spawn_signgold = (Tile)new SpawnMetalTile(Sprite.key);
/*  44 */   public static Tile spawn_buttongr = (Tile)new SpawnButtonTile(Sprite.spawn_buttongr);
/*  45 */   public static Tile spawn_buttondowngr = (Tile)new SpawnButtonTile(Sprite.spawn_buttondowngr);
/*  46 */   public static Tile spawn_buttonbl = (Tile)new SpawnButtonTile(Sprite.spawn_buttonbl);
/*  47 */   public static Tile spawn_buttondownbl = (Tile)new SpawnButtonTile(Sprite.spawn_buttondownbl);
/*  48 */   public static Tile spawn_buttonrd = (Tile)new SpawnButtonTile(Sprite.spawn_buttonrd);
/*  49 */   public static Tile spawn_buttondownrd = (Tile)new SpawnButtonTile(Sprite.spawn_buttondownrd);
/*  50 */   public static Tile spawn_buttonyl = (Tile)new SpawnButtonTile(Sprite.spawn_buttonyl);
/*  51 */   public static Tile spawn_buttondownyl = (Tile)new SpawnButtonTile(Sprite.spawn_buttondownyl);
/*  52 */   public static Tile spawn_opendoorgr = (Tile)new SpawnOpendoorTile(Sprite.spawn_opendoorgr);
/*  53 */   public static Tile spawn_opendoorgr2 = (Tile)new SpawnOpendoorTile(Sprite.spawn_opendoorgr2);
/*  54 */   public static Tile spawn_opendoorbl = (Tile)new SpawnOpendoorTile(Sprite.spawn_opendoorbl);
/*  55 */   public static Tile spawn_opendoorbl2 = (Tile)new SpawnOpendoorTile(Sprite.spawn_opendoorbl2);
/*  56 */   public static Tile spawn_opendoorrd = (Tile)new SpawnOpendoorTile(Sprite.spawn_opendoorrd);
/*  57 */   public static Tile spawn_opendoorrd2 = (Tile)new SpawnOpendoorTile(Sprite.spawn_opendoorrd2);
/*  58 */   public static Tile spawn_opendooryl = (Tile)new SpawnOpendoorTile(Sprite.spawn_opendooryl);
/*  59 */   public static Tile spawn_opendooryl2 = (Tile)new SpawnOpendoorTile(Sprite.spawn_opendooryl2);
/*  60 */   public static Tile spawn_wall1 = (Tile)new SpawnWallTile(Sprite.spawn_wall1);
/*  61 */   public static Tile spawn_wall2 = (Tile)new SpawnWallTile(Sprite.spawn_wall2);
/*  62 */   public static Tile spawn_wall3 = (Tile)new SpawnWallTile(Sprite.spawn_wall3);
/*  63 */   public static Tile spawn_wall4 = (Tile)new SpawnWallTile(Sprite.spawn_wall4);
/*  64 */   public static Tile spawn_leftproj = (Tile)new SpawnWallTile(Sprite.spawn_leftproj);
/*  65 */   public static Tile spawn_rightproj = (Tile)new SpawnWallTile(Sprite.spawn_rightproj);
/*  66 */   public static Tile spawn_sep = (Tile)new SpawnSepTile(Sprite.spawn_sep);
/*  67 */   public static Tile spawn_sep2 = (Tile)new SpawnSep2Tile(Sprite.spawn_sep2);
/*  68 */   public static Tile spawn_tubebrk = (Tile)new SpawnMetalTile(Sprite.spawn_tubebrk);
/*  69 */   public static Tile spawn_tubebrk2 = (Tile)new SpawnMetalTile(Sprite.spawn_tubebrk2);
/*  70 */   public static Tile spawn_closedoorgr = (Tile)new SpawnWallTile(Sprite.spawn_closedoorgr);
/*  71 */   public static Tile spawn_closedoorgr2 = (Tile)new SpawnWallTile(Sprite.spawn_closedoorgr2);
/*  72 */   public static Tile spawn_closedoorgr3 = (Tile)new SpawnWallTile(Sprite.spawn_closedoorgr);
/*  73 */   public static Tile spawn_closedoorbl = (Tile)new SpawnWallTile(Sprite.spawn_closedoorbl);
/*  74 */   public static Tile spawn_closedoorbl2 = (Tile)new SpawnWallTile(Sprite.spawn_closedoorbl2);
/*  75 */   public static Tile spawn_closedoorbl3 = (Tile)new SpawnWallTile(Sprite.spawn_closedoorbl);
/*  76 */   public static Tile spawn_closedoorrd = (Tile)new SpawnWallTile(Sprite.spawn_closedoorrd);
/*  77 */   public static Tile spawn_closedoorrd2 = (Tile)new SpawnWallTile(Sprite.spawn_closedoorrd2);
/*  78 */   public static Tile spawn_closedoorrd3 = (Tile)new SpawnWallTile(Sprite.spawn_closedoorrd);
/*  79 */   public static Tile spawn_closedooryl = (Tile)new SpawnWallTile(Sprite.spawn_closedooryl);
/*  80 */   public static Tile spawn_closedooryl2 = (Tile)new SpawnWallTile(Sprite.spawn_closedooryl2);
/*  81 */   public static Tile spawn_closedooryl3 = (Tile)new SpawnWallTile(Sprite.spawn_closedooryl);
/*  82 */   public static Tile exit = (Tile)new SpawnWallTile(Sprite.exit);
/*  83 */   public static Tile exit2 = (Tile)new SpawnWallTile(Sprite.exit2);
/*  84 */   public static Tile light = (Tile)new SpawnMetalTile(Sprite.light);
/*  85 */   public static Tile light2 = (Tile)new SpawnMetalTile(Sprite.light2);
/*  86 */   public static Tile light3 = (Tile)new SpawnMetalTile(Sprite.light3);
/*  87 */   public static Tile light4 = (Tile)new SpawnMetalTile(Sprite.light4);
/*  88 */   public static Tile light5 = (Tile)new SpawnMetalTile(Sprite.light5);
/*  89 */   public static Tile light6 = (Tile)new SpawnMetalTile(Sprite.light6);
/*     */   
/*  91 */   public static Tile spawn_wall_end = (Tile)new SpawnWallTile(Sprite.wall_end);
/*  92 */   public static Tile spawn_wall_end2 = (Tile)new SpawnWallTile(Sprite.wall_end2);
/*  93 */   public static Tile spawn_wall_end3 = (Tile)new SpawnWallTile(Sprite.wall_end3);
/*  94 */   public static Tile spawn_wall_end4 = (Tile)new SpawnWallTile(Sprite.wall_end4);
/*  95 */   public static Tile spawn_wall_end5 = (Tile)new SpawnWallTile(Sprite.wall_end5);
/*  96 */   public static Tile spawn_wall_end6 = (Tile)new SpawnWallTile(Sprite.wall_end6);
/*  97 */   public static Tile spawn_wall_endgr = (Tile)new SpawnWallTile(Sprite.wall_endgr);
/*  98 */   public static Tile spawn_wall_endbl = (Tile)new SpawnWallTile(Sprite.wall_endbl);
/*  99 */   public static Tile spawn_wall_endrd = (Tile)new SpawnWallTile(Sprite.wall_endrd);
/* 100 */   public static Tile spawn_wall_endyl = (Tile)new SpawnWallTile(Sprite.wall_endyl);
/*     */   
/* 102 */   public static Tile spawn_startpad1tl = (Tile)new SpawnStartpadTile(Sprite.spawn_startpad1tl);
/* 103 */   public static Tile spawn_startpad1tr = (Tile)new SpawnStartpadTile(Sprite.spawn_startpad1tr);
/* 104 */   public static Tile spawn_startpad1bl = (Tile)new SpawnStartpadTile(Sprite.spawn_startpad1bl);
/* 105 */   public static Tile spawn_startpad1br = (Tile)new SpawnStartpadTile(Sprite.spawn_startpad1br);
/*     */   
/* 107 */   public static Tile spawn_startpad2tl = (Tile)new SpawnStartpadTile(Sprite.spawn_startpad2tl);
/* 108 */   public static Tile spawn_startpad2tr = (Tile)new SpawnStartpadTile(Sprite.spawn_startpad2tr);
/* 109 */   public static Tile spawn_startpad2bl = (Tile)new SpawnStartpadTile(Sprite.spawn_startpad2bl);
/* 110 */   public static Tile spawn_startpad2br = (Tile)new SpawnStartpadTile(Sprite.spawn_startpad2br);
/*     */   
/* 112 */   public static Tile spawn_startpad3tl = (Tile)new SpawnStartpadTile(Sprite.spawn_startpad3tl);
/* 113 */   public static Tile spawn_startpad3tr = (Tile)new SpawnStartpadTile(Sprite.spawn_startpad3tr);
/* 114 */   public static Tile spawn_startpad3bl = (Tile)new SpawnStartpadTile(Sprite.spawn_startpad3bl);
/* 115 */   public static Tile spawn_startpad3br = (Tile)new SpawnStartpadTile(Sprite.spawn_startpad3br);
/*     */   
/* 117 */   public static Tile speed_orb = (Tile)new SpawnButtonTile(Sprite.speed_orb);
/* 118 */   public static Tile temp_orb = (Tile)new SpawnButtonTile(Sprite.temp_orb);
/* 119 */   public static Tile health_orb = (Tile)new SpawnButtonTile(Sprite.health_orb);
/* 120 */   public static Tile rb_orb = (Tile)new SpawnButtonTile(Sprite.rb_orb);
/* 121 */   public static Tile end_orb = (Tile)new SpawnButtonTile(Sprite.end_orb);
/* 122 */   public static Tile empty = (Tile)new SpawnButtonTile(Sprite.empty);
/* 123 */   public static Tile border1 = (Tile)new SpawnWallTile(Sprite.border1);
/* 124 */   public static Tile border2 = (Tile)new SpawnWallTile(Sprite.border2);
/* 125 */   public static Tile border3 = (Tile)new SpawnWallTile(Sprite.border3);
/*     */ 
/*     */   
/* 128 */   public static Tile enemy = (Tile)new SpawnMetalTile(Sprite.enemy);
/* 129 */   public static Tile enemy2 = (Tile)new SpawnMetalTile(Sprite.enemy2);
/* 130 */   public static Tile enemy3 = (Tile)new SpawnMetalTile(Sprite.enemy3);
/* 131 */   public static Tile enemy4 = (Tile)new SpawnMetalTile(Sprite.enemy4);
/* 132 */   public static Tile enemy5 = (Tile)new SpawnMetalTile(Sprite.enemy5);
/* 133 */   public static Tile enemy6 = (Tile)new SpawnMetalTile(Sprite.enemy6);
/* 134 */   public static Tile enemy7 = (Tile)new SpawnMetalTile(Sprite.enemy7);
/* 135 */   public static Tile enemy8 = (Tile)new SpawnMetalTile(Sprite.enemy8);
/* 136 */   public static Tile enemy9 = (Tile)new SpawnMetalTile(Sprite.enemy9);
/* 137 */   public static Tile enemy10 = (Tile)new SpawnMetalTile(Sprite.enemy10);
/* 138 */   public static Tile enemy11 = (Tile)new SpawnMetalTile(Sprite.enemy11);
/* 139 */   public static Tile enemy12 = (Tile)new SpawnMetalTile(Sprite.enemy12);
/* 140 */   public static Tile enemy13 = (Tile)new SpawnMetalTile(Sprite.enemy13);
/* 141 */   public static Tile enemy14 = (Tile)new SpawnMetalTile(Sprite.enemy14);
/* 142 */   public static Tile enemy15 = (Tile)new SpawnMetalTile(Sprite.enemy15);
/* 143 */   public static Tile enemy16 = (Tile)new SpawnMetalTile(Sprite.enemy16);
/* 144 */   public static Tile enemy17 = (Tile)new SpawnMetalTile(Sprite.enemy17);
/* 145 */   public static Tile enemy18 = (Tile)new SpawnMetalTile(Sprite.enemy18);
/* 146 */   public static Tile enemy19 = (Tile)new SpawnMetalTile(Sprite.enemy19);
/* 147 */   public static Tile enemy20 = (Tile)new SpawnMetalTile(Sprite.enemy20);
/* 148 */   public static Tile enemy21 = (Tile)new SpawnMetalTile(Sprite.enemy21);
/* 149 */   public static Tile enemy22 = (Tile)new SpawnMetalTile(Sprite.enemy22);
/* 150 */   public static Tile enemy23 = (Tile)new SpawnMetalTile(Sprite.enemy23);
/* 151 */   public static Tile enemy24 = (Tile)new SpawnMetalTile(Sprite.enemy24);
/* 152 */   public static Tile enemy25 = (Tile)new SpawnMetalTile(Sprite.enemy25);
/*     */   
/* 154 */   public static Tile e2enemy = (Tile)new SpawnMetalTile(Sprite.e2enemy);
/* 155 */   public static Tile e2enemy2 = (Tile)new SpawnMetalTile(Sprite.e2enemy2);
/* 156 */   public static Tile e2enemy3 = (Tile)new SpawnMetalTile(Sprite.e2enemy3);
/* 157 */   public static Tile e2enemy4 = (Tile)new SpawnMetalTile(Sprite.e2enemy4);
/* 158 */   public static Tile e2enemy5 = (Tile)new SpawnMetalTile(Sprite.e2enemy5);
/* 159 */   public static Tile e2enemy6 = (Tile)new SpawnMetalTile(Sprite.e2enemy6);
/* 160 */   public static Tile e2enemy7 = (Tile)new SpawnMetalTile(Sprite.e2enemy7);
/* 161 */   public static Tile e2enemy8 = (Tile)new SpawnMetalTile(Sprite.e2enemy8);
/* 162 */   public static Tile e2enemy9 = (Tile)new SpawnMetalTile(Sprite.e2enemy9);
/* 163 */   public static Tile e2enemy10 = (Tile)new SpawnMetalTile(Sprite.e2enemy10);
/* 164 */   public static Tile e2enemy11 = (Tile)new SpawnMetalTile(Sprite.e2enemy11);
/* 165 */   public static Tile e2enemy12 = (Tile)new SpawnMetalTile(Sprite.e2enemy12);
/* 166 */   public static Tile e2enemy13 = (Tile)new SpawnMetalTile(Sprite.e2enemy13);
/* 167 */   public static Tile e2enemy14 = (Tile)new SpawnMetalTile(Sprite.e2enemy14);
/* 168 */   public static Tile e2enemy15 = (Tile)new SpawnMetalTile(Sprite.e2enemy15);
/* 169 */   public static Tile e2enemy16 = (Tile)new SpawnMetalTile(Sprite.e2enemy16);
/* 170 */   public static Tile e2enemy17 = (Tile)new SpawnMetalTile(Sprite.e2enemy17);
/* 171 */   public static Tile e2enemy18 = (Tile)new SpawnMetalTile(Sprite.e2enemy18);
/* 172 */   public static Tile e2enemy19 = (Tile)new SpawnMetalTile(Sprite.e2enemy19);
/* 173 */   public static Tile e2enemy20 = (Tile)new SpawnMetalTile(Sprite.e2enemy20);
/* 174 */   public static Tile e2enemy21 = (Tile)new SpawnMetalTile(Sprite.e2enemy21);
/* 175 */   public static Tile e2enemy22 = (Tile)new SpawnMetalTile(Sprite.e2enemy22);
/* 176 */   public static Tile e2enemy23 = (Tile)new SpawnMetalTile(Sprite.e2enemy23);
/* 177 */   public static Tile e2enemy24 = (Tile)new SpawnMetalTile(Sprite.e2enemy24);
/* 178 */   public static Tile e2enemy25 = (Tile)new SpawnMetalTile(Sprite.e2enemy25);
/*     */   
/*     */   public static final int col_spawn_floor = -4210755;
/*     */   
/*     */   public static final int col_spawn_fakefloor = -32884;
/*     */   
/*     */   public static final int col_spawn_nosprite = -21;
/*     */   
/*     */   public static final int col_spawn_blackwall = -9729;
/*     */   
/*     */   public static final int col_spawn_nospritewall = -3223905;
/*     */   
/*     */   public static final int col_spawn_floor2 = -4107437;
/*     */   
/*     */   public static final int col_spawn_floor3 = -7286803;
/*     */   
/*     */   public static final int col_spawn_tube = -65281;
/*     */   
/*     */   public static final int col_spawn_flamebl = -16760221;
/*     */   
/*     */   public static final int col_spawn_flamegr = -16729501;
/*     */   
/*     */   public static final int col_spawn_flamerd = -48541;
/*     */   
/*     */   public static final int col_spawn_flamedoor = -9748609;
/*     */   
/*     */   public static final int col_spawn_flamedoorend = -8454034;
/*     */   
/*     */   public static final int col_spawn_sign = -5939418;
/*     */   public static final int col_spawn_sign2 = -5939374;
/*     */   public static final int col_spawn_sign3 = -5939347;
/*     */   public static final int col_spawn_sign4 = -5939336;
/*     */   public static final int col_spawn_sign5 = -5939328;
/*     */   public static final int col_spawn_sign6 = -5939326;
/*     */   public static final int col_spawn_sign7 = -5939324;
/*     */   public static final int col_spawn_sign8 = -5939322;
/*     */   public static final int col_spawn_sign9 = -5939320;
/*     */   public static final int col_spawn_sign10 = -5939318;
/*     */   public static final int col_spawn_sign11 = -5939316;
/*     */   public static final int col_spawn_sign12 = -6987360;
/*     */   public static final int col_spawn_sign13 = -6987358;
/*     */   public static final int col_spawn_sign14 = -6987362;
/*     */   public static final int col_spawn_signgold = -16896;
/*     */   public static final int col_spawn_buttongr = -11731200;
/*     */   public static final int col_spawn_buttongr2 = -11796736;
/*     */   public static final int col_spawn_buttonbl = -11796225;
/*     */   public static final int col_spawn_buttonbl2 = -11861761;
/*     */   public static final int col_spawn_buttonrd = -65460;
/*     */   public static final int col_spawn_buttonrd2 = -65461;
/*     */   public static final int col_spawn_buttonyl = -180;
/*     */   public static final int col_spawn_buttonyl2 = -181;
/*     */   public static final int col_spawn_closedoorgrend = -16744689;
/*     */   public static final int col_spawn_closedoorgrend2 = -16726002;
/*     */   public static final int col_spawn_closedoorblend = -16773505;
/*     */   public static final int col_spawn_closedoorblend2 = -15446785;
/*     */   public static final int col_spawn_closedoorrdend = -8450048;
/*     */   public static final int col_spawn_closedoorrdend2 = -65024;
/*     */   public static final int col_spawn_wall1 = -16777216;
/*     */   public static final int col_spawn_wall2 = -12566464;
/*     */   public static final int col_spawn_leftproj = -5111553;
/*     */   public static final int col_spawn_rightproj = -6094593;
/*     */   public static final int col_spawn_sep = -2368551;
/*     */   public static final int col_spawn_sep2 = -5921371;
/*     */   public static final int col_spawn_tubebrk = -28673;
/*     */   public static final int col_spawn_tubebrk2 = -22529;
/*     */   public static final int col_spawn_closedoorgr = -16744690;
/*     */   public static final int col_spawn_closedoorgr2 = -16711792;
/*     */   public static final int col_spawn_closedoorgr3 = -16726514;
/*     */   public static final int col_spawn_closedoorbl = -16773761;
/*     */   public static final int col_spawn_closedoorbl2 = -16740097;
/*     */   public static final int col_spawn_closedoorbl3 = -15447041;
/*     */   public static final int col_spawn_closedoorrd = -8450560;
/*     */   public static final int col_spawn_closedoorrd2 = -65392;
/*     */   public static final int col_spawn_closedoorrd3 = -65536;
/*     */   public static final int col_spawn_closedooryl = -81;
/*     */   public static final int col_spawn_closedooryl2 = -112;
/*     */   public static final int col_exit = -9350097;
/*     */   public static final int col_exit2 = -9350096;
/*     */   public static final int col_spawn_light = -4210753;
/*     */   public static final int col_spawn_light2 = -4210751;
/*     */   public static final int col_spawn_light3 = -4210749;
/*     */   public static final int col_spawn_light4 = -4210747;
/*     */   public static final int col_spawn_light5 = -4210745;
/*     */   public static final int col_spawn_light6 = -4210743;
/*     */   public static final int col_spawn_border1 = -16318375;
/*     */   public static final int col_spawn_border2 = -16318373;
/*     */   public static final int col_spawn_border3 = -16318371;
/*     */   public static final int col_spawn_white = -1642521;
/*     */   public static final int col_spawn_whiteexit = -2431761;
/*     */   public static final int col_enemy = -8416513;
/*     */   public static final int col_enemy2 = -8416001;
/*     */   public static final int col_enemy3 = -8415489;
/*     */   public static final int col_enemy4 = -8414977;
/*     */   public static final int col_enemy5 = -8414465;
/*     */   public static final int col_enemy6 = -8413953;
/*     */   public static final int col_enemy7 = -8413441;
/*     */   public static final int col_enemy8 = -8412929;
/*     */   public static final int col_enemy9 = -8412417;
/*     */   public static final int col_enemy10 = -8411905;
/*     */   public static final int col_enemy11 = -8411393;
/*     */   public static final int col_enemy12 = -8410881;
/*     */   public static final int col_enemy13 = -8410369;
/*     */   public static final int col_enemy14 = -8409857;
/*     */   public static final int col_enemy15 = -8409345;
/*     */   public static final int col_enemy16 = -8408833;
/*     */   public static final int col_enemy17 = -8408321;
/*     */   public static final int col_enemy18 = -8407809;
/*     */   public static final int col_enemy19 = -8407297;
/*     */   public static final int col_enemy20 = -8406785;
/*     */   public static final int col_enemy21 = -8406273;
/*     */   public static final int col_enemy22 = -8405761;
/*     */   public static final int col_enemy23 = -8405249;
/*     */   public static final int col_enemy24 = -8404737;
/*     */   public static final int col_enemy25 = -8404225;
/*     */   public static final int col_wall_end = -8355712;
/*     */   public static final int col_wall_end3 = -8355710;
/*     */   public static final int col_wall_end4 = -8355708;
/*     */   public static final int col_wall_end5 = -8355706;
/*     */   public static final int col_wall_end6 = -8355704;
/*     */   public static final int col_wall_endgr = -16711791;
/*     */   public static final int col_wall_endbl = -16739585;
/*     */   public static final int col_wall_endrd = -65391;
/*     */   public static final int col_wall_endyl = -82;
/*     */   public static final int col_wall_endyl2 = -111;
/*     */   public static final int col_spawn_startpad1tl = -12262144;
/*     */   public static final int col_spawn_startpad1tr = -12262143;
/*     */   public static final int col_spawn_startpad1bl = -12262142;
/*     */   public static final int col_spawn_startpad1br = -12262141;
/*     */   public static final int col_spawn_startpad2tl = -12259328;
/*     */   public static final int col_spawn_startpad2tr = -12259327;
/*     */   public static final int col_spawn_startpad2bl = -12259326;
/*     */   public static final int col_spawn_startpad2br = -12259325;
/*     */   public static final int col_spawn_startpad3tl = -12255488;
/*     */   public static final int col_spawn_startpad3tr = -12255487;
/*     */   public static final int col_spawn_startpad3bl = -12255486;
/*     */   public static final int col_spawn_startpad3br = -12255485;
/*     */   public static final int col_spawn_startpad4tl = -12255484;
/*     */   public static final int col_spawn_startpad4tr = -12255483;
/*     */   public static final int col_spawn_startpad4bl = -12255482;
/*     */   public static final int col_spawn_startpad4br = -12255481;
/*     */   public static final int col_spawn_startpad5tl = -12255472;
/*     */   public static final int col_spawn_startpad5tr = -12255471;
/*     */   public static final int col_spawn_startpad5bl = -12255470;
/*     */   public static final int col_spawn_startpad5br = -12255469;
/*     */   public static final int col_spawn_startpad6tl = -12255468;
/*     */   public static final int col_spawn_startpad6tr = -12255467;
/*     */   public static final int col_spawn_startpad6bl = -12255466;
/*     */   public static final int col_spawn_startpad6br = -12255465;
/*     */   public static final int col_spawn_startpad7tl = -12255456;
/*     */   public static final int col_spawn_startpad7tr = -12255455;
/*     */   public static final int col_spawn_startpad7bl = -12255454;
/*     */   public static final int col_spawn_startpad7br = -12255453;
/*     */   public static final int col_spawn_startpad8tl = -12255452;
/*     */   public static final int col_spawn_startpad8tr = -12255451;
/*     */   public static final int col_spawn_startpad8bl = -12255450;
/*     */   public static final int col_spawn_startpad8br = -12255449;
/*     */   public static final int col_spawn_startpad9tl = -12255440;
/*     */   public static final int col_spawn_startpad9tr = -12255439;
/*     */   public static final int col_spawn_startpad9bl = -12255438;
/*     */   public static final int col_spawn_startpad9br = -12255437;
/*     */   public static final int col_spawn_startpad10tl = -12255436;
/*     */   public static final int col_spawn_startpad10tr = -12255435;
/*     */   public static final int col_spawn_startpad10bl = -12255434;
/*     */   public static final int col_spawn_startpad10br = -12255433;
/*     */   public static final int col_speed_orb = -5864861;
/*     */   public static final int col_temp_orb = -1723511;
/*     */   public static final int col_health_orb = -9414845;
/*     */   public static final int col_rb_orb = -38400;
/*     */   public static final int col_rb_orb2 = -37888;
/*     */   public static final int col_rb_orb3 = -365568;
/*     */   public static final int col_rb_orb4 = -37376;
/*     */   public static final int col_rb_orb5 = -36864;
/*     */   public static final int col_rb_orb6 = -36352;
/*     */   public static final int col_rb_orb7 = -366080;
/*     */   public static final int col_rb_orb8 = -37886;
/*     */   public static final int col_rb_orb9 = -37884;
/*     */   public static final int col_rb_orb10 = -37882;
/*     */   public static final int col_rb_orb11 = -37880;
/*     */   
/*     */   public Tile(Sprite sprite) {
/* 358 */     this.sprite = sprite;
/*     */   }
/*     */ 
/*     */   
/*     */   public void render(int x, int y, Screen screen) {}
/*     */ 
/*     */   
/*     */   public boolean solid() {
/* 366 */     return false;
/*     */   }
/*     */   
/*     */   public boolean sep() {
/* 370 */     return false;
/*     */   }
/*     */   
/*     */   public boolean sep2() {
/* 374 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Andrew\Documents\School Past\Comp Sci Project IB\Quandary Final\Quandary.jar!\com\Static\Blindsided\level\tile\Tile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */