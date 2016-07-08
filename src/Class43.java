public class Class43 {
	Class131_Sub5 aClass131_Sub5_426 = null;
	int anInt431 = -1;
	boolean aBool436 = false;
	int[] anIntArray432;
	int[] anIntArray433;
	int[] anIntArray427;
	int[] anIntArray430;
	static int[] anIntArray435 = new int[500];
	static int[] anIntArray434 = new int[500];
	static int[] anIntArray428 = new int[500];
	static int[] anIntArray429 = new int[500];

	Class43(final byte[] var1, final Class131_Sub5 var2) {
		aClass131_Sub5_426 = var2;
		final DataBuffer var4 = new DataBuffer(var1);
		final DataBuffer var7 = new DataBuffer(var1);
		var4.pos = 2;
		final int var8 = var4.method595();
		int var10 = -1;
		int var6 = 0;
		var7.pos = var4.pos + var8;

		int var9;
		for (var9 = 0; var9 < var8; ++var9) {
			final int var5 = var4.method595();
			if (var5 > 0) {
				if (aClass131_Sub5_426.anIntArray1007[var9] != 0)
					for (int var3 = var9 - 1; var3 > var10; --var3)
						if (aClass131_Sub5_426.anIntArray1007[var3] == 0) {
							anIntArray435[var6] = var3;
							anIntArray434[var6] = 0;
							anIntArray428[var6] = 0;
							anIntArray429[var6] = 0;
							++var6;
							break;
						}

				anIntArray435[var6] = var9;
				short var11 = 0;
				if (aClass131_Sub5_426.anIntArray1007[var9] == 3)
					var11 = 128;

				if ((var5 & 1) != 0)
					anIntArray434[var6] = var7.method605();
				else
					anIntArray434[var6] = var11;

				if ((var5 & 2) != 0)
					anIntArray428[var6] = var7.method605();
				else
					anIntArray428[var6] = var11;

				if ((var5 & 4) != 0)
					anIntArray429[var6] = var7.method605();
				else
					anIntArray429[var6] = var11;

				var10 = var9;
				++var6;
				if (aClass131_Sub5_426.anIntArray1007[var9] == 5)
					aBool436 = true;
			}
		}

		if (var7.pos != var1.length)
			throw new RuntimeException();
		else {
			anInt431 = var6;
			anIntArray432 = new int[var6];
			anIntArray433 = new int[var6];
			anIntArray427 = new int[var6];
			anIntArray430 = new int[var6];

			for (var9 = 0; var9 < var6; ++var9) {
				anIntArray432[var9] = anIntArray435[var9];
				anIntArray433[var9] = anIntArray434[var9];
				anIntArray427[var9] = anIntArray428[var9];
				anIntArray430[var9] = anIntArray429[var9];
			}

		}
	}
}
