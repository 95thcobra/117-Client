public class Class13 {
	public static int anInt113;
	public static int[] anIntArray114;
	public static int anInt115;
	static int anInt116;
	public static byte[][] aByteArrayArray117;

	static Class131_Sub18 method52(Class131_Sub18 var0) {
		final int var1 = Class49.method254(var0);
		final int var3 = (var1 >> 17) & 7;
		final int var4 = var3;
		if (var3 == 0)
			return null;
		else {
			for (int var2 = 0; var2 < var4; ++var2) {
				var0 = Class88.method377(var0.anInt1177);
				if (null == var0)
					return null;
			}

			return var0;
		}
	}

	public static String method53(int var0, final int var1, final boolean var2) {
		if ((var1 >= 2) && (var1 <= 36)) {
			if (var0 < 0)
				return Integer.toString(var0, var1);
			else {
				int var5 = 2;

				for (int var6 = var0 / var1; var6 != 0; ++var5)
					var6 /= var1;

				final char[] var7 = new char[var5];
				var7[0] = 43;

				for (int var3 = var5 - 1; var3 > 0; --var3) {
					final int var8 = var0;
					var0 /= var1;
					final int var4 = var8 - (var1 * var0);
					if (var4 >= 10)
						var7[var3] = (char) (var4 + 87);
					else
						var7[var3] = (char) (48 + var4);
				}

				return new String(var7);
			}
		} else
			throw new IllegalArgumentException("");
	}

	public static boolean method54(final int var0) {
		return ((var0 >> 21) & 1) != 0;
	}
}
