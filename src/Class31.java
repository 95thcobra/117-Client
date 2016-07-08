public final class Class31 {
	int anInt288;
	int anInt289;
	Class131_Sub20_Sub19 aClass131_Sub20_Sub19_290;
	Class131_Sub20_Sub19 aClass131_Sub20_Sub19_291;
	int anInt292;
	Class131_Sub20_Sub19 aClass131_Sub20_Sub19_293;
	int anInt294;
	int anInt295;
	static int anInt296;

	static final void method137(final String var0) {
		if (null != Class131_Sub20_Sub8.aClass131_Sub13Array1498) {
			client.secureBuffer.method871(212);
			client.secureBuffer.writeByte(Class131_Sub6.method554(var0));
			client.secureBuffer.writeStr(var0);
		}
	}

	static final void method138(final Class131_Sub18[] var0, final int var1) {
		for (final Class131_Sub18 element : var0) {
			final Class131_Sub18 var3 = element;
			if ((var3 != null) && (var3.anInt1177 == var1)
					&& (!var3.aBool1263 || !Class131_Sub20_Sub19_Sub4.method958(var3))) {
				if (var3.anInt1202 == 0) {
					if (!var3.aBool1263 && Class131_Sub20_Sub19_Sub4.method958(var3)
							&& (var3 != Class21.aClass131_Sub18_199))
						continue;

					method138(var0, var3.anInt1272);
					if (null != var3.aClass131_Sub18Array1171)
						method138(var3.aClass131_Sub18Array1171, var3.anInt1272);

					final Class131_Sub7 var4 = (Class131_Sub7) client.aClass114_2184.method457(var3.anInt1272);
					if (var4 != null)
						Class131_Sub13.method583(var4.anInt1025);
				}

				if (var3.anInt1202 == 6) {
					int var6;
					if ((var3.anInt1160 != -1) || (var3.anInt1187 != -1)) {
						final boolean var7 = Class44.method222(var3);
						if (var7)
							var6 = var3.anInt1187;
						else
							var6 = var3.anInt1160;

						if (var6 != -1) {
							final Class131_Sub20_Sub1 var5 = Class131_Sub20_Sub19_Sub2_Sub1.method1066(var6);

							for (var3.anInt1147 += client.anInt2103; var3.anInt1147 > var5.anIntArray1358[var3.anInt1279]; Class131_Sub20_Sub6
									.method734(var3)) {
								var3.anInt1147 -= var5.anIntArray1358[var3.anInt1279];
								++var3.anInt1279;
								if (var3.anInt1279 >= var5.anIntArray1353.length) {
									var3.anInt1279 -= var5.anInt1368;
									if ((var3.anInt1279 < 0) || (var3.anInt1279 >= var5.anIntArray1353.length))
										var3.anInt1279 = 0;
								}
							}
						}
					}

					if ((var3.anInt1214 != 0) && !var3.aBool1263) {
						int var8 = var3.anInt1214 >> 16;
						var6 = (var3.anInt1214 << 16) >> 16;
						var8 *= client.anInt2103;
						var6 *= client.anInt2103;
						var3.anInt1209 = (var3.anInt1209 + var8) & 2047;
						var3.anInt1210 = (var6 + var3.anInt1210) & 2047;
						Class131_Sub20_Sub6.method734(var3);
					}
				}
			}
		}

	}
}
