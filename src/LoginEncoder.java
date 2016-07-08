import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.util.Iterator;

public class LoginEncoder {
	static BigInteger RSA_EXP = new BigInteger("10001", 16);
	static BigInteger RSA_MOD = new BigInteger(
			"a145f32cc0061a676331cfa6dc1dc8dc300a3a08b42ed2dca3a70104aefc6fb3c9a84caf6c8e2dea05d8c06aa2ea1e8661aedc32fc071021e85711c7730a6d06b80dc1dd7f6143f927bfa204e8965820d2a736dc1fb5fa8092061636b247b34223f707ee55a25bb247cc3312a5724268f3997318e28c009159c5838077b54849",
			16);

	static final void method196(final String var0) {
		if (null != var0) {
			final String var2 = Class85.method371(var0, client.aClass142_2031);
			if (var2 != null)
				for (int var3 = 0; var3 < client.anInt2290; ++var3) {
					final Class44 var6 = client.aClass44Array2292[var3];
					final String var4 = var6.aString442;
					final String var5 = Class85.method371(var4, client.aClass142_2031);
					if (Class1.method14(var0, var2, var4, var5)) {
						--client.anInt2290;

						for (int var1 = var3; var1 < client.anInt2290; ++var1)
							client.aClass44Array2292[var1] = client.aClass44Array2292[var1 + 1];

						client.anInt2216 = client.anInt2298;
						client.secureBuffer.method871(53);
						client.secureBuffer.writeByte(Class131_Sub6.method554(var0));
						client.secureBuffer.writeStr(var0);
						break;
					}
				}
		}
	}

	static Class30 method197() {
		Class30.anInt275 = 0;
		Class30 var0;
		if (Class30.anInt275 < Class30.anInt274)
			var0 = Class30.aClass30Array273[++Class30.anInt275 - 1];
		else
			var0 = null;

		return var0;
	}

	static final void method198() {
		for (Class131_Sub20_Sub19_Sub4 var0 = (Class131_Sub20_Sub19_Sub4) client.aClass115_2284
				.method465(); null != var0; var0 = (Class131_Sub20_Sub19_Sub4) client.aClass115_2284.method468())
			if ((var0.anInt1797 == Class39.anInt410) && (client.anInt2038 <= var0.anInt1803)) {
				if (client.anInt2038 >= var0.anInt1802) {
					if (var0.anInt1806 > 0) {
						final Class131_Sub20_Sub19_Sub2_Sub1 var2 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var0.anInt1806
								- 1];
						if ((var2 != null) && (var2.anInt1718 >= 0) && (var2.anInt1718 < 13312) && (var2.anInt1759 >= 0)
								&& (var2.anInt1759 < 13312))
							var0.method954(var2.anInt1718, var2.anInt1759,
									Class18.method88(var2.anInt1718, var2.anInt1759, var0.anInt1797) - var0.anInt1801,
									client.anInt2038);
					}

					if (var0.anInt1806 < 0) {
						final int var1 = -var0.anInt1806 - 1;
						Player var3;
						if (client.myPlayerIndex == var1)
							var3 = Class131_Sub11.myPlayer;
						else
							var3 = client.playerArray[var1];

						if ((var3 != null) && (var3.anInt1718 >= 0) && (var3.anInt1718 < 13312) && (var3.anInt1759 >= 0)
								&& (var3.anInt1759 < 13312))
							var0.method954(var3.anInt1718, var3.anInt1759,
									Class18.method88(var3.anInt1718, var3.anInt1759, var0.anInt1797) - var0.anInt1801,
									client.anInt2038);
					}

					var0.method956(client.anInt2103);
					Class65.aClass33_595.method155(Class39.anInt410, (int) var0.aDouble1808, (int) var0.aDouble1809,
							(int) var0.aDouble1810, 60, var0, var0.anInt1816, -1, false);
				}
			} else
				var0.method501();

	}

	static final void method199() {
		try {
			if (client.loginStage == 0) {
				if (null != Class131_Sub20_Sub20.loginConnection) {
					Class131_Sub20_Sub20.loginConnection.method373();
					Class131_Sub20_Sub20.loginConnection = null;
				}

				Class107.aClass87_811 = null;
				client.aBool2098 = false;
				client.anInt2079 = 0;
				client.loginStage = 1;
			}

			if (client.loginStage == 1) {
				if (null == Class107.aClass87_811)
					Class107.aClass87_811 = Class36.aClass78_371.method347(Class131_Sub7.aString1027,
							Class131_Sub11.anInt1072);

				if (Class107.aClass87_811.anInt714 == 2)
					throw new IOException();

				if (Class107.aClass87_811.anInt714 == 1) {
					Class131_Sub20_Sub20.loginConnection = new Class86((Socket) Class107.aClass87_811.anObject716,
							Class36.aClass78_371);
					Class107.aClass87_811 = null;
					client.loginStage = 2;
				}
			}

			if (client.loginStage == 2) {
				client.secureBuffer.pos = 0;
				client.secureBuffer.writeByte(14);
				Class131_Sub20_Sub20.loginConnection.write(client.secureBuffer.data, 0, 1);
				client.gameBuffer.pos = 0;
				client.loginStage = 3;
			}

			int var0;
			if (client.loginStage == 3) {
				if (null != Class131_Sub20_Sub6.aClass17_1480)
					Class131_Sub20_Sub6.aClass17_1480.method66();

				if (Class131_Sub20_Sub19_Sub4.aClass17_1817 != null)
					Class131_Sub20_Sub19_Sub4.aClass17_1817.method66();

				var0 = Class131_Sub20_Sub20.loginConnection.read();
				if (null != Class131_Sub20_Sub6.aClass17_1480)
					Class131_Sub20_Sub6.aClass17_1480.method66();

				if (null != Class131_Sub20_Sub19_Sub4.aClass17_1817)
					Class131_Sub20_Sub19_Sub4.aClass17_1817.method66();

				if (var0 != 0) {
					Class131_Sub20_Sub13.method783(var0);
					return;
				}

				client.gameBuffer.pos = 0;
				client.loginStage = 5;
			}

			int var2;
			int var3;
			if (client.loginStage == 5) {
				final int[] seed = new int[] { 
						(int) (Math.random() * 9.9999999E7D),
						(int) (Math.random() * 9.9999999E7D), 
						(int) (Math.random() * 9.9999999E7D),
						(int) (Math.random() * 9.9999999E7D) 
				};
				client.secureBuffer.pos = 0;
				client.secureBuffer.writeByte(1);
				client.secureBuffer.writeByte(NpcFlags.aClass97_38.method11((byte) -20));
				client.secureBuffer.writeInt(seed[0]);
				client.secureBuffer.writeInt(seed[1]);
				client.secureBuffer.writeInt(seed[2]);
				client.secureBuffer.writeInt(seed[3]);

				System.out.println("switchchase: "+NpcFlags.aClass97_38.anInt770);
				switch (NpcFlags.aClass97_38.anInt770) {
				case 0:
				case 3:
					client.secureBuffer.method587(Class63.anInt582);
					client.secureBuffer.pos += 5;
					break;
				case 1:
					client.secureBuffer.pos += 8;
					break;
				case 2:
					client.secureBuffer.writeInt(((Integer) Class50.aClass28_494.aLinkedHashMap257.get(Integer.valueOf(Class97.method397(NpcFlags.username)))).intValue());
					client.secureBuffer.pos += 4;
				}

				System.out.println("password: "+NpcFlags.password);
				client.secureBuffer.writeStr(NpcFlags.password); // password
				client.secureBuffer.doRsa(RSA_EXP, RSA_MOD);
				
				client.loginBuffer.pos = 0;
				if (client.anInt2036 == 40)
					client.loginBuffer.writeByte(18);
				else
					client.loginBuffer.writeByte(16);

				client.loginBuffer.method586(0);
				var2 = client.loginBuffer.pos;

				client.loginBuffer.writeInt(117);
			
				// securebuffer is sent here.
				client.loginBuffer.writeBytes(client.secureBuffer.data, 0, client.secureBuffer.pos);
				var3 = client.loginBuffer.pos;

				client.loginBuffer.writeStr(NpcFlags.username);
				client.loginBuffer.writeByte(((client.aBool2237 ? 1 : 0) << 1) | (client.aBool2033 ? 1 : 0));
				client.loginBuffer.method586(Class2.anInt7);
				client.loginBuffer.method586(Class88.anInt723);

				final Class131_Sub14_Sub1 var4 = client.loginBuffer;
				final byte[] var5 = new byte[24];

				int var6;
				try {
					Class72.aClass140_617.method510(0L);
					Class72.aClass140_617.method511(var5);

					for (var6 = 0; (var6 < 24) && (var5[var6] == 0); ++var6)
						;

					if (var6 >= 24)
						throw new IOException();
				} catch (final Exception var12) {
					for (int var8 = 0; var8 < 24; ++var8)
						var5[var8] = -1;
				}

				var4.writeBytes(var5, 0, 24);
				client.loginBuffer.writeStr(client.aString2150);
				client.loginBuffer.writeInt(Class39.anInt412);
				final DataBuffer machineInfo = new DataBuffer(Class131_Sub20_Sub4.myMachine.method674());
				Class131_Sub20_Sub4.myMachine.method675(machineInfo);

				client.loginBuffer.writeBytes(machineInfo.data, 0, machineInfo.data.length);
				client.loginBuffer.writeByte(Class131_Sub20_Sub14.anInt1594);
				client.loginBuffer.writeInt(Class71.aClass100_Sub1_612.anInt789);
				client.loginBuffer.writeInt(Class84.aClass100_Sub1_696.anInt789);
				client.loginBuffer.writeInt(Class32.aClass100_Sub1_297.anInt789);
				client.loginBuffer.writeInt(Class28.aClass100_Sub1_254.anInt789);
				client.loginBuffer.writeInt(Class78.aClass100_Sub1_648.anInt789);
				client.loginBuffer.writeInt(Class29.aClass100_Sub1_268.anInt789);
				client.loginBuffer.writeInt(Class44.aClass100_Sub1_446.anInt789);
				client.loginBuffer.writeInt(Class60.aClass100_Sub1_571.anInt789);
				client.loginBuffer.writeInt(Class51.aClass100_Sub1_502.anInt789);
				client.loginBuffer.writeInt(Class126_Sub1.aClass100_Sub1_953.anInt789);
				client.loginBuffer.writeInt(Class131_Sub20_Sub19_Sub1.aClass100_Sub1_1701.anInt789);
				client.loginBuffer.writeInt(Class82.aClass100_Sub1_686.anInt789);
				client.loginBuffer.writeInt(Class44.aClass100_Sub1_443.anInt789);
				client.loginBuffer.writeInt(Class131_Sub4_Sub4.aClass100_Sub1_1689.anInt789);
				client.loginBuffer.writeInt(Applet_Sub1.aClass100_Sub1_2023.anInt789);
				client.loginBuffer.writeInt(NpcFlags.aClass100_Sub1_55.anInt789);

				if (Loader.DO_RSA)
					client.loginBuffer.method588(seed, var3, client.loginBuffer.pos);

				client.loginBuffer.writeShortSize(client.loginBuffer.pos - var2);
				Class131_Sub20_Sub20.loginConnection.write(client.loginBuffer.data, 0, client.loginBuffer.pos);
				client.secureBuffer.setIsaacSeed(seed);

				for (var6 = 0; var6 < 4; ++var6)
					seed[var6] += 50;

				client.gameBuffer.setIsaacSeed(seed);
				
				client.loginStage = 6;
			}

			if ((client.loginStage == 6) && (Class131_Sub20_Sub20.loginConnection.available() > 0)) {
				var0 = Class131_Sub20_Sub20.loginConnection.read();
				if ((var0 == 21) && (client.anInt2036 == 20))
					client.loginStage = 7;
				else if (var0 == 2)
					client.loginStage = 9;
				else if ((var0 == 15) && (client.anInt2036 == 40)) {
					client.messageSize = -1;
					client.loginStage = 13;
				} else if ((var0 == 23) && (client.anInt2063 < 1)) {
					++client.anInt2063;
					client.loginStage = 0;
				} else {
					if (var0 != 29) {
						Class131_Sub20_Sub13.method783(var0);
						return;
					}

					client.loginStage = 11;
				}
			}
			
			System.out.println("Loginstage: " + client.loginStage);

			if ((client.loginStage == 7) && (Class131_Sub20_Sub20.loginConnection.available() > 0)) {
				client.anInt2064 = (Class131_Sub20_Sub20.loginConnection.read() + 3) * 60;
				client.loginStage = 8;
			}

			if (client.loginStage == 8) {
				client.anInt2079 = 0;
				Class64.method306("You have only just left another world.", "Your profile will be transferred in:",
						(client.anInt2064 / 60) + " seconds.");
				if (--client.anInt2064 <= 0)
					client.loginStage = 0;

			} else {
				if ((client.loginStage == 9) && (Class131_Sub20_Sub20.loginConnection.available() >= 13)) {
					System.out.println("We're in login stage 9!");
					final boolean var14 = Class131_Sub20_Sub20.loginConnection.read() == 1;
					Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0, 4);
					client.gameBuffer.pos = 0;
					
					if (var14) {
						var2 = client.gameBuffer.readOpcode() << 24;
						var2 |= client.gameBuffer.readOpcode() << 16;
						var2 |= client.gameBuffer.readOpcode() << 8;
						var2 |= client.gameBuffer.readOpcode();
						var3 = Class97.method397(NpcFlags.username);
						if ((Class50.aClass28_494.aLinkedHashMap257.size() >= 10)
								&& !Class50.aClass28_494.aLinkedHashMap257.containsKey(Integer.valueOf(var3))) {
							final Iterator var17 = Class50.aClass28_494.aLinkedHashMap257.entrySet().iterator();
							var17.next();
							var17.remove();
						}

						Class50.aClass28_494.aLinkedHashMap257.put(Integer.valueOf(var3), Integer.valueOf(var2));
						Class24.method115();
					}

					client.playerRights = Class131_Sub20_Sub20.loginConnection.read();
					System.out.println("playerrights: " + client.playerRights);
					client.aBool2192 = Class131_Sub20_Sub20.loginConnection.read() == 1;
					client.myPlayerIndex = Class131_Sub20_Sub20.loginConnection.read();
					client.myPlayerIndex <<= 8;
					client.myPlayerIndex += Class131_Sub20_Sub20.loginConnection.read();
					client.anInt2149 = Class131_Sub20_Sub20.loginConnection.read();
					Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0, 1);
					client.gameBuffer.pos = 0;
					client.incomingPacket = client.gameBuffer.readOpcode();
					Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0, 2);
					client.gameBuffer.pos = 0;
					client.messageSize = client.gameBuffer.readUShort();

					System.out.println("got here1");
					try {
						Class76.method342(client.aclient2265, "zap");
					} catch (final Throwable var11) {
						;
					}
					System.out.println("got here2");

					client.loginStage = 10;
				}

			//	System.out.println("Loginstage: "+ client.loginStage + "");
				if (client.loginStage == 10) {
					if (Class131_Sub20_Sub20.loginConnection.available() >= client.messageSize) {
						client.gameBuffer.pos = 0;
						
						// Read all game buffer data
						Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0, client.messageSize);
						
						Class67.method317();
						
						Class36.initializeGPI(client.gameBuffer);
						
						Class105.anInt808 = -1;
						GPI.thisIsActuallyMapRegion(false); // seems like map region lol
						
						client.incomingPacket = -1;
					}

				} else {
					if ((client.loginStage == 11) && (Class131_Sub20_Sub20.loginConnection.available() >= 2)) {
						client.gameBuffer.pos = 0;
						Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0, 2);
						client.gameBuffer.pos = 0;
						Class58.anInt565 = client.gameBuffer.readUShort();
						client.loginStage = 12;
					}

					if ((client.loginStage == 12)
							&& (Class131_Sub20_Sub20.loginConnection.available() >= Class58.anInt565)) {
						client.gameBuffer.pos = 0;
						Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0,
								Class58.anInt565);
						client.gameBuffer.pos = 0;
						final String var15 = client.gameBuffer.method638();
						final String var10 = client.gameBuffer.method638();
						final String var9 = client.gameBuffer.method638();
						Class64.method306(var15, var10, var9);
						Class32.method142(10);
					}

					if (client.loginStage != 13) {
						++client.anInt2079;
						if (client.anInt2079 > 2000)
							if (client.anInt2063 < 1) {
								if (Class140.anInt929 == Class131_Sub11.anInt1072)
									Class131_Sub11.anInt1072 = Class49.anInt478;
								else
									Class131_Sub11.anInt1072 = Class140.anInt929;

								++client.anInt2063;
								client.loginStage = 0;
							} else
								Class131_Sub20_Sub13.method783(-3);
					} else {
						if (client.messageSize == -1) {
							if (Class131_Sub20_Sub20.loginConnection.available() < 2)
								return;

							Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0,
									2);
							client.gameBuffer.pos = 0;
							client.messageSize = client.gameBuffer.readUShort();
						}

						if (Class131_Sub20_Sub20.loginConnection.available() >= client.messageSize) {
							Class131_Sub20_Sub20.loginConnection.read(client.gameBuffer.data, 0,
									client.messageSize);
							client.gameBuffer.pos = 0;
							var0 = client.messageSize;
							client.secureBuffer.pos = 0;
							client.gameBuffer.pos = 0;
							client.incomingPacket = -1;
							client.anInt2041 = 1;
							client.anInt2219 = -1;
							client.anInt2154 = -1;
							client.messageSize = 0;
							client.anInt2075 = 0;
							client.anInt2046 = 0;
							client.anInt2166 = 0;
							client.aBool2047 = false;
							client.anInt2259 = 0;
							client.anInt2218 = 0;

							for (var2 = 0; var2 < 2048; ++var2)
								client.playerArray[var2] = null;

							Class131_Sub11.myPlayer = null;

							for (var2 = 0; var2 < client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065.length; ++var2) {
								final Class131_Sub20_Sub19_Sub2_Sub1 var19 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var2];
								if (var19 != null) {
									var19.anInt1726 = -1;
									var19.aBool1727 = false;
								}
							}

							Class131_Sub11.aClass114_1074 = new Class114(32);
							Class32.method142(30);

							for (var2 = 0; var2 < 100; ++var2)
								client.aBoolArray2252[var2] = true;

							client.secureBuffer.method871(81);
							final Class131_Sub14_Sub1 var20 = client.secureBuffer;
							var3 = client.aBool2237 ? 2 : 1;
							var20.writeByte(var3);
							client.secureBuffer.method586(Class2.anInt7);
							client.secureBuffer.method586(Class88.anInt723);
							Class36.initializeGPI(client.gameBuffer);
							if (client.gameBuffer.pos != var0)
								throw new RuntimeException();
						}
					}
				}
			}
		} catch (final IOException var13) {
			if (client.anInt2063 < 1) {
				if (Class140.anInt929 == Class131_Sub11.anInt1072)
					Class131_Sub11.anInt1072 = Class49.anInt478;
				else
					Class131_Sub11.anInt1072 = Class140.anInt929;

				++client.anInt2063;
				client.loginStage = 0;
			} else
				Class131_Sub20_Sub13.method783(-2);
		}
	}

	static Class131_Sub20_Sub17_Sub3[] method200() {
		final Class131_Sub20_Sub17_Sub3[] var0 = new Class131_Sub20_Sub17_Sub3[Class13.anInt116];

		for (int var2 = 0; var2 < Class13.anInt116; ++var2) {
			final Class131_Sub20_Sub17_Sub3 var1 = var0[var2] = new Class131_Sub20_Sub17_Sub3();
			var1.anInt1826 = Class13.anInt113;
			var1.anInt1828 = Class13.anInt115;
			var1.anInt1824 = Class13.anIntArray114[var2];
			var1.anInt1825 = Class131_Sub20_Sub15.anIntArray1605[var2];
			var1.anInt1822 = Class131_Sub20_Sub19_Sub3.anIntArray1766[var2];
			var1.anInt1827 = NpcFlags.anIntArray54[var2];
			final int var4 = var1.anInt1827 * var1.anInt1822;
			final byte[] var5 = Class13.aByteArrayArray117[var2];
			var1.anIntArray1823 = new int[var4];

			for (int var3 = 0; var3 < var4; ++var3)
				var1.anIntArray1823[var3] = Class36.anIntArray370[var5[var3] & 255];
		}

		Class5.method28();
		return var0;
	}
}
