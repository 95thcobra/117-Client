public class Class2 {
	int anInt3;
	int anInt4;
	int anInt5;
	String aString6;
	public static int anInt7;
	protected static boolean aBool8;
	static Class131_Sub20_Sub17_Sub3[] aClass131_Sub20_Sub17_Sub3Array9;
	int anInt10;

	public static Class131_Sub20_Sub7 method20(final int var0) {
		Class131_Sub20_Sub7 var1 = (Class131_Sub20_Sub7) Class131_Sub20_Sub7.aClass121_1492.method482(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class130.aClass100_900.method402(19, var0);
			var1 = new Class131_Sub20_Sub7();
			if (null != var2)
				var1.method742(new DataBuffer(var2));

			Class131_Sub20_Sub7.aClass121_1492.method479(var1, var0);
			return var1;
		}
	}

	public static int method21(final int var0) {
		return var0 > 0 ? 1 : (var0 < 0 ? -1 : 0);
	}
}
