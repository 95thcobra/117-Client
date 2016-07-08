import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class Class131_Sub20_Sub7 extends Class131_Sub20 {
	protected static int anInt1491;
	static int anInt1493;
	public boolean aBool1490 = false;
	static Class121 aClass121_1492 = new Class121(64);

	public static void method740(final String var0, final Throwable var1) {
		try {
			String var2 = "";
			if (null != var1) {
				Throwable var3 = var1;
				String var5;
				if (var1 instanceof RuntimeException_Sub1) {
					final RuntimeException_Sub1 var4 = (RuntimeException_Sub1) var1;
					var5 = var4.aString1953 + " | ";
					var3 = var4.aThrowable1950;
				} else
					var5 = "";

				final StringWriter var18 = new StringWriter();
				final PrintWriter var6 = new PrintWriter(var18);
				var3.printStackTrace(var6);
				var6.close();
				final String var7 = var18.toString();
				final BufferedReader var8 = new BufferedReader(new StringReader(var7));
				final String var9 = var8.readLine();

				while (true) {
					String var10 = var8.readLine();
					if (null == var10) {
						var5 = var5 + "| " + var9;
						var2 = var5;
						break;
					}

					final int var11 = var10.indexOf(40);
					final int var12 = var10.indexOf(41, var11 + 1);
					if ((var11 >= 0) && (var12 >= 0)) {
						String var13 = var10.substring(var11 + 1, var12);
						final int var14 = var13.indexOf(".java:");
						if (var14 >= 0) {
							var13 = var13.substring(0, var14) + var13.substring(var14 + 5);
							var5 = var5 + var13 + '\u0020';
							continue;
						}

						var10 = var10.substring(0, var11);
					}

					var10 = var10.trim();
					var10 = var10.substring(var10.lastIndexOf(32) + 1);
					var10 = var10.substring(var10.lastIndexOf(9) + 1);
					var5 = var5 + var10 + '\u0020';
				}
			}

			if (var0 != null) {
				if (null != var1)
					var2 = var2 + " | ";

				var2 = var2 + var0;
			}

			System.out.println("Error: " + var2);
			var2 = var2.replace('\u003a', '\u002e');
			var2 = var2.replace('\u0040', '\u005f');
			var2 = var2.replace('\u0026', '\u005f');
			var2 = var2.replace('\u0023', '\u005f');
			if (null == RuntimeException_Sub1.anApplet1952)
				return;

			final URL var15 = new URL(RuntimeException_Sub1.anApplet1952.getCodeBase(),
					"clienterror.ws?c=" + RuntimeException_Sub1.anInt1955 + "&u=" + RuntimeException_Sub1.aString1951
							+ "&v1=" + Class78.aString638 + "&v2=" + Class78.aString639 + "&e=" + var2);
			final DataInputStream var17 = new DataInputStream(var15.openStream());
			var17.read();
			var17.close();
		} catch (final Exception var16) {
			;
		}

	}

	void method741(final DataBuffer var1, final int var2) {
		if (var2 == 2)
			aBool1490 = true;

	}

	void method742(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method595();
			if (var2 == 0)
				return;

			method741(var1, var2);
		}
	}

	static int method743(final int var0, final int var1) {
		final Class131_Sub11 var2 = (Class131_Sub11) Class131_Sub11.aClass114_1074.method457(var0);
		return var2 != null ? ((var1 >= 0) && (var1 < var2.anIntArray1071.length) ? var2.anIntArray1071[var1] : 0) : 0;
	}

	static final void method744(final Class131_Sub18 var0, final int var1, final int var2) {
		if (var0.anInt1161 == 1)
			Class73.method334(var0.aString1274, "", 24, 0, 0, var0.anInt1272);

		String var3;
		int var4;
		int var7;
		if ((var0.anInt1161 == 2) && !client.aBool2178) {
			var7 = Class49.method254(var0);
			var4 = (var7 >> 11) & 63;
			if (var4 == 0)
				var3 = null;
			else if ((null != var0.aString1199) && (var0.aString1199.trim().length() != 0))
				var3 = var0.aString1199;
			else
				var3 = null;

			if (null != var3)
				Class73.method334(var3, Class103.method427('\uff00') + var0.aString1273, 25, 0, -1, var0.anInt1272);
		}

		if (var0.anInt1161 == 3)
			Class73.method334("Close", "", 26, 0, 0, var0.anInt1272);

		if (var0.anInt1161 == 4)
			Class73.method334(var0.aString1274, "", 28, 0, 0, var0.anInt1272);

		if (var0.anInt1161 == 5)
			Class73.method334(var0.aString1274, "", 29, 0, 0, var0.anInt1272);

		if ((var0.anInt1161 == 6) && (client.aClass131_Sub18_2049 == null))
			Class73.method334(var0.aString1274, "", 30, 0, -1, var0.anInt1272);

		int var5;
		if (var0.anInt1202 == 2) {
			var5 = 0;

			for (var4 = 0; var4 < var0.anInt1291; ++var4)
				for (var7 = 0; var7 < var0.anInt1173; ++var7) {
					int var11 = var7 * (var0.anInt1224 + 32);
					int var10 = var4 * (32 + var0.anInt1225);
					if (var5 < 20) {
						var11 += var0.anIntArray1226[var5];
						var10 += var0.anIntArray1227[var5];
					}

					if ((var1 >= var11) && (var2 >= var10) && (var1 < (var11 + 32)) && (var2 < (32 + var10))) {
						client.anInt2143 = var5;
						Class131_Sub20_Sub2.aClass131_Sub18_1422 = var0;
						if (var0.anIntArray1292[var5] > 0) {
							final Class131_Sub20_Sub2 var12 = Class79_Sub1.method645(var0.anIntArray1292[var5] - 1,
									(short) 23352);
							if ((client.anInt2090 == 1) && Class68.method320(Class49.method254(var0))) {
								if ((PacketDecoder.anInt544 != var0.anInt1272) || (Class131_Sub20_Sub1.anInt1370 != var5))
									Class73.method334("Use", client.aString2177 + " " + "->" + " "
											+ Class103.method427(16748608) + var12.aString1385, 31, var12.anInt1423,
											var5, var0.anInt1272);
							} else if (client.aBool2178 && Class68.method320(Class49.method254(var0))) {
								if ((Class45.anInt451 & 16) == 16)
									Class73.method334(
											client.aString2181, client.aString2182 + " " + "->" + " "
													+ Class103.method427(16748608) + var12.aString1385,
											32, var12.anInt1423, var5, var0.anInt1272);
							} else {
								String[] var9 = var12.aStringArray1406;
								if (client.aBool2194)
									var9 = Class49.method255(var9);

								int var8;
								byte var13;
								if (Class68.method320(Class49.method254(var0)))
									for (var8 = 4; var8 >= 3; --var8)
										if ((var9 != null) && (var9[var8] != null)) {
											if (var8 == 3)
												var13 = 36;
											else
												var13 = 37;

											Class73.method334(var9[var8],
													Class103.method427(16748608) + var12.aString1385, var13,
													var12.anInt1423, var5, var0.anInt1272);
										} else if (var8 == 4)
											Class73.method334("Drop", Class103.method427(16748608) + var12.aString1385,
													37, var12.anInt1423, var5, var0.anInt1272);

								if (Class51.method270(Class49.method254(var0)))
									Class73.method334("Use", Class103.method427(16748608) + var12.aString1385, 38,
											var12.anInt1423, var5, var0.anInt1272);

								if (Class68.method320(Class49.method254(var0)) && (var9 != null))
									for (var8 = 2; var8 >= 0; --var8)
										if (var9[var8] != null) {
											var13 = 0;
											if (var8 == 0)
												var13 = 33;

											if (var8 == 1)
												var13 = 34;

											if (var8 == 2)
												var13 = 35;

											Class73.method334(var9[var8],
													Class103.method427(16748608) + var12.aString1385, var13,
													var12.anInt1423, var5, var0.anInt1272);
										}

								var9 = var0.aStringArray1200;
								if (client.aBool2194)
									var9 = Class49.method255(var9);

								if (var9 != null)
									for (var8 = 4; var8 >= 0; --var8)
										if (null != var9[var8]) {
											var13 = 0;
											if (var8 == 0)
												var13 = 39;

											if (var8 == 1)
												var13 = 40;

											if (var8 == 2)
												var13 = 41;

											if (var8 == 3)
												var13 = 42;

											if (var8 == 4)
												var13 = 43;

											Class73.method334(var9[var8],
													Class103.method427(16748608) + var12.aString1385, var13,
													var12.anInt1423, var5, var0.anInt1272);
										}

								Class73.method334("Examine", Class103.method427(16748608) + var12.aString1385, 1005,
										var12.anInt1423, var5, var0.anInt1272);
							}
						}
					}

					++var5;
				}
		}

		if (var0.aBool1263)
			if (client.aBool2178) {
				if (Class13.method54(Class49.method254(var0)) && ((Class45.anInt451 & 32) == 32))
					Class73.method334(client.aString2181, client.aString2182 + " " + "->" + " " + var0.aString1237, 58,
							0, var0.anInt1159, var0.anInt1272);
			} else {
				for (var5 = 9; var5 >= 5; --var5) {
					final String var6 = Class131_Sub20_Sub19.method867(var0, var5);
					if (var6 != null)
						Class73.method334(var6, var0.aString1237, 1007, var5 + 1, var0.anInt1159, var0.anInt1272);
				}

				var7 = Class49.method254(var0);
				var4 = (var7 >> 11) & 63;
				if (var4 == 0)
					var3 = null;
				else if ((var0.aString1199 != null) && (var0.aString1199.trim().length() != 0))
					var3 = var0.aString1199;
				else
					var3 = null;

				for (var7 = 4; var7 >= 0; --var7) {
					final String var14 = Class131_Sub20_Sub19.method867(var0, var7);
					if (null != var14)
						Class73.method334(var14, var0.aString1237, 57, var7 + 1, var0.anInt1159, var0.anInt1272);
				}

				if (Class53.method274(Class49.method254(var0)))
					Class73.method334("Continue", "", 30, 0, var0.anInt1159, var0.anInt1272);
			}

	}
}
