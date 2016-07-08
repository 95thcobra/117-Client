import java.util.HashMap;

public class Class69 {
	public static boolean method322(final char var0) {
		return (var0 >= 32) && (var0 <= 126) ? true
				: ((var0 >= 160) && (var0 <= 255) ? true
						: (var0 == 8364) || (var0 == 338) || (var0 == 8212) || (var0 == 339) || (var0 == 376));
	}

	static {
		new HashMap();
	}

	static final void method323(final byte[] var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7, final Class51[] var8) {
		int var11;
		for (int var9 = 0; var9 < 8; ++var9)
			for (var11 = 0; var11 < 8; ++var11)
				if (((var2 + var9) > 0) && ((var9 + var2) < 103) && ((var3 + var11) > 0) && ((var11 + var3) < 103))
					var8[var1].anIntArrayArray501[var9 + var2][var3 + var11] &= -16777217;

		final DataBuffer var19 = new DataBuffer(var0);

		for (var11 = 0; var11 < 4; ++var11)
			for (int var14 = 0; var14 < 64; ++var14)
				for (int var17 = 0; var17 < 64; ++var17)
					if ((var4 == var11) && (var14 >= var5) && (var14 < (8 + var5)) && (var17 >= var6)
							&& (var17 < (8 + var6))) {
						final int var15 = var14 & 7;
						final int var24 = var17 & 7;
						final int var10 = var7 & 3;
						int var22;
						if (var10 == 0)
							var22 = var15;
						else if (var10 == 1)
							var22 = var24;
						else if (var10 == 2)
							var22 = 7 - var15;
						else
							var22 = 7 - var24;

						final int var27 = var22 + var2;
						final int var12 = var14 & 7;
						final int var18 = var17 & 7;
						final int var16 = var7 & 3;
						int var13;
						if (var16 == 0)
							var13 = var18;
						else if (var16 == 1)
							var13 = 7 - var12;
						else if (var16 == 2)
							var13 = 7 - var18;
						else
							var13 = var12;

						Class35.method204(var19, var1, var27, var3 + var13, 0, 0, var7);
					} else
						Class35.method204(var19, 0, -1, -1, 0, 0, 0);

	}

	public static void method324() {
		Class131_Sub20_Sub6.aClass121_1453.method481();
		Class131_Sub20_Sub6.aClass121_1454.method481();
	}
}
