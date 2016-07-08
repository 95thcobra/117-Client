import java.io.EOFException;

public class Class48 {
	public static String aString469;
	static int anInt476;
	static int[][][] anIntArrayArrayArray477;
	boolean aBool473 = false;
	long aLong475;
	int[] anIntArray472;
	String[] aStringArray474;
	boolean[] aBoolArray470;
	boolean[] aBoolArray471;

	void method241() {
		int var1;
		for (var1 = 0; var1 < anIntArray472.length; ++var1)
			if (!aBoolArray470[var1])
				anIntArray472[var1] = -1;

		for (var1 = 0; var1 < aStringArray474.length; ++var1)
			if (!aBoolArray471[var1])
				aStringArray474[var1] = null;

	}

	void method242(final int var1, final int var2) {
		anIntArray472[var1] = var2;
		if (aBoolArray470[var1])
			aBool473 = true;

	}

	int method243(final int var1) {
		return anIntArray472[var1];
	}

	Class143 method244(final boolean var1) {
		return Class131_Sub20_Sub5.method726("2", Class80.aClass73_665.aString623, var1);
	}

	void method245() {
		final Class143 var1 = method244(false);
		boolean var23 = false;

		try {
			label186: {
				try {
					var23 = true;
					final byte[] var2 = new byte[(int) var1.method522()];

					int var4;
					for (int var3 = 0; var3 < var2.length; var3 += var4) {
						var4 = var1.method519(var2, var3, var2.length - var3);
						if (var4 == -1)
							throw new EOFException();
					}

					final DataBuffer var5 = new DataBuffer(var2);
					if ((var5.data.length - var5.pos) < 1) {
						try {
							var1.method521();
						} catch (final Exception var26) {
							;
						}

						return;
					}

					final int var7 = var5.method595();
					if ((var7 < 0) || (var7 > 1)) {
						try {
							var1.method521();
						} catch (final Exception var28) {
							;
						}

						return;
					}

					final int var9 = var5.readUShort();

					int var10;
					int var11;
					int var12;
					for (var10 = 0; var10 < var9; ++var10) {
						var11 = var5.readUShort();
						var12 = var5.readIntV1();
						if (aBoolArray470[var11])
							anIntArray472[var11] = var12;
					}

					var10 = var5.readUShort();

					for (var11 = 0; var11 < var10; ++var11) {
						var12 = var5.readUShort();
						final String var13 = var5.method638();
						if (aBoolArray471[var12])
							aStringArray474[var12] = var13;
					}
				} catch (final Exception var29) {
					try {
						var1.method521();
						var23 = false;
					} catch (final Exception var25) {
						var23 = false;
					}
					break label186;
				}

				try {
					var1.method521();
					var23 = false;
				} catch (final Exception var27) {
					var23 = false;
				}
			}
		} finally {
			if (var23)
				try {
					var1.method521();
				} catch (final Exception var24) {
					;
				}
		}

		aBool473 = false;
	}

	void method246() {
		if (aBool473 && (aLong475 < (Class84.method366(780546663) - 60000L)))
			method248();

	}

	boolean method247() {
		return aBool473;
	}

	void method248() {
		final Class143 var1 = method244(true);
		boolean var16 = false;

		try {
			label183: {
				try {
					var16 = true;
					int var2 = 3;
					int var3 = 0;

					int var4;
					for (var4 = 0; var4 < anIntArray472.length; ++var4)
						if (aBoolArray470[var4] && (anIntArray472[var4] != -1)) {
							var2 += 6;
							++var3;
						}

					var2 += 2;
					var4 = 0;

					for (int var5 = 0; var5 < aStringArray474.length; ++var5)
						if (aBoolArray471[var5] && (null != aStringArray474[var5])) {
							var2 += 2 + Class131_Sub6.method554(aStringArray474[var5]);
							++var4;
						}

					final DataBuffer var6 = new DataBuffer(var2);
					var6.writeByte(1);
					var6.method586(var3);

					int var7;
					for (var7 = 0; var7 < anIntArray472.length; ++var7)
						if (aBoolArray470[var7] && (anIntArray472[var7] != -1)) {
							var6.method586(var7);
							var6.writeInt(anIntArray472[var7]);
						}

					var6.method586(var4);
					var7 = 0;

					while (true) {
						if (var7 >= aStringArray474.length) {
							var1.method523(var6.data, 0, var6.pos);
							break;
						}

						if (aBoolArray471[var7] && (aStringArray474[var7] != null)) {
							var6.method586(var7);
							var6.writeStr(aStringArray474[var7]);
						}

						++var7;
					}
				} catch (final Exception var20) {
					try {
						var1.method521();
						var16 = false;
					} catch (final Exception var18) {
						var16 = false;
					}
					break label183;
				}

				try {
					var1.method521();
					var16 = false;
				} catch (final Exception var19) {
					var16 = false;
				}
			}
		} finally {
			if (var16)
				try {
					var1.method521();
				} catch (final Exception var17) {
					;
				}
		}

		aBool473 = false;
		aLong475 = Class84.method366(780546663);
	}

	Class48() {
		anIntArray472 = new int[Class32.aClass100_Sub1_297.method417(19)];
		aStringArray474 = new String[Class32.aClass100_Sub1_297.method417(15)];
		aBoolArray470 = new boolean[anIntArray472.length];

		int var1;
		for (var1 = 0; var1 < anIntArray472.length; ++var1) {
			final Class131_Sub20_Sub7 var2 = Class2.method20(var1);
			aBoolArray470[var1] = var2.aBool1490;
		}

		aBoolArray471 = new boolean[aStringArray474.length];

		for (var1 = 0; var1 < aStringArray474.length; ++var1) {
			final Class131_Sub20_Sub10 var3 = Class91.method388(var1);
			aBoolArray471[var1] = var3.aBool1552;
		}

		for (var1 = 0; var1 < anIntArray472.length; ++var1)
			anIntArray472[var1] = -1;

		method245();
	}

	void method249(final int var1, final String var2) {
		aStringArray474[var1] = var2;
		if (aBoolArray471[var1])
			aBool473 = true;

	}

	String method250(final int var1) {
		return aStringArray474[var1];
	}

	static void method251() {
		int var0 = Class2.anInt7;
		int var1 = Class88.anInt723;
		if (Class131_Sub20_Sub5.anInt1450 < var0)
			var0 = Class131_Sub20_Sub5.anInt1450;

		if (Class131_Sub20_Sub7.anInt1491 < var1)
			var1 = Class131_Sub20_Sub7.anInt1491;

		if (null != Class50.aClass28_494)
			try {
				final client var2 = client.aclient2265;
				final int var3 = client.aBool2237 ? 2 : 1;
				Class76.method343(var2, "resize", new Object[] { Integer.valueOf(var3) });
			} catch (final Throwable var4) {
				;
			}

	}

	public static String method252(final CharSequence var0) {
		long var1 = 0L;
		final int var6 = var0.length();

		for (int var3 = 0; var3 < var6; ++var3) {
			var1 *= 37L;
			final char var4 = var0.charAt(var3);
			if ((var4 >= 65) && (var4 <= 90))
				var1 += (1 + var4) - 65;
			else if ((var4 >= 97) && (var4 <= 122))
				var1 += (1 + var4) - 97;
			else if ((var4 >= 48) && (var4 <= 57))
				var1 += (var4 + 27) - 48;

			if (var1 >= 177917621779460413L)
				break;
		}

		while ((0L == (var1 % 37L)) && (var1 != 0L))
			var1 /= 37L;

		String var5 = Class131_Sub20_Sub5.method724(var1);
		if (null == var5)
			var5 = "";

		return var5;
	}
}
