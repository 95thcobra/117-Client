public class Class131_Sub20_Sub3 extends Class131_Sub20 {
	static Class84 aClass84_1424;
	static Class100 aClass100_1425;
	public int anInt1429;
	public int anInt1426;
	public int anInt1427;
	static Class121 aClass121_1428 = new Class121(64);

	void method705(final DataBuffer var1, final int var2) {
		if (var2 == 1) {
			anInt1429 = var1.readUShort();
			anInt1426 = var1.readUByte();
			anInt1427 = var1.readUByte();
		}

	}

	static void method706(final Class131_Sub18 var0) {
		final Class131_Sub18 var1 = var0.anInt1177 == -1 ? null : Class88.method377(var0.anInt1177);
		int var2;
		int var3;
		if (var1 == null) {
			var2 = Class2.anInt7;
			var3 = Class88.anInt723;
		} else {
			var2 = var1.anInt1173;
			var3 = var1.anInt1291;
		}

		Player.method1074(var0, var2, var3, false);
		Class47.method238(var0, var2, var3);
	}

	static final void method707() {
		for (int var0 = 0; var0 < client.anInt2230; ++var0) {
			final int var1 = client.anIntArray2067[var0];
			final Class131_Sub20_Sub19_Sub2_Sub1 var2 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var1];
			if (null != var2) {
				Class131_Sub20_Sub19_Sub4.method957(var2);
			}
		}

	}

	static final void method708(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final Class33 var7, final Class51 var8) {
		final Class131_Sub20_Sub9 var9 = Class83.method362(var4);
		int var10;
		int var16;
		if ((var5 != 1) && (var5 != 3)) {
			var10 = var9.anInt1511;
			var16 = var9.anInt1503;
		} else {
			var10 = var9.anInt1503;
			var16 = var9.anInt1511;
		}

		int var13;
		int var14;
		if ((var2 + var10) <= 104) {
			var14 = var2 + (var10 >> 1);
			var13 = ((var10 + 1) >> 1) + var2;
		} else {
			var14 = var2;
			var13 = var2 + 1;
		}

		int var11;
		int var17;
		if ((var3 + var16) <= 104) {
			var11 = var3 + (var16 >> 1);
			var17 = var3 + ((1 + var16) >> 1);
		} else {
			var11 = var3;
			var17 = 1 + var3;
		}

		final int[][] var12 = Class26.anIntArrayArrayArray239[var1];
		final int var18 = (var12[var13][var17] + var12[var14][var17] + var12[var14][var11] + var12[var13][var11]) >> 2;
		final int var19 = (var2 << 7) + (var10 << 6);
		final int var20 = (var16 << 6) + (var3 << 7);
		int var21 = (var3 << 7) + var2 + (var4 << 14) + 1073741824;
		if (var9.anInt1521 == 0)
			var21 -= Integer.MIN_VALUE;

		int var23 = var6 + (var5 << 6);
		if (var9.anInt1542 == 1)
			var23 += 256;

		Object var24;
		if (var6 == 22) {
			if ((var9.anInt1525 == -1) && (null == var9.anIntArray1513))
				var24 = var9.method752(22, var5, var12, var19, var18, var20);
			else
				var24 = new Class131_Sub20_Sub19_Sub5(var4, 22, var5, var1, var2, var3, var9.anInt1525, true,
						(Class131_Sub20_Sub19) null);

			var7.method151(var0, var2, var3, var18, (Class131_Sub20_Sub19) var24, var21, var23);
			if (var9.anInt1519 == 1)
				var8.method261(var2, var3);

		} else if ((var6 != 10) && (var6 != 11)) {
			if (var6 >= 12) {
				if ((var9.anInt1525 == -1) && (null == var9.anIntArray1513))
					var24 = var9.method752(var6, var5, var12, var19, var18, var20);
				else
					var24 = new Class131_Sub20_Sub19_Sub5(var4, var6, var5, var1, var2, var3, var9.anInt1525, true,
							(Class131_Sub20_Sub19) null);

				var7.method195(var0, var2, var3, var18, 1, 1, (Class131_Sub20_Sub19) var24, 0, var21, var23);
				if (var9.anInt1519 != 0)
					var8.method268(var2, var3, var10, var16, var9.aBool1520);

			} else if (var6 == 0) {
				if ((var9.anInt1525 == -1) && (null == var9.anIntArray1513))
					var24 = var9.method752(0, var5, var12, var19, var18, var20);
				else
					var24 = new Class131_Sub20_Sub19_Sub5(var4, 0, var5, var1, var2, var3, var9.anInt1525, true,
							(Class131_Sub20_Sub19) null);

				var7.method185(var0, var2, var3, var18, (Class131_Sub20_Sub19) var24, (Class131_Sub20_Sub19) null,
						Class26.anIntArray232[var5], 0, var21, var23);
				if (var9.anInt1519 != 0)
					var8.method260(var2, var3, var6, var5, var9.aBool1520);

			} else if (var6 == 1) {
				if ((var9.anInt1525 == -1) && (null == var9.anIntArray1513))
					var24 = var9.method752(1, var5, var12, var19, var18, var20);
				else
					var24 = new Class131_Sub20_Sub19_Sub5(var4, 1, var5, var1, var2, var3, var9.anInt1525, true,
							(Class131_Sub20_Sub19) null);

				var7.method185(var0, var2, var3, var18, (Class131_Sub20_Sub19) var24, (Class131_Sub20_Sub19) null,
						Class26.anIntArray233[var5], 0, var21, var23);
				if (var9.anInt1519 != 0)
					var8.method260(var2, var3, var6, var5, var9.aBool1520);

			} else {
				int var15;
				Object var22;
				if (var6 == 2) {
					var15 = (1 + var5) & 3;
					Object var26;
					if ((var9.anInt1525 == -1) && (null == var9.anIntArray1513)) {
						var26 = var9.method752(2, 4 + var5, var12, var19, var18, var20);
						var22 = var9.method752(2, var15, var12, var19, var18, var20);
					} else {
						var26 = new Class131_Sub20_Sub19_Sub5(var4, 2, var5 + 4, var1, var2, var3, var9.anInt1525, true,
								(Class131_Sub20_Sub19) null);
						var22 = new Class131_Sub20_Sub19_Sub5(var4, 2, var15, var1, var2, var3, var9.anInt1525, true,
								(Class131_Sub20_Sub19) null);
					}

					var7.method185(var0, var2, var3, var18, (Class131_Sub20_Sub19) var26, (Class131_Sub20_Sub19) var22,
							Class26.anIntArray232[var5], Class26.anIntArray232[var15], var21, var23);
					if (var9.anInt1519 != 0)
						var8.method260(var2, var3, var6, var5, var9.aBool1520);

				} else if (var6 == 3) {
					if ((var9.anInt1525 == -1) && (null == var9.anIntArray1513))
						var24 = var9.method752(3, var5, var12, var19, var18, var20);
					else
						var24 = new Class131_Sub20_Sub19_Sub5(var4, 3, var5, var1, var2, var3, var9.anInt1525, true,
								(Class131_Sub20_Sub19) null);

					var7.method185(var0, var2, var3, var18, (Class131_Sub20_Sub19) var24, (Class131_Sub20_Sub19) null,
							Class26.anIntArray233[var5], 0, var21, var23);
					if (var9.anInt1519 != 0)
						var8.method260(var2, var3, var6, var5, var9.aBool1520);

				} else if (var6 == 9) {
					if ((var9.anInt1525 == -1) && (var9.anIntArray1513 == null))
						var24 = var9.method752(var6, var5, var12, var19, var18, var20);
					else
						var24 = new Class131_Sub20_Sub19_Sub5(var4, var6, var5, var1, var2, var3, var9.anInt1525, true,
								(Class131_Sub20_Sub19) null);

					var7.method195(var0, var2, var3, var18, 1, 1, (Class131_Sub20_Sub19) var24, 0, var21, var23);
					if (var9.anInt1519 != 0)
						var8.method268(var2, var3, var10, var16, var9.aBool1520);

				} else if (var6 == 4) {
					if ((var9.anInt1525 == -1) && (null == var9.anIntArray1513))
						var24 = var9.method752(4, var5, var12, var19, var18, var20);
					else
						var24 = new Class131_Sub20_Sub19_Sub5(var4, 4, var5, var1, var2, var3, var9.anInt1525, true,
								(Class131_Sub20_Sub19) null);

					var7.method186(var0, var2, var3, var18, (Class131_Sub20_Sub19) var24, (Class131_Sub20_Sub19) null,
							Class26.anIntArray232[var5], 0, 0, 0, var21, var23);
				} else {
					int var25;
					if (var6 == 5) {
						var15 = 16;
						var25 = var7.method167(var0, var2, var3);
						if (var25 != 0)
							var15 = Class83.method362((var25 >> 14) & 32767).anInt1526;

						if ((var9.anInt1525 == -1) && (var9.anIntArray1513 == null))
							var22 = var9.method752(4, var5, var12, var19, var18, var20);
						else
							var22 = new Class131_Sub20_Sub19_Sub5(var4, 4, var5, var1, var2, var3, var9.anInt1525, true,
									(Class131_Sub20_Sub19) null);

						var7.method186(var0, var2, var3, var18, (Class131_Sub20_Sub19) var22,
								(Class131_Sub20_Sub19) null, Class26.anIntArray232[var5], 0,
								Class26.anIntArray234[var5] * var15, Class26.anIntArray235[var5] * var15, var21, var23);
					} else if (var6 == 6) {
						var15 = 8;
						var25 = var7.method167(var0, var2, var3);
						if (var25 != 0)
							var15 = Class83.method362((var25 >> 14) & 32767).anInt1526 / 2;

						if ((var9.anInt1525 == -1) && (var9.anIntArray1513 == null))
							var22 = var9.method752(4, var5 + 4, var12, var19, var18, var20);
						else
							var22 = new Class131_Sub20_Sub19_Sub5(var4, 4, var5 + 4, var1, var2, var3, var9.anInt1525,
									true, (Class131_Sub20_Sub19) null);

						var7.method186(var0, var2, var3, var18, (Class131_Sub20_Sub19) var22,
								(Class131_Sub20_Sub19) null, 256, var5, Class26.anIntArray236[var5] * var15,
								var15 * Class26.anIntArray241[var5], var21, var23);
					} else if (var6 == 7) {
						var25 = (var5 + 2) & 3;
						if ((var9.anInt1525 == -1) && (var9.anIntArray1513 == null))
							var24 = var9.method752(4, 4 + var25, var12, var19, var18, var20);
						else
							var24 = new Class131_Sub20_Sub19_Sub5(var4, 4, 4 + var25, var1, var2, var3, var9.anInt1525,
									true, (Class131_Sub20_Sub19) null);

						var7.method186(var0, var2, var3, var18, (Class131_Sub20_Sub19) var24,
								(Class131_Sub20_Sub19) null, 256, var25, 0, 0, var21, var23);
					} else if (var6 == 8) {
						var15 = 8;
						var25 = var7.method167(var0, var2, var3);
						if (var25 != 0)
							var15 = Class83.method362((var25 >> 14) & 32767).anInt1526 / 2;

						final int var27 = (2 + var5) & 3;
						Object var28;
						if ((var9.anInt1525 == -1) && (var9.anIntArray1513 == null)) {
							var22 = var9.method752(4, var5 + 4, var12, var19, var18, var20);
							var28 = var9.method752(4, var27 + 4, var12, var19, var18, var20);
						} else {
							var22 = new Class131_Sub20_Sub19_Sub5(var4, 4, var5 + 4, var1, var2, var3, var9.anInt1525,
									true, (Class131_Sub20_Sub19) null);
							var28 = new Class131_Sub20_Sub19_Sub5(var4, 4, var27 + 4, var1, var2, var3, var9.anInt1525,
									true, (Class131_Sub20_Sub19) null);
						}

						var7.method186(var0, var2, var3, var18, (Class131_Sub20_Sub19) var22,
								(Class131_Sub20_Sub19) var28, 256, var5, var15 * Class26.anIntArray236[var5],
								Class26.anIntArray241[var5] * var15, var21, var23);
					}
				}
			}
		} else {
			if ((var9.anInt1525 == -1) && (null == var9.anIntArray1513))
				var24 = var9.method752(10, var5, var12, var19, var18, var20);
			else
				var24 = new Class131_Sub20_Sub19_Sub5(var4, 10, var5, var1, var2, var3, var9.anInt1525, true,
						(Class131_Sub20_Sub19) null);

			if (var24 != null)
				var7.method195(var0, var2, var3, var18, var10, var16, (Class131_Sub20_Sub19) var24,
						var6 == 11 ? 256 : 0, var21, var23);

			if (var9.anInt1519 != 0)
				var8.method268(var2, var3, var10, var16, var9.aBool1520);

		}
	}

	void method709(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.readUByte();
			if (var2 == 0)
				return;

			method705(var1, var2);
		}
	}
}
