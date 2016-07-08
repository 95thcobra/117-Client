public class Class120 {
	int[] anIntArray873;

	public int method478(final int var1) {
		final int var2 = (anIntArray873.length >> 1) - 1;
		int var3 = var1 & var2;

		while (true) {
			final int var4 = anIntArray873[var3 + var3 + 1];
			if (var4 == -1)
				return -1;

			if (anIntArray873[var3 + var3] == var1)
				return var4;

			var3 = (var3 + 1) & var2;
		}
	}

	public Class120(final int[] var1) {
		int var4;
		for (var4 = 1; var4 <= (var1.length + (var1.length >> 1)); var4 <<= 1)
			;

		anIntArray873 = new int[var4 + var4];

		int var2;
		for (var2 = 0; var2 < (var4 + var4); ++var2)
			anIntArray873[var2] = -1;

		int var3;
		for (var2 = 0; var2 < var1.length; anIntArray873[var3 + var3 + 1] = var2++) {
			for (var3 = var1[var2] & (var4 - 1); anIntArray873[var3 + var3 + 1] != -1; var3 = (var3 + 1) & (var4 - 1))
				;

			anIntArray873[var3 + var3] = var1[var2];
		}

	}
}
