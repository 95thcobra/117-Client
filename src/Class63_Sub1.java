import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class63_Sub1 extends Class63 {
	static int[] anIntArray1100;

	@Override
	protected boolean method302(final int var1, final int var2, final int var3, final Class51 var4, final byte var5) {
		return (var2 == anInt587) && (var3 == anInt583);
	}

	static final void method579(final String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			Class50.aClass28_494.aBool251 = !Class50.aClass28_494.aBool251;
			Class24.method115();
			if (Class50.aClass28_494.aBool251)
				Class131_Sub20_Sub15.method792(99, "", "Roofs are now all hidden");
			else
				Class131_Sub20_Sub15.method792(99, "", "Roofs will only be removed selectively");
		}

		if (var0.equalsIgnoreCase("displayfps"))
			client.aBool2092 = !client.aBool2092;

		if (client.playerRights >= 2) {
			if (var0.equalsIgnoreCase("fpson"))
				client.aBool2092 = true;

			if (var0.equalsIgnoreCase("fpsoff"))
				client.aBool2092 = false;

			if (var0.equalsIgnoreCase("gc"))
				System.gc();

			if (var0.equalsIgnoreCase("clientdrop"))
				if (client.anInt2080 > 0)
					Class26.method121();
				else {
					Class32.method142(40);
					Class42.aClass86_421 = Class131_Sub20_Sub20.loginConnection;
					Class131_Sub20_Sub20.loginConnection = null;
				}

			if (var0.equalsIgnoreCase("errortest") && (client.anInt2030 == 2))
				throw new RuntimeException();
		}

		client.secureBuffer.method871(227);
		client.secureBuffer.writeByte(var0.length() + 1);
		client.secureBuffer.writeStr(var0);
	}

	static final void method580(final int var0, final int var1, final int var2, final int var3) {
		if ((client.anInt2090 == 0) && !client.aBool2178)
			Class73.method334("Walk here", "", 23, 0, var0 - var2, var1 - var3);

		int var8 = -1;
		int var5 = -1;

		int var6;
		int var9;
		for (var6 = 0; var6 < Class131_Sub20_Sub19_Sub7.anInt1944; ++var6) {
			var9 = Class131_Sub20_Sub19_Sub7.anIntArray1945[var6];
			final int var10 = var9 & 127;
			final int var11 = (var9 >> 7) & 127;
			final int var12 = (var9 >> 29) & 3;
			final int var13 = (var9 >> 14) & 32767;
			if (var9 != var5) {
				var5 = var9;
				if ((var12 == 2) && (Class65.aClass33_595.method187(Class39.anInt410, var10, var11, var9) >= 0)) {
					Class131_Sub20_Sub9 var16 = Class83.method362(var13);
					if (var16.anIntArray1513 != null)
						var16 = var16.method754();

					if (var16 == null)
						continue;

					if (client.anInt2090 == 1)
						Class73.method334("Use", client.aString2177 + " " + "->" + " " + Class103.method427('\uffff')
								+ var16.aString1528, 1, var9, var10, var11);
					else if (client.aBool2178) {
						if ((Class45.anInt451 & 4) == 4)
							Class73.method334(client.aString2181, client.aString2182 + " " + "->" + " "
									+ Class103.method427('\uffff') + var16.aString1528, 2, var9, var10, var11);
					} else {
						String[] var18 = var16.aStringArray1529;
						if (client.aBool2194)
							var18 = Class49.method255(var18);

						if (null != var18)
							for (int var19 = 4; var19 >= 0; --var19)
								if (null != var18[var19]) {
									short var7 = 0;
									if (var19 == 0)
										var7 = 3;

									if (var19 == 1)
										var7 = 4;

									if (var19 == 2)
										var7 = 5;

									if (var19 == 3)
										var7 = 6;

									if (var19 == 4)
										var7 = 1001;

									Class73.method334(var18[var19], Class103.method427('\uffff') + var16.aString1528,
											var7, var9, var10, var11);
								}

						Class73.method334("Examine", Class103.method427('\uffff') + var16.aString1528, 1002,
								var16.anInt1509 << 14, var10, var11);
					}
				}

				Player var15;
				Class131_Sub20_Sub19_Sub2_Sub1 var17;
				int var20;
				int var23;
				int[] var26;
				if (var12 == 1) {
					final Class131_Sub20_Sub19_Sub2_Sub1 var24 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var13];
					if (var24 == null)
						continue;

					if ((var24.aClass131_Sub20_Sub6_1978.anInt1465 == 1) && ((var24.anInt1718 & 127) == 64)
							&& ((var24.anInt1759 & 127) == 64)) {
						for (var20 = 0; var20 < client.anInt2230; ++var20) {
							var17 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[client.anIntArray2067[var20]];
							if ((var17 != null) && (var24 != var17) && (var17.aClass131_Sub20_Sub6_1978.anInt1465 == 1)
									&& (var17.anInt1718 == var24.anInt1718) && (var24.anInt1759 == var17.anInt1759))
								Class25.method119(var17.aClass131_Sub20_Sub6_1978, client.anIntArray2067[var20], var10,
										var11);
						}

						var20 = GPI.anInt11;
						var26 = GPI.anIntArray17;

						for (var23 = 0; var23 < var20; ++var23) {
							var15 = client.playerArray[var26[var23]];
							if ((null != var15) && (var15.anInt1718 == var24.anInt1718)
									&& (var24.anInt1759 == var15.anInt1759))
								Class63.method301(var15, var26[var23], var10, var11);
						}
					}

					Class25.method119(var24.aClass131_Sub20_Sub6_1978, var13, var10, var11);
				}

				if (var12 == 0) {
					final Player var25 = client.playerArray[var13];
					if (null == var25)
						continue;

					if (((var25.anInt1718 & 127) == 64) && ((var25.anInt1759 & 127) == 64)) {
						for (var20 = 0; var20 < client.anInt2230; ++var20) {
							var17 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[client.anIntArray2067[var20]];
							if ((var17 != null) && (var17.aClass131_Sub20_Sub6_1978.anInt1465 == 1)
									&& (var17.anInt1718 == var25.anInt1718) && (var25.anInt1759 == var17.anInt1759))
								Class25.method119(var17.aClass131_Sub20_Sub6_1978, client.anIntArray2067[var20], var10,
										var11);
						}

						var20 = GPI.anInt11;
						var26 = GPI.anIntArray17;

						for (var23 = 0; var23 < var20; ++var23) {
							var15 = client.playerArray[var26[var23]];
							if ((var15 != null) && (var25 != var15) && (var25.anInt1718 == var15.anInt1718)
									&& (var15.anInt1759 == var25.anInt1759))
								Class63.method301(var15, var26[var23], var10, var11);
						}
					}

					if (var13 != client.anInt2200)
						Class63.method301(var25, var13, var10, var11);
					else
						var8 = var9;
				}

				if (var12 == 3) {
					final Class115 var27 = client.aClass115ArrayArrayArray2306[Class39.anInt410][var10][var11];
					if (null != var27)
						for (Class131_Sub20_Sub19_Sub3 var29 = (Class131_Sub20_Sub19_Sub3) var27
								.method467(); var29 != null; var29 = (Class131_Sub20_Sub19_Sub3) var27.method469()) {
							final Class131_Sub20_Sub2 var28 = Class79_Sub1.method645(var29.anInt1764, (short) 28401);
							if (client.anInt2090 == 1)
								Class73.method334("Use", client.aString2177 + " " + "->" + " "
										+ Class103.method427(16748608) + var28.aString1385, 16, var29.anInt1764, var10,
										var11);
							else if (client.aBool2178) {
								if ((Class45.anInt451 & 1) == 1)
									Class73.method334(
											client.aString2181, client.aString2182 + " " + "->" + " "
													+ Class103.method427(16748608) + var28.aString1385,
											17, var29.anInt1764, var10, var11);
							} else {
								String[] var22 = var28.aStringArray1393;
								if (client.aBool2194)
									var22 = Class49.method255(var22);

								for (int var4 = 4; var4 >= 0; --var4)
									if ((null != var22) && (var22[var4] != null)) {
										byte var14 = 0;
										if (var4 == 0)
											var14 = 18;

										if (var4 == 1)
											var14 = 19;

										if (var4 == 2)
											var14 = 20;

										if (var4 == 3)
											var14 = 21;

										if (var4 == 4)
											var14 = 22;

										Class73.method334(var22[var4], Class103.method427(16748608) + var28.aString1385,
												var14, var29.anInt1764, var10, var11);
									} else if (var4 == 2)
										Class73.method334("Take", Class103.method427(16748608) + var28.aString1385, 20,
												var29.anInt1764, var10, var11);

								Class73.method334("Examine", Class103.method427(16748608) + var28.aString1385, 1004,
										var29.anInt1764, var10, var11);
							}
						}
				}
			}
		}

		if (var8 != -1) {
			var6 = var8 & 127;
			var9 = (var8 >> 7) & 127;
			final Player var21 = client.playerArray[client.anInt2200];
			Class63.method301(var21, client.anInt2200, var6, var9);
		}

	}

	public static void method581(final Class131_Sub14_Sub1 var0) {
		final Class131_Sub24 var1 = (Class131_Sub24) Class135.aClass128_906.method492();
		if (var1 != null) {
			final int var2 = var0.pos;
			var0.writeInt(var1.anInt1344);

			for (int var3 = 0; var3 < var1.anInt1343; ++var3)
				if (var1.anIntArray1350[var3] != 0)
					var0.writeByte(var1.anIntArray1350[var3]);
				else
					try {
						final int var4 = var1.anIntArray1345[var3];
						Field var5;
						int var6;
						if (var4 == 0) {
							var5 = var1.aFieldArray1346[var3];
							var6 = var5.getInt((Object) null);
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.aFieldArray1346[var3];
							var5.setInt((Object) null, var1.anIntArray1347[var3]);
							var0.writeByte(0);
						} else if (var4 == 2) {
							var5 = var1.aFieldArray1346[var3];
							var6 = var5.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var6);
						}

						Method var25;
						if (var4 != 3) {
							if (var4 == 4) {
								var25 = var1.aMethodArray1348[var3];
								var6 = var25.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var25 = var1.aMethodArray1348[var3];
							final byte[][] var7 = var1.aByteArrayArrayArray1349[var3];
							final Object[] var8 = new Object[var7.length];

							for (int var9 = 0; var9 < var7.length; ++var9) {
								final ObjectInputStream var10 = new ObjectInputStream(
										new ByteArrayInputStream(var7[var9]));
								var8[var9] = var10.readObject();
							}

							final Object var11 = var25.invoke((Object) null, var8);
							if (var11 == null)
								var0.writeByte(0);
							else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.method635(((Number) var11).longValue());
							} else if (var11 instanceof String) {
								var0.writeByte(2);
								var0.writeStr((String) var11);
							} else
								var0.writeByte(4);
						}
					} catch (final ClassNotFoundException var13) {
						var0.writeByte(-10);
					} catch (final InvalidClassException var14) {
						var0.writeByte(-11);
					} catch (final StreamCorruptedException var15) {
						var0.writeByte(-12);
					} catch (final OptionalDataException var16) {
						var0.writeByte(-13);
					} catch (final IllegalAccessException var17) {
						var0.writeByte(-14);
					} catch (final IllegalArgumentException var18) {
						var0.writeByte(-15);
					} catch (final InvocationTargetException var19) {
						var0.writeByte(-16);
					} catch (final SecurityException var20) {
						var0.writeByte(-17);
					} catch (final IOException var21) {
						var0.writeByte(-18);
					} catch (final NullPointerException var22) {
						var0.writeByte(-19);
					} catch (final Exception var23) {
						var0.writeByte(-20);
					} catch (final Throwable var24) {
						var0.writeByte(-21);
					}

			var0.method637(var2);
			var1.method501();
		}
	}
}
