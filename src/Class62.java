public class Class62 {
	static int[] anIntArray581;

	static final void method300(final int var0, final int var1, final int var2, final int var3) {
		for (int var4 = var1; var4 <= (var3 + var1); ++var4)
			for (int var5 = var0; var5 <= (var0 + var2); ++var5)
				if ((var5 >= 0) && (var5 < 104) && (var4 >= 0) && (var4 < 104)) {
					Class139.aByteArrayArrayArray916[0][var5][var4] = 127;
					if ((var5 == var0) && (var5 > 0))
						Class26.anIntArrayArrayArray239[0][var5][var4] = Class26.anIntArrayArrayArray239[0][var5
								- 1][var4];

					if (((var0 + var2) == var5) && (var5 < 103))
						Class26.anIntArrayArrayArray239[0][var5][var4] = Class26.anIntArrayArrayArray239[0][var5
								+ 1][var4];

					if ((var1 == var4) && (var4 > 0))
						Class26.anIntArrayArrayArray239[0][var5][var4] = Class26.anIntArrayArrayArray239[0][var5][var4
								- 1];

					if ((var4 == (var1 + var3)) && (var4 < 103))
						Class26.anIntArrayArrayArray239[0][var5][var4] = Class26.anIntArrayArrayArray239[0][var5][var4
								+ 1];
				}

	}
}
