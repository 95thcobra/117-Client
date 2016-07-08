import java.awt.Component;

public class Class46 {
	static int anInt452;
	static int anInt453;

	public static void method230(final int var0) {
		Class113.anInt830 = 1;
		Class50.aClass100_495 = null;
		Class24.anInt213 = -1;
		Class130.anInt901 = -1;
		Class113.anInt833 = 0;
		Class50.aBool496 = false;
		Class113.anInt834 = var0;
	}

	static final void method231() {
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		int var7;
		int var8;
		int var9;
		int var10;
		int var13;
		int var14;
		int var15;
		int var16;
		if (client.incomingPacket == 230) {
			var1 = client.gameBuffer.method595();
			var2 = ((var1 >> 4) & 7) + Class131_Sub20_Sub19_Sub5.anInt1832;
			var3 = (var1 & 7) + Class131_Sub20_Sub16.anInt1625;
			var4 = var2 + client.gameBuffer.method584();
			var5 = var3 + client.gameBuffer.method584();
			var15 = client.gameBuffer.readShort();
			var14 = client.gameBuffer.readUShort();
			var13 = client.gameBuffer.method595() * 4;
			var16 = client.gameBuffer.method595() * 4;
			var7 = client.gameBuffer.readUShort();
			var8 = client.gameBuffer.readUShort();
			var9 = client.gameBuffer.method595();
			var10 = client.gameBuffer.method595();
			if ((var2 >= 0) && (var3 >= 0) && (var2 < 104) && (var3 < 104) && (var4 >= 0) && (var5 >= 0) && (var4 < 104)
					&& (var5 < 104) && (var14 != '\uffff')) {
				var2 = 64 + (128 * var2);
				var3 = (var3 * 128) + 64;
				var4 = (var4 * 128) + 64;
				var5 = 64 + (var5 * 128);
				final Class131_Sub20_Sub19_Sub4 var17 = new Class131_Sub20_Sub19_Sub4(var14, Class39.anInt410, var2,
						var3, Class18.method88(var2, var3, Class39.anInt410) - var13, client.anInt2038 + var7,
						client.anInt2038 + var8, var9, var10, var15, var16);
				var17.method954(var4, var5, Class18.method88(var4, var5, Class39.anInt410) - var16,
						client.anInt2038 + var7);
				client.aClass115_2284.method471(var17);
			}

		} else if (client.incomingPacket == 16) {
			var1 = client.gameBuffer.readUShort();
			var2 = client.gameBuffer.method616();
			var3 = Class131_Sub20_Sub19_Sub5.anInt1832 + ((var2 >> 4) & 7);
			var4 = (var2 & 7) + Class131_Sub20_Sub16.anInt1625;
			var5 = client.gameBuffer.method614();
			var15 = var5 >> 2;
			var14 = var5 & 3;
			var13 = client.anIntArray2024[var15];
			if ((var3 >= 0) && (var4 >= 0) && (var3 < 104) && (var4 < 104))
				Class24.method112(Class39.anInt410, var3, var4, var13, var1, var15, var14, 0, -1);

		} else {
			if (client.incomingPacket == 225) {
				var1 = client.gameBuffer.method595();
				var2 = ((var1 >> 4) & 7) + Class131_Sub20_Sub19_Sub5.anInt1832;
				var3 = Class131_Sub20_Sub16.anInt1625 + (var1 & 7);
				var4 = client.gameBuffer.readUShort();
				var5 = client.gameBuffer.method595();
				var15 = (var5 >> 4) & 15;
				var14 = var5 & 7;
				var13 = client.gameBuffer.method595();
				if ((var2 >= 0) && (var3 >= 0) && (var2 < 104) && (var3 < 104)) {
					var16 = var15 + 1;
					if ((Class131_Sub11.myPlayer.anIntArray1755[0] >= (var2 - var16))
							&& (Class131_Sub11.myPlayer.anIntArray1755[0] <= (var2 + var16))
							&& (Class131_Sub11.myPlayer.anIntArray1756[0] >= (var3 - var16))
							&& (Class131_Sub11.myPlayer.anIntArray1756[0] <= (var16 + var3))
							&& (client.anInt2086 != 0) && (var14 > 0) && (client.anInt2289 < 50)) {
						client.anIntArray2266[client.anInt2289] = var4;
						client.anIntArray2267[client.anInt2289] = var14;
						client.anIntArray2268[client.anInt2289] = var13;
						client.aClass8Array2129[client.anInt2289] = null;
						client.anIntArray2257[client.anInt2289] = var15 + (var3 << 8) + (var2 << 16);
						++client.anInt2289;
					}
				}
			}

			if (client.incomingPacket == 46) {
				var1 = client.gameBuffer.method595();
				var2 = Class131_Sub20_Sub19_Sub5.anInt1832 + ((var1 >> 4) & 7);
				var3 = (var1 & 7) + Class131_Sub20_Sub16.anInt1625;
				var4 = client.gameBuffer.readUShort();
				var5 = client.gameBuffer.readUShort();
				var15 = client.gameBuffer.readUShort();
				if ((var2 >= 0) && (var3 >= 0) && (var2 < 104) && (var3 < 104)) {
					final Class115 var40 = client.aClass115ArrayArrayArray2306[Class39.anInt410][var2][var3];
					if (var40 != null) {
						for (Class131_Sub20_Sub19_Sub3 var24 = (Class131_Sub20_Sub19_Sub3) var40
								.method465(); null != var24; var24 = (Class131_Sub20_Sub19_Sub3) var40.method468())
							if ((var24.anInt1764 == (var4 & 32767)) && (var24.anInt1763 == var5)) {
								var24.anInt1763 = var15;
								break;
							}

						Class131_Sub19.method676(var2, var3);
					}
				}

			} else if (client.incomingPacket == 229) {
				var1 = client.gameBuffer.method595();
				var2 = ((var1 >> 4) & 7) + Class131_Sub20_Sub19_Sub5.anInt1832;
				var3 = (var1 & 7) + Class131_Sub20_Sub16.anInt1625;
				var4 = client.gameBuffer.readUShort();
				var5 = client.gameBuffer.method595();
				var15 = client.gameBuffer.readUShort();
				if ((var2 >= 0) && (var3 >= 0) && (var2 < 104) && (var3 < 104)) {
					var2 = 64 + (var2 * 128);
					var3 = 64 + (var3 * 128);
					final Class131_Sub20_Sub19_Sub1 var21 = new Class131_Sub20_Sub19_Sub1(var4, Class39.anInt410, var2,
							var3, Class18.method88(var2, var3, Class39.anInt410) - var5, var15, client.anInt2038);
					client.aClass115_2160.method471(var21);
				}

			} else if (client.incomingPacket == 175) {
				var1 = client.gameBuffer.readULEShortA();
				var2 = client.gameBuffer.method615();
				var3 = Class131_Sub20_Sub19_Sub5.anInt1832 + ((var2 >> 4) & 7);
				var4 = Class131_Sub20_Sub16.anInt1625 + (var2 & 7);
				var5 = client.gameBuffer.method595();
				var15 = var5 >> 2;
				var14 = var5 & 3;
				var13 = client.anIntArray2024[var15];
				if ((var3 >= 0) && (var4 >= 0) && (var3 < 103) && (var4 < 103)) {
					if (var13 == 0) {
						final Class25 var6 = Class65.aClass33_595.method164(Class39.anInt410, var3, var4);
						if (var6 != null) {
							var7 = (var6.anInt223 >> 14) & 32767;
							if (var15 == 2) {
								var6.aClass131_Sub20_Sub19_218 = new Class131_Sub20_Sub19_Sub5(var7, 2, var14 + 4,
										Class39.anInt410, var3, var4, var1, false, var6.aClass131_Sub20_Sub19_218);
								var6.aClass131_Sub20_Sub19_220 = new Class131_Sub20_Sub19_Sub5(var7, 2, (1 + var14) & 3,
										Class39.anInt410, var3, var4, var1, false, var6.aClass131_Sub20_Sub19_220);
							} else
								var6.aClass131_Sub20_Sub19_218 = new Class131_Sub20_Sub19_Sub5(var7, var15, var14,
										Class39.anInt410, var3, var4, var1, false, var6.aClass131_Sub20_Sub19_218);
						}
					}

					if (var13 == 1) {
						final Class38 var36 = Class65.aClass33_595.method192(Class39.anInt410, var3, var4);
						if (var36 != null) {
							var7 = (var36.anInt403 >> 14) & 32767;
							if ((var15 != 4) && (var15 != 5)) {
								if (var15 == 6)
									var36.aClass131_Sub20_Sub19_402 = new Class131_Sub20_Sub19_Sub5(var7, 4, var14 + 4,
											Class39.anInt410, var3, var4, var1, false, var36.aClass131_Sub20_Sub19_402);
								else if (var15 == 7)
									var36.aClass131_Sub20_Sub19_402 = new Class131_Sub20_Sub19_Sub5(var7, 4,
											4 + ((var14 + 2) & 3), Class39.anInt410, var3, var4, var1, false,
											var36.aClass131_Sub20_Sub19_402);
								else if (var15 == 8) {
									var36.aClass131_Sub20_Sub19_402 = new Class131_Sub20_Sub19_Sub5(var7, 4, 4 + var14,
											Class39.anInt410, var3, var4, var1, false, var36.aClass131_Sub20_Sub19_402);
									var36.aClass131_Sub20_Sub19_395 = new Class131_Sub20_Sub19_Sub5(var7, 4,
											4 + ((var14 + 2) & 3), Class39.anInt410, var3, var4, var1, false,
											var36.aClass131_Sub20_Sub19_395);
								}
							} else
								var36.aClass131_Sub20_Sub19_402 = new Class131_Sub20_Sub19_Sub5(var7, 4, var14,
										Class39.anInt410, var3, var4, var1, false, var36.aClass131_Sub20_Sub19_402);
						}
					}

					if (var13 == 2) {
						final Class47 var37 = Class65.aClass33_595.method165(Class39.anInt410, var3, var4);
						if (var15 == 11)
							var15 = 10;

						if (null != var37)
							var37.aClass131_Sub20_Sub19_457 = new Class131_Sub20_Sub19_Sub5(
									(var37.anInt465 >> 14) & 32767, var15, var14, Class39.anInt410, var3, var4, var1,
									false, var37.aClass131_Sub20_Sub19_457);
					}

					if (var13 == 3) {
						final Class22 var38 = Class65.aClass33_595.method166(Class39.anInt410, var3, var4);
						if (null != var38)
							var38.aClass131_Sub20_Sub19_205 = new Class131_Sub20_Sub19_Sub5(
									(var38.anInt204 >> 14) & 32767, 22, var14, Class39.anInt410, var3, var4, var1,
									false, var38.aClass131_Sub20_Sub19_205);
					}
				}

			} else {
				if (client.incomingPacket == 206) {
					byte var35 = client.gameBuffer.method599();
					var2 = client.gameBuffer.readUShort();
					var3 = client.gameBuffer.method616();
					var4 = ((var3 >> 4) & 7) + Class131_Sub20_Sub19_Sub5.anInt1832;
					var5 = Class131_Sub20_Sub16.anInt1625 + (var3 & 7);
					byte var39 = client.gameBuffer.method617();
					var14 = client.gameBuffer.method629();
					var13 = client.gameBuffer.readULEShortA();
					var16 = client.gameBuffer.method616();
					var7 = var16 >> 2;
					var8 = var16 & 3;
					var9 = client.anIntArray2024[var7];
					var10 = client.gameBuffer.readULEShortA();
					byte var27 = client.gameBuffer.method599();
					byte var12 = client.gameBuffer.method617();
					Player var11;
					if (client.myPlayerIndex == var2)
						var11 = Class131_Sub11.myPlayer;
					else
						var11 = client.playerArray[var2];

					if (null != var11) {
						final Class131_Sub20_Sub9 var20 = Class83.method362(var10);
						int var18;
						int var22;
						if ((var8 != 1) && (var8 != 3)) {
							var18 = var20.anInt1511;
							var22 = var20.anInt1503;
						} else {
							var18 = var20.anInt1503;
							var22 = var20.anInt1511;
						}

						final int var19 = (var18 >> 1) + var4;
						final int var33 = var4 + ((1 + var18) >> 1);
						final int var28 = var5 + (var22 >> 1);
						final int var29 = var5 + ((var22 + 1) >> 1);
						final int[][] var30 = Class26.anIntArrayArrayArray239[Class39.anInt410];
						final int var25 = (var30[var19][var28] + var30[var33][var28] + var30[var19][var29]
								+ var30[var33][var29]) >> 2;
						final int var31 = (var18 << 6) + (var4 << 7);
						final int var23 = (var22 << 6) + (var5 << 7);
						final Class131_Sub20_Sub19_Sub7 var32 = var20.method752(var7, var8, var30, var31, var25, var23);
						if (var32 != null) {
							Class24.method112(Class39.anInt410, var4, var5, var9, -1, 0, 0, 1 + var13, 1 + var14);
							var11.anInt1998 = client.anInt2038 + var13;
							var11.anInt1992 = var14 + client.anInt2038;
							var11.aClass131_Sub20_Sub19_Sub7_1987 = var32;
							var11.anInt1989 = (64 * var18) + (128 * var4);
							var11.anInt1991 = (64 * var22) + (var5 * 128);
							var11.anInt1988 = var25;
							byte var26;
							if (var39 > var12) {
								var26 = var39;
								var39 = var12;
								var12 = var26;
							}

							if (var35 > var27) {
								var26 = var35;
								var35 = var27;
								var27 = var26;
							}

							var11.anInt1993 = var4 + var39;
							var11.anInt1995 = var12 + var4;
							var11.anInt1994 = var35 + var5;
							var11.anInt1996 = var5 + var27;
						}
					}
				}

				if (client.incomingPacket == 38) {
					var1 = client.gameBuffer.method595();
					var2 = Class131_Sub20_Sub19_Sub5.anInt1832 + ((var1 >> 4) & 7);
					var3 = (var1 & 7) + Class131_Sub20_Sub16.anInt1625;
					var4 = client.gameBuffer.method595();
					var5 = var4 >> 2;
					var15 = var4 & 3;
					var14 = client.anIntArray2024[var5];
					if ((var2 >= 0) && (var3 >= 0) && (var2 < 104) && (var3 < 104))
						Class24.method112(Class39.anInt410, var2, var3, var14, -1, var5, var15, 0, -1);

				} else {
					Class131_Sub20_Sub19_Sub3 var0;
					if (client.incomingPacket == 138) {
						var1 = client.gameBuffer.readULEShortA();
						var2 = client.gameBuffer.readUShort();
						var3 = client.gameBuffer.method614();
						var4 = Class131_Sub20_Sub19_Sub5.anInt1832 + ((var3 >> 4) & 7);
						var5 = (var3 & 7) + Class131_Sub20_Sub16.anInt1625;
						if ((var4 >= 0) && (var5 >= 0) && (var4 < 104) && (var5 < 104)) {
							var0 = new Class131_Sub20_Sub19_Sub3();
							var0.anInt1764 = var1;
							var0.anInt1763 = var2;
							if (null == client.aClass115ArrayArrayArray2306[Class39.anInt410][var4][var5])
								client.aClass115ArrayArrayArray2306[Class39.anInt410][var4][var5] = new Class115();

							client.aClass115ArrayArrayArray2306[Class39.anInt410][var4][var5].method471(var0);
							Class131_Sub19.method676(var4, var5);
						}

					} else if (client.incomingPacket == 90) {
						var1 = client.gameBuffer.readUshortA();
						var2 = client.gameBuffer.method595();
						var3 = ((var2 >> 4) & 7) + Class131_Sub20_Sub19_Sub5.anInt1832;
						var4 = Class131_Sub20_Sub16.anInt1625 + (var2 & 7);
						if ((var3 >= 0) && (var4 >= 0) && (var3 < 104) && (var4 < 104)) {
							final Class115 var34 = client.aClass115ArrayArrayArray2306[Class39.anInt410][var3][var4];
							if (null != var34) {
								for (var0 = (Class131_Sub20_Sub19_Sub3) var34
										.method465(); null != var0; var0 = (Class131_Sub20_Sub19_Sub3) var34
												.method468())
									if (var0.anInt1764 == (var1 & 32767)) {
										var0.method501();
										break;
									}

								if (var34.method465() == null)
									client.aClass115ArrayArrayArray2306[Class39.anInt410][var3][var4] = null;

								Class131_Sub19.method676(var3, var4);
							}
						}

					}
				}
			}
		}
	}

	static final boolean method232(final byte[] var0, final int var1, final int var2) {
		boolean var3 = true;
		final DataBuffer var9 = new DataBuffer(var0);
		int var6 = -1;

		label68: while (true) {
			final int var8 = var9.method606();
			if (var8 == 0)
				return var3;

			var6 += var8;
			int var4 = 0;
			boolean var11 = false;

			while (true) {
				int var5;
				while (!var11) {
					var5 = var9.method606();
					if (var5 == 0)
						continue label68;

					var4 += var5 - 1;
					final int var15 = var4 & 63;
					final int var14 = (var4 >> 6) & 63;
					final int var10 = var9.method595() >> 2;
					final int var13 = var1 + var14;
					final int var7 = var2 + var15;
					if ((var13 > 0) && (var7 > 0) && (var13 < 103) && (var7 < 103)) {
						final Class131_Sub20_Sub9 var12 = Class83.method362(var6);
						if ((var10 != 22) || !client.aBool2033 || (var12.anInt1521 != 0) || (var12.anInt1519 == 1)
								|| var12.aBool1543) {
							if (!var12.method751()) {
								++client.anInt2084;
								var3 = false;
							}

							var11 = true;
						}
					}
				}

				var5 = var9.method606();
				if (var5 == 0)
					break;

				var9.method595();
			}
		}
	}

	static void method233() {
		Class32.aMap298.clear();
		Class32.aClass125_301.method489();
		Class32.aClass124_299.method485();
		Class32.anInt300 = 0;
	}

	public static final Class17 method234(final Class78 var0, final Component var1, final int var2, int var3) {
		if (Class17.anInt162 == 0)
			throw new IllegalStateException();
		else if ((var2 >= 0) && (var2 < 2)) {
			if (var3 < 256)
				var3 = 256;

			try {
				final Class17_Sub2 var7 = new Class17_Sub2();
				var7.anIntArray158 = new int[256 * (Class17.aBool166 ? 2 : 1)];
				var7.anInt163 = var3;
				var7.method71(var1);
				var7.anInt168 = 1024 + (var3 & -1024);
				if (var7.anInt168 > 16384)
					var7.anInt168 = 16384;

				var7.method72(var7.anInt168);
				if ((Class17.anInt156 > 0) && (null == Class126_Sub1.aClass12_952)) {
					Class126_Sub1.aClass12_952 = new Class12();
					Class126_Sub1.aClass12_952.aClass78_112 = var0;
					var0.method348(Class126_Sub1.aClass12_952, Class17.anInt156);
				}

				if (Class126_Sub1.aClass12_952 != null) {
					if (null != Class126_Sub1.aClass12_952.aClass17Array108[var2])
						throw new IllegalArgumentException();

					Class126_Sub1.aClass12_952.aClass17Array108[var2] = var7;
				}

				return var7;
			} catch (final Throwable var6) {
				try {
					final Class17_Sub1 var4 = new Class17_Sub1(var0, var2);
					var4.anIntArray158 = new int[256 * (Class17.aBool166 ? 2 : 1)];
					var4.anInt163 = var3;
					var4.method71(var1);
					var4.anInt168 = 16384;
					var4.method72(var4.anInt168);
					if ((Class17.anInt156 > 0) && (null == Class126_Sub1.aClass12_952)) {
						Class126_Sub1.aClass12_952 = new Class12();
						Class126_Sub1.aClass12_952.aClass78_112 = var0;
						var0.method348(Class126_Sub1.aClass12_952, Class17.anInt156);
					}

					if (null != Class126_Sub1.aClass12_952) {
						if (Class126_Sub1.aClass12_952.aClass17Array108[var2] != null)
							throw new IllegalArgumentException();

						Class126_Sub1.aClass12_952.aClass17Array108[var2] = var4;
					}

					return var4;
				} catch (final Throwable var5) {
					return new Class17();
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	public static Class131_Sub20_Sub14 method235(final int var0) {
		Class131_Sub20_Sub14 var1 = (Class131_Sub20_Sub14) Class131_Sub20_Sub14.aClass121_1584.method482(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class131_Sub20_Sub14.aClass100_1595.method402(13, var0);
			var1 = new Class131_Sub20_Sub14();
			var1.anInt1583 = var0;
			if (var2 != null)
				var1.method784(new DataBuffer(var2));

			Class131_Sub20_Sub14.aClass121_1584.method479(var1, var0);
			return var1;
		}
	}
}
