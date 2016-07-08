public class Class27 implements Interface4 {
	public int anInt248;
	int anInt245;
	public static Class27 aClass27_246 = new Class27(0, 0);
	static Class27 aClass27_247 = new Class27(1, 1);
	static Class27 aClass27_250 = new Class27(2, 2);
	static Class27 aClass27_249 = new Class27(3, 3);
	static Class27 aClass27_244 = new Class27(4, 4);

	@Override
	public int method11(final byte var1) {
		return anInt245;
	}

	Class27(final int var1, final int var2) {
		anInt248 = var1;
		anInt245 = var2;
	}

	public static String method122(final byte[] var0) {
		final int var1 = var0.length;
		final StringBuilder var3 = new StringBuilder();

		for (int var2 = 0; var2 < (0 + var1); var2 += 3) {
			final int var4 = var0[var2] & 255;
			var3.append(Class104.aCharArray801[var4 >>> 2]);
			if (var2 < (var1 - 1)) {
				final int var5 = var0[var2 + 1] & 255;
				var3.append(Class104.aCharArray801[((var4 & 3) << 4) | (var5 >>> 4)]);
				if (var2 < (var1 - 2)) {
					final int var6 = var0[var2 + 2] & 255;
					var3.append(Class104.aCharArray801[((var5 & 15) << 2) | (var6 >>> 6)])
							.append(Class104.aCharArray801[var6 & 63]);
				} else
					var3.append(Class104.aCharArray801[(var5 & 15) << 2]).append("=");
			} else
				var3.append(Class104.aCharArray801[(var4 & 3) << 4]).append("==");
		}

		final String var7 = var3.toString();
		return var7;
	}
}
