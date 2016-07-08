import java.awt.Frame;

public class Class131_Sub5 extends Class131 {
	protected static Frame aFrame1003;
	int anInt1005;
	int anInt1004;
	int[] anIntArray1007;
	int[][] anIntArrayArray1006;

	Class131_Sub5(final int var1, final byte[] var2) {
		anInt1005 = var1;
		final DataBuffer var4 = new DataBuffer(var2);
		anInt1004 = var4.method595();
		anIntArray1007 = new int[anInt1004];
		anIntArrayArray1006 = new int[anInt1004][];

		int var3;
		for (var3 = 0; var3 < anInt1004; ++var3)
			anIntArray1007[var3] = var4.method595();

		for (var3 = 0; var3 < anInt1004; ++var3)
			anIntArrayArray1006[var3] = new int[var4.method595()];

		for (var3 = 0; var3 < anInt1004; ++var3)
			for (int var5 = 0; var5 < anIntArrayArray1006[var3].length; ++var5)
				anIntArrayArray1006[var3][var5] = var4.method595();

	}
}
