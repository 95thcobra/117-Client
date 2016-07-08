public class Class95 {
	static Class131_Sub20_Sub17_Sub3 aClass131_Sub20_Sub17_Sub3_763;

	public static String method395(final DataBuffer var0, final int var1) {
		try {
			int var2 = var0.method606();
			if (var2 > var1)
				var2 = var1;

			final byte[] var3 = new byte[var2];
			var0.pos += Class136.aClass60_908.method292(var0.data, var0.pos, var3, 0, var2);
			final String var4 = Class83.method361(var3, 0, var2);
			return var4;
		} catch (final Exception var6) {
			return "Cabbage";
		}
	}
}
