public class Class131_Sub20_Sub20 extends Class131_Sub20 {
	static int anInt1649;
	public int anInt1650;
	public byte aByte1651;
	static Class131_Sub20_Sub17_Sub3 aClass131_Sub20_Sub17_Sub3_1652;
	public Class100_Sub1 aClass100_Sub1_1653;
	static Class86 loginConnection;

	public static Class131_Sub20_Sub6 method879(final int var0) {
		Class131_Sub20_Sub6 var1 = (Class131_Sub20_Sub6) Class131_Sub20_Sub6.aClass121_1453.method482(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Class131_Sub20_Sub6.aClass100_1451.method402(9, var0);
			var1 = new Class131_Sub20_Sub6();
			var1.anInt1457 = var0;
			if (null != var2)
				var1.method728(new DataBuffer(var2));

			var1.method733(1652970538);
			Class131_Sub20_Sub6.aClass121_1453.method479(var1, var0);
			return var1;
		}
	}

	public static Class131_Sub18 method880(final int var0, final int var1) {
		final Class131_Sub18 var2 = Class88.method377(var0);
		return var1 != -1
				? ((var2 != null) && (var2.aClass131_Sub18Array1171 != null)
						&& (var1 < var2.aClass131_Sub18Array1171.length) ? var2.aClass131_Sub18Array1171[var1] : null)
				: var2;
	}
}
