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
		if (Class131_Sub20_Sub20.loginConnection == null)
			return false;
		else {
			int xp;
			String var4;
			try {
				int var0 = Class131_Sub20_Sub20.loginConnection.available();
				if (var0 == 0)
					return false;

				if (client.incomingPacket == -1) {
					Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0, 1);
					client.gameBuffer.pos = 0;
					client.incomingPacket = client.gameBuffer.readOpcode();
					client.messageSize = Class117.anIntArray845[client.incomingPacket];
					--var0;
				}

				if (client.messageSize == -1) {
					if (var0 <= 0)
						return false;

					Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0, 1);
					client.messageSize = client.gameBuffer.data[0] & 255;
					--var0;
				}

				if (client.messageSize == -2) {
					if (var0 <= 1)
						return false;

					Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0, 2);
					client.gameBuffer.pos = 0;
					client.messageSize = client.gameBuffer.readUShort();
					var0 -= 2;
				}

				if (var0 < client.messageSize)
					return false;

				client.gameBuffer.pos = 0;
				Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0, client.messageSize);
				client.anInt2075 = 0;
				client.anInt2154 = client.anInt2219;
				client.anInt2219 = client.anInt2041 * -1;
				client.anInt2041 = client.incomingPacket * -1;
				int skillId;
				if (client.incomingPacket == 43) {
					skillId = client.gameBuffer.readIntV1();
					final Class131_Sub7 var65 = (Class131_Sub7) client.aClass114_2184.method457(skillId);
					if (null != var65)
						Class131_Sub6.method553(var65, true);

					if (null != client.aClass131_Sub18_2049) {
						Class131_Sub20_Sub6.method734(client.aClass131_Sub18_2049);
						client.aClass131_Sub18_2049 = null;
					}

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 250) {
					client.aBool2271 = true;
					client.anInt2305 = client.gameBuffer.readUByte();
					Class31.anInt296 = client.gameBuffer.readUByte();
					Class131_Sub20_Sub7.anInt1493 = client.gameBuffer.readUShort();
					Class72.anInt618 = client.gameBuffer.readUByte();
					Class131_Sub10.anInt1067 = client.gameBuffer.readUByte();
					if (Class131_Sub10.anInt1067 >= 100) {
						Class139.anInt917 = 64 + (client.anInt2305 * 128);
						Class1.anInt1 = 64 + (Class31.anInt296 * 128);
						Class46.anInt452 = Class18.method88(Class139.anInt917, Class1.anInt1, Class39.anInt410)
								- Class131_Sub20_Sub7.anInt1493;
					}

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 32) {// set root pane / window pane
					skillId = client.gameBuffer.readUshortA();
					System.out.println("rootpane id: " + skillId);
					client.anInt2128 = skillId;
					Class131_Sub20_Sub19_Sub2.method925(false);
					Class40.method216(skillId);
					Class93.method391(client.anInt2128);

					for (xp = 0; xp < 100; ++xp)
						client.aBoolArray2252[xp] = true;

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 94) {
					Class26.method121();
					client.incomingPacket = -1;
					return false;
				}

				if (client.incomingPacket == 73) {
					skillId = client.gameBuffer.readUByte();
					if (client.gameBuffer.readUByte() == 0) {
						client.grandExchangeOffers[skillId] = new GrandExchangeOffer();
						client.gameBuffer.pos += 18;
					} else {
						--client.gameBuffer.pos;
						client.grandExchangeOffers[skillId] = new GrandExchangeOffer(client.gameBuffer, false);
					}

					client.anInt2297 = client.anInt2298;
					client.incomingPacket = -1;
					return true;
				}

				int index;
				int playerIndex;
				int var10;
				boolean var64;
				boolean var97;
				if (client.incomingPacket == 137) {
					var4 = client.gameBuffer.readString();
					xp = client.gameBuffer.readUShort();
					final byte var78 = client.gameBuffer.readByte();
					var64 = false;
					if (var78 == -128)
						var64 = true;

					if (var64) {
						if (Class23.anInt210 == 0) {
							client.incomingPacket = -1;
							return true;
						}

						var97 = false;

						for (index = 0; (index < Class23.anInt210)
								&& (!Class131_Sub20_Sub8.aClass131_Sub13Array1498[index].aString1106.equals(var4)
										|| (xp != Class131_Sub20_Sub8.aClass131_Sub13Array1498[index].anInt1102)); ++index)
							;

						if (index < Class23.anInt210) {
							while (index < (Class23.anInt210 - 1)) {
								Class131_Sub20_Sub8.aClass131_Sub13Array1498[index] = Class131_Sub20_Sub8.aClass131_Sub13Array1498[index
										+ 1];
								++index;
							}

							--Class23.anInt210;
							Class131_Sub20_Sub8.aClass131_Sub13Array1498[Class23.anInt210] = null;
						}
					} else {
						client.gameBuffer.readString();
						final Class131_Sub13 var72 = new Class131_Sub13();
						var72.aString1106 = var4;
						var72.aString1104 = Class85.method371(var72.aString1106, client.aClass142_2031);
						var72.anInt1102 = xp;
						var72.aByte1103 = var78;

						for (playerIndex = Class23.anInt210 - 1; playerIndex >= 0; --playerIndex) {
							var10 = Class131_Sub20_Sub8.aClass131_Sub13Array1498[playerIndex].aString1104
									.compareTo(var72.aString1104);
							if (var10 == 0) {
								Class131_Sub20_Sub8.aClass131_Sub13Array1498[playerIndex].anInt1102 = xp;
								Class131_Sub20_Sub8.aClass131_Sub13Array1498[playerIndex].aByte1103 = var78;
								if (var4.equals(Class131_Sub11.myPlayer.aString2004))
									Class28.aByte259 = var78;

								client.anInt2277 = client.anInt2298;
								client.incomingPacket = -1;
								return true;
							}

							if (var10 < 0)
								break;
						}

						if (Class23.anInt210 >= Class131_Sub20_Sub8.aClass131_Sub13Array1498.length) {
							client.incomingPacket = -1;
							return true;
						}

						for (var10 = Class23.anInt210 - 1; var10 > playerIndex; --var10)
							Class131_Sub20_Sub8.aClass131_Sub13Array1498[var10
									+ 1] = Class131_Sub20_Sub8.aClass131_Sub13Array1498[var10];

						if (Class23.anInt210 == 0)
							Class131_Sub20_Sub8.aClass131_Sub13Array1498 = new Class131_Sub13[100];

						Class131_Sub20_Sub8.aClass131_Sub13Array1498[1 + playerIndex] = var72;
						++Class23.anInt210;
						if (var4.equals(Class131_Sub11.myPlayer.aString2004))
							Class28.aByte259 = var78;
					}

					client.anInt2277 = client.anInt2298;
					client.incomingPacket = -1;
					return true;
				}

				boolean var80;
				if (client.incomingPacket == 231) {
					var80 = client.gameBuffer.readUByte() == 1;
					if (var80) {
						Class28.aLong256 = Class84.method366(780546663) - client.gameBuffer.method600();
						Class78.aClass141_646 = new Class141(client.gameBuffer, true);
					} else
						Class78.aClass141_646 = null;

					client.anInt2270 = client.anInt2298;
					client.incomingPacket = -1;
					return true;
				}

				Class131_Sub18 var11;
				if (client.incomingPacket == 232) {
					skillId = client.gameBuffer.readUShort();
					xp = client.gameBuffer.readIntV2();
					var11 = Class88.method377(xp);
					if ((var11 != null) && (var11.anInt1202 == 0)) {
						if (skillId > (var11.anInt1182 - var11.anInt1291))
							skillId = var11.anInt1182 - var11.anInt1291;

						if (skillId < 0)
							skillId = 0;

						if (skillId != var11.anInt1180) {
							var11.anInt1180 = skillId;
							Class131_Sub20_Sub6.method734(var11);
						}
					}

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 69) {
					GPI.localPlayers = 0;

					for (skillId = 0; skillId < 2048; ++skillId) {
						GPI.cachedAppearances[skillId] = null;
						GPI.aByteArray22[skillId] = 1;
					}

					for (skillId = 0; skillId < 2048; ++skillId)
						client.playerArray[skillId] = null;

					Class36.initializeGPI(client.gameBuffer);
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 34) { // possibly map base
					Class131_Sub20_Sub16.anInt1625 = client.gameBuffer.getUByteA();
					Class131_Sub20_Sub19_Sub5.anInt1832 = client.gameBuffer.getUByteC();
					client.incomingPacket = -1;
					return true;
				}

				if ((client.incomingPacket == 225) || (client.incomingPacket == 46) || (client.incomingPacket == 206)
						|| (client.incomingPacket == 229) || (client.incomingPacket == 230)
						|| (client.incomingPacket == 90) || (client.incomingPacket == 138)
						|| (client.incomingPacket == 175) || (client.incomingPacket == 38)
						|| (client.incomingPacket == 16)) {
					Class46.method231();
					client.incomingPacket = -1;
					return true;
				}

				int pos;
				Class131_Sub18 var74;
				if (client.incomingPacket == 131) {
					skillId = client.gameBuffer.method621();
					xp = client.gameBuffer.method644();
					pos = client.gameBuffer.method639();
					var74 = Class88.method377(xp);
					if ((var74.anInt1167 != pos) || (skillId != var74.anInt1157) || (var74.anInt1163 != 0)
							|| (var74.anInt1261 != 0)) {
						var74.anInt1167 = pos;
						var74.anInt1157 = skillId;
						var74.anInt1163 = 0;
						var74.anInt1261 = 0;
						Class131_Sub20_Sub6.method734(var74);
						Class131_Sub20_Sub3.method706(var74);
						if (var74.anInt1202 == 0)
							Class16_Sub1.method547(Class131_Sub18.aClass131_Sub18ArrayArray1174[xp >> 16], var74,
									false);
					}

					client.incomingPacket = -1;
					return true;
				}

				int skipCount;
				if (client.incomingPacket == 106) {
					xp = client.gameBuffer.readUByte();
					final Class84[] var92 = Class60.method295(-1747730515);
					skipCount = 0;

					Class84 var67;
					while (true) {
						if (skipCount >= var92.length) {
							var67 = null;
							break;
						}

						final Class84 var71 = var92[skipCount];
						if (xp == var71.anInt698) {
							var67 = var71;
							break;
						}

						++skipCount;
					}

					Class131_Sub20_Sub3.aClass84_1424 = var67;
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 36) {
					client.anInt2218 = client.gameBuffer.readUByte();
					if (client.anInt2218 == 255)
						client.anInt2218 = 0;

					client.anInt2258 = client.gameBuffer.readUByte();
					if (client.anInt2258 == 255)
						client.anInt2258 = 0;

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 37) {
					for (skillId = 0; skillId < client.playerArray.length; ++skillId)
						if (client.playerArray[skillId] != null)
							client.playerArray[skillId].anInt1703 = -1;

					for (skillId = 0; skillId < client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065.length; ++skillId)
						if (null != client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[skillId])
							client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[skillId].anInt1703 = -1;

					client.incomingPacket = -1;
					return true;
				}

				int var15;
				if (client.incomingPacket == 65) {
					client.anInt2277 = client.anInt2298;
					if (client.messageSize == 0) {
						client.aString2250 = null;
						client.aString2251 = null;
						Class23.anInt210 = 0;
						Class131_Sub20_Sub8.aClass131_Sub13Array1498 = null;
						client.incomingPacket = -1;
						return true;
					}

					client.aString2251 = client.gameBuffer.readString();
					final long var13 = client.gameBuffer.method600();
					client.aString2250 = Class52.method271(var13);
					Class113.aByte836 = client.gameBuffer.readByte();
					pos = client.gameBuffer.readUByte();
					if (pos == 255) {
						client.incomingPacket = -1;
						return true;
					}

					Class23.anInt210 = pos;
					final Class131_Sub13[] var81 = new Class131_Sub13[100];

					for (index = 0; index < Class23.anInt210; ++index) {
						var81[index] = new Class131_Sub13();
						var81[index].aString1106 = client.gameBuffer.readString();
						var81[index].aString1104 = Class85.method371(var81[index].aString1106, client.aClass142_2031);
						var81[index].anInt1102 = client.gameBuffer.readUShort();
						var81[index].aByte1103 = client.gameBuffer.readByte();
						client.gameBuffer.readString();
						if (var81[index].aString1106.equals(Class131_Sub11.myPlayer.aString2004))
							Class28.aByte259 = var81[index].aByte1103;
					}

					var97 = false;
					var10 = Class23.anInt210;

					while (var10 > 0) {
						var97 = true;
						--var10;

						for (var15 = 0; var15 < var10; ++var15)
							if (var81[var15].aString1104.compareTo(var81[1 + var15].aString1104) > 0) {
								final Class131_Sub13 var93 = var81[var15];
								var81[var15] = var81[1 + var15];
								var81[1 + var15] = var93;
								var97 = false;
							}

						if (var97)
							break;
					}

					Class131_Sub20_Sub8.aClass131_Sub13Array1498 = var81;
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 183) {
					skillId = client.gameBuffer.readIntV1();
					xp = client.gameBuffer.method621();
					var11 = Class88.method377(skillId);
					if ((xp != var11.anInt1160) || (xp == -1)) {
						var11.anInt1160 = xp;
						var11.anInt1279 = 0;
						var11.anInt1147 = 0;
						Class131_Sub20_Sub6.method734(var11);
					}

					client.incomingPacket = -1;
					return true;
				}

				String var2;
				String var76;
				if (client.incomingPacket == 174) {
					var4 = client.gameBuffer.readString();
					final Class131_Sub14_Sub1 var89 = client.gameBuffer;
					var2 = Class95.method395(var89, 32767);
					var76 = Class131_Sub20_Sub17_Sub4.method1054(Class131_Sub11.method575(var2));
					Class131_Sub20_Sub15.method792(6, var4, var76);
					client.incomingPacket = -1;
					return true;
				}

				Class131_Sub14_Sub1 buf;
				Player var84;
				
				// PLAYER SYNC
				if (client.incomingPacket == 64) {
					
					System.out.println("PACKET 64 PLAYER COUNT: " + GPI.otherPlayers);
				
					buf = client.gameBuffer;
					xp = client.messageSize;
					pos = buf.pos;
					GPI.anInt21 = 0;
					skipCount = 0;
					buf.bitAccess();

					// START ENCODE CONTEXT PLAYER
					
					for (index = 0; index < GPI.localPlayers; ++index) { // localplayers = players the player can view.
						playerIndex = GPI.localPlayerIndices[index];
						
						System.out.println("is this 0?"+(GPI.skipFlags[playerIndex] & 1));
						
						// Movement?
						if ((GPI.skipFlags[playerIndex] & 1) == 0) {
							System.out.println("var6:"+skipCount);
							if (skipCount > 0) {
								--skipCount;
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							} else {
								var10 = buf.readBits(1);// This is 1 if player is moving, 0 if not.
								System.out.println("The var 10:"+var10);
								
								if (var10 == 0) { // Skip flag
									skipCount = Class131_Sub20_Sub2.decodeSkipCount(buf); // 0
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
								} else
									Player1.decodeMovement(buf, playerIndex);
							}
						}
					}

					buf.byteAccess();
					if (skipCount != 0) {
						System.out.println("crashes here 26.");
						throw new RuntimeException();
					}
					buf.bitAccess();

					for (index = 0; index < GPI.localPlayers; ++index) {
						playerIndex = GPI.localPlayerIndices[index];
						if ((GPI.skipFlags[playerIndex] & 1) != 0)
							if (skipCount > 0) {
								--skipCount;
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							} else {	
								var10 = buf.readBits(1);						
								if (var10 == 0) {
									skipCount = Class131_Sub20_Sub2.decodeSkipCount(buf);
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
								} else
									Player1.decodeMovement(buf, playerIndex);
							}
					}

					buf.byteAccess();
					if (skipCount != 0) {
						System.out.println("crashes here 27.");
						throw new RuntimeException();
					}
					buf.bitAccess();

		               int countOther1 = 0;
					for (index = 0; index < GPI.otherPlayers; ++index) {
						playerIndex = GPI.globalPlayerIndices[index];
						if ((GPI.skipFlags[playerIndex] & 1) != 0)
							if (skipCount > 0) {
								--skipCount;
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							} else {
							   	 countOther1++;
								//System.out.println("EXPECTING1 var10");
								var10 = buf.readBits(1);
								if (var10 == 0) {
									skipCount = Class131_Sub20_Sub2.decodeSkipCount(buf);
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
								} else if (Class61.method297(buf, playerIndex))
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							}
					}  System.out.println("total1: " + countOther1);

					buf.byteAccess();
					if (skipCount != 0) {
						System.out.println("crashes here 28.");
						throw new RuntimeException();
					}
					buf.bitAccess();

				      int countOther2 = 0;
					for (index = 0; index < GPI.otherPlayers; ++index) {
						playerIndex = GPI.globalPlayerIndices[index];
						if ((GPI.skipFlags[playerIndex] & 1) == 0)
							if (skipCount > 0) {
								--skipCount;
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							} else {
								countOther2++;
								//System.out.println("EXPECTING2 var10");
								var10 = buf.readBits(1);
								if (var10 == 0) {
									skipCount = Class131_Sub20_Sub2.decodeSkipCount(buf);
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
								} else if (Class61.method297(buf, playerIndex))
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							}
					}
					  System.out.println("total2:"+countOther2);

					buf.byteAccess();
					if (skipCount != 0) {
						System.out.println("crashes here 29.");
						throw new RuntimeException();
					}
					GPI.localPlayers = 0;
					GPI.otherPlayers = 0;

					for (index = 1; index < 2048; ++index) {
						GPI.skipFlags[index] = (byte) (GPI.skipFlags[index] >> 1);
						var84 = client.playerArray[index];
						if (var84 != null)
							GPI.localPlayerIndices[++GPI.localPlayers - 1] = index;
						else
							GPI.globalPlayerIndices[++GPI.otherPlayers - 1] = index;
					}

					for (skipCount = 0; skipCount < GPI.anInt21; ++skipCount) {
						index = GPI.anIntArray23[skipCount];
						var84 = client.playerArray[index];
						var10 = buf.readUByte();
						if ((var10 & 8) != 0)
							var10 += buf.readUByte() << 8;

						Class131_Sub20_Sub16.method840(buf, index, var84, var10);
					}

					System.out.println("xp:"+xp);
					System.out.println("(var60.pos - currentLevel))" +(buf.pos - pos));
					if (xp != (buf.pos - pos)) {
						System.out.println("crashes here 30.");
						throw new RuntimeException((buf.pos - pos) + " " + xp);
					}
					
					client.incomingPacket = -1;
					return true;
				}
				
				// END OF PLAYER UPDATING

				System.out.println("Incoming packet: " + client.incomingPacket);

				// Display map region (instanced)
				if (client.incomingPacket == 148) {
					Class78.playerSyncMaybe(true);
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 23) {
					for (skillId = 0; skillId < Class65.anInt594; ++skillId) {
						final Class131_Sub20_Sub15 var63 = Class99.method399(skillId);
						if (var63 != null) {
							Class96.anIntArray764[skillId] = 0;
							Class96.anIntArray766[skillId] = 0;
						}
					}

					Class84.method367();
					client.anInt2027 += 32;
					client.incomingPacket = -1;
					return true;
				}

				// Interface text
				if (client.incomingPacket == 55) {
					var4 = client.gameBuffer.readString();
					xp = client.gameBuffer.readIntV2();
					var11 = Class88.method377(xp);
					if (!var4.equals(var11.aString1218)) {
						var11.aString1218 = var4;
						Class131_Sub20_Sub6.method734(var11);
					}

					client.incomingPacket = -1;
					return true;
				}

				boolean var19;
				String var73;
				if (client.incomingPacket == 48) {
					while (client.gameBuffer.pos < client.messageSize) {
						var80 = client.gameBuffer.readUByte() == 1;
						var2 = client.gameBuffer.readString();
						var73 = client.gameBuffer.readString();
						skipCount = client.gameBuffer.readUShort();
						index = client.gameBuffer.readUByte();
						playerIndex = client.gameBuffer.readUByte();
						final boolean var85 = (playerIndex & 2) != 0;
						final boolean var82 = (playerIndex & 1) != 0;
						if (skipCount > 0) {
							client.gameBuffer.readString();
							client.gameBuffer.readUByte();
							client.gameBuffer.readIntV1();
						}

						client.gameBuffer.readString();

						for (int var90 = 0; var90 < client.anInt2290; ++var90) {
							final Class44 var91 = client.aClass44Array2292[var90];
							if (!var80) {
								if (var2.equals(var91.aString442)) {
									if (var91.anInt438 != skipCount) {
										var19 = true;

										for (Class126_Sub1 var94 = (Class126_Sub1) client.aClass112_2293
												.method453(); var94 != null; var94 = (Class126_Sub1) client.aClass112_2293
														.method454())
											if (var94.aString949.equals(var2))
												if ((skipCount != 0) && (var94.aShort950 == 0)) {
													var94.method490();
													var19 = false;
												} else if ((skipCount == 0) && (var94.aShort950 != 0)) {
													var94.method490();
													var19 = false;
												}

										if (var19)
											client.aClass112_2293.method452(new Class126_Sub1(var2, skipCount));

										var91.anInt438 = skipCount;
									}

									var91.aString437 = var73;
									var91.anInt445 = index;
									var91.aBool439 = var85;
									var91.aBool440 = var82;
									var2 = null;
									break;
								}
							} else if (var73.equals(var91.aString442)) {
								var91.aString442 = var2;
								var91.aString437 = var73;
								var2 = null;
								break;
							}
						}

						if ((null != var2) && (client.anInt2290 < 400)) {
							final Class44 var21 = new Class44();
							client.aClass44Array2292[client.anInt2290] = var21;
							var21.aString442 = var2;
							var21.aString437 = var73;
							var21.anInt438 = skipCount;
							var21.anInt445 = index;
							var21.aBool439 = var85;
							var21.aBool440 = var82;
							++client.anInt2290;
						}
					}

					client.anInt2134 = 2;
					client.anInt2216 = client.anInt2298;
					var80 = false;
					xp = client.anInt2290;

					while (xp > 0) {
						var80 = true;
						--xp;

						for (pos = 0; pos < xp; ++pos) {
							var64 = false;
							final Class44 var70 = client.aClass44Array2292[pos];
							final Class44 var88 = client.aClass44Array2292[pos + 1];
							if ((var70.anInt438 != client.anInt2123) && (var88.anInt438 == client.anInt2123))
								var64 = true;

							if (!var64 && (var70.anInt438 == 0) && (var88.anInt438 != 0))
								var64 = true;

							if (!var64 && !var70.aBool439 && var88.aBool439)
								var64 = true;

							if (!var64 && !var70.aBool440 && var88.aBool440)
								var64 = true;

							if (var64) {
								final Class44 var96 = client.aClass44Array2292[pos];
								client.aClass44Array2292[pos] = client.aClass44Array2292[pos + 1];
								client.aClass44Array2292[1 + pos] = var96;
								var80 = false;
							}
						}

						if (var80)
							break;
					}

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 51) {
					Class84.method367();
					client.anInt2189 = client.gameBuffer.readShort();
					client.anInt2263 = client.anInt2298;
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 20) {
					skillId = client.gameBuffer.readIntV2();
					xp = client.gameBuffer.readULEShortA();
					var11 = Class88.method377(skillId);
					if ((var11.anInt1201 != 2) || (var11.anInt1172 != xp)) {
						var11.anInt1201 = 2;
						var11.anInt1172 = xp;
						Class131_Sub20_Sub6.method734(var11);
					}

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 191) {
					if (client.anInt2128 != -1)
						Class131_Sub20_Sub19_Sub2_Sub1.method1065(client.anInt2128, 0);

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 176) {
					client.anInt2046 = client.gameBuffer.readUShort() * 30;
					client.anInt2263 = client.anInt2298;
					client.incomingPacket = -1;
					return true;
				}

				Class131_Sub18 var69;
				if (client.incomingPacket == 214) {
					skillId = client.gameBuffer.readUShort();
					xp = client.gameBuffer.readUShort();
					pos = client.gameBuffer.readIntV2();
					skipCount = client.gameBuffer.readULEShortA();
					var69 = Class88.method377(pos);
					if ((skipCount != var69.anInt1209) || (var69.anInt1210 != skillId) || (var69.anInt1277 != xp)) {
						var69.anInt1209 = skipCount;
						var69.anInt1210 = skillId;
						var69.anInt1277 = xp;
						Class131_Sub20_Sub6.method734(var69);
					}

					client.incomingPacket = -1;
					return true;
				}

				Class131_Sub18 var55;
				if (client.incomingPacket == 14) {
					skillId = client.gameBuffer.method628();
					var55 = Class88.method377(skillId);
					var55.anInt1201 = 3;
					var55.anInt1172 = Class131_Sub11.myPlayer.aClass91_1980.method385();
					Class131_Sub20_Sub6.method734(var55);
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 217) {
					Class16.method63(client.gameBuffer);
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 96) {
					Class131_Sub20_Sub19_Sub5.anInt1832 = client.gameBuffer.getUByteA();
					Class131_Sub20_Sub16.anInt1625 = client.gameBuffer.getUByteS();

					for (skillId = Class131_Sub20_Sub19_Sub5.anInt1832; skillId < (8
							+ Class131_Sub20_Sub19_Sub5.anInt1832); ++skillId)
						for (xp = Class131_Sub20_Sub16.anInt1625; xp < (8 + Class131_Sub20_Sub16.anInt1625); ++xp)
							if (client.aClass115ArrayArrayArray2306[Class39.anInt410][skillId][xp] != null) {
								client.aClass115ArrayArrayArray2306[Class39.anInt410][skillId][xp] = null;
								Class131_Sub19.method676(skillId, xp);
							}

					for (Class131_Sub9 var62 = (Class131_Sub9) client.aClass115_2158
							.method465(); null != var62; var62 = (Class131_Sub9) client.aClass115_2158.method468())
						if ((var62.anInt1045 >= Class131_Sub20_Sub19_Sub5.anInt1832)
								&& (var62.anInt1045 < (8 + Class131_Sub20_Sub19_Sub5.anInt1832))
								&& (var62.anInt1043 >= Class131_Sub20_Sub16.anInt1625)
								&& (var62.anInt1043 < (Class131_Sub20_Sub16.anInt1625 + 8))
								&& (var62.anInt1052 == Class39.anInt410))
							var62.anInt1050 = 0;

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 211) {
					client.gameBuffer.pos += 28;
					if (client.gameBuffer.method611()) {
						buf = client.gameBuffer;
						xp = client.gameBuffer.pos - 28;
						if (Class72.aClass140_617 != null)
							try {
								Class72.aClass140_617.method510(0L);
								Class72.aClass140_617.method516(buf.data, xp, 24);
							} catch (final Exception var50) {
								;
							}
					}

					client.incomingPacket = -1;
					return true;
				}

				Class131_Sub14_Sub1 var58;
				// not used
				if (client.incomingPacket == 33) {
					GPI.drawMapRegion(true);
					client.gameBuffer.readOpcode();
					skillId = client.gameBuffer.readUShort();
					var58 = client.gameBuffer;
					pos = var58.pos;
					GPI.anInt21 = 0;
					skipCount = 0;
					var58.bitAccess();

					for (index = 0; index < GPI.localPlayers; ++index) {
						playerIndex = GPI.localPlayerIndices[index];
						if ((GPI.skipFlags[playerIndex] & 1) == 0)
							if (skipCount > 0) {
								--skipCount;
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							} else {
								var10 = var58.readBits(1);
								if (var10 == 0) {
									skipCount = Class131_Sub20_Sub2.decodeSkipCount(var58);
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
								} else
									Player1.decodeMovement(var58, playerIndex);
							}
					}

					var58.byteAccess();
					if (skipCount != 0)
						throw new RuntimeException();

					var58.bitAccess();

					for (index = 0; index < GPI.localPlayers; ++index) {
						playerIndex = GPI.localPlayerIndices[index];
						if ((GPI.skipFlags[playerIndex] & 1) != 0)
							if (skipCount > 0) {
								--skipCount;
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							} else {
								var10 = var58.readBits(1);
								if (var10 == 0) {
									skipCount = Class131_Sub20_Sub2.decodeSkipCount(var58);
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
								} else
									Player1.decodeMovement(var58, playerIndex);
							}
					}

					var58.byteAccess();
					if (skipCount != 0)
						throw new RuntimeException();

					var58.bitAccess();

					for (index = 0; index < GPI.otherPlayers; ++index) {
						playerIndex = GPI.globalPlayerIndices[index];
						if ((GPI.skipFlags[playerIndex] & 1) != 0)
							if (skipCount > 0) {
								--skipCount;
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							} else {
								var10 = var58.readBits(1);
								if (var10 == 0) {
									skipCount = Class131_Sub20_Sub2.decodeSkipCount(var58);
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
								} else if (Class61.method297(var58, playerIndex))
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							}
					}

					var58.byteAccess();
					if (skipCount != 0)
						throw new RuntimeException();

					var58.bitAccess();

					for (index = 0; index < GPI.otherPlayers; ++index) {
						playerIndex = GPI.globalPlayerIndices[index];
						if ((GPI.skipFlags[playerIndex] & 1) == 0)
							if (skipCount > 0) {
								--skipCount;
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							} else {
								var10 = var58.readBits(1);
								if (var10 == 0) {
									skipCount = Class131_Sub20_Sub2.decodeSkipCount(var58);
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
								} else if (Class61.method297(var58, playerIndex))
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							}
					}

					var58.byteAccess();
					if (skipCount != 0)
						throw new RuntimeException();

					GPI.localPlayers = 0;
					GPI.otherPlayers = 0;

					for (index = 1; index < 2048; ++index) {
						GPI.skipFlags[index] = (byte) (GPI.skipFlags[index] >> 1);
						var84 = client.playerArray[index];
						if (var84 != null)
							GPI.localPlayerIndices[++GPI.localPlayers - 1] = index;
						else
							GPI.globalPlayerIndices[++GPI.otherPlayers - 1] = index;
					}

					for (skipCount = 0; skipCount < GPI.anInt21; ++skipCount) {
						index = GPI.anIntArray23[skipCount];
						var84 = client.playerArray[index];
						var10 = var58.readUByte();
						if ((var10 & 8) != 0)
							var10 += var58.readUByte() << 8;

						Class131_Sub20_Sub16.method840(var58, index, var84, var10);
					}

					if (skillId != (var58.pos - pos))
						throw new RuntimeException((var58.pos - pos) + " " + skillId);

					client.incomingPacket = -1;
					return true;
				}

				String var20;
				long var23;
				long var25;
				int var33;
				String var34;
				if (client.incomingPacket == 132) {
					var4 = client.gameBuffer.readString();
					var23 = client.gameBuffer.readUShort();
					var25 = client.gameBuffer.method598();
					final Class82 var87 = (Class82) Class39.method214(Class42.method221(),
							client.gameBuffer.readUByte());
					final long var27 = var25 + (var23 << 32);
					boolean var17 = false;

					for (int var29 = 0; var29 < 100; ++var29)
						if (var27 == client.aLongArray2244[var29]) {
							var17 = true;
							break;
						}

					if (Player.method1075(var4))
						var17 = true;

					if (!var17 && (client.anInt2146 == 0)) {
						client.aLongArray2244[client.anInt2245] = var27;
						client.anInt2245 = (1 + client.anInt2245) % 100;
						final Class131_Sub14_Sub1 var30 = client.gameBuffer;
						final String var18 = Class95.method395(var30, 32767);
						var20 = Class131_Sub20_Sub17_Sub4.method1054(Class131_Sub11.method575(var18));
						byte var31;
						if (var87.aBool690)
							var31 = 7;
						else
							var31 = 3;

						if (var87.anInt689 != -1) {
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
				if (client.incomingPacket == 213) {
					Class78.playerSyncMaybe(false);
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 66) {
					Class32.method140(client.gameBuffer.readString());
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 82) {
					client.anInt2259 = client.gameBuffer.readUByte();
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 113) {
					skillId = client.gameBuffer.readUshortA();
					xp = client.gameBuffer.method628();
					var11 = Class88.method377(xp);
					if ((var11.anInt1201 != 1) || (skillId != var11.anInt1172)) {
						var11.anInt1201 = 1;
						var11.anInt1172 = skillId;
						Class131_Sub20_Sub6.method734(var11);
					}

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 180) {
					final Class30 var59 = new Class30();
					var59.aString281 = client.gameBuffer.readString();
					var59.anInt278 = client.gameBuffer.readUShort();
					xp = client.gameBuffer.readIntV1();
					var59.anInt279 = xp;
					Class32.method142(45);
					Class131_Sub20_Sub20.loginConnection.method373();
					Class131_Sub20_Sub20.loginConnection = null;
					Class63.method304(var59);
					client.incomingPacket = -1;
					return false;
				}

				Class131_Sub7 target;
				if (client.incomingPacket == 147) {
					skillId = client.gameBuffer.readIntV2();
					xp = client.gameBuffer.method628();
					final Class131_Sub7 var86 = (Class131_Sub7) client.aClass114_2184.method457(xp);
					target = (Class131_Sub7) client.aClass114_2184.method457(skillId);
					if (target != null)
						Class131_Sub6.method553(target, (null == var86) || (target.anInt1025 != var86.anInt1025));

					if (var86 != null) {
						var86.method501();
						client.aClass114_2184.method461(var86, skillId);
					}

					var69 = Class88.method377(xp);
					if (var69 != null)
						Class131_Sub20_Sub6.method734(var69);

					var69 = Class88.method377(skillId);
					if (var69 != null) {
						Class131_Sub20_Sub6.method734(var69);
						Class16_Sub1.method547(Class131_Sub18.aClass131_Sub18ArrayArray1174[var69.anInt1272 >>> 16],
								var69, true);
					}

					if (client.anInt2128 != -1)
						Class131_Sub20_Sub19_Sub2_Sub1.method1065(client.anInt2128, 1);

					client.incomingPacket = -1;
					return true;
				}

				// Update skill
				if (client.incomingPacket == 56) {
					Class84.method367();
					skillId = client.gameBuffer.getUByteA();
					xp = client.gameBuffer.readIntV2();
					pos = client.gameBuffer.getUByteC();
					client.anIntArray2163[skillId] = xp;
					client.anIntArray2161[skillId] = pos;
					client.anIntArray2162[skillId] = 1;

					for (skipCount = 0; skipCount < 98; ++skipCount)
						if (xp >= Class90.anIntArray728[skipCount])
							client.anIntArray2162[skillId] = skipCount + 2;

					client.anIntArray2213[(++client.anInt2214 - 1) & 31] = skillId;
					client.incomingPacket = -1;
					return true;
				}

				long key;
				if (client.incomingPacket == 125) {
					skillId = client.gameBuffer.readIntV1();
					xp = client.gameBuffer.readIntV1();
					if ((null == Class117.aGarbageCollectorMXBean846) || !Class117.aGarbageCollectorMXBean846.isValid())
						try {
							final Iterator var83 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

							while (var83.hasNext()) {
								final GarbageCollectorMXBean var79 = (GarbageCollectorMXBean) var83.next();
								if (var79.isValid()) {
									Class117.aGarbageCollectorMXBean846 = var79;
									client.aLong2220 = -1L;
									client.aLong2102 = -1L;
								}
							}
						} catch (final Throwable var51) {
							;
						}

					final long var35 = Class84.method366(780546663);
					index = -1;
					if (null != Class117.aGarbageCollectorMXBean846) {
						key = Class117.aGarbageCollectorMXBean846.getCollectionTime();
						if (-1L != client.aLong2102) {
							final long var39 = key - client.aLong2102;
							final long var41 = var35 - client.aLong2220;
							if (0L != var41)
								index = (int) ((100L * var39) / var41);
						}

						client.aLong2102 = key;
						client.aLong2220 = var35;
					}

					client.secureBuffer.method871(184);
					client.secureBuffer.writeByte(index);
					client.secureBuffer.writeInt(skillId);
					client.secureBuffer.method625(xp);
					client.secureBuffer.method613(Applet_Sub1.anInt2009);
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 104) {
					client.aBool2271 = false;

					for (skillId = 0; skillId < 5; ++skillId)
						client.aBoolArray2261[skillId] = false;

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 177) {
					skillId = client.gameBuffer.readIntV2();
					xp = client.gameBuffer.readUShort();
					pos = (xp >> 10) & 31;
					skipCount = (xp >> 5) & 31;
					index = xp & 31;
					playerIndex = (pos << 19) + (skipCount << 11) + (index << 3);
					final Class131_Sub18 var95 = Class88.method377(skillId);
					if (playerIndex != var95.anInt1183) {
						var95.anInt1183 = playerIndex;
						Class131_Sub20_Sub6.method734(var95);
					}

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 249) {
					for (skillId = 0; skillId < Class96.anIntArray766.length; ++skillId)
						if (Class96.anIntArray764[skillId] != Class96.anIntArray766[skillId]) {
							Class96.anIntArray766[skillId] = Class96.anIntArray764[skillId];
							Class24.method117(skillId);
							client.anIntArray2145[(++client.anInt2027 - 1) & 31] = skillId;
						}

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 195) {
					skillId = client.gameBuffer.readUShort();
					if (skillId == '\uffff')
						skillId = -1;

					xp = client.gameBuffer.method628();
					pos = client.gameBuffer.readIntV2();
					var74 = Class88.method377(xp);
					Class131_Sub20_Sub2 var68;
					if (!var74.aBool1263) {
						if (skillId == -1) {
							var74.anInt1201 = 0;
							client.incomingPacket = -1;
							return true;
						}

						var68 = Class79_Sub1.method645(skillId, (short) 10850);
						var74.anInt1201 = 4;
						var74.anInt1172 = skillId;
						var74.anInt1209 = var68.anInt1376;
						var74.anInt1210 = var68.anInt1386;
						var74.anInt1277 = (var68.anInt1384 * 100) / pos;
						Class131_Sub20_Sub6.method734(var74);
					} else {
						var74.anInt1168 = skillId;
						var74.anInt1198 = pos;
						var68 = Class79_Sub1.method645(skillId, (short) 32211);
						var74.anInt1209 = var68.anInt1376;
						var74.anInt1210 = var68.anInt1386;
						var74.anInt1150 = var68.anInt1388;
						var74.anInt1207 = var68.anInt1390;
						var74.anInt1208 = var68.anInt1389;
						var74.anInt1277 = var68.anInt1384;
						if (var68.anInt1408 == 1)
							var74.anInt1216 = 1;
						else
							var74.anInt1216 = 2;

						if (var74.anInt1213 > 0)
							var74.anInt1277 = (var74.anInt1277 * 32) / var74.anInt1213;
						else if (var74.anInt1229 > 0)
							var74.anInt1277 = (var74.anInt1277 * 32) / var74.anInt1229;

						Class131_Sub20_Sub6.method734(var74);
					}

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 251) {
					client.anInt2134 = 1;
					client.anInt2216 = client.anInt2298;
					client.incomingPacket = -1;
					return true;
				}

				long var43;
				if (client.incomingPacket == 84) {
					skillId = client.gameBuffer.pos + client.messageSize;
					xp = client.gameBuffer.readUShort();
					pos = client.gameBuffer.readUShort();
					if (xp != client.anInt2128) {
						client.anInt2128 = xp;
						Class131_Sub20_Sub19_Sub2.method925(false);
						Class40.method216(client.anInt2128);
						Class93.method391(client.anInt2128);

						for (skipCount = 0; skipCount < 100; ++skipCount)
							client.aBoolArray2252[skipCount] = true;
					}

					Class131_Sub7 var22;
					for (; pos-- > 0; var22.aBool1029 = true) {
						skipCount = client.gameBuffer.readIntV1();
						index = client.gameBuffer.readUShort();
						playerIndex = client.gameBuffer.readUByte();
						var22 = (Class131_Sub7) client.aClass114_2184.method457(skipCount);
						if ((null != var22) && (var22.anInt1025 != index)) {
							Class131_Sub6.method553(var22, true);
							var22 = null;
						}

						if (null == var22)
							var22 = Class131_Sub10.method572(skipCount, index, playerIndex);
					}

					for (target = (Class131_Sub7) client.aClass114_2184
							.method460(); target != null; target = (Class131_Sub7) client.aClass114_2184.method458())
						if (target.aBool1029)
							target.aBool1029 = false;
						else
							Class131_Sub6.method553(target, true);

					client.aClass114_2225 = new Class114(512);

					while (client.gameBuffer.pos < skillId) {
						skipCount = client.gameBuffer.readIntV1();
						index = client.gameBuffer.readUShort();
						playerIndex = client.gameBuffer.readUShort();
						var10 = client.gameBuffer.readIntV1();

						for (var15 = index; var15 <= playerIndex; ++var15) {
							var43 = var15 + ((long) skipCount << 32);
							client.aClass114_2225.method461(new InterfaceSetting(var10), var43);
						}
					}

					client.incomingPacket = -1;
					return true;
				}

				// Decode map region
				if (client.incomingPacket == 42) {
					System.out.println("packet is 42");
					GPI.drawMapRegion(false);
					client.gameBuffer.readOpcode();
					skillId = client.gameBuffer.readUShort();
					var58 = client.gameBuffer;
					pos = var58.pos;
					GPI.anInt21 = 0;
					skipCount = 0;
					var58.bitAccess();

					for (index = 0; index < GPI.localPlayers; ++index) {
						playerIndex = GPI.localPlayerIndices[index];
						if ((GPI.skipFlags[playerIndex] & 1) == 0)
							if (skipCount > 0) {
								--skipCount;
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							} else {
								var10 = var58.readBits(1);
								if (var10 == 0) {
									skipCount = Class131_Sub20_Sub2.decodeSkipCount(var58);
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
								} else
									Player1.decodeMovement(var58, playerIndex);
							}
					}

					var58.byteAccess();
					if (skipCount != 0)
						throw new RuntimeException();

					var58.bitAccess();

					for (index = 0; index < GPI.localPlayers; ++index) {
						playerIndex = GPI.localPlayerIndices[index];
						if ((GPI.skipFlags[playerIndex] & 1) != 0)
							if (skipCount > 0) {
								--skipCount;
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							} else {
								var10 = var58.readBits(1);
								if (var10 == 0) {
									skipCount = Class131_Sub20_Sub2.decodeSkipCount(var58);
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
								} else
									Player1.decodeMovement(var58, playerIndex);
							}
					}

					var58.byteAccess();
					if (skipCount != 0)
						throw new RuntimeException();

					var58.bitAccess();

					for (index = 0; index < GPI.otherPlayers; ++index) {
						playerIndex = GPI.globalPlayerIndices[index];
						if ((GPI.skipFlags[playerIndex] & 1) != 0)
							if (skipCount > 0) {
								--skipCount;
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							} else {
								var10 = var58.readBits(1);
								if (var10 == 0) {
									skipCount = Class131_Sub20_Sub2.decodeSkipCount(var58);
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
								} else if (Class61.method297(var58, playerIndex))
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							}
					}

					var58.byteAccess();
					if (skipCount != 0)
						throw new RuntimeException();

					var58.bitAccess();

					for (index = 0; index < GPI.otherPlayers; ++index) {
						playerIndex = GPI.globalPlayerIndices[index];
						if ((GPI.skipFlags[playerIndex] & 1) == 0)
							if (skipCount > 0) {
								--skipCount;
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							} else {
								var10 = var58.readBits(1);
								if (var10 == 0) {
									skipCount = Class131_Sub20_Sub2.decodeSkipCount(var58);
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
								} else if (Class61.method297(var58, playerIndex))
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							}
					}

					var58.byteAccess();
					if (skipCount != 0)
						throw new RuntimeException();

					GPI.localPlayers = 0;
					GPI.otherPlayers = 0;

					for (index = 1; index < 2048; ++index) {
						GPI.skipFlags[index] = (byte) (GPI.skipFlags[index] >> 1);
						var84 = client.playerArray[index];
						if (var84 != null)
							GPI.localPlayerIndices[++GPI.localPlayers - 1] = index;
						else
							GPI.globalPlayerIndices[++GPI.otherPlayers - 1] = index;
					}

					for (skipCount = 0; skipCount < GPI.anInt21; ++skipCount) {
						index = GPI.anIntArray23[skipCount];
						var84 = client.playerArray[index];
						var10 = var58.readUByte();
						if ((var10 & 8) != 0)
							var10 += var58.readUByte() << 8;

						Class131_Sub20_Sub16.method840(var58, index, var84, var10);
					}

					if ((var58.pos - pos) != skillId)
						throw new RuntimeException((var58.pos - pos) + " " + skillId);

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 171) {
					skillId = client.gameBuffer.readULEShortA();
					final Class131_Sub11 var57 = (Class131_Sub11) Class131_Sub11.aClass114_1074.method457(skillId);
					if (var57 != null)
						var57.method501();

					client.anIntArray2211[(++client.anInt2212 - 1) & 31] = skillId & 32767;
					client.incomingPacket = -1;
					return true;
				}

				boolean var61;
				if (client.incomingPacket == 81) {
					for (; client.gameBuffer.pos < client.messageSize;) {
						skillId = client.gameBuffer.readUByte();
						var61 = (skillId & 1) == 1;
						var73 = client.gameBuffer.readString();
						var76 = client.gameBuffer.readString();
						client.gameBuffer.readString();

						for (index = 0; index < client.anInt2294; ++index) {
							final Class36 var16 = client.aClass36Array2295[index];
							if (var61) {
								if (var76.equals(var16.aString369)) {
									var16.aString369 = var73;
									var16.aString372 = var76;
									var11 = null;
									break;
								}
							} else if (var73.equals(var16.aString369)) {
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

				if (client.incomingPacket == 3) {
					skillId = client.gameBuffer.readUshortA();
					if (skillId == '\uffff')
						skillId = -1;

					if ((skillId == -1) && !client.aBool2262)
						Class126_Sub1.method524();
					else if ((skillId != -1) && (skillId != client.anInt2052) && (client.anInt2260 != 0)
							&& !client.aBool2262) {
						final Class100_Sub1 var56 = Class44.aClass100_Sub1_446;
						pos = client.anInt2260;
						Class113.anInt830 = 1;
						Class50.aClass100_495 = var56;
						Class24.anInt213 = skillId;
						Class130.anInt901 = 0;
						Class113.anInt833 = pos;
						Class50.aBool496 = false;
						Class113.anInt834 = 2;
					}

					client.anInt2052 = skillId;
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 167) {
					skillId = client.gameBuffer.method598();
					xp = client.gameBuffer.readUshortA();
					if (xp == '\uffff')
						xp = -1;

					if ((client.anInt2260 != 0) && (xp != -1)) {
						Class23.method108(Class82.aClass100_Sub1_686, xp, 0, client.anInt2260, false);
						client.aBool2262 = true;
					}

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 178) {
					skillId = client.gameBuffer.readIntV2();
					var55 = Class88.method377(skillId);

					for (pos = 0; pos < var55.anIntArray1292.length; ++pos) {
						var55.anIntArray1292[pos] = -1;
						var55.anIntArray1292[pos] = 0;
					}

					Class131_Sub20_Sub6.method734(var55);
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 74) {
					skillId = client.gameBuffer.readIntV1();
					xp = client.gameBuffer.readUShort();
					if (skillId < -70000)
						xp += '\u8000';

					if (skillId >= 0)
						var11 = Class88.method377(skillId);
					else
						var11 = null;

					final Class131_Sub11 var75 = (Class131_Sub11) Class131_Sub11.aClass114_1074.method457(xp);
					if (null != var75)
						for (index = 0; index < var75.anIntArray1070.length; ++index) {
							var75.anIntArray1070[index] = -1;
							var75.anIntArray1071[index] = 0;
						}

					skipCount = client.gameBuffer.readUShort();

					for (index = 0; index < skipCount; ++index) {
						playerIndex = client.gameBuffer.readULEShortA();
						var10 = client.gameBuffer.getUByteA();
						if (var10 == 255)
							var10 = client.gameBuffer.readIntV2();

						if ((var11 != null) && (index < var11.anIntArray1292.length)) {
							var11.anIntArray1292[index] = playerIndex;
							var11.anIntArray1154[index] = var10;
						}

						Class1.method17(xp, index, playerIndex - 1, var10);
					}

					if (null != var11)
						Class131_Sub20_Sub6.method734(var11);

					Class84.method367();
					client.anIntArray2211[(++client.anInt2212 - 1) & 31] = xp & 32767;
					client.incomingPacket = -1;
					return true;
				}

				// Interface setting
				if (client.incomingPacket == 8) {
					skillId = client.gameBuffer.readIntV1();
					xp = client.gameBuffer.readIntV1();
					pos = client.gameBuffer.readUShort();
					if (pos == '\uffff')
						pos = -1;

					skipCount = client.gameBuffer.readUshortA();
					if (skipCount == '\uffff')
						skipCount = -1;

					for (index = pos; index <= skipCount; ++index) {
						key = ((long) skillId << 32) + index;
						final Class131 var98 = client.aClass114_2225.method457(key);
						if (null != var98)
							var98.method501();

						client.aClass114_2225.method461(new InterfaceSetting(xp), key);
					}

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 47) { // Varp
					skillId = client.gameBuffer.readUshortA();
					final byte var66 = client.gameBuffer.readByte();
					Class96.anIntArray764[skillId] = var66;
					if (Class96.anIntArray766[skillId] != var66)
						Class96.anIntArray766[skillId] = var66;

					Class24.method117(skillId);
					client.anIntArray2145[(++client.anInt2027 - 1) & 31] = skillId;
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 241) {
					skillId = client.gameBuffer.readUByte();
					xp = client.gameBuffer.readUByte();
					pos = client.gameBuffer.readUByte();
					skipCount = client.gameBuffer.readUByte();
					client.aBoolArray2261[skillId] = true;
					client.anIntArray2273[skillId] = xp;
					client.anIntArray2274[skillId] = pos;
					client.anIntArray2275[skillId] = skipCount;
					client.anIntArray2276[skillId] = 0;
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 126) {
					var4 = client.gameBuffer.readString();
					final Object[] var54 = new Object[var4.length() + 1];

					for (pos = var4.length() - 1; pos >= 0; --pos)
						if (var4.charAt(pos) == 115)
							var54[1 + pos] = client.gameBuffer.readString();
						else
							var54[pos + 1] = new Integer(client.gameBuffer.readIntV1());

					var54[0] = new Integer(client.gameBuffer.readIntV1());
					final Class131_Sub10 var77 = new Class131_Sub10();
					var77.anObjectArray1056 = var54;
					NpcFlags.method24(var77, 200000);
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 135) {
					client.anInt2193 = client.gameBuffer.readUByte();
					if (client.anInt2193 == 1)
						client.anInt2048 = client.gameBuffer.readUShort();

					if ((client.anInt2193 >= 2) && (client.anInt2193 <= 6)) {
						if (client.anInt2193 == 2) {
							client.anInt2053 = 64;
							client.anInt2054 = 64;
						}

						if (client.anInt2193 == 3) {
							client.anInt2053 = 0;
							client.anInt2054 = 64;
						}

						if (client.anInt2193 == 4) {
							client.anInt2053 = 128;
							client.anInt2054 = 64;
						}

						if (client.anInt2193 == 5) {
							client.anInt2053 = 64;
							client.anInt2054 = 0;
						}

						if (client.anInt2193 == 6) {
							client.anInt2053 = 64;
							client.anInt2054 = 128;
						}

						client.anInt2193 = 2;
						client.anInt2050 = client.gameBuffer.readUShort();
						client.anInt2051 = client.gameBuffer.readUShort();
						client.anInt2176 = client.gameBuffer.readUByte();
					}

					if (client.anInt2193 == 10)
						client.anInt2097 = client.gameBuffer.readUShort();

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 99) {
					skillId = client.gameBuffer.method644();
					Class118.aClass87_856 = Class36.aClass78_371.method351(skillId);
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 44) {
					Class131_Sub20_Sub16.anInt1625 = client.gameBuffer.getUByteS();
					Class131_Sub20_Sub19_Sub5.anInt1832 = client.gameBuffer.getUByteA();

					while (client.gameBuffer.pos < client.messageSize) {
						client.incomingPacket = client.gameBuffer.readUByte();
						Class46.method231();
					}

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 162) {
					skillId = client.gameBuffer.readIntV1();
					var61 = client.gameBuffer.getUByteA() == 1;
					var11 = Class88.method377(skillId);
					if (var11.aBool1178 != var61) {
						var11.aBool1178 = var61;
						Class131_Sub20_Sub6.method734(var11);
					}

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 166) {
					skillId = client.gameBuffer.readUShort();
					xp = client.gameBuffer.readULEShort();
					pos = client.gameBuffer.method628();
					var74 = Class88.method377(pos);
					var74.anInt1214 = skillId + (xp << 16);
					client.incomingPacket = -1;
					return true;
				}

				// other varp
				if (client.incomingPacket == 95) {
					skillId = client.gameBuffer.readIntV1();
					xp = client.gameBuffer.readULEShortA();
					Class96.anIntArray764[xp] = skillId;
					if (skillId != Class96.anIntArray766[xp])
						Class96.anIntArray766[xp] = skillId;

					Class24.method117(xp);
					client.anIntArray2145[(++client.anInt2027 - 1) & 31] = xp;
					client.incomingPacket = -1;
					return true;
				}

				// Send message
				if (client.incomingPacket == 221) {
					skillId = client.gameBuffer.readCompact();
					var61 = client.gameBuffer.readUByte() == 1;
					var73 = "";
					var64 = false;
					if (var61) {
						var73 = client.gameBuffer.readString();
						if (Player.method1075(var73))
							var64 = true;
					}

					final String var8 = client.gameBuffer.readString();
					if (!var64)
						Class131_Sub20_Sub15.method792(skillId, var73, var8);

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 200) {
					var4 = client.gameBuffer.readString();
					var23 = client.gameBuffer.method600();
					var25 = client.gameBuffer.readUShort();
					key = client.gameBuffer.method598();
					final Class82 var45 = (Class82) Class39.method214(Class42.method221(),
							client.gameBuffer.readUByte());
					var43 = (var25 << 32) + key;
					var19 = false;

					for (int var46 = 0; var46 < 100; ++var46)
						if (var43 == client.aLongArray2244[var46]) {
							var19 = true;
							break;
						}

					if (var45.aBool691 && Player.method1075(var4))
						var19 = true;

					if (!var19 && (client.anInt2146 == 0)) {
						client.aLongArray2244[client.anInt2245] = var43;
						client.anInt2245 = (client.anInt2245 + 1) % 100;
						final Class131_Sub14_Sub1 var47 = client.gameBuffer;
						var20 = Class95.method395(var47, 32767);
						final String var48 = Class131_Sub20_Sub17_Sub4.method1054(Class131_Sub11.method575(var20));
						if (var45.anInt689 != -1) {
							var33 = var45.anInt689;
							var34 = "<img=" + var33 + ">";
							Class131_Sub14_Sub1.method877(9, var34 + var4, var48, Class131_Sub20_Sub5.method724(var23));
						} else
							Class131_Sub14_Sub1.method877(9, var4, var48, Class131_Sub20_Sub5.method724(var23));
					}

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 10) {
					skillId = client.gameBuffer.readUShort();
					xp = client.gameBuffer.readUByte();
					pos = client.gameBuffer.readUShort();
					Class25.method120(skillId, xp, pos);
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 31) {
					Class84.method367();
					client.anInt2188 = client.gameBuffer.readUByte();
					client.anInt2263 = client.anInt2298;
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 92) { // interface
					skillId = client.gameBuffer.readIntV1();
					xp = client.gameBuffer.readUShort();
					pos = client.gameBuffer.getUByteS();
					target = (Class131_Sub7) client.aClass114_2184.method457(skillId);
					if (null != target)
						Class131_Sub6.method553(target, target.anInt1025 != xp);

					Class131_Sub10.method572(skillId, xp, pos);
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 71) { // possibly map base
					client.anInt2241 = client.gameBuffer.readUByte();
					client.anInt2242 = client.gameBuffer.readUByte();
					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 140) {
					client.aBool2271 = true;
					Class78.anInt640 = client.gameBuffer.readUByte();
					Class131_Sub20_Sub13.anInt1577 = client.gameBuffer.readUByte();
					Class80.anInt664 = client.gameBuffer.readUShort();
					Class90.anInt729 = client.gameBuffer.readUByte();
					Class29.anInt263 = client.gameBuffer.readUByte();
					if (Class29.anInt263 >= 100) {
						skillId = (Class78.anInt640 * 128) + 64;
						xp = 64 + (Class131_Sub20_Sub13.anInt1577 * 128);
						pos = Class18.method88(skillId, xp, Class39.anInt410) - Class80.anInt664;
						skipCount = skillId - Class139.anInt917;
						index = pos - Class46.anInt452;
						playerIndex = xp - Class1.anInt1;
						var10 = (int) Math.sqrt((playerIndex * playerIndex) + (skipCount * skipCount));
						Class75.anInt633 = (int) (Math.atan2(index, var10) * 325.949D) & 2047;
						Class131_Sub20_Sub1.anInt1371 = (int) (Math.atan2(skipCount, playerIndex) * -325.949D) & 2047;
						if (Class75.anInt633 < 128)
							Class75.anInt633 = 128;

						if (Class75.anInt633 > 383)
							Class75.anInt633 = 383;
					}

					client.incomingPacket = -1;
					return true;
				}

				if (client.incomingPacket == 189) {
					skillId = client.gameBuffer.readIntV1();
					xp = client.gameBuffer.readUShort();
					if (skillId < -70000)
						xp += '\u8000';

					if (skillId >= 0)
						var11 = Class88.method377(skillId);
					else
						var11 = null;

					for (; client.gameBuffer.pos < client.messageSize; Class1.method17(xp, skipCount, index - 1, playerIndex)) {
						skipCount = client.gameBuffer.readCompact();
						index = client.gameBuffer.readUShort();
						playerIndex = 0;
						if (index != 0) {
							playerIndex = client.gameBuffer.readUByte();
							if (playerIndex == 255)
								playerIndex = client.gameBuffer.readIntV1();
						}

						if ((null != var11) && (skipCount >= 0) && (skipCount < var11.anIntArray1292.length)) {
							var11.anIntArray1292[skipCount] = index;
							var11.anIntArray1154[skipCount] = playerIndex;
						}
					}

					if (var11 != null)
						Class131_Sub20_Sub6.method734(var11);

					Class84.method367();
					client.anIntArray2211[(++client.anInt2212 - 1) & 31] = xp & 32767;
					client.incomingPacket = -1;
					return true;
				}

				// Player option
				if (client.incomingPacket == 30) {
					skillId = client.gameBuffer.readUByte();
					var2 = client.gameBuffer.readString();
					pos = client.gameBuffer.getUByteA();
					if ((skillId >= 1) && (skillId <= 8)) {
						if (var2.equalsIgnoreCase("null"))
							var2 = null;

						client.aStringArray2153[skillId - 1] = var2;
						client.aBoolArray2113[skillId - 1] = pos == 0;
					}

					client.incomingPacket = -1;
					return true;
				}

				Class131_Sub20_Sub7.method740("" + client.incomingPacket + "," + client.anInt2219 + ","
						+ client.anInt2154 + "," + client.messageSize, (Throwable) null);
				Class26.method121();
			} catch (final IOException var52) {
				if (client.anInt2080 > 0)
					Class26.method121();
				else {
					Class32.method142(40);
					Class42.aClass86_421 = Class131_Sub20_Sub20.loginConnection;
					Class131_Sub20_Sub20.loginConnection = null;
				}
			} catch (final Exception var53) {
				var4 = "" + client.incomingPacket + "," + client.anInt2219 + "," + client.anInt2154 + ","
						+ client.messageSize + ","
						+ (Class131_Sub20_Sub20.anInt1649 + Class131_Sub11.myPlayer.anIntArray1755[0]) + ","
						+ (Class50.anInt491 + Class131_Sub11.myPlayer.anIntArray1756[0]) + ",";

				for (xp = 0; (xp < client.messageSize) && (xp < 50); ++xp)
					var4 = var4 + client.gameBuffer.data[xp] + ",";

				Class131_Sub20_Sub7.method740(var4, var53);
				Class26.method121();
			}

			return true;
		}
	}
}
