public final class Class47 {
	int anInt454;
	int anInt455;
	int anInt456;
	public Class131_Sub20_Sub19 aClass131_Sub20_Sub19_457;
	int anInt458;
	int anInt459;
	int anInt460;
	int anInt461;
	int anInt462;
	int anInt463;
	int anInt464;
	public static int anInt467;
	int anInt468;
	public int anInt465 = 0;
	int anInt466 = 0;

	static final void method236(int var0, int var1, final int var2) {
		if ((var0 >= 128) && (var1 >= 128) && (var0 <= 13056) && (var1 <= 13056)) {
			int var4 = Class18.method88(var0, var1, Class39.anInt410) - var2;
			var0 -= Class139.anInt917;
			var4 -= Class46.anInt452;
			var1 -= Class1.anInt1;
			final int var6 = Class131_Sub20_Sub17_Sub1.anIntArray1787[Class75.anInt633];
			final int var5 = Class131_Sub20_Sub17_Sub1.anIntArray1770[Class75.anInt633];
			final int var7 = Class131_Sub20_Sub17_Sub1.anIntArray1787[Class131_Sub20_Sub1.anInt1371];
			final int var3 = Class131_Sub20_Sub17_Sub1.anIntArray1770[Class131_Sub20_Sub1.anInt1371];
			int var8 = ((var3 * var0) + (var7 * var1)) >> 16;
			var1 = ((var3 * var1) - (var7 * var0)) >> 16;
			var0 = var8;
			var8 = ((var5 * var4) - (var6 * var1)) >> 16;
			var1 = ((var5 * var1) + (var6 * var4)) >> 16;
			if (var1 >= 50) {
				client.anInt2132 = ((client.anInt2283 * var0) / var1) + (client.anInt2169 / 2);
				client.anInt2133 = ((client.anInt2283 * var8) / var1) + (client.anInt2288 / 2);
			} else {
				client.anInt2132 = -1;
				client.anInt2133 = -1;
			}

		} else {
			client.anInt2132 = -1;
			client.anInt2133 = -1;
		}
	}

	public static final void method237(final long var0) {
		if (var0 > 0L)
			if ((var0 % 10L) == 0L) {
				final long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (final InterruptedException var8) {
					;
				}

				try {
					Thread.sleep(1L);
				} catch (final InterruptedException var7) {
					;
				}
			} else
				try {
					Thread.sleep(var0);
				} catch (final InterruptedException var6) {
					;
				}
	}

	static void method238(final Class131_Sub18 var0, final int var1, final int var2) {
		if (var0.anInt1163 == 0)
			var0.anInt1276 = var0.anInt1167;
		else if (var0.anInt1163 == 1)
			var0.anInt1276 = var0.anInt1167 + ((var1 - var0.anInt1173) / 2);
		else if (var0.anInt1163 == 2)
			var0.anInt1276 = var1 - var0.anInt1173 - var0.anInt1167;
		else if (var0.anInt1163 == 3)
			var0.anInt1276 = (var0.anInt1167 * var1) >> 14;
		else if (var0.anInt1163 == 4)
			var0.anInt1276 = ((var1 - var0.anInt1173) / 2) + ((var0.anInt1167 * var1) >> 14);
		else
			var0.anInt1276 = var1 - var0.anInt1173 - ((var0.anInt1167 * var1) >> 14);

		if (var0.anInt1261 == 0)
			var0.anInt1211 = var0.anInt1157;
		else if (var0.anInt1261 == 1)
			var0.anInt1211 = var0.anInt1157 + ((var2 - var0.anInt1291) / 2);
		else if (var0.anInt1261 == 2)
			var0.anInt1211 = var2 - var0.anInt1291 - var0.anInt1157;
		else if (var0.anInt1261 == 3)
			var0.anInt1211 = (var2 * var0.anInt1157) >> 14;
		else if (var0.anInt1261 == 4)
			var0.anInt1211 = ((var2 - var0.anInt1291) / 2) + ((var0.anInt1157 * var2) >> 14);
		else
			var0.anInt1211 = var2 - var0.anInt1291 - ((var2 * var0.anInt1157) >> 14);

		if (client.aBool2269 && (var0.anInt1202 == 0)) {
			if (var0.anInt1276 < 0)
				var0.anInt1276 = 0;
			else if ((var0.anInt1276 + var0.anInt1173) > var1)
				var0.anInt1276 = var1 - var0.anInt1173;

			if (var0.anInt1211 < 0)
				var0.anInt1211 = 0;
			else if ((var0.anInt1211 + var0.anInt1291) > var2)
				var0.anInt1211 = var2 - var0.anInt1291;
		}

	}

	public static void method239(final Class100 var0, final Class100 var1) {
		Class131_Sub20_Sub13.aClass100_1578 = var0;
		Class131_Sub20_Sub13.aClass100_1570 = var1;
		Class138.anInt914 = Class131_Sub20_Sub13.aClass100_1578.method417(3);
	}

	static final void method240() {
		client.secureBuffer.method871(12);

		for (Class131_Sub7 var0 = (Class131_Sub7) client.aClass114_2184
				.method460(); null != var0; var0 = (Class131_Sub7) client.aClass114_2184.method458())
			if ((var0.anInt1024 == 0) || (var0.anInt1024 == 3))
				Class131_Sub6.method553(var0, true);

		if (null != client.aClass131_Sub18_2049) {
			Class131_Sub20_Sub6.method734(client.aClass131_Sub18_2049);
			client.aClass131_Sub18_2049 = null;
		}

	}
}
