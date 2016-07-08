public class Class137 {
	String aString909;
	String aString913;
	public int anInt912;
	public long aLong911;
	public GrandExchangeOffer aClass129_910;

	Class137(final DataBuffer var1, final byte var2, final int var3) {
		aString909 = var1.readString();
		aString913 = var1.readString();
		anInt912 = var1.readUShort();
		aLong911 = var1.method600();
		final int var4 = var1.readIntV1();
		final int var5 = var1.readIntV1();
		aClass129_910 = new GrandExchangeOffer();
		aClass129_910.method495(2);
		aClass129_910.method498(var2);
		aClass129_910.anInt895 = var4;
		aClass129_910.anInt898 = var5;
		aClass129_910.anInt897 = 0;
		aClass129_910.anInt896 = 0;
		aClass129_910.anInt894 = var3;
	}

	public String method504() {
		return aString909;
	}

	public String method505() {
		return aString913;
	}

	static void method506(final Class30[] var0, final int var1, final int var2, final int[] var3, final int[] var4) {
		if (var1 < var2) {
			int var12 = var1 - 1;
			int var5 = 1 + var2;
			final int var7 = (var1 + var2) / 2;
			final Class30 var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var12 < var5) {
				boolean var10 = true;

				int var6;
				int var9;
				int var11;
				do {
					--var5;

					for (var9 = 0; var9 < 4; ++var9) {
						if (var3[var9] == 2) {
							var6 = var0[var5].anInt283;
							var11 = var8.anInt283;
						} else if (var3[var9] == 1) {
							var6 = var0[var5].anInt276;
							var11 = var8.anInt276;
							if ((var6 == -1) && (var4[var9] == 1))
								var6 = 2001;

							if ((var11 == -1) && (var4[var9] == 1))
								var11 = 2001;
						} else if (var3[var9] == 3) {
							var6 = var0[var5].method132() ? 1 : 0;
							var11 = var8.method132() ? 1 : 0;
						} else {
							var6 = var0[var5].anInt278;
							var11 = var8.anInt278;
						}

						if (var6 != var11) {
							if (((var4[var9] != 1) || (var6 <= var11)) && ((var4[var9] != 0) || (var6 >= var11)))
								var10 = false;
							break;
						}

						if (var9 == 3)
							var10 = false;
					}
				} while (var10);

				var10 = true;

				do {
					++var12;

					for (var9 = 0; var9 < 4; ++var9) {
						if (var3[var9] == 2) {
							var6 = var0[var12].anInt283;
							var11 = var8.anInt283;
						} else if (var3[var9] == 1) {
							var6 = var0[var12].anInt276;
							var11 = var8.anInt276;
							if ((var6 == -1) && (var4[var9] == 1))
								var6 = 2001;

							if ((var11 == -1) && (var4[var9] == 1))
								var11 = 2001;
						} else if (var3[var9] == 3) {
							var6 = var0[var12].method132() ? 1 : 0;
							var11 = var8.method132() ? 1 : 0;
						} else {
							var6 = var0[var12].anInt278;
							var11 = var8.anInt278;
						}

						if (var11 != var6) {
							if (((var4[var9] != 1) || (var6 >= var11)) && ((var4[var9] != 0) || (var6 <= var11)))
								var10 = false;
							break;
						}

						if (var9 == 3)
							var10 = false;
					}
				} while (var10);

				if (var12 < var5) {
					final Class30 var13 = var0[var12];
					var0[var12] = var0[var5];
					var0[var5] = var13;
				}
			}

			method506(var0, var1, var5, var3, var4);
			method506(var0, 1 + var5, var2, var3, var4);
		}

	}
}
