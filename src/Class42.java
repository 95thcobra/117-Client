import java.math.BigInteger;

public class Class42 {
	static Class86 aClass86_421;
	static int anInt423;
	static Class131_Sub20_Sub17_Sub3[] aClass131_Sub20_Sub17_Sub3Array424;
	static Class131_Sub20_Sub17_Sub3 aClass131_Sub20_Sub17_Sub3_425;
	static BigInteger aBigInteger420 = new BigInteger(
			"80782894952180643741752986186714059433953886149239752893425047584684715842049");
	static BigInteger aBigInteger422 = new BigInteger(
			"7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

	static final void method220(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5) {
		final int var6 = (2048 - var3) & 2047;
		final int var11 = (2048 - var4) & 2047;
		int var7 = 0;
		int var12 = 0;
		int var9 = var5;
		int var8;
		int var10;
		int var13;
		if (var6 != 0) {
			var10 = Class131_Sub20_Sub17_Sub1.anIntArray1787[var6];
			var8 = Class131_Sub20_Sub17_Sub1.anIntArray1770[var6];
			var13 = ((var8 * var12) - (var5 * var10)) >> 16;
			var9 = ((var5 * var8) + (var12 * var10)) >> 16;
			var12 = var13;
		}

		if (var11 != 0) {
			var10 = Class131_Sub20_Sub17_Sub1.anIntArray1787[var11];
			var8 = Class131_Sub20_Sub17_Sub1.anIntArray1770[var11];
			var13 = ((var9 * var10) + (var8 * var7)) >> 16;
			var9 = ((var8 * var9) - (var10 * var7)) >> 16;
			var7 = var13;
		}

		Class139.anInt917 = var0 - var7;
		Class46.anInt452 = var1 - var12;
		Class1.anInt1 = var2 - var9;
		Class75.anInt633 = var3;
		Class131_Sub20_Sub1.anInt1371 = var4;
	}

	public static Class82[] method221() {
		return new Class82[] { Class82.aClass82_685, Class82.aClass82_687, Class82.aClass82_692, Class82.aClass82_683,
				Class82.aClass82_684 };
	}
}
