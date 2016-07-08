public abstract class Class100 {
	static Class131_Sub18 aClass131_Sub18_786;
	boolean aBool790;
	boolean aBool791;
	static Class66 aClass66_788 = new Class66();
	static int anInt792 = 0;
	public int anInt789;
	int anInt793;
	int[] anIntArray784;
	int[] anIntArray780;
	int[] anIntArray782;
	int[] anIntArray781;
	int[][] anIntArrayArray783;
	Object[] anObjectArray777;
	Object[][] anObjectArrayArray787;
	int[] anIntArray778;
	Class120 aClass120_776;
	int[][] anIntArrayArray779;
	Class120[] aClass120Array785;

	void method401(final int var1, final int var2) {
	}

	public byte[] method402(final int var1, final int var2) {
		return method403(var1, var2, (int[]) null);
	}

	public byte[] method403(final int var1, final int var2, final int[] var3) {
		if ((var1 >= 0) && (var1 < anObjectArrayArray787.length) && (anObjectArrayArray787[var1] != null) && (var2 >= 0)
				&& (var2 < anObjectArrayArray787[var1].length)) {
			if (null == anObjectArrayArray787[var1][var2]) {
				boolean var4 = method412(var1, var3);
				if (!var4) {
					method418(var1, 1329470439);
					var4 = method412(var1, var3);
					if (!var4)
						return null;
				}
			}

			final byte[] var5 = Class131_Sub20_Sub8.method747(anObjectArrayArray787[var1][var2], false);
			if (aBool791)
				anObjectArrayArray787[var1][var2] = null;

			return var5;
		} else
			return null;
	}

	public boolean method404(final int var1, final int var2) {
		if ((var1 >= 0) && (var1 < anObjectArrayArray787.length) && (null != anObjectArrayArray787[var1]) && (var2 >= 0)
				&& (var2 < anObjectArrayArray787[var1].length)) {
			if (null != anObjectArrayArray787[var1][var2])
				return true;
			else if (anObjectArray777[var1] != null)
				return true;
			else {
				method418(var1, 1329470439);
				return null != anObjectArray777[var1];
			}
		} else
			return false;
	}

	public boolean method405(final int var1) {
		if (anObjectArray777[var1] == null) {
			method418(var1, 1329470439);
			return null != anObjectArray777[var1];
		} else
			return true;
	}

	public boolean method406() {
		boolean var1 = true;

		for (final int var3 : anIntArray784) {
			if (null == anObjectArray777[var3]) {
				method418(var3, 1329470439);
				if (anObjectArray777[var3] == null)
					var1 = false;
			}
		}

		return var1;
	}

	public byte[] method407(final int var1) {
		if (anObjectArrayArray787.length == 1)
			return method402(0, var1);
		else if (anObjectArrayArray787[var1].length == 1)
			return method402(var1, 0);
		else
			throw new RuntimeException();
	}

	public int method408() {
		return anObjectArrayArray787.length;
	}

	public byte[] method409(final int var1, final int var2) {
		if ((var1 >= 0) && (var1 < anObjectArrayArray787.length) && (null != anObjectArrayArray787[var1]) && (var2 >= 0)
				&& (var2 < anObjectArrayArray787[var1].length)) {
			if (anObjectArrayArray787[var1][var2] == null) {
				boolean var3 = method412(var1, (int[]) null);
				if (!var3) {
					method418(var1, 1329470439);
					var3 = method412(var1, (int[]) null);
					if (!var3)
						return null;
				}
			}

			final byte[] var4 = Class131_Sub20_Sub8.method747(anObjectArrayArray787[var1][var2], false);
			return var4;
		} else
			return null;
	}

	Class100(final boolean var1, final boolean var2) {
		aBool790 = var1;
		aBool791 = var2;
	}

	public void method410(final int var1) {
		for (int var2 = 0; var2 < anObjectArrayArray787[var1].length; ++var2)
			anObjectArrayArray787[var1][var2] = null;

	}

	public void method411() {
		for (int var1 = 0; var1 < anObjectArrayArray787.length; ++var1)
			if (anObjectArrayArray787[var1] != null)
				for (int var2 = 0; var2 < anObjectArrayArray787[var1].length; ++var2)
					anObjectArrayArray787[var1][var2] = null;

	}

	boolean method412(final int var1, final int[] var2) {
		if (anObjectArray777[var1] == null)
			return false;
		else {
			final int var3 = anIntArray781[var1];
			final int[] var4 = anIntArrayArray783[var1];
			final Object[] var5 = anObjectArrayArray787[var1];
			boolean var6 = true;

			for (int var7 = 0; var7 < var3; ++var7)
				if (var5[var4[var7]] == null) {
					var6 = false;
					break;
				}

			if (var6)
				return true;
			else {
				byte[] var8;
				if ((var2 != null) && ((var2[0] != 0) || (var2[1] != 0) || (var2[2] != 0) || (var2[3] != 0))) {
					var8 = Class131_Sub20_Sub8.method747(anObjectArray777[var1], true);
					final DataBuffer var9 = new DataBuffer(var8);
					var9.method609(var2, 5, var9.data.length);
				} else
					var8 = Class131_Sub20_Sub8.method747(anObjectArray777[var1], false);

				final byte[] var20 = Class131_Sub4_Sub4.method914(var8);
				if (aBool790)
					anObjectArray777[var1] = null;

				if (var3 > 1) {
					int var10 = var20.length;
					--var10;
					final int var11 = var20[var10] & 255;
					var10 -= 4 * var11 * var3;
					final DataBuffer var12 = new DataBuffer(var20);
					final int[] var13 = new int[var3];
					var12.pos = var10;

					int var15;
					int var16;
					for (int var14 = 0; var14 < var11; ++var14) {
						var15 = 0;

						for (var16 = 0; var16 < var3; ++var16) {
							var15 += var12.readIntV1();
							var13[var16] += var15;
						}
					}

					final byte[][] var17 = new byte[var3][];

					for (var15 = 0; var15 < var3; ++var15) {
						var17[var15] = new byte[var13[var15]];
						var13[var15] = 0;
					}

					var12.pos = var10;
					var15 = 0;

					for (var16 = 0; var16 < var11; ++var16) {
						int var18 = 0;

						for (int var19 = 0; var19 < var3; ++var19) {
							var18 += var12.readIntV1();
							System.arraycopy(var20, var15, var17[var19], var13[var19], var18);
							var13[var19] += var18;
							var15 += var18;
						}
					}

					for (var16 = 0; var16 < var3; ++var16)
						if (!aBool791)
							var5[var4[var16]] = Class131_Sub20_Sub4.method719(var17[var16], false);
						else
							var5[var4[var16]] = var17[var16];
				} else if (!aBool791)
					var5[var4[0]] = Class131_Sub20_Sub4.method719(var20, false);
				else
					var5[var4[0]] = var20;

				return true;
			}
		}
	}

	public int method413(String var1) {
		var1 = var1.toLowerCase();
		return aClass120_776.method478(Class107.method432(var1));
	}

	public int method414(final int var1, String var2) {
		var2 = var2.toLowerCase();
		return aClass120Array785[var1].method478(Class107.method432(var2));
	}

	public byte[] method415(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		final int var3 = aClass120_776.method478(Class107.method432(var1));
		final int var4 = aClass120Array785[var3].method478(Class107.method432(var2));
		return method402(var3, var4);
	}

	public void method416(String var1) {
		var1 = var1.toLowerCase();
		final int var2 = aClass120_776.method478(Class107.method432(var1));
		if (var2 >= 0)
			method401(var2, -1171043006);
	}

	public int method417(final int var1) {
		return anObjectArrayArray787[var1].length;
	}

	void method418(final int var1, final int var2) {
	}

	public boolean method419(final String var1) {
		final int var2 = method413("");
		return var2 != -1 ? method422("", var1) : method422(var1, "");
	}

	public int[] method420(final int var1) {
		return anIntArrayArray783[var1];
	}

	public byte[] method421(final int var1) {
		if (anObjectArrayArray787.length == 1)
			return method409(0, var1);
		else if (anObjectArrayArray787[var1].length == 1)
			return method409(var1, 0);
		else
			throw new RuntimeException();
	}

	public boolean method422(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		final int var3 = aClass120_776.method478(Class107.method432(var1));
		final int var4 = aClass120Array785[var3].method478(Class107.method432(var2));
		return method404(var3, var4);
	}

	void method423(final byte[] var1) {
		final int var2 = var1.length;
		int var10 = -1;

		int var7;
		for (var7 = 0; var7 < var2; ++var7)
			var10 = (var10 >>> 8) ^ DataBuffer.anIntArray1108[(var10 ^ var1[var7]) & 255];

		var10 = ~var10;
		anInt789 = var10;
		final DataBuffer var4 = new DataBuffer(Class131_Sub4_Sub4.method914(var1));
		var10 = var4.method595();
		if ((var10 >= 5) && (var10 <= 7)) {
			if (var10 >= 6)
				var4.readIntV1();

			var7 = var4.method595();
			if (var10 >= 7)
				anInt793 = var4.method643();
			else
				anInt793 = var4.readUShort();

			int var14 = 0;
			int var13 = -1;
			anIntArray784 = new int[anInt793];
			int var3;
			if (var10 >= 7)
				for (var3 = 0; var3 < anInt793; ++var3) {
					anIntArray784[var3] = var14 += var4.method643();
					if (anIntArray784[var3] > var13)
						var13 = anIntArray784[var3];
				}
			else
				for (var3 = 0; var3 < anInt793; ++var3) {
					anIntArray784[var3] = var14 += var4.readUShort();
					if (anIntArray784[var3] > var13)
						var13 = anIntArray784[var3];
				}

			anIntArray780 = new int[var13 + 1];
			anIntArray782 = new int[var13 + 1];
			anIntArray781 = new int[var13 + 1];
			anIntArrayArray783 = new int[1 + var13][];
			anObjectArray777 = new Object[var13 + 1];
			anObjectArrayArray787 = new Object[var13 + 1][];
			if (var7 != 0) {
				anIntArray778 = new int[1 + var13];

				for (var3 = 0; var3 < anInt793; ++var3)
					anIntArray778[anIntArray784[var3]] = var4.readIntV1();

				aClass120_776 = new Class120(anIntArray778);
			}

			for (var3 = 0; var3 < anInt793; ++var3)
				anIntArray780[anIntArray784[var3]] = var4.readIntV1();

			for (var3 = 0; var3 < anInt793; ++var3)
				anIntArray782[anIntArray784[var3]] = var4.readIntV1();

			for (var3 = 0; var3 < anInt793; ++var3)
				anIntArray781[anIntArray784[var3]] = var4.readUShort();

			int var5;
			int var6;
			int var8;
			int var9;
			int var15;
			if (var10 >= 7)
				for (var3 = 0; var3 < anInt793; ++var3) {
					var8 = anIntArray784[var3];
					var6 = anIntArray781[var8];
					var14 = 0;
					var9 = -1;
					anIntArrayArray783[var8] = new int[var6];

					for (var5 = 0; var5 < var6; ++var5) {
						var15 = anIntArrayArray783[var8][var5] = var14 += var4.method643();
						if (var15 > var9)
							var9 = var15;
					}

					anObjectArrayArray787[var8] = new Object[1 + var9];
				}
			else
				for (var3 = 0; var3 < anInt793; ++var3) {
					var8 = anIntArray784[var3];
					var6 = anIntArray781[var8];
					var14 = 0;
					var9 = -1;
					anIntArrayArray783[var8] = new int[var6];

					for (var5 = 0; var5 < var6; ++var5) {
						var15 = anIntArrayArray783[var8][var5] = var14 += var4.readUShort();
						if (var15 > var9)
							var9 = var15;
					}

					anObjectArrayArray787[var8] = new Object[1 + var9];
				}

			if (var7 != 0) {
				anIntArrayArray779 = new int[var13 + 1][];
				aClass120Array785 = new Class120[var13 + 1];

				for (var3 = 0; var3 < anInt793; ++var3) {
					var8 = anIntArray784[var3];
					var6 = anIntArray781[var8];
					anIntArrayArray779[var8] = new int[anObjectArrayArray787[var8].length];

					for (var9 = 0; var9 < var6; ++var9)
						anIntArrayArray779[var8][anIntArrayArray783[var8][var9]] = var4.readIntV1();

					aClass120Array785[var8] = new Class120(anIntArrayArray779[var8]);
				}
			}

		} else
			throw new RuntimeException("");
	}

	public static boolean method424(final int var0, final int var1, final int var2) {
		return ((var0 >> (var1 + 1)) & 1) != 0;
	}
}
