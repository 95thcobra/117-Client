public class Class68 {
	public static String method319(final CharSequence var0) {
		final int var1 = var0.length();
		final char[] var3 = new char[var1];

		for (int var2 = 0; var2 < var1; ++var2)
			var3[var2] = 42;

		final String var4 = new String(var3);
		return var4;
	}

	public static boolean method320(final int var0) {
		return ((var0 >> 30) & 1) != 0;
	}

	public static Class131_Sub20_Sub17_Sub4_Sub1 method321(final Class100 var0, final Class100 var1, final int var2,
			final int var3) {
		if (!Class38.method210(var0, var2, var3))
			return null;
		else {
			final byte[] var5 = var1.method402(var2, var3);
			Class131_Sub20_Sub17_Sub4_Sub1 var4;
			if (var5 == null)
				var4 = null;
			else {
				final Class131_Sub20_Sub17_Sub4_Sub1 var6 = new Class131_Sub20_Sub17_Sub4_Sub1(var5,
						Class13.anIntArray114, Class131_Sub20_Sub15.anIntArray1605,
						Class131_Sub20_Sub19_Sub3.anIntArray1766, NpcFlags.anIntArray54, Class36.anIntArray370,
						Class13.aByteArrayArray117);
				Class5.method28();
				var4 = var6;
			}

			return var4;
		}
	}
}
