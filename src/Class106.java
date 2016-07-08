public final class Class106 {
	static char[] aCharArray809 = new char[] { '\u005f', '\u0061', '\u0062', '\u0063', '\u0064', '\u0065', '\u0066',
			'\u0067', '\u0068', '\u0069', '\u006a', '\u006b', '\u006c', '\u006d', '\u006e', '\u006f', '\u0070',
			'\u0071', '\u0072', '\u0073', '\u0074', '\u0075', '\u0076', '\u0077', '\u0078', '\u0079', '\u007a',
			'\u0030', '\u0031', '\u0032', '\u0033', '\u0034', '\u0035', '\u0036', '\u0037', '\u0038', '\u0039' };

	static final int method430(final int var0, final int var1) {
		int var2 = (Class73.method335(var0 + '\ub135', var1 + 91923, 4) - 128)
				+ ((Class73.method335(10294 + var0, '\u93bd' + var1, 2) - 128) >> 1)
				+ ((Class73.method335(var0, var1, 1) - 128) >> 2);
		var2 = 35 + (int) (0.3D * var2);
		if (var2 < 10)
			var2 = 10;
		else if (var2 > 60)
			var2 = 60;

		return var2;
	}

	public static String method431(final byte[] var0, final int var1, final int var2) {
		final char[] var3 = new char[var2];
		int var8 = 0;
		int var4 = var1;

		int var6;
		for (final int var5 = var2 + var1; var4 < var5; var3[var8++] = (char) var6) {
			final int var7 = var0[var4++] & 255;
			if (var7 < 128) {
				if (var7 == 0)
					var6 = '\ufffd';
				else
					var6 = var7;
			} else if (var7 < 192)
				var6 = '\ufffd';
			else if (var7 < 224) {
				if ((var4 < var5) && ((var0[var4] & 192) == 128)) {
					var6 = ((var7 & 31) << 6) | (var0[var4++] & 63);
					if (var6 < 128)
						var6 = '\ufffd';
				} else
					var6 = '\ufffd';
			} else if (var7 < 240) {
				if (((1 + var4) < var5) && ((var0[var4] & 192) == 128) && ((var0[1 + var4] & 192) == 128)) {
					var6 = ((var7 & 15) << 12) | ((var0[var4++] & 63) << 6) | (var0[var4++] & 63);
					if (var6 < 2048)
						var6 = '\ufffd';
				} else
					var6 = '\ufffd';
			} else if (var7 < 248) {
				if (((var4 + 2) < var5) && ((var0[var4] & 192) == 128) && ((var0[1 + var4] & 192) == 128)
						&& ((var0[var4 + 2] & 192) == 128)) {
					var6 = ((var7 & 7) << 18) | ((var0[var4++] & 63) << 12) | ((var0[var4++] & 63) << 6)
							| (var0[var4++] & 63);
					if ((var6 >= 65536) && (var6 <= 1114111))
						var6 = '\ufffd';
					else
						var6 = '\ufffd';
				} else
					var6 = '\ufffd';
			} else
				var6 = '\ufffd';
		}

		return new String(var3, 0, var8);
	}
}
