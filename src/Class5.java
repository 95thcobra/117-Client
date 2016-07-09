import java.awt.Graphics;

public class Class5 {
	static int anInt60;
	static Class87 aClass87_62;
	static Class5 aClass5_63 = new Class5();
	static Class5 aClass5_58 = new Class5();
	static Class5 aClass5_59 = new Class5();
	static Class5 aClass5_61 = new Class5();

	static final void method25() {
		final int[] var0 = GPI.localPlayerIndices;

		int var2;
		for (var2 = 0; var2 < GPI.localPlayers; ++var2) {
			final Player var3 = client.playerArray[var0[var2]];
			if ((var3 != null) && (var3.anInt1761 > 0)) {
				--var3.anInt1761;
				if (var3.anInt1761 == 0)
					var3.aString1705 = null;
			}
		}

		for (var2 = 0; var2 < client.anInt2230; ++var2) {
			final int var4 = client.anIntArray2067[var2];
			final Class131_Sub20_Sub19_Sub2_Sub1 var1 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var4];
			if ((var1 != null) && (var1.anInt1761 > 0)) {
				--var1.anInt1761;
				if (var1.anInt1761 == 0)
					var1.aString1705 = null;
			}
		}

	}

	static final void method26(final String var0, final boolean var1) {
		final byte var2 = 4;
		final int var3 = 6 + var2;
		final int var4 = var2 + 6;
		final int var5 = Class7.aClass131_Sub20_Sub17_Sub4_Sub1_79.method1039(var0, 250);
		final int var6 = Class7.aClass131_Sub20_Sub17_Sub4_Sub1_79.method1040(var0, 250) * 13;
		Class131_Sub20_Sub17.method850(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 0);
		Class131_Sub20_Sub17.method854(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
		Class7.aClass131_Sub20_Sub17_Sub4_Sub1_79.method1041(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
		Class1.method12(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2);
		if (var1)
			try {
				final Graphics var7 = Class29.aCanvas271.getGraphics();
				Class131_Sub20_Sub19_Sub5.aClass16_1839.method61(var7, 0, 0, 1171214531);
			} catch (final Exception var13) {
				Class29.aCanvas271.repaint();
			}
		else {
			final int var8 = var3;
			final int var9 = var4;
			final int var10 = var5;
			final int var11 = var6;

			for (int var12 = 0; var12 < client.anInt2226; ++var12)
				if (((client.anIntArray2233[var12] + client.anIntArray2231[var12]) > var8)
						&& (client.anIntArray2231[var12] < (var8 + var10))
						&& ((client.anIntArray2232[var12] + client.anIntArray2234[var12]) > var9)
						&& (client.anIntArray2232[var12] < (var11 + var9)))
					client.aBoolArray2229[var12] = true;
		}

	}

	static final void method27(final Player var0, final int var1, final int var2,
			final byte var3) {
		final int var4 = var0.anIntArray1755[0];
		final int var6 = var0.anIntArray1756[0];
		final int var7 = var0.getSize();
		if ((var4 >= var7) && (var4 < (104 - var7)) && (var6 >= var7) && (var6 < (104 - var7)))
			if ((var1 >= var7) && (var1 < (104 - var7)) && (var2 >= var7) && (var2 < (104 - var7))) {
				final int var5 = Class21.method104(var4, var6, var0.getSize(),
						Class131_Sub20_Sub19_Sub3.method929(var1, var2), client.aClass51Array2087[var0.anInt1979], true,
						client.anIntArray2058, client.anIntArray2304);
				if (var5 >= 1)
					for (int var8 = 0; var8 < (var5 - 1); ++var8)
						var0.method1072(client.anIntArray2058[var8], client.anIntArray2304[var8], var3);
			}
	}

	public static void method28() {
		Class13.anIntArray114 = null;
		Class131_Sub20_Sub15.anIntArray1605 = null;
		Class131_Sub20_Sub19_Sub3.anIntArray1766 = null;
		NpcFlags.anIntArray54 = null;
		Class36.anIntArray370 = null;
		Class13.aByteArrayArray117 = null;
	}

	static void method29(final Class131_Sub20_Sub1 var0, final int var1, final int var2, final int var3) {
		if ((client.anInt2289 < 50) && (client.anInt2086 != 0))
			if ((var0.anIntArray1359 != null) && (var1 < var0.anIntArray1359.length)) {
				final int var4 = var0.anIntArray1359[var1];
				if (var4 != 0) {
					final int var5 = var4 >> 8;
					final int var6 = (var4 >> 4) & 7;
					final int var7 = var4 & 15;
					client.anIntArray2266[client.anInt2289] = var5;
					client.anIntArray2267[client.anInt2289] = var6;
					client.anIntArray2268[client.anInt2289] = 0;
					client.aClass8Array2129[client.anInt2289] = null;
					final int var8 = (var2 - 64) / 128;
					final int var9 = (var3 - 64) / 128;
					client.anIntArray2257[client.anInt2289] = (var8 << 16) + (var9 << 8) + var7;
					++client.anInt2289;
				}
			}
	}
}
