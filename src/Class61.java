import java.awt.datatransfer.Clipboard;

public class Class61 {
	static Clipboard aClipboard575;
	static Class131_Sub4_Sub2 aClass131_Sub4_Sub2_578;
	static int anInt580 = 0;
	static int anInt574 = 0;
	static int anInt576 = 0;
	static byte[][] aByteArrayArray579 = new byte[1000][];
	static byte[][] aByteArrayArray573 = new byte[250][];
	static byte[][] aByteArrayArray577 = new byte[50][];

	static synchronized byte[] method296(final int var0) {
		byte[] var1;
		if ((var0 == 100) && (anInt580 > 0)) {
			var1 = aByteArrayArray579[--anInt580];
			aByteArrayArray579[anInt580] = null;
			return var1;
		} else if ((var0 == 5000) && (anInt574 > 0)) {
			var1 = aByteArrayArray573[--anInt574];
			aByteArrayArray573[anInt574] = null;
			return var1;
		} else if ((var0 == 30000) && (anInt576 > 0)) {
			var1 = aByteArrayArray577[--anInt576];
			aByteArrayArray577[anInt576] = null;
			return var1;
		} else
			return new byte[var0];
	}

	static boolean updateFlagsMaybe(final Class131_Sub14_Sub1 var0, final int var1) {
		final int var2 = var0.readBits(2);
		int var4;
		int var5;
		int var6;
		int var7;
		int var9;
		int var10;
		if (var2 == 0) {
			if (var0.readBits(1) != 0)
				updateFlagsMaybe(var0, var1);

			var5 = var0.readBits(6);
			var6 = var0.readBits(6);
			final boolean var12 = var0.readBits(1) == 1;
			if (var12)
				GPI.anIntArray23[++GPI.anInt21 - 1] = var1;

			if (client.playerArray[var1] != null)
				throw new RuntimeException();
			else {
				final Player var3 = client.playerArray[var1] = new Player();
				var3.anInt1981 = var1;
				if (null != GPI.cachedAppearances[var1])
					var3.updateAppearance(GPI.cachedAppearances[var1]);

				var3.anInt1751 = GPI.cachedDirections[var1];
				var3.anInt1726 = GPI.cachedIndices[var1];
				var9 = GPI.cachedRegions[var1];
				var4 = var9 >> 28;
				var7 = (var9 >> 14) & 255;
				var10 = var9 & 255;
				var3.aByteArray1709[0] = GPI.aByteArray22[var1];
				var3.anInt1979 = (byte) var4;
				var3.method1073((var5 + (var7 << 6)) - Class131_Sub20_Sub20.anInt1649,
						((var10 << 6) + var6) - Class50.anInt491);
				var3.aBool2002 = false;
				return true;
			}
		} else if (var2 == 1) {
			var5 = var0.readBits(2);
			var6 = GPI.cachedRegions[var1];
			GPI.cachedRegions[var1] = ((((var6 >> 28) + var5) & 3) << 28) + (var6 & 268435455);
			return false;
		} else {
			int var8;
			int var11;
			if (var2 == 2) {
				var5 = var0.readBits(5);
				var6 = var5 >> 3;
				var8 = var5 & 7;
				var11 = GPI.cachedRegions[var1];
				var9 = ((var11 >> 28) + var6) & 3;
				var4 = (var11 >> 14) & 255;
				var7 = var11 & 255;
				if (var8 == 0) {
					--var4;
					--var7;
				}

				if (var8 == 1)
					--var7;

				if (var8 == 2) {
					++var4;
					--var7;
				}

				if (var8 == 3)
					--var4;

				if (var8 == 4)
					++var4;

				if (var8 == 5) {
					--var4;
					++var7;
				}

				if (var8 == 6)
					++var7;

				if (var8 == 7) {
					++var4;
					++var7;
				}

				GPI.cachedRegions[var1] = (var4 << 14) + (var9 << 28) + var7;
				return false;
			} else {
				var5 = var0.readBits(18);
				var6 = var5 >> 16;
				var8 = (var5 >> 8) & 255;
				var11 = var5 & 255;
				var9 = GPI.cachedRegions[var1];
				var4 = (var6 + (var9 >> 28)) & 3;
				var7 = (var8 + (var9 >> 14)) & 255;
				var10 = (var9 + var11) & 255;
				GPI.cachedRegions[var1] = (var4 << 28) + (var7 << 14) + var10;
				return false;
			}
		}
	}

	public static int method298(final CharSequence var0, final CharSequence var1, final int var2) {
		final int var3 = var0.length();
		final int var8 = var1.length();
		int var9 = 0;
		int var6 = 0;
		char var10 = 0;
		char var7 = 0;

		while (((var9 - var10) < var3) || ((var6 - var7) < var8)) {
			if ((var9 - var10) >= var3)
				return -1;

			if ((var6 - var7) >= var8)
				return 1;

			char var4;
			if (var10 != 0) {
				var4 = var10;
			} else
				var4 = var0.charAt(var9++);

			char var5;
			if (var7 != 0) {
				var5 = var7;
			} else
				var5 = var1.charAt(var6++);

			var10 = Class102.method425(var4);
			var7 = Class102.method425(var5);
			var4 = Class81.method358(var4);
			var5 = Class81.method358(var5);
			if ((var5 != var4) && (Character.toUpperCase(var4) != Character.toUpperCase(var5))) {
				var4 = Character.toLowerCase(var4);
				var5 = Character.toLowerCase(var5);
				if (var4 != var5)
					return Class64.method308(var4) - Class64.method308(var5);
			}
		}

		final int var14 = Math.min(var3, var8);

		char var12;
		int var15;
		for (var15 = 0; var15 < var14; ++var15) {
			char var11 = var0.charAt(var15);
			var12 = var1.charAt(var15);
			if ((var11 != var12) && (Character.toUpperCase(var11) != Character.toUpperCase(var12))) {
				var11 = Character.toLowerCase(var11);
				var12 = Character.toLowerCase(var12);
				if (var11 != var12)
					return Class64.method308(var11) - Class64.method308(var12);
			}
		}

		var15 = var3 - var8;
		if (var15 != 0)
			return var15;
		else {
			for (int var18 = 0; var18 < var14; ++var18) {
				var12 = var0.charAt(var18);
				final char var13 = var1.charAt(var18);
				if (var13 != var12)
					return Class64.method308(var12) - Class64.method308(var13);
			}

			return 0;
		}
	}

	static final void method299() {
		final short var0 = 256;
		int var2;
		if (NpcFlags.anInt26 > 0) {
			for (var2 = 0; var2 < 256; ++var2)
				if (NpcFlags.anInt26 > 768)
					Class45.anIntArray450[var2] = Class131_Sub11.method573(Class74.anIntArray627[var2],
							Class30.anIntArray282[var2], 1024 - NpcFlags.anInt26);
				else if (NpcFlags.anInt26 > 256)
					Class45.anIntArray450[var2] = Class30.anIntArray282[var2];
				else
					Class45.anIntArray450[var2] = Class131_Sub11.method573(Class30.anIntArray282[var2],
							Class74.anIntArray627[var2], 256 - NpcFlags.anInt26);
		} else if (NpcFlags.anInt34 > 0) {
			for (var2 = 0; var2 < 256; ++var2)
				if (NpcFlags.anInt34 > 768)
					Class45.anIntArray450[var2] = Class131_Sub11.method573(Class74.anIntArray627[var2],
							Class63_Sub1.anIntArray1100[var2], 1024 - NpcFlags.anInt34);
				else if (NpcFlags.anInt34 > 256)
					Class45.anIntArray450[var2] = Class63_Sub1.anIntArray1100[var2];
				else
					Class45.anIntArray450[var2] = Class131_Sub11.method573(Class63_Sub1.anIntArray1100[var2],
							Class74.anIntArray627[var2], 256 - NpcFlags.anInt34);
		} else
			for (var2 = 0; var2 < 256; ++var2)
				Class45.anIntArray450[var2] = Class74.anIntArray627[var2];

		Class131_Sub20_Sub17.method845(NpcFlags.anInt36, 9, NpcFlags.anInt36 + 128, 7 + var0);
		NpcFlags.aClass131_Sub20_Sub17_Sub3_28.method966(NpcFlags.anInt36, 0);
		Class131_Sub20_Sub17.method844();
		var2 = 0;
		int var5 = (Class131_Sub20_Sub19_Sub5.aClass16_1839.anInt150 * 9) + NpcFlags.anInt36;

		int var1;
		int var3;
		int var4;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var4 = 1; var4 < (var0 - 1); ++var4) {
			var7 = (NpcFlags.anIntArray32[var4] * (var0 - var4)) / var0;
			var3 = var7 + 22;
			if (var3 < 0)
				var3 = 0;

			var2 += var3;

			for (var8 = var3; var8 < 128; ++var8) {
				var1 = Class49.anIntArray485[var2++];
				if (var1 != 0) {
					var9 = var1;
					var10 = 256 - var1;
					var1 = Class45.anIntArray450[var1];
					var6 = Class131_Sub20_Sub19_Sub5.aClass16_1839.anIntArray153[var5];
					Class131_Sub20_Sub19_Sub5.aClass16_1839.anIntArray153[var5++] = ((((var10 * (var6 & '\uff00'))
							+ (var9 * (var1 & '\uff00'))) & 16711680)
							+ (((var9 * (var1 & 16711935)) + ((var6 & 16711935) * var10)) & -16711936)) >> 8;
				} else
					++var5;
			}

			var5 += (var3 + Class131_Sub20_Sub19_Sub5.aClass16_1839.anInt150) - 128;
		}

		Class131_Sub20_Sub17.method845((765 + NpcFlags.anInt36) - 128, 9, 765 + NpcFlags.anInt36, var0 + 7);
		Class131_Sub20_Sub20.aClass131_Sub20_Sub17_Sub3_1652.method966(NpcFlags.anInt36 + 382, 0);
		Class131_Sub20_Sub17.method844();
		var2 = 0;
		var5 = 637 + 24 + (Class131_Sub20_Sub19_Sub5.aClass16_1839.anInt150 * 9) + NpcFlags.anInt36;

		for (var4 = 1; var4 < (var0 - 1); ++var4) {
			var7 = ((var0 - var4) * NpcFlags.anIntArray32[var4]) / var0;
			var3 = 103 - var7;
			var5 += var7;

			for (var8 = 0; var8 < var3; ++var8) {
				var1 = Class49.anIntArray485[var2++];
				if (var1 != 0) {
					var9 = var1;
					var10 = 256 - var1;
					var1 = Class45.anIntArray450[var1];
					var6 = Class131_Sub20_Sub19_Sub5.aClass16_1839.anIntArray153[var5];
					Class131_Sub20_Sub19_Sub5.aClass16_1839.anIntArray153[var5++] = (((((var6 & '\uff00') * var10)
							+ (var9 * (var1 & '\uff00'))) & 16711680)
							+ (((var10 * (var6 & 16711935)) + ((var1 & 16711935) * var9)) & -16711936)) >> 8;
				} else
					++var5;
			}

			var2 += 128 - var3;
			var5 += Class131_Sub20_Sub19_Sub5.aClass16_1839.anInt150 - var3 - var7;
		}

	}
}
