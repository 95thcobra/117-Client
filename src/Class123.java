public class Class123 {
	static void method483(final int var0) {
		if ((client.anInt2260 != 0) && (var0 != -1)) {
			Class23.method108(Class82.aClass100_Sub1_686, var0, 0, client.anInt2260, false);
			client.aBool2262 = true;
		}

	}

	static void method484() {
		for (int var0 = 0; var0 < client.anInt2166; ++var0) {
			final int var2 = client.anIntArray2066[var0];
			final boolean var3 = (var2 == 57) || (var2 == 58) || (var2 == 1007) || (var2 == 25) || (var2 == 30);
			if (var3) {
				if (var0 < (client.anInt2166 - 1))
					for (int var1 = var0; var1 < (client.anInt2166 - 1); ++var1) {
						client.aStringArray2195[var1] = client.aStringArray2195[var1 + 1];
						client.aStringArray2172[var1] = client.aStringArray2172[var1 + 1];
						client.anIntArray2066[var1] = client.anIntArray2066[var1 + 1];
						client.anIntArray2170[var1] = client.anIntArray2170[1 + var1];
						client.anIntArray2171[var1] = client.anIntArray2171[var1 + 1];
						client.anIntArray2168[var1] = client.anIntArray2168[var1 + 1];
					}

				--client.anInt2166;
			}
		}

	}
}
