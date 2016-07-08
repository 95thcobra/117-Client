import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public final class PacketDecoder {
	int anInt508;
	int anInt514;
	int anInt515;
	int anInt516;
	int anInt519;
	int anInt520;
	byte aByte521;
	int anInt523;
	byte[] aByteArray524;
	int anInt525;
	int anInt527;
	int anInt529;
	int anInt530;
	int anInt531;
	byte[] aByteArray535;
	int anInt542;
	static int anInt544;
	int anInt546 = 4096;
	int anInt509 = 16;
	int anInt517 = 258;
	int anInt511 = 6;
	int anInt512 = 50;
	int anInt513 = 18002;
	int anInt526 = 0;
	int anInt518 = 0;
	int[] anIntArray528 = new int[256];
	int[] anIntArray538 = new int[257];
	boolean[] aBoolArray545 = new boolean[256];
	boolean[] aBoolArray543 = new boolean[16];
	byte[] aByteArray533 = new byte[256];
	byte[] aByteArray534 = new byte[4096];
	int[] anIntArray510 = new int[16];
	byte[] aByteArray536 = new byte[18002];
	byte[] aByteArray537 = new byte[18002];
	byte[][] aByteArrayArray522 = new byte[6][258];
	int[][] anIntArrayArray539 = new int[6][258];
	int[][] anIntArrayArray532 = new int[6][258];
	int[][] anIntArrayArray540 = new int[6][258];
	int[] anIntArray541 = new int[6];

	static final boolean method279() {
      if(Class131_Sub20_Sub20.loginConnection == null)
		return false;
	else {
         int var3;
         String var4;
         try {
            int var0 = Class131_Sub20_Sub20.loginConnection.available();
            if(var0 == 0)
				return false;

            if(client.incomingPacket == -1) {
               Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0, 1);
               client.gameBuffer.pos = 0;
               client.incomingPacket = client.gameBuffer.readOpcode();
               client.messageSize = Class117.anIntArray845[client.incomingPacket];
               --var0;
            }

            if(client.messageSize == -1) {
               if(var0 <= 0)
				return false;

               Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0, 1);
               client.messageSize = client.gameBuffer.data[0] & 255;
               --var0;
            }

            if(client.messageSize == -2) {
               if(var0 <= 1)
				return false;

               Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0, 2);
               client.gameBuffer.pos = 0;
               client.messageSize = client.gameBuffer.readUShort();
               var0 -= 2;
            }

            if(var0 < client.messageSize)
				return false;

            client.gameBuffer.pos = 0;
            Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0, client.messageSize);
            client.anInt2075 = 0;
            client.anInt2154 = client.anInt2219;
            client.anInt2219 = client.anInt2041 * -1;
            client.anInt2041 = client.incomingPacket * -1;
            int var1;
            if(client.incomingPacket == 43) {
               var1 = client.gameBuffer.readIntV1();
               final Class131_Sub7 var65 = (Class131_Sub7)client.aClass114_2184.method457(var1);
               if(null != var65)
				Class131_Sub6.method553(var65, true);

               if(null != client.aClass131_Sub18_2049) {
                  Class131_Sub20_Sub6.method734(client.aClass131_Sub18_2049);
                  client.aClass131_Sub18_2049 = null;
               }

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 250) {
               client.aBool2271 = true;
               client.anInt2305 = client.gameBuffer.method595();
               Class31.anInt296 = client.gameBuffer.method595();
               Class131_Sub20_Sub7.anInt1493 = client.gameBuffer.readUShort();
               Class72.anInt618 = client.gameBuffer.method595();
               Class131_Sub10.anInt1067 = client.gameBuffer.method595();
               if(Class131_Sub10.anInt1067 >= 100) {
                  Class139.anInt917 = 64 + (client.anInt2305 * 128);
                  Class1.anInt1 = 64 + (Class31.anInt296 * 128);
                  Class46.anInt452 = Class18.method88(Class139.anInt917, Class1.anInt1, Class39.anInt410) - Class131_Sub20_Sub7.anInt1493;
               }

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 32) {// set root pane / window pane
               var1 = client.gameBuffer.readUshortA();
               client.anInt2128 = var1;
               Class131_Sub20_Sub19_Sub2.method925(false);
               Class40.method216(var1);
               Class93.method391(client.anInt2128);

               for(var3 = 0; var3 < 100; ++var3)
				client.aBoolArray2252[var3] = true;

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 94) {
               Class26.method121();
               client.incomingPacket = -1;
               return false;
            }

            if(client.incomingPacket == 73) {
               var1 = client.gameBuffer.method595();
               if(client.gameBuffer.method595() == 0) {
                  client.grandExchangeOffers[var1] = new GrandExchangeOffer();
                  client.gameBuffer.pos += 18;
               } else {
                  --client.gameBuffer.pos;
                  client.grandExchangeOffers[var1] = new GrandExchangeOffer(client.gameBuffer, false);
               }

               client.anInt2297 = client.anInt2298;
               client.incomingPacket = -1;
               return true;
            }

            int var7;
            int var9;
            int var10;
            boolean var64;
            boolean var97;
            if(client.incomingPacket == 137) {
               var4 = client.gameBuffer.method638();
               var3 = client.gameBuffer.readUShort();
               final byte var78 = client.gameBuffer.method584();
               var64 = false;
               if(var78 == -128)
				var64 = true;

               if(var64) {
                  if(Class23.anInt210 == 0) {
                     client.incomingPacket = -1;
                     return true;
                  }

                  var97 = false;

                  for(var7 = 0; (var7 < Class23.anInt210) && (!Class131_Sub20_Sub8.aClass131_Sub13Array1498[var7].aString1106.equals(var4) || (var3 != Class131_Sub20_Sub8.aClass131_Sub13Array1498[var7].anInt1102)); ++var7)
					;

                  if(var7 < Class23.anInt210) {
                     while(var7 < (Class23.anInt210 - 1)) {
                        Class131_Sub20_Sub8.aClass131_Sub13Array1498[var7] = Class131_Sub20_Sub8.aClass131_Sub13Array1498[var7 + 1];
                        ++var7;
                     }

                     --Class23.anInt210;
                     Class131_Sub20_Sub8.aClass131_Sub13Array1498[Class23.anInt210] = null;
                  }
               } else {
                  client.gameBuffer.method638();
                  final Class131_Sub13 var72 = new Class131_Sub13();
                  var72.aString1106 = var4;
                  var72.aString1104 = Class85.method371(var72.aString1106, client.aClass142_2031);
                  var72.anInt1102 = var3;
                  var72.aByte1103 = var78;

                  for(var9 = Class23.anInt210 - 1; var9 >= 0; --var9) {
                     var10 = Class131_Sub20_Sub8.aClass131_Sub13Array1498[var9].aString1104.compareTo(var72.aString1104);
                     if(var10 == 0) {
                        Class131_Sub20_Sub8.aClass131_Sub13Array1498[var9].anInt1102 = var3;
                        Class131_Sub20_Sub8.aClass131_Sub13Array1498[var9].aByte1103 = var78;
                        if(var4.equals(Class131_Sub11.myPlayer.aString2004))
							Class28.aByte259 = var78;

                        client.anInt2277 = client.anInt2298;
                        client.incomingPacket = -1;
                        return true;
                     }

                     if(var10 < 0)
						break;
                  }

                  if(Class23.anInt210 >= Class131_Sub20_Sub8.aClass131_Sub13Array1498.length) {
                     client.incomingPacket = -1;
                     return true;
                  }

                  for(var10 = Class23.anInt210 - 1; var10 > var9; --var10)
					Class131_Sub20_Sub8.aClass131_Sub13Array1498[var10 + 1] = Class131_Sub20_Sub8.aClass131_Sub13Array1498[var10];

                  if(Class23.anInt210 == 0)
					Class131_Sub20_Sub8.aClass131_Sub13Array1498 = new Class131_Sub13[100];

                  Class131_Sub20_Sub8.aClass131_Sub13Array1498[1 + var9] = var72;
                  ++Class23.anInt210;
                  if(var4.equals(Class131_Sub11.myPlayer.aString2004))
					Class28.aByte259 = var78;
               }

               client.anInt2277 = client.anInt2298;
               client.incomingPacket = -1;
               return true;
            }

            boolean var80;
            if(client.incomingPacket == 231) {
               var80 = client.gameBuffer.method595() == 1;
               if(var80) {
                  Class28.aLong256 = Class84.method366(780546663) - client.gameBuffer.method600();
                  Class78.aClass141_646 = new Class141(client.gameBuffer, true);
               } else
				Class78.aClass141_646 = null;

               client.anInt2270 = client.anInt2298;
               client.incomingPacket = -1;
               return true;
            }

            Class131_Sub18 var11;
            if(client.incomingPacket == 232) {
               var1 = client.gameBuffer.readUShort();
               var3 = client.gameBuffer.method630();
               var11 = Class88.method377(var3);
               if((var11 != null) && (var11.anInt1202 == 0)) {
                  if(var1 > (var11.anInt1182 - var11.anInt1291))
					var1 = var11.anInt1182 - var11.anInt1291;

                  if(var1 < 0)
					var1 = 0;

                  if(var1 != var11.anInt1180) {
                     var11.anInt1180 = var1;
                     Class131_Sub20_Sub6.method734(var11);
                  }
               }

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 69) {
               GPI.anInt11 = 0;

               for(var1 = 0; var1 < 2048; ++var1) {
                  GPI.cachedAppearances[var1] = null;
                  GPI.aByteArray22[var1] = 1;
               }

               for(var1 = 0; var1 < 2048; ++var1)
				client.playerArray[var1] = null;

               Class36.initializeGPI(client.gameBuffer);
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 34) {
               Class131_Sub20_Sub16.anInt1625 = client.gameBuffer.method614();
               Class131_Sub20_Sub19_Sub5.anInt1832 = client.gameBuffer.method615();
               client.incomingPacket = -1;
               return true;
            }

            if((client.incomingPacket == 225) || (client.incomingPacket == 46) || (client.incomingPacket == 206) || (client.incomingPacket == 229) || (client.incomingPacket == 230) || (client.incomingPacket == 90) || (client.incomingPacket == 138) || (client.incomingPacket == 175) || (client.incomingPacket == 38) || (client.incomingPacket == 16)) {
               Class46.method231();
               client.incomingPacket = -1;
               return true;
            }

            int var5;
            Class131_Sub18 var74;
            if(client.incomingPacket == 131) {
               var1 = client.gameBuffer.method621();
               var3 = client.gameBuffer.method644();
               var5 = client.gameBuffer.method639();
               var74 = Class88.method377(var3);
               if((var74.anInt1167 != var5) || (var1 != var74.anInt1157) || (var74.anInt1163 != 0) || (var74.anInt1261 != 0)) {
                  var74.anInt1167 = var5;
                  var74.anInt1157 = var1;
                  var74.anInt1163 = 0;
                  var74.anInt1261 = 0;
                  Class131_Sub20_Sub6.method734(var74);
                  Class131_Sub20_Sub3.method706(var74);
                  if(var74.anInt1202 == 0)
					Class16_Sub1.method547(Class131_Sub18.aClass131_Sub18ArrayArray1174[var3 >> 16], var74, false);
               }

               client.incomingPacket = -1;
               return true;
            }

            int var6;
            if(client.incomingPacket == 106) {
               var3 = client.gameBuffer.method595();
               final Class84[] var92 = Class60.method295(-1747730515);
               var6 = 0;

               Class84 var67;
               while(true) {
                  if(var6 >= var92.length) {
                     var67 = null;
                     break;
                  }

                  final Class84 var71 = var92[var6];
                  if(var3 == var71.anInt698) {
                     var67 = var71;
                     break;
                  }

                  ++var6;
               }

               Class131_Sub20_Sub3.aClass84_1424 = var67;
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 36) {
               client.anInt2218 = client.gameBuffer.method595();
               if(client.anInt2218 == 255)
				client.anInt2218 = 0;

               client.anInt2258 = client.gameBuffer.method595();
               if(client.anInt2258 == 255)
				client.anInt2258 = 0;

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 37) {
               for(var1 = 0; var1 < client.playerArray.length; ++var1)
				if(client.playerArray[var1] != null)
					client.playerArray[var1].anInt1703 = -1;

               for(var1 = 0; var1 < client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065.length; ++var1)
				if(null != client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var1])
					client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var1].anInt1703 = -1;

               client.incomingPacket = -1;
               return true;
            }

            int var15;
            if(client.incomingPacket == 65) {
               client.anInt2277 = client.anInt2298;
               if(client.messageSize == 0) {
                  client.aString2250 = null;
                  client.aString2251 = null;
                  Class23.anInt210 = 0;
                  Class131_Sub20_Sub8.aClass131_Sub13Array1498 = null;
                  client.incomingPacket = -1;
                  return true;
               }

               client.aString2251 = client.gameBuffer.method638();
               final long var13 = client.gameBuffer.method600();
               client.aString2250 = Class52.method271(var13);
               Class113.aByte836 = client.gameBuffer.method584();
               var5 = client.gameBuffer.method595();
               if(var5 == 255) {
                  client.incomingPacket = -1;
                  return true;
               }

               Class23.anInt210 = var5;
               final Class131_Sub13[] var81 = new Class131_Sub13[100];

               for(var7 = 0; var7 < Class23.anInt210; ++var7) {
                  var81[var7] = new Class131_Sub13();
                  var81[var7].aString1106 = client.gameBuffer.method638();
                  var81[var7].aString1104 = Class85.method371(var81[var7].aString1106, client.aClass142_2031);
                  var81[var7].anInt1102 = client.gameBuffer.readUShort();
                  var81[var7].aByte1103 = client.gameBuffer.method584();
                  client.gameBuffer.method638();
                  if(var81[var7].aString1106.equals(Class131_Sub11.myPlayer.aString2004))
					Class28.aByte259 = var81[var7].aByte1103;
               }

               var97 = false;
               var10 = Class23.anInt210;

               while(var10 > 0) {
                  var97 = true;
                  --var10;

                  for(var15 = 0; var15 < var10; ++var15)
					if(var81[var15].aString1104.compareTo(var81[1 + var15].aString1104) > 0) {
                        final Class131_Sub13 var93 = var81[var15];
                        var81[var15] = var81[1 + var15];
                        var81[1 + var15] = var93;
                        var97 = false;
                     }

                  if(var97)
					break;
               }

               Class131_Sub20_Sub8.aClass131_Sub13Array1498 = var81;
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 183) {
               var1 = client.gameBuffer.readIntV1();
               var3 = client.gameBuffer.method621();
               var11 = Class88.method377(var1);
               if((var3 != var11.anInt1160) || (var3 == -1)) {
                  var11.anInt1160 = var3;
                  var11.anInt1279 = 0;
                  var11.anInt1147 = 0;
                  Class131_Sub20_Sub6.method734(var11);
               }

               client.incomingPacket = -1;
               return true;
            }

            String var2;
            String var76;
            if(client.incomingPacket == 174) {
               var4 = client.gameBuffer.method638();
               final Class131_Sub14_Sub1 var89 = client.gameBuffer;
               var2 = Class95.method395(var89, 32767);
               var76 = Class131_Sub20_Sub17_Sub4.method1054(Class131_Sub11.method575(var2));
               Class131_Sub20_Sub15.method792(6, var4, var76);
               client.incomingPacket = -1;
               return true;
            }

            Class131_Sub14_Sub1 var60;
            Player var84;
            if(client.incomingPacket == 64) {
               var60 = client.gameBuffer;
               var3 = client.messageSize;
               var5 = var60.pos;
               GPI.anInt21 = 0;
               var6 = 0;
               var60.bitAccess();

               for(var7 = 0; var7 < GPI.anInt11; ++var7) {
                  var9 = GPI.anIntArray17[var7];
                  if((GPI.skipFlags[var9] & 1) == 0)
					if(var6 > 0) {
                        --var6;
                        GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     } else {
                        var10 = var60.getBits(1);
                        if(var10 == 0) {
                           var6 = Class131_Sub20_Sub2.method702(var60);
                           GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                        } else
							Class131_Sub20_Sub18.method866(var60, var9);
                     }
               }

               var60.method876();
               if(var6 != 0)
				throw new RuntimeException();

               var60.bitAccess();

               for(var7 = 0; var7 < GPI.anInt11; ++var7) {
                  var9 = GPI.anIntArray17[var7];
                  if((GPI.skipFlags[var9] & 1) != 0)
					if(var6 > 0) {
                        --var6;
                        GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     } else {
                        var10 = var60.getBits(1);
                        if(var10 == 0) {
                           var6 = Class131_Sub20_Sub2.method702(var60);
                           GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                        } else
							Class131_Sub20_Sub18.method866(var60, var9);
                     }
               }

               var60.method876();
               if(var6 != 0)
				throw new RuntimeException();

               var60.bitAccess();

               for(var7 = 0; var7 < GPI.globalPlayerCount; ++var7) {
                  var9 = GPI.globalPlayerIndices[var7];
                  if((GPI.skipFlags[var9] & 1) != 0)
					if(var6 > 0) {
                        --var6;
                        GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     } else {
                        var10 = var60.getBits(1);
                        if(var10 == 0) {
                           var6 = Class131_Sub20_Sub2.method702(var60);
                           GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                        } else if(Class61.method297(var60, var9))
							GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     }
               }

               var60.method876();
               if(var6 != 0)
				throw new RuntimeException();

               var60.bitAccess();

               for(var7 = 0; var7 < GPI.globalPlayerCount; ++var7) {
                  var9 = GPI.globalPlayerIndices[var7];
                  if((GPI.skipFlags[var9] & 1) == 0)
					if(var6 > 0) {
                        --var6;
                        GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     } else {
                        var10 = var60.getBits(1);
                        if(var10 == 0) {
                           var6 = Class131_Sub20_Sub2.method702(var60);
                           GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                        } else if(Class61.method297(var60, var9))
							GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     }
               }

               var60.method876();
               if(var6 != 0)
				throw new RuntimeException();

               GPI.anInt11 = 0;
               GPI.globalPlayerCount = 0;

               for(var7 = 1; var7 < 2048; ++var7) {
                  GPI.skipFlags[var7] = (byte)(GPI.skipFlags[var7] >> 1);
                  var84 = client.playerArray[var7];
                  if(var84 != null)
					GPI.anIntArray17[++GPI.anInt11 - 1] = var7;
				else
					GPI.globalPlayerIndices[++GPI.globalPlayerCount - 1] = var7;
               }

               for(var6 = 0; var6 < GPI.anInt21; ++var6) {
                  var7 = GPI.anIntArray23[var6];
                  var84 = client.playerArray[var7];
                  var10 = var60.method595();
                  if((var10 & 8) != 0)
					var10 += var60.method595() << 8;

                  Class131_Sub20_Sub16.method840(var60, var7, var84, var10);
               }

               if(var3 != (var60.pos - var5))
				throw new RuntimeException((var60.pos - var5) + " " + var3);

               client.incomingPacket = -1;
               return true;
            }
            
            System.out.println("Incoming packet: " + client.incomingPacket);

            // Display map region (instanced)
            if(client.incomingPacket == 148) {
               Class78.drawMapRegion(true);
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 23) {
               for(var1 = 0; var1 < Class65.anInt594; ++var1) {
                  final Class131_Sub20_Sub15 var63 = Class99.method399(var1);
                  if(var63 != null) {
                     Class96.anIntArray764[var1] = 0;
                     Class96.anIntArray766[var1] = 0;
                  }
               }

               Class84.method367();
               client.anInt2027 += 32;
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 55) {
               var4 = client.gameBuffer.method638();
               var3 = client.gameBuffer.method630();
               var11 = Class88.method377(var3);
               if(!var4.equals(var11.aString1218)) {
                  var11.aString1218 = var4;
                  Class131_Sub20_Sub6.method734(var11);
               }

               client.incomingPacket = -1;
               return true;
            }

            boolean var19;
            String var73;
            if(client.incomingPacket == 48) {
               while(client.gameBuffer.pos < client.messageSize) {
                  var80 = client.gameBuffer.method595() == 1;
                  var2 = client.gameBuffer.method638();
                  var73 = client.gameBuffer.method638();
                  var6 = client.gameBuffer.readUShort();
                  var7 = client.gameBuffer.method595();
                  var9 = client.gameBuffer.method595();
                  final boolean var85 = (var9 & 2) != 0;
                  final boolean var82 = (var9 & 1) != 0;
                  if(var6 > 0) {
                     client.gameBuffer.method638();
                     client.gameBuffer.method595();
                     client.gameBuffer.readIntV1();
                  }

                  client.gameBuffer.method638();

                  for(int var90 = 0; var90 < client.anInt2290; ++var90) {
                     final Class44 var91 = client.aClass44Array2292[var90];
                     if(!var80) {
                        if(var2.equals(var91.aString442)) {
                           if(var91.anInt438 != var6) {
                              var19 = true;

                              for(Class126_Sub1 var94 = (Class126_Sub1)client.aClass112_2293.method453(); var94 != null; var94 = (Class126_Sub1)client.aClass112_2293.method454())
								if(var94.aString949.equals(var2))
									if((var6 != 0) && (var94.aShort950 == 0)) {
                                       var94.method490();
                                       var19 = false;
                                    } else if((var6 == 0) && (var94.aShort950 != 0)) {
                                       var94.method490();
                                       var19 = false;
                                    }

                              if(var19)
								client.aClass112_2293.method452(new Class126_Sub1(var2, var6));

                              var91.anInt438 = var6;
                           }

                           var91.aString437 = var73;
                           var91.anInt445 = var7;
                           var91.aBool439 = var85;
                           var91.aBool440 = var82;
                           var2 = null;
                           break;
                        }
                     } else if(var73.equals(var91.aString442)) {
                        var91.aString442 = var2;
                        var91.aString437 = var73;
                        var2 = null;
                        break;
                     }
                  }

                  if((null != var2) && (client.anInt2290 < 400)) {
                     final Class44 var21 = new Class44();
                     client.aClass44Array2292[client.anInt2290] = var21;
                     var21.aString442 = var2;
                     var21.aString437 = var73;
                     var21.anInt438 = var6;
                     var21.anInt445 = var7;
                     var21.aBool439 = var85;
                     var21.aBool440 = var82;
                     ++client.anInt2290;
                  }
               }

               client.anInt2134 = 2;
               client.anInt2216 = client.anInt2298;
               var80 = false;
               var3 = client.anInt2290;

               while(var3 > 0) {
                  var80 = true;
                  --var3;

                  for(var5 = 0; var5 < var3; ++var5) {
                     var64 = false;
                     final Class44 var70 = client.aClass44Array2292[var5];
                     final Class44 var88 = client.aClass44Array2292[var5 + 1];
                     if((var70.anInt438 != client.anInt2123) && (var88.anInt438 == client.anInt2123))
						var64 = true;

                     if(!var64 && (var70.anInt438 == 0) && (var88.anInt438 != 0))
						var64 = true;

                     if(!var64 && !var70.aBool439 && var88.aBool439)
						var64 = true;

                     if(!var64 && !var70.aBool440 && var88.aBool440)
						var64 = true;

                     if(var64) {
                        final Class44 var96 = client.aClass44Array2292[var5];
                        client.aClass44Array2292[var5] = client.aClass44Array2292[var5 + 1];
                        client.aClass44Array2292[1 + var5] = var96;
                        var80 = false;
                     }
                  }

                  if(var80)
					break;
               }

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 51) {
               Class84.method367();
               client.anInt2189 = client.gameBuffer.readShort();
               client.anInt2263 = client.anInt2298;
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 20) {
               var1 = client.gameBuffer.method630();
               var3 = client.gameBuffer.readULEShortA();
               var11 = Class88.method377(var1);
               if((var11.anInt1201 != 2) || (var11.anInt1172 != var3)) {
                  var11.anInt1201 = 2;
                  var11.anInt1172 = var3;
                  Class131_Sub20_Sub6.method734(var11);
               }

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 191) {
               if(client.anInt2128 != -1)
				Class131_Sub20_Sub19_Sub2_Sub1.method1065(client.anInt2128, 0);

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 176) {
               client.anInt2046 = client.gameBuffer.readUShort() * 30;
               client.anInt2263 = client.anInt2298;
               client.incomingPacket = -1;
               return true;
            }

            Class131_Sub18 var69;
            if(client.incomingPacket == 214) {
               var1 = client.gameBuffer.readUShort();
               var3 = client.gameBuffer.readUShort();
               var5 = client.gameBuffer.method630();
               var6 = client.gameBuffer.readULEShortA();
               var69 = Class88.method377(var5);
               if((var6 != var69.anInt1209) || (var69.anInt1210 != var1) || (var69.anInt1277 != var3)) {
                  var69.anInt1209 = var6;
                  var69.anInt1210 = var1;
                  var69.anInt1277 = var3;
                  Class131_Sub20_Sub6.method734(var69);
               }

               client.incomingPacket = -1;
               return true;
            }

            Class131_Sub18 var55;
            if(client.incomingPacket == 14) {
               var1 = client.gameBuffer.method628();
               var55 = Class88.method377(var1);
               var55.anInt1201 = 3;
               var55.anInt1172 = Class131_Sub11.myPlayer.aClass91_1980.method385();
               Class131_Sub20_Sub6.method734(var55);
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 217) {
               Class16.method63(client.gameBuffer);
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 96) {
               Class131_Sub20_Sub19_Sub5.anInt1832 = client.gameBuffer.method614();
               Class131_Sub20_Sub16.anInt1625 = client.gameBuffer.method616();

               for(var1 = Class131_Sub20_Sub19_Sub5.anInt1832; var1 < (8 + Class131_Sub20_Sub19_Sub5.anInt1832); ++var1)
				for(var3 = Class131_Sub20_Sub16.anInt1625; var3 < (8 + Class131_Sub20_Sub16.anInt1625); ++var3)
					if(client.aClass115ArrayArrayArray2306[Class39.anInt410][var1][var3] != null) {
                        client.aClass115ArrayArrayArray2306[Class39.anInt410][var1][var3] = null;
                        Class131_Sub19.method676(var1, var3);
                     }

               for(Class131_Sub9 var62 = (Class131_Sub9)client.aClass115_2158.method465(); null != var62; var62 = (Class131_Sub9)client.aClass115_2158.method468())
				if((var62.anInt1045 >= Class131_Sub20_Sub19_Sub5.anInt1832) && (var62.anInt1045 < (8 + Class131_Sub20_Sub19_Sub5.anInt1832)) && (var62.anInt1043 >= Class131_Sub20_Sub16.anInt1625) && (var62.anInt1043 < (Class131_Sub20_Sub16.anInt1625 + 8)) && (var62.anInt1052 == Class39.anInt410))
					var62.anInt1050 = 0;

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 211) {
               client.gameBuffer.pos += 28;
               if(client.gameBuffer.method611()) {
                  var60 = client.gameBuffer;
                  var3 = client.gameBuffer.pos - 28;
                  if(Class72.aClass140_617 != null)
					try {
                        Class72.aClass140_617.method510(0L);
                        Class72.aClass140_617.method516(var60.data, var3, 24);
                     } catch (final Exception var50) {
                        ;
                     }
               }

               client.incomingPacket = -1;
               return true;
            }

            Class131_Sub14_Sub1 var58;
            if(client.incomingPacket == 33) {
               GPI.thisIsActuallyMapRegion(true);
               client.gameBuffer.readOpcode();
               var1 = client.gameBuffer.readUShort();
               var58 = client.gameBuffer;
               var5 = var58.pos;
               GPI.anInt21 = 0;
               var6 = 0;
               var58.bitAccess();

               for(var7 = 0; var7 < GPI.anInt11; ++var7) {
                  var9 = GPI.anIntArray17[var7];
                  if((GPI.skipFlags[var9] & 1) == 0)
					if(var6 > 0) {
                        --var6;
                        GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     } else {
                        var10 = var58.getBits(1);
                        if(var10 == 0) {
                           var6 = Class131_Sub20_Sub2.method702(var58);
                           GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                        } else
							Class131_Sub20_Sub18.method866(var58, var9);
                     }
               }

               var58.method876();
               if(var6 != 0)
				throw new RuntimeException();

               var58.bitAccess();

               for(var7 = 0; var7 < GPI.anInt11; ++var7) {
                  var9 = GPI.anIntArray17[var7];
                  if((GPI.skipFlags[var9] & 1) != 0)
					if(var6 > 0) {
                        --var6;
                        GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     } else {
                        var10 = var58.getBits(1);
                        if(var10 == 0) {
                           var6 = Class131_Sub20_Sub2.method702(var58);
                           GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                        } else
							Class131_Sub20_Sub18.method866(var58, var9);
                     }
               }

               var58.method876();
               if(var6 != 0)
				throw new RuntimeException();

               var58.bitAccess();

               for(var7 = 0; var7 < GPI.globalPlayerCount; ++var7) {
                  var9 = GPI.globalPlayerIndices[var7];
                  if((GPI.skipFlags[var9] & 1) != 0)
					if(var6 > 0) {
                        --var6;
                        GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     } else {
                        var10 = var58.getBits(1);
                        if(var10 == 0) {
                           var6 = Class131_Sub20_Sub2.method702(var58);
                           GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                        } else if(Class61.method297(var58, var9))
							GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     }
               }

               var58.method876();
               if(var6 != 0)
				throw new RuntimeException();

               var58.bitAccess();

               for(var7 = 0; var7 < GPI.globalPlayerCount; ++var7) {
                  var9 = GPI.globalPlayerIndices[var7];
                  if((GPI.skipFlags[var9] & 1) == 0)
					if(var6 > 0) {
                        --var6;
                        GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     } else {
                        var10 = var58.getBits(1);
                        if(var10 == 0) {
                           var6 = Class131_Sub20_Sub2.method702(var58);
                           GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                        } else if(Class61.method297(var58, var9))
							GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     }
               }

               var58.method876();
               if(var6 != 0)
				throw new RuntimeException();

               GPI.anInt11 = 0;
               GPI.globalPlayerCount = 0;

               for(var7 = 1; var7 < 2048; ++var7) {
                  GPI.skipFlags[var7] = (byte)(GPI.skipFlags[var7] >> 1);
                  var84 = client.playerArray[var7];
                  if(var84 != null)
					GPI.anIntArray17[++GPI.anInt11 - 1] = var7;
				else
					GPI.globalPlayerIndices[++GPI.globalPlayerCount - 1] = var7;
               }

               for(var6 = 0; var6 < GPI.anInt21; ++var6) {
                  var7 = GPI.anIntArray23[var6];
                  var84 = client.playerArray[var7];
                  var10 = var58.method595();
                  if((var10 & 8) != 0)
					var10 += var58.method595() << 8;

                  Class131_Sub20_Sub16.method840(var58, var7, var84, var10);
               }

               if(var1 != (var58.pos - var5))
				throw new RuntimeException((var58.pos - var5) + " " + var1);

               client.incomingPacket = -1;
               return true;
            }

            String var20;
            long var23;
            long var25;
            int var33;
            String var34;
            if(client.incomingPacket == 132) {
               var4 = client.gameBuffer.method638();
               var23 = client.gameBuffer.readUShort();
               var25 = client.gameBuffer.method598();
               final Class82 var87 = (Class82)Class39.method214(Class42.method221(), client.gameBuffer.method595());
               final long var27 = var25 + (var23 << 32);
               boolean var17 = false;

               for(int var29 = 0; var29 < 100; ++var29)
				if(var27 == client.aLongArray2244[var29]) {
                     var17 = true;
                     break;
                  }

               if(Player.method1075(var4))
				var17 = true;

               if(!var17 && (client.anInt2146 == 0)) {
                  client.aLongArray2244[client.anInt2245] = var27;
                  client.anInt2245 = (1 + client.anInt2245) % 100;
                  final Class131_Sub14_Sub1 var30 = client.gameBuffer;
                  final String var18 = Class95.method395(var30, 32767);
                  var20 = Class131_Sub20_Sub17_Sub4.method1054(Class131_Sub11.method575(var18));
                  byte var31;
                  if(var87.aBool690)
					var31 = 7;
				else
					var31 = 3;

                  if(var87.anInt689 != -1) {
                     var33 = var87.anInt689;
                     var34 = "<img=" + var33 + ">";
                     Class131_Sub20_Sub15.method792(var31, var34 + var4, var20);
                  } else
					Class131_Sub20_Sub15.method792(var31, var4, var20);
               }

               client.incomingPacket = -1;
               return true;
            }

            // Display map region
            if(client.incomingPacket == 213) {
               Class78.drawMapRegion(false);
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 66) {
               Class32.method140(client.gameBuffer.method638());
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 82) {
               client.anInt2259 = client.gameBuffer.method595();
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 113) {
               var1 = client.gameBuffer.readUshortA();
               var3 = client.gameBuffer.method628();
               var11 = Class88.method377(var3);
               if((var11.anInt1201 != 1) || (var1 != var11.anInt1172)) {
                  var11.anInt1201 = 1;
                  var11.anInt1172 = var1;
                  Class131_Sub20_Sub6.method734(var11);
               }

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 180) {
               final Class30 var59 = new Class30();
               var59.aString281 = client.gameBuffer.method638();
               var59.anInt278 = client.gameBuffer.readUShort();
               var3 = client.gameBuffer.readIntV1();
               var59.anInt279 = var3;
               Class32.method142(45);
               Class131_Sub20_Sub20.loginConnection.method373();
               Class131_Sub20_Sub20.loginConnection = null;
               Class63.method304(var59);
               client.incomingPacket = -1;
               return false;
            }

            Class131_Sub7 var12;
            if(client.incomingPacket == 147) {
               var1 = client.gameBuffer.method630();
               var3 = client.gameBuffer.method628();
               final Class131_Sub7 var86 = (Class131_Sub7)client.aClass114_2184.method457(var3);
               var12 = (Class131_Sub7)client.aClass114_2184.method457(var1);
               if(var12 != null)
				Class131_Sub6.method553(var12, (null == var86) || (var12.anInt1025 != var86.anInt1025));

               if(var86 != null) {
                  var86.method501();
                  client.aClass114_2184.method461(var86, var1);
               }

               var69 = Class88.method377(var3);
               if(var69 != null)
				Class131_Sub20_Sub6.method734(var69);

               var69 = Class88.method377(var1);
               if(var69 != null) {
                  Class131_Sub20_Sub6.method734(var69);
                  Class16_Sub1.method547(Class131_Sub18.aClass131_Sub18ArrayArray1174[var69.anInt1272 >>> 16], var69, true);
               }

               if(client.anInt2128 != -1)
				Class131_Sub20_Sub19_Sub2_Sub1.method1065(client.anInt2128, 1);

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 56) {
               Class84.method367();
               var1 = client.gameBuffer.method614();
               var3 = client.gameBuffer.method630();
               var5 = client.gameBuffer.method615();
               client.anIntArray2163[var1] = var3;
               client.anIntArray2161[var1] = var5;
               client.anIntArray2162[var1] = 1;

               for(var6 = 0; var6 < 98; ++var6)
				if(var3 >= Class90.anIntArray728[var6])
					client.anIntArray2162[var1] = var6 + 2;

               client.anIntArray2213[(++client.anInt2214 - 1) & 31] = var1;
               client.incomingPacket = -1;
               return true;
            }

            long var37;
            if(client.incomingPacket == 125) {
               var1 = client.gameBuffer.readIntV1();
               var3 = client.gameBuffer.readIntV1();
               if((null == Class117.aGarbageCollectorMXBean846) || !Class117.aGarbageCollectorMXBean846.isValid())
				try {
                     final Iterator var83 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

                     while(var83.hasNext()) {
                        final GarbageCollectorMXBean var79 = (GarbageCollectorMXBean)var83.next();
                        if(var79.isValid()) {
                           Class117.aGarbageCollectorMXBean846 = var79;
                           client.aLong2220 = -1L;
                           client.aLong2102 = -1L;
                        }
                     }
                  } catch (final Throwable var51) {
                     ;
                  }

               final long var35 = Class84.method366(780546663);
               var7 = -1;
               if(null != Class117.aGarbageCollectorMXBean846) {
                  var37 = Class117.aGarbageCollectorMXBean846.getCollectionTime();
                  if(-1L != client.aLong2102) {
                     final long var39 = var37 - client.aLong2102;
                     final long var41 = var35 - client.aLong2220;
                     if(0L != var41)
						var7 = (int)((100L * var39) / var41);
                  }

                  client.aLong2102 = var37;
                  client.aLong2220 = var35;
               }

               client.secureBuffer.method871(184);
               client.secureBuffer.writeByte(var7);
               client.secureBuffer.writeInt(var1);
               client.secureBuffer.method625(var3);
               client.secureBuffer.method613(Applet_Sub1.anInt2009);
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 104) {
               client.aBool2271 = false;

               for(var1 = 0; var1 < 5; ++var1)
				client.aBoolArray2261[var1] = false;

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 177) {
               var1 = client.gameBuffer.method630();
               var3 = client.gameBuffer.readUShort();
               var5 = (var3 >> 10) & 31;
               var6 = (var3 >> 5) & 31;
               var7 = var3 & 31;
               var9 = (var5 << 19) + (var6 << 11) + (var7 << 3);
               final Class131_Sub18 var95 = Class88.method377(var1);
               if(var9 != var95.anInt1183) {
                  var95.anInt1183 = var9;
                  Class131_Sub20_Sub6.method734(var95);
               }

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 249) {
               for(var1 = 0; var1 < Class96.anIntArray766.length; ++var1)
				if(Class96.anIntArray764[var1] != Class96.anIntArray766[var1]) {
                     Class96.anIntArray766[var1] = Class96.anIntArray764[var1];
                     Class24.method117(var1);
                     client.anIntArray2145[(++client.anInt2027 - 1) & 31] = var1;
                  }

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 195) {
               var1 = client.gameBuffer.readUShort();
               if(var1 == '\uffff')
				var1 = -1;

               var3 = client.gameBuffer.method628();
               var5 = client.gameBuffer.method630();
               var74 = Class88.method377(var3);
               Class131_Sub20_Sub2 var68;
               if(!var74.aBool1263) {
                  if(var1 == -1) {
                     var74.anInt1201 = 0;
                     client.incomingPacket = -1;
                     return true;
                  }

                  var68 = Class79_Sub1.method645(var1, (short)10850);
                  var74.anInt1201 = 4;
                  var74.anInt1172 = var1;
                  var74.anInt1209 = var68.anInt1376;
                  var74.anInt1210 = var68.anInt1386;
                  var74.anInt1277 = (var68.anInt1384 * 100) / var5;
                  Class131_Sub20_Sub6.method734(var74);
               } else {
                  var74.anInt1168 = var1;
                  var74.anInt1198 = var5;
                  var68 = Class79_Sub1.method645(var1, (short)32211);
                  var74.anInt1209 = var68.anInt1376;
                  var74.anInt1210 = var68.anInt1386;
                  var74.anInt1150 = var68.anInt1388;
                  var74.anInt1207 = var68.anInt1390;
                  var74.anInt1208 = var68.anInt1389;
                  var74.anInt1277 = var68.anInt1384;
                  if(var68.anInt1408 == 1)
					var74.anInt1216 = 1;
				else
					var74.anInt1216 = 2;

                  if(var74.anInt1213 > 0)
					var74.anInt1277 = (var74.anInt1277 * 32) / var74.anInt1213;
				else if(var74.anInt1229 > 0)
					var74.anInt1277 = (var74.anInt1277 * 32) / var74.anInt1229;

                  Class131_Sub20_Sub6.method734(var74);
               }

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 251) {
               client.anInt2134 = 1;
               client.anInt2216 = client.anInt2298;
               client.incomingPacket = -1;
               return true;
            }

            long var43;
            if(client.incomingPacket == 84) {
               var1 = client.gameBuffer.pos + client.messageSize;
               var3 = client.gameBuffer.readUShort();
               var5 = client.gameBuffer.readUShort();
               if(var3 != client.anInt2128) {
                  client.anInt2128 = var3;
                  Class131_Sub20_Sub19_Sub2.method925(false);
                  Class40.method216(client.anInt2128);
                  Class93.method391(client.anInt2128);

                  for(var6 = 0; var6 < 100; ++var6)
					client.aBoolArray2252[var6] = true;
               }

               Class131_Sub7 var22;
               for(; var5-- > 0; var22.aBool1029 = true) {
                  var6 = client.gameBuffer.readIntV1();
                  var7 = client.gameBuffer.readUShort();
                  var9 = client.gameBuffer.method595();
                  var22 = (Class131_Sub7)client.aClass114_2184.method457(var6);
                  if((null != var22) && (var22.anInt1025 != var7)) {
                     Class131_Sub6.method553(var22, true);
                     var22 = null;
                  }

                  if(null == var22)
					var22 = Class131_Sub10.method572(var6, var7, var9);
               }

               for(var12 = (Class131_Sub7)client.aClass114_2184.method460(); var12 != null; var12 = (Class131_Sub7)client.aClass114_2184.method458())
				if(var12.aBool1029)
					var12.aBool1029 = false;
				else
					Class131_Sub6.method553(var12, true);

               client.aClass114_2225 = new Class114(512);

               while(client.gameBuffer.pos < var1) {
                  var6 = client.gameBuffer.readIntV1();
                  var7 = client.gameBuffer.readUShort();
                  var9 = client.gameBuffer.readUShort();
                  var10 = client.gameBuffer.readIntV1();

                  for(var15 = var7; var15 <= var9; ++var15) {
                     var43 = var15 + ((long)var6 << 32);
                     client.aClass114_2225.method461(new Class131_Sub21(var10), var43);
                  }
               }

               client.incomingPacket = -1;
               return true;
            }

            // Decode map region
            if(client.incomingPacket == 42) {
            	System.out.println("packet is 42");
               GPI.thisIsActuallyMapRegion(false);
               client.gameBuffer.readOpcode();
               var1 = client.gameBuffer.readUShort();
               var58 = client.gameBuffer;
               var5 = var58.pos;
               GPI.anInt21 = 0;
               var6 = 0;
               var58.bitAccess();

               for(var7 = 0; var7 < GPI.anInt11; ++var7) {
                  var9 = GPI.anIntArray17[var7];
                  if((GPI.skipFlags[var9] & 1) == 0)
					if(var6 > 0) {
                        --var6;
                        GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     } else {
                        var10 = var58.getBits(1);
                        if(var10 == 0) {
                           var6 = Class131_Sub20_Sub2.method702(var58);
                           GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                        } else
							Class131_Sub20_Sub18.method866(var58, var9);
                     }
               }

               var58.method876();
               if(var6 != 0)
				throw new RuntimeException();

               var58.bitAccess();

               for(var7 = 0; var7 < GPI.anInt11; ++var7) {
                  var9 = GPI.anIntArray17[var7];
                  if((GPI.skipFlags[var9] & 1) != 0)
					if(var6 > 0) {
                        --var6;
                        GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     } else {
                        var10 = var58.getBits(1);
                        if(var10 == 0) {
                           var6 = Class131_Sub20_Sub2.method702(var58);
                           GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                        } else
							Class131_Sub20_Sub18.method866(var58, var9);
                     }
               }

               var58.method876();
               if(var6 != 0)
				throw new RuntimeException();

               var58.bitAccess();

               for(var7 = 0; var7 < GPI.globalPlayerCount; ++var7) {
                  var9 = GPI.globalPlayerIndices[var7];
                  if((GPI.skipFlags[var9] & 1) != 0)
					if(var6 > 0) {
                        --var6;
                        GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     } else {
                        var10 = var58.getBits(1);
                        if(var10 == 0) {
                           var6 = Class131_Sub20_Sub2.method702(var58);
                           GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                        } else if(Class61.method297(var58, var9))
							GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     }
               }

               var58.method876();
               if(var6 != 0)
				throw new RuntimeException();

               var58.bitAccess();

               for(var7 = 0; var7 < GPI.globalPlayerCount; ++var7) {
                  var9 = GPI.globalPlayerIndices[var7];
                  if((GPI.skipFlags[var9] & 1) == 0)
					if(var6 > 0) {
                        --var6;
                        GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     } else {
                        var10 = var58.getBits(1);
                        if(var10 == 0) {
                           var6 = Class131_Sub20_Sub2.method702(var58);
                           GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                        } else if(Class61.method297(var58, var9))
							GPI.skipFlags[var9] = (byte)(GPI.skipFlags[var9] | 2);
                     }
               }

               var58.method876();
               if(var6 != 0)
				throw new RuntimeException();

               GPI.anInt11 = 0;
               GPI.globalPlayerCount = 0;

               for(var7 = 1; var7 < 2048; ++var7) {
                  GPI.skipFlags[var7] = (byte)(GPI.skipFlags[var7] >> 1);
                  var84 = client.playerArray[var7];
                  if(var84 != null)
					GPI.anIntArray17[++GPI.anInt11 - 1] = var7;
				else
					GPI.globalPlayerIndices[++GPI.globalPlayerCount - 1] = var7;
               }

               for(var6 = 0; var6 < GPI.anInt21; ++var6) {
                  var7 = GPI.anIntArray23[var6];
                  var84 = client.playerArray[var7];
                  var10 = var58.method595();
                  if((var10 & 8) != 0)
					var10 += var58.method595() << 8;

                  Class131_Sub20_Sub16.method840(var58, var7, var84, var10);
               }

               if((var58.pos - var5) != var1)
				throw new RuntimeException((var58.pos - var5) + " " + var1);

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 171) {
               var1 = client.gameBuffer.readULEShortA();
               final Class131_Sub11 var57 = (Class131_Sub11)Class131_Sub11.aClass114_1074.method457(var1);
               if(var57 != null)
				var57.method501();

               client.anIntArray2211[(++client.anInt2212 - 1) & 31] = var1 & 32767;
               client.incomingPacket = -1;
               return true;
            }

            boolean var61;
            if(client.incomingPacket == 81) {
               for(; client.gameBuffer.pos < client.messageSize;) {
                  var1 = client.gameBuffer.method595();
                  var61 = (var1 & 1) == 1;
                  var73 = client.gameBuffer.method638();
                  var76 = client.gameBuffer.method638();
                  client.gameBuffer.method638();

                  for(var7 = 0; var7 < client.anInt2294; ++var7) {
                     final Class36 var16 = client.aClass36Array2295[var7];
                     if(var61) {
                        if(var76.equals(var16.aString369)) {
                           var16.aString369 = var73;
                           var16.aString372 = var76;
                           var11 = null;
                           break;
                        }
                     } else if(var73.equals(var16.aString369)) {
                        var16.aString369 = var73;
                        var16.aString372 = var76;
                        var11 = null;
                        break;
                     }
                  }
               }

               client.anInt2216 = client.anInt2298;
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 3) {
               var1 = client.gameBuffer.readUshortA();
               if(var1 == '\uffff')
				var1 = -1;

               if((var1 == -1) && !client.aBool2262)
				Class126_Sub1.method524();
			else if((var1 != -1) && (var1 != client.anInt2052) && (client.anInt2260 != 0) && !client.aBool2262) {
                  final Class100_Sub1 var56 = Class44.aClass100_Sub1_446;
                  var5 = client.anInt2260;
                  Class113.anInt830 = 1;
                  Class50.aClass100_495 = var56;
                  Class24.anInt213 = var1;
                  Class130.anInt901 = 0;
                  Class113.anInt833 = var5;
                  Class50.aBool496 = false;
                  Class113.anInt834 = 2;
               }

               client.anInt2052 = var1;
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 167) {
               var1 = client.gameBuffer.method598();
               var3 = client.gameBuffer.readUshortA();
               if(var3 == '\uffff')
				var3 = -1;

               if((client.anInt2260 != 0) && (var3 != -1)) {
                  Class23.method108(Class82.aClass100_Sub1_686, var3, 0, client.anInt2260, false);
                  client.aBool2262 = true;
               }

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 178) {
               var1 = client.gameBuffer.method630();
               var55 = Class88.method377(var1);

               for(var5 = 0; var5 < var55.anIntArray1292.length; ++var5) {
                  var55.anIntArray1292[var5] = -1;
                  var55.anIntArray1292[var5] = 0;
               }

               Class131_Sub20_Sub6.method734(var55);
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 74) {
               var1 = client.gameBuffer.readIntV1();
               var3 = client.gameBuffer.readUShort();
               if(var1 < -70000)
				var3 += '\u8000';

               if(var1 >= 0)
				var11 = Class88.method377(var1);
			else
				var11 = null;

               final Class131_Sub11 var75 = (Class131_Sub11)Class131_Sub11.aClass114_1074.method457(var3);
               if(null != var75)
				for(var7 = 0; var7 < var75.anIntArray1070.length; ++var7) {
                     var75.anIntArray1070[var7] = -1;
                     var75.anIntArray1071[var7] = 0;
                  }

               var6 = client.gameBuffer.readUShort();

               for(var7 = 0; var7 < var6; ++var7) {
                  var9 = client.gameBuffer.readULEShortA();
                  var10 = client.gameBuffer.method614();
                  if(var10 == 255)
					var10 = client.gameBuffer.method630();

                  if((var11 != null) && (var7 < var11.anIntArray1292.length)) {
                     var11.anIntArray1292[var7] = var9;
                     var11.anIntArray1154[var7] = var10;
                  }

                  Class1.method17(var3, var7, var9 - 1, var10);
               }

               if(null != var11)
				Class131_Sub20_Sub6.method734(var11);

               Class84.method367();
               client.anIntArray2211[(++client.anInt2212 - 1) & 31] = var3 & 32767;
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 8) {
               var1 = client.gameBuffer.readIntV1();
               var3 = client.gameBuffer.readIntV1();
               var5 = client.gameBuffer.readUShort();
               if(var5 == '\uffff')
				var5 = -1;

               var6 = client.gameBuffer.readUshortA();
               if(var6 == '\uffff')
				var6 = -1;

               for(var7 = var5; var7 <= var6; ++var7) {
                  var37 = ((long)var1 << 32) + var7;
                  final Class131 var98 = client.aClass114_2225.method457(var37);
                  if(null != var98)
					var98.method501();

                  client.aClass114_2225.method461(new Class131_Sub21(var3), var37);
               }

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 47) {
               var1 = client.gameBuffer.readUshortA();
               final byte var66 = client.gameBuffer.method584();
               Class96.anIntArray764[var1] = var66;
               if(Class96.anIntArray766[var1] != var66)
				Class96.anIntArray766[var1] = var66;

               Class24.method117(var1);
               client.anIntArray2145[(++client.anInt2027 - 1) & 31] = var1;
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 241) {
               var1 = client.gameBuffer.method595();
               var3 = client.gameBuffer.method595();
               var5 = client.gameBuffer.method595();
               var6 = client.gameBuffer.method595();
               client.aBoolArray2261[var1] = true;
               client.anIntArray2273[var1] = var3;
               client.anIntArray2274[var1] = var5;
               client.anIntArray2275[var1] = var6;
               client.anIntArray2276[var1] = 0;
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 126) {
               var4 = client.gameBuffer.method638();
               final Object[] var54 = new Object[var4.length() + 1];

               for(var5 = var4.length() - 1; var5 >= 0; --var5)
				if(var4.charAt(var5) == 115)
					var54[1 + var5] = client.gameBuffer.method638();
				else
					var54[var5 + 1] = new Integer(client.gameBuffer.readIntV1());

               var54[0] = new Integer(client.gameBuffer.readIntV1());
               final Class131_Sub10 var77 = new Class131_Sub10();
               var77.anObjectArray1056 = var54;
               NpcFlags.method24(var77, 200000);
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 135) {
               client.anInt2193 = client.gameBuffer.method595();
               if(client.anInt2193 == 1)
				client.anInt2048 = client.gameBuffer.readUShort();

               if((client.anInt2193 >= 2) && (client.anInt2193 <= 6)) {
                  if(client.anInt2193 == 2) {
                     client.anInt2053 = 64;
                     client.anInt2054 = 64;
                  }

                  if(client.anInt2193 == 3) {
                     client.anInt2053 = 0;
                     client.anInt2054 = 64;
                  }

                  if(client.anInt2193 == 4) {
                     client.anInt2053 = 128;
                     client.anInt2054 = 64;
                  }

                  if(client.anInt2193 == 5) {
                     client.anInt2053 = 64;
                     client.anInt2054 = 0;
                  }

                  if(client.anInt2193 == 6) {
                     client.anInt2053 = 64;
                     client.anInt2054 = 128;
                  }

                  client.anInt2193 = 2;
                  client.anInt2050 = client.gameBuffer.readUShort();
                  client.anInt2051 = client.gameBuffer.readUShort();
                  client.anInt2176 = client.gameBuffer.method595();
               }

               if(client.anInt2193 == 10)
				client.anInt2097 = client.gameBuffer.readUShort();

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 99) {
               var1 = client.gameBuffer.method644();
               Class118.aClass87_856 = Class36.aClass78_371.method351(var1);
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 44) {
               Class131_Sub20_Sub16.anInt1625 = client.gameBuffer.method616();
               Class131_Sub20_Sub19_Sub5.anInt1832 = client.gameBuffer.method614();

               while(client.gameBuffer.pos < client.messageSize) {
                  client.incomingPacket = client.gameBuffer.method595();
                  Class46.method231();
               }

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 162) {
               var1 = client.gameBuffer.readIntV1();
               var61 = client.gameBuffer.method614() == 1;
               var11 = Class88.method377(var1);
               if(var11.aBool1178 != var61) {
                  var11.aBool1178 = var61;
                  Class131_Sub20_Sub6.method734(var11);
               }

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 166) {
               var1 = client.gameBuffer.readUShort();
               var3 = client.gameBuffer.method629();
               var5 = client.gameBuffer.method628();
               var74 = Class88.method377(var5);
               var74.anInt1214 = var1 + (var3 << 16);
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 95) {
               var1 = client.gameBuffer.readIntV1();
               var3 = client.gameBuffer.readULEShortA();
               Class96.anIntArray764[var3] = var1;
               if(var1 != Class96.anIntArray766[var3])
				Class96.anIntArray766[var3] = var1;

               Class24.method117(var3);
               client.anIntArray2145[(++client.anInt2027 - 1) & 31] = var3;
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 221) {
               var1 = client.gameBuffer.method606();
               var61 = client.gameBuffer.method595() == 1;
               var73 = "";
               var64 = false;
               if(var61) {
                  var73 = client.gameBuffer.method638();
                  if(Player.method1075(var73))
					var64 = true;
               }

               final String var8 = client.gameBuffer.method638();
               if(!var64)
				Class131_Sub20_Sub15.method792(var1, var73, var8);

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 200) {
               var4 = client.gameBuffer.method638();
               var23 = client.gameBuffer.method600();
               var25 = client.gameBuffer.readUShort();
               var37 = client.gameBuffer.method598();
               final Class82 var45 = (Class82)Class39.method214(Class42.method221(), client.gameBuffer.method595());
               var43 = (var25 << 32) + var37;
               var19 = false;

               for(int var46 = 0; var46 < 100; ++var46)
				if(var43 == client.aLongArray2244[var46]) {
                     var19 = true;
                     break;
                  }

               if(var45.aBool691 && Player.method1075(var4))
				var19 = true;

               if(!var19 && (client.anInt2146 == 0)) {
                  client.aLongArray2244[client.anInt2245] = var43;
                  client.anInt2245 = (client.anInt2245 + 1) % 100;
                  final Class131_Sub14_Sub1 var47 = client.gameBuffer;
                  var20 = Class95.method395(var47, 32767);
                  final String var48 = Class131_Sub20_Sub17_Sub4.method1054(Class131_Sub11.method575(var20));
                  if(var45.anInt689 != -1) {
                     var33 = var45.anInt689;
                     var34 = "<img=" + var33 + ">";
                     Class131_Sub14_Sub1.method877(9, var34 + var4, var48, Class131_Sub20_Sub5.method724(var23));
                  } else
					Class131_Sub14_Sub1.method877(9, var4, var48, Class131_Sub20_Sub5.method724(var23));
               }

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 10) {
               var1 = client.gameBuffer.readUShort();
               var3 = client.gameBuffer.method595();
               var5 = client.gameBuffer.readUShort();
               Class25.method120(var1, var3, var5);
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 31) {
               Class84.method367();
               client.anInt2188 = client.gameBuffer.method595();
               client.anInt2263 = client.anInt2298;
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 92) {
               var1 = client.gameBuffer.readIntV1();
               var3 = client.gameBuffer.readUShort();
               var5 = client.gameBuffer.method616();
               var12 = (Class131_Sub7)client.aClass114_2184.method457(var1);
               if(null != var12)
				Class131_Sub6.method553(var12, var12.anInt1025 != var3);

               Class131_Sub10.method572(var1, var3, var5);
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 71) {
               client.anInt2241 = client.gameBuffer.method595();
               client.anInt2242 = client.gameBuffer.method595();
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 140) {
               client.aBool2271 = true;
               Class78.anInt640 = client.gameBuffer.method595();
               Class131_Sub20_Sub13.anInt1577 = client.gameBuffer.method595();
               Class80.anInt664 = client.gameBuffer.readUShort();
               Class90.anInt729 = client.gameBuffer.method595();
               Class29.anInt263 = client.gameBuffer.method595();
               if(Class29.anInt263 >= 100) {
                  var1 = (Class78.anInt640 * 128) + 64;
                  var3 = 64 + (Class131_Sub20_Sub13.anInt1577 * 128);
                  var5 = Class18.method88(var1, var3, Class39.anInt410) - Class80.anInt664;
                  var6 = var1 - Class139.anInt917;
                  var7 = var5 - Class46.anInt452;
                  var9 = var3 - Class1.anInt1;
                  var10 = (int)Math.sqrt((var9 * var9) + (var6 * var6));
                  Class75.anInt633 = (int)(Math.atan2(var7, var10) * 325.949D) & 2047;
                  Class131_Sub20_Sub1.anInt1371 = (int)(Math.atan2(var6, var9) * -325.949D) & 2047;
                  if(Class75.anInt633 < 128)
					Class75.anInt633 = 128;

                  if(Class75.anInt633 > 383)
					Class75.anInt633 = 383;
               }

               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 189) {
               var1 = client.gameBuffer.readIntV1();
               var3 = client.gameBuffer.readUShort();
               if(var1 < -70000)
				var3 += '\u8000';

               if(var1 >= 0)
				var11 = Class88.method377(var1);
			else
				var11 = null;

               for(; client.gameBuffer.pos < client.messageSize; Class1.method17(var3, var6, var7 - 1, var9)) {
                  var6 = client.gameBuffer.method606();
                  var7 = client.gameBuffer.readUShort();
                  var9 = 0;
                  if(var7 != 0) {
                     var9 = client.gameBuffer.method595();
                     if(var9 == 255)
						var9 = client.gameBuffer.readIntV1();
                  }

                  if((null != var11) && (var6 >= 0) && (var6 < var11.anIntArray1292.length)) {
                     var11.anIntArray1292[var6] = var7;
                     var11.anIntArray1154[var6] = var9;
                  }
               }

               if(var11 != null)
				Class131_Sub20_Sub6.method734(var11);

               Class84.method367();
               client.anIntArray2211[(++client.anInt2212 - 1) & 31] = var3 & 32767;
               client.incomingPacket = -1;
               return true;
            }

            if(client.incomingPacket == 30) {
               var1 = client.gameBuffer.method595();
               var2 = client.gameBuffer.method638();
               var5 = client.gameBuffer.method614();
               if((var1 >= 1) && (var1 <= 8)) {
                  if(var2.equalsIgnoreCase("null"))
					var2 = null;

                  client.aStringArray2153[var1 - 1] = var2;
                  client.aBoolArray2113[var1 - 1] = var5 == 0;
               }

               client.incomingPacket = -1;
               return true;
            }

            Class131_Sub20_Sub7.method740("" + client.incomingPacket + "," + client.anInt2219 + "," + client.anInt2154 + "," + client.messageSize, (Throwable)null);
            Class26.method121();
         } catch (final IOException var52) {
            if(client.anInt2080 > 0)
				Class26.method121();
			else {
               Class32.method142(40);
               Class42.aClass86_421 = Class131_Sub20_Sub20.loginConnection;
               Class131_Sub20_Sub20.loginConnection = null;
            }
         } catch (final Exception var53) {
            var4 = "" + client.incomingPacket + "," + client.anInt2219 + "," + client.anInt2154 + "," + client.messageSize + "," + (Class131_Sub20_Sub20.anInt1649 + Class131_Sub11.myPlayer.anIntArray1755[0]) + "," + (Class50.anInt491 + Class131_Sub11.myPlayer.anIntArray1756[0]) + ",";

            for(var3 = 0; (var3 < client.messageSize) && (var3 < 50); ++var3)
				var4 = var4 + client.gameBuffer.data[var3] + ",";

            Class131_Sub20_Sub7.method740(var4, var53);
            Class26.method121();
         }

         return true;
      }
   }
}
