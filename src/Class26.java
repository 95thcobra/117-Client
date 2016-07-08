public final class Class26 {
	static byte[][][] aByteArrayArrayArray224;
	static byte[][][] aByteArrayArrayArray227;
	static int[] anIntArray228;
	static byte[][][] aByteArrayArrayArray229;
	static int[] anIntArray230;
	static int[] anIntArray231;
	static int anInt240;
	static int[] anIntArray242;
	static Class131_Sub20_Sub17_Sub3[] aClass131_Sub20_Sub17_Sub3Array243;
	static int[][][] anIntArrayArrayArray239 = new int[4][105][105];
	static byte[][][] aByteArrayArrayArray225 = new byte[4][104][104];
	static int anInt226 = 99;
	static int[] anIntArray232 = new int[] { 1, 2, 4, 8 };
	static int[] anIntArray233 = new int[] { 16, 32, 64, 128 };
	static int[] anIntArray234 = new int[] { 1, 0, -1, 0 };
	static int[] anIntArray235 = new int[] { 0, -1, 0, 1 };
	static int[] anIntArray236 = new int[] { 1, -1, -1, 1 };
	static int[] anIntArray241 = new int[] { -1, -1, 1, 1 };
	static int anInt237 = (int) (Math.random() * 17.0D) - 8;
	static int anInt238 = (int) (Math.random() * 33.0D) - 16;

	static final void method121() {
		if (Class131_Sub20_Sub20.loginConnection != null) {
			Class131_Sub20_Sub20.loginConnection.method373();
			Class131_Sub20_Sub20.loginConnection = null;
		}

		Class32.method139();
		Class65.aClass33_595.method190();

		for (int var0 = 0; var0 < 4; ++var0)
			client.aClass51Array2087[var0].method259();

		System.gc();
		Class46.method230(2);
		client.anInt2052 = -1;
		client.aBool2262 = false;
		Class131_Sub20_Sub1.method689();
		Class32.method142(10);
	}
}
