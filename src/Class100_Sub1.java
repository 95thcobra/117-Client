import java.util.zip.CRC32;

public class Class100_Sub1 extends Class100 {
	static Class131_Sub20_Sub17_Sub3[] aClass131_Sub20_Sub17_Sub3Array1128;
	static CRC32 aCRC32_1132 = new CRC32();
	volatile boolean[] aBoolArray1123;
	volatile boolean aBool1126 = false;
	int anInt1133 = -1;
	boolean aBool1127 = false;
	Class75 aClass75_1125;
	Class75 aClass75_1124;
	int anInt1129;
	int anInt1130;
	int anInt1131;

	public int method650() {
		if (aBool1126)
			return 100;
		else if (null != anObjectArray777)
			return 99;
		else {
			int var1 = Class131_Sub20_Sub19_Sub4.method952(255, anInt1129);
			if (var1 >= 100)
				var1 = 99;

			return var1;
		}
	}

	@Override
	void method401(final int var1, final int var2) {
		final int var3 = anInt1129;
		final long var4 = var1 + (var3 << 16);
		final Class131_Sub20_Sub20 var6 = (Class131_Sub20_Sub20) Class94.aClass114_750.method457(var4);
		if (null != var6)
			Class94.aClass116_749.method475(var6);

	}

	@Override
	void method418(final int var1, final int var2) {
		if ((aClass75_1125 != null) && (aBoolArray1123 != null) && aBoolArray1123[var1])
			Class45.method229(var1, aClass75_1125, this);
		else
			Class131_Sub20_Sub11.method770(this, anInt1129, var1, anIntArray780[var1], (byte) 2, true);

	}

	void method651() {
		aBoolArray1123 = new boolean[anObjectArray777.length];

		int var1;
		for (var1 = 0; var1 < aBoolArray1123.length; ++var1)
			aBoolArray1123[var1] = false;

		if (null == aClass75_1125)
			aBool1126 = true;
		else {
			anInt1133 = -1;

			for (var1 = 0; var1 < aBoolArray1123.length; ++var1)
				if (anIntArray781[var1] > 0) {
					Class131_Sub9.method567(var1, aClass75_1125, this);
					anInt1133 = var1;
				}

			if (anInt1133 == -1)
				aBool1126 = true;

		}
	}

	void method652(final Class75 var1, final int var2, final byte[] var3, final boolean var4) {
		int var5;
		if (var1 == aClass75_1124) {
			if (aBool1126)
				throw new RuntimeException();

			if (var3 == null) {
				Class131_Sub20_Sub11.method770(this, 255, anInt1129, anInt1130, (byte) 0, true);
				return;
			}

			aCRC32_1132.reset();
			aCRC32_1132.update(var3, 0, var3.length);
			var5 = (int) aCRC32_1132.getValue();
			final DataBuffer var6 = new DataBuffer(Class131_Sub4_Sub4.method914(var3));
			final int var7 = var6.method595();
			if ((var7 != 5) && (var7 != 6))
				throw new RuntimeException(var7 + "," + anInt1129 + "," + var2);

			int var8 = 0;
			if (var7 >= 6)
				var8 = var6.readIntV1();

			if ((var5 != anInt1130) || (var8 != anInt1131)) {
				Class131_Sub20_Sub11.method770(this, 255, anInt1129, anInt1130, (byte) 0, true);
				return;
			}

			method423(var3);
			method651();
		} else {
			if (!var4 && (anInt1133 == var2))
				aBool1126 = true;

			if ((var3 == null) || (var3.length <= 2)) {
				aBoolArray1123[var2] = false;
				if (aBool1127 || var4)
					Class131_Sub20_Sub11.method770(this, anInt1129, var2, anIntArray780[var2], (byte) 2, var4);

				return;
			}

			aCRC32_1132.reset();
			aCRC32_1132.update(var3, 0, var3.length - 2);
			var5 = (int) aCRC32_1132.getValue();
			final int var9 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if ((anIntArray780[var2] != var5) || (var9 != anIntArray782[var2])) {
				aBoolArray1123[var2] = false;
				if (aBool1127 || var4)
					Class131_Sub20_Sub11.method770(this, anInt1129, var2, anIntArray780[var2], (byte) 2, var4);

				return;
			}

			aBoolArray1123[var2] = true;
			if (var4)
				anObjectArray777[var2] = Class131_Sub20_Sub4.method719(var3, false);
		}

	}

	public Class100_Sub1(final Class75 var1, final Class75 var2, final int var3, final boolean var4, final boolean var5,
			final boolean var6) {
		super(var4, var5);
		aClass75_1125 = var1;
		aClass75_1124 = var2;
		anInt1129 = var3;
		aBool1127 = var6;
		Class64.method309(this, anInt1129);
	}

	int method653(final int var1) {
		return anObjectArray777[var1] != null ? 100
				: (aBoolArray1123[var1] ? 100 : Class131_Sub20_Sub19_Sub4.method952(anInt1129, var1));
	}

	public void method654(final int var1, final int var2) {
		anInt1130 = var1;
		anInt1131 = var2;
		if (aClass75_1124 != null)
			Class45.method229(anInt1129, aClass75_1124, this);
		else
			Class131_Sub20_Sub11.method770(this, 255, anInt1129, anInt1130, (byte) 0, true);

	}

	public int method655() {
		int var1 = 0;
		int var3 = 0;

		int var2;
		for (var2 = 0; var2 < anObjectArray777.length; ++var2)
			if (anIntArray781[var2] > 0) {
				var1 += 100;
				var3 += method653(var2);
			}

		if (var1 == 0)
			return 100;
		else {
			var2 = (var3 * 100) / var1;
			return var2;
		}
	}

	public void method656(final int var1, final byte[] var2, final boolean var3, final boolean var4) {
		if (var3) {
			if (aBool1126)
				throw new RuntimeException();

			if (aClass75_1124 != null)
				Class70.method326(anInt1129, var2, aClass75_1124);

			method423(var2);
			method651();
		} else {
			var2[var2.length - 2] = (byte) (anIntArray782[var1] >> 8);
			var2[var2.length - 1] = (byte) anIntArray782[var1];
			if (aClass75_1125 != null) {
				final Class75 var5 = aClass75_1125;
				final Class131_Sub17 var6 = new Class131_Sub17();
				var6.anInt1143 = 0;
				var6.aLong902 = var1;
				var6.aByteArray1142 = var2;
				var6.aClass75_1144 = var5;
				final Class115 var7 = Class105.aClass115_807;
				synchronized (var7) {
					Class105.aClass115_807.method471(var6);
				}

				final Object var12 = Class105.anObject806;
				synchronized (var12) {
					if (Class105.anInt804 == 0)
						Class36.aClass78_371.method348(new Class105(), 5);

					Class105.anInt804 = 600;
				}

				aBoolArray1123[var1] = true;
			}

			if (var4)
				anObjectArray777[var1] = Class131_Sub20_Sub4.method719(var2, false);
		}

	}

	static final void method657(final int var0, final int var1, final int var2, final int var3, final int var4) {
		int var5 = Class65.aClass33_595.method167(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var13;
		if (var5 != 0) {
			var9 = Class65.aClass33_595.method187(var0, var1, var2, var5);
			var10 = (var9 >> 6) & 3;
			var11 = var9 & 31;
			var8 = var3;
			if (var5 > 0)
				var8 = var4;

			final int[] var6 = Class95.aClass131_Sub20_Sub17_Sub3_763.anIntArray1823;
			var7 = (var1 * 4) + 24624 + ((103 - var2) * 2048);
			var13 = (var5 >> 14) & 32767;
			final Class131_Sub20_Sub9 var14 = Class83.method362(var13);
			if (var14.anInt1531 != -1) {
				final Class131_Sub20_Sub17_Sub2 var15 = Class39.aClass131_Sub20_Sub17_Sub2Array409[var14.anInt1531];
				if (var15 != null) {
					final int var16 = ((var14.anInt1511 * 4) - var15.anInt1790) / 2;
					final int var17 = ((var14.anInt1503 * 4) - var15.anInt1791) / 2;
					var15.method950((4 * var1) + 48 + var16, ((104 - var2 - var14.anInt1503) * 4) + 48 + var17);
				}
			} else {
				if ((var11 == 0) || (var11 == 2))
					if (var10 == 0) {
						var6[var7] = var8;
						var6[var7 + 512] = var8;
						var6[var7 + 1024] = var8;
						var6[1536 + var7] = var8;
					} else if (var10 == 1) {
						var6[var7] = var8;
						var6[1 + var7] = var8;
						var6[var7 + 2] = var8;
						var6[3 + var7] = var8;
					} else if (var10 == 2) {
						var6[var7 + 3] = var8;
						var6[var7 + 3 + 512] = var8;
						var6[1024 + 3 + var7] = var8;
						var6[1536 + var7 + 3] = var8;
					} else if (var10 == 3) {
						var6[var7 + 1536] = var8;
						var6[1 + 1536 + var7] = var8;
						var6[2 + var7 + 1536] = var8;
						var6[1536 + var7 + 3] = var8;
					}

				if (var11 == 3)
					if (var10 == 0)
						var6[var7] = var8;
					else if (var10 == 1)
						var6[3 + var7] = var8;
					else if (var10 == 2)
						var6[1536 + var7 + 3] = var8;
					else if (var10 == 3)
						var6[var7 + 1536] = var8;

				if (var11 == 2)
					if (var10 == 3) {
						var6[var7] = var8;
						var6[512 + var7] = var8;
						var6[1024 + var7] = var8;
						var6[var7 + 1536] = var8;
					} else if (var10 == 0) {
						var6[var7] = var8;
						var6[var7 + 1] = var8;
						var6[2 + var7] = var8;
						var6[var7 + 3] = var8;
					} else if (var10 == 1) {
						var6[3 + var7] = var8;
						var6[var7 + 3 + 512] = var8;
						var6[3 + var7 + 1024] = var8;
						var6[3 + var7 + 1536] = var8;
					} else if (var10 == 2) {
						var6[var7 + 1536] = var8;
						var6[var7 + 1536 + 1] = var8;
						var6[2 + var7 + 1536] = var8;
						var6[1536 + var7 + 3] = var8;
					}
			}
		}

		var5 = Class65.aClass33_595.method191(var0, var1, var2);
		if (var5 != 0) {
			var9 = Class65.aClass33_595.method187(var0, var1, var2, var5);
			var10 = (var9 >> 6) & 3;
			var11 = var9 & 31;
			var8 = (var5 >> 14) & 32767;
			final Class131_Sub20_Sub9 var23 = Class83.method362(var8);
			int var18;
			if (var23.anInt1531 != -1) {
				final Class131_Sub20_Sub17_Sub2 var12 = Class39.aClass131_Sub20_Sub17_Sub2Array409[var23.anInt1531];
				if (var12 != null) {
					var13 = ((var23.anInt1511 * 4) - var12.anInt1790) / 2;
					var18 = ((var23.anInt1503 * 4) - var12.anInt1791) / 2;
					var12.method950((var1 * 4) + 48 + var13, 48 + ((104 - var2 - var23.anInt1503) * 4) + var18);
				}
			} else if (var11 == 9) {
				var7 = 15658734;
				if (var5 > 0)
					var7 = 15597568;

				final int[] var19 = Class95.aClass131_Sub20_Sub17_Sub3_763.anIntArray1823;
				var18 = 24624 + (4 * var1) + ((103 - var2) * 2048);
				if ((var10 != 0) && (var10 != 2)) {
					var19[var18] = var7;
					var19[1 + 512 + var18] = var7;
					var19[1024 + var18 + 2] = var7;
					var19[3 + var18 + 1536] = var7;
				} else {
					var19[var18 + 1536] = var7;
					var19[1024 + var18 + 1] = var7;
					var19[2 + var18 + 512] = var7;
					var19[3 + var18] = var7;
				}
			}
		}

		var5 = Class65.aClass33_595.method149(var0, var1, var2);
		if (var5 != 0) {
			var9 = (var5 >> 14) & 32767;
			final Class131_Sub20_Sub9 var21 = Class83.method362(var9);
			if (var21.anInt1531 != -1) {
				final Class131_Sub20_Sub17_Sub2 var20 = Class39.aClass131_Sub20_Sub17_Sub2Array409[var21.anInt1531];
				if (var20 != null) {
					var8 = ((var21.anInt1511 * 4) - var20.anInt1790) / 2;
					final int var22 = ((var21.anInt1503 * 4) - var20.anInt1791) / 2;
					var20.method950(var8 + 48 + (4 * var1), 48 + ((104 - var2 - var21.anInt1503) * 4) + var22);
				}
			}
		}

	}
}
