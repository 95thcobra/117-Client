public final class Class83 {
	public static Class131_Sub20_Sub17_Sub2 method360(final Class100 var0, final String var1, final String var2) {
		final int var3 = var0.method413(var1);
		final int var4 = var0.method414(var3, var2);
		return Class131_Sub20_Sub19_Sub4.method953(var0, var3, var4);
	}

	public static String method361(final byte[] var0, final int var1, final int var2) {
		final char[] var3 = new char[var2];
		int var6 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var4 = var0[var5 + var1] & 255;
			if (var4 != 0) {
				if ((var4 >= 128) && (var4 < 160)) {
					char var7 = Class107.aCharArray810[var4 - 128];
					if (var7 == 0)
						var7 = 63;

					var4 = var7;
				}

				var3[var6++] = (char) var4;
			}
		}

		return new String(var3, 0, var6);
	}

	public static Class131_Sub20_Sub9 method362(final int var0) {
		Class131_Sub20_Sub9 var1 = (Class131_Sub20_Sub9) Class131_Sub20_Sub9.aClass121_1504.method482(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class131_Sub20_Sub9.aClass100_1535.method402(6, var0);
			var1 = new Class131_Sub20_Sub9();
			var1.anInt1509 = var0;
			if (var2 != null)
				var1.method757(new DataBuffer(var2));

			var1.method759();
			if (var1.aBool1537) {
				var1.anInt1519 = 0;
				var1.aBool1520 = false;
			}

			Class131_Sub20_Sub9.aClass121_1504.method479(var1, var0);
			return var1;
		}
	}

	public static void method363() {
		Class131_Sub20_Sub5.aClass121_1443.method481();
	}

	static final int method364(final int var0, int var1, final int var2) {
		if (var2 > 179)
			var1 /= 2;

		if (var2 > 192)
			var1 /= 2;

		if (var2 > 217)
			var1 /= 2;

		if (var2 > 243)
			var1 /= 2;

		final int var3 = ((var0 / 4) << 10) + ((var1 / 32) << 7) + (var2 / 2);
		return var3;
	}
}
