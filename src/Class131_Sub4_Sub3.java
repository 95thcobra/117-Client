public class Class131_Sub4_Sub3 extends Class131_Sub4 {
	int anInt1661 = 256;
	boolean aBool1681;
	long aLong1684;
	int anInt1682;
	int anInt1683;
	long aLong1666;
	int anInt1662 = 1000000;
	int[] anIntArray1669 = new int[16];
	int[] anIntArray1680 = new int[16];
	int[] anIntArray1665 = new int[16];
	int[] anIntArray1675 = new int[16];
	int[] anIntArray1667 = new int[16];
	int[] anIntArray1668 = new int[16];
	int[] anIntArray1663 = new int[16];
	int[] anIntArray1670 = new int[16];
	int[] anIntArray1685 = new int[16];
	int[] anIntArray1673 = new int[16];
	int[] anIntArray1672 = new int[16];
	int[] anIntArray1674 = new int[16];
	int[] anIntArray1660 = new int[16];
	int[] anIntArray1676 = new int[16];
	int[] anIntArray1677 = new int[16];
	Class131_Sub22[][] aClass131_Sub22ArrayArray1678 = new Class131_Sub22[16][128];
	Class131_Sub22[][] aClass131_Sub22ArrayArray1679 = new Class131_Sub22[16][128];
	Class111 aClass111_1671 = new Class111();
	Class131_Sub4_Sub4 aClass131_Sub4_Sub4_1686 = new Class131_Sub4_Sub4(this);
	Class114 aClass114_1664 = new Class114(128);

	void method882(final int var1) {
		for (Class131_Sub22 var2 = (Class131_Sub22) aClass131_Sub4_Sub4_1686.aClass115_1690
				.method465(); null != var2; var2 = (Class131_Sub22) aClass131_Sub4_Sub4_1686.aClass115_1690.method468())
			if (((var1 < 0) || (var2.anInt1332 == var1)) && (var2.anInt1335 < 0)) {
				aClass131_Sub22ArrayArray1678[var2.anInt1332][var2.anInt1326] = null;
				var2.anInt1335 = 0;
			}

	}

	public synchronized void method883(final int var1) {
		anInt1661 = var1;
	}

	public synchronized boolean method884(final Class131_Sub15 var1, final Class100 var2, final Class21 var3,
			final int var4) {
		var1.method647();
		boolean var5 = true;
		final int[] var12 = new int[] { var4 };

		for (Class131_Sub23 var7 = (Class131_Sub23) var1.aClass114_1121
				.method460(); null != var7; var7 = (Class131_Sub23) var1.aClass114_1121.method458()) {
			final int var8 = (int) var7.aLong902;
			Class131_Sub16 var9 = (Class131_Sub16) aClass114_1664.method457(var8);
			if (null == var9) {
				final byte[] var10 = var2.method407(var8);
				Class131_Sub16 var11;
				if (var10 == null)
					var11 = null;
				else
					var11 = new Class131_Sub16(var10);

				var9 = var11;
				if (null == var11) {
					var5 = false;
					continue;
				}

				aClass114_1664.method461(var11, var8);
			}

			if (!var9.method659(var3, var7.aByteArray1342, var12))
				var5 = false;
		}

		if (var5)
			var1.method648();

		return var5;
	}

	public synchronized void method885() {
		for (Class131_Sub16 var1 = (Class131_Sub16) aClass114_1664
				.method460(); null != var1; var1 = (Class131_Sub16) aClass114_1664.method458())
			var1.method658();

	}

	synchronized void method886() {
		for (Class131_Sub16 var1 = (Class131_Sub16) aClass114_1664
				.method460(); var1 != null; var1 = (Class131_Sub16) aClass114_1664.method458())
			var1.method501();

	}

	public synchronized void method887(final Class131_Sub15 var1, final boolean var2) {
		method888();
		aClass111_1671.method437(var1.aByteArray1122);
		aBool1681 = var2;
		aLong1684 = 0L;
		final int var3 = aClass111_1671.method442();

		for (int var4 = 0; var4 < var3; ++var4) {
			aClass111_1671.method446(var4);
			aClass111_1671.method440(var4);
			aClass111_1671.method438(var4);
		}

		anInt1682 = aClass111_1671.method450();
		anInt1683 = aClass111_1671.anIntArray824[anInt1682];
		aLong1666 = aClass111_1671.method449(anInt1683);
	}

	public synchronized void method888() {
		aClass111_1671.method447();
		method902();
	}

	public synchronized boolean method889() {
		return aClass111_1671.method451();
	}

	void method890(final int var1, final int var2) {
		anIntArray1675[var1] = var2;
		anIntArray1668[var1] = var2 & -128;
		method891(var1, var2);
	}

	void method891(final int var1, final int var2) {
		if (anIntArray1667[var1] != var2) {
			anIntArray1667[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3)
				aClass131_Sub22ArrayArray1679[var1][var3] = null;
		}

	}

	void method892(final int var1, final int var2, final int var3) {
		method908(var1, var2);
		if ((anIntArray1673[var1] & 2) != 0)
			for (Class131_Sub22 var5 = (Class131_Sub22) aClass131_Sub4_Sub4_1686.aClass115_1690
					.method467(); null != var5; var5 = (Class131_Sub22) aClass131_Sub4_Sub4_1686.aClass115_1690
							.method469())
				if ((var5.anInt1332 == var1) && (var5.anInt1335 < 0)) {
					aClass131_Sub22ArrayArray1678[var1][var5.anInt1326] = null;
					aClass131_Sub22ArrayArray1678[var1][var2] = var5;
					final int var6 = var5.anInt1329 + ((var5.anInt1337 * var5.anInt1321) >> 12);
					var5.anInt1329 += (var2 - var5.anInt1326) << 8;
					var5.anInt1321 = var6 - var5.anInt1329;
					var5.anInt1337 = 4096;
					var5.anInt1326 = var2;
					return;
				}

		final Class131_Sub16 var9 = (Class131_Sub16) aClass114_1664.method457(anIntArray1667[var1]);
		if (var9 != null) {
			final Class131_Sub2_Sub1 var7 = var9.aClass131_Sub2_Sub1Array1135[var2];
			if (var7 != null) {
				final Class131_Sub22 var4 = new Class131_Sub22();
				var4.anInt1332 = var1;
				var4.aClass131_Sub16_1322 = var9;
				var4.aClass131_Sub2_Sub1_1323 = var7;
				var4.aClass118_1341 = var9.aClass118Array1134[var2];
				var4.anInt1330 = var9.aByteArray1141[var2];
				var4.anInt1326 = var2;
				var4.anInt1327 = (1024 + (var9.aByteArray1136[var2] * var9.anInt1139 * var3 * var3)) >> 11;
				var4.anInt1336 = var9.aByteArray1137[var2] & 255;
				var4.anInt1329 = (var2 << 8) - (var9.aShortArray1138[var2] & 32767);
				var4.anInt1328 = 0;
				var4.anInt1331 = 0;
				var4.anInt1334 = 0;
				var4.anInt1335 = -1;
				var4.anInt1324 = 0;
				if (anIntArray1660[var1] == 0)
					var4.aClass131_Sub4_Sub1_1339 = Class131_Sub4_Sub1.method795(var7, method901(var4), method905(var4),
							method907(var4));
				else {
					var4.aClass131_Sub4_Sub1_1339 = Class131_Sub4_Sub1.method795(var7, method901(var4), 0,
							method907(var4));
					method897(var4, var9.aShortArray1138[var2] < 0);
				}

				if (var9.aShortArray1138[var2] < 0)
					var4.aClass131_Sub4_Sub1_1339.method802(-1);

				if (var4.anInt1330 >= 0) {
					final Class131_Sub22 var8 = aClass131_Sub22ArrayArray1679[var1][var4.anInt1330];
					if ((var8 != null) && (var8.anInt1335 < 0)) {
						aClass131_Sub22ArrayArray1678[var1][var8.anInt1326] = null;
						var8.anInt1335 = 0;
					}

					aClass131_Sub22ArrayArray1679[var1][var4.anInt1330] = var4;
				}

				aClass131_Sub4_Sub4_1686.aClass115_1690.method471(var4);
				aClass131_Sub22ArrayArray1678[var1][var2] = var4;
			}
		}
	}

	void method893() {
	}

	int method894() {
		return anInt1661;
	}

	void method895(int var1) {
		if (var1 >= 0) {
			anIntArray1669[var1] = 12800;
			anIntArray1680[var1] = 8192;
			anIntArray1665[var1] = 16383;
			anIntArray1663[var1] = 8192;
			anIntArray1670[var1] = 0;
			anIntArray1685[var1] = 8192;
			method899(var1);
			method898(var1);
			anIntArray1673[var1] = 0;
			anIntArray1672[var1] = 32767;
			anIntArray1674[var1] = 256;
			anIntArray1660[var1] = 0;
			method900(var1, 8192);
		} else
			for (var1 = 0; var1 < 16; ++var1)
				method895(var1);
	}

	void method896(final int var1) {
		for (Class131_Sub22 var2 = (Class131_Sub22) aClass131_Sub4_Sub4_1686.aClass115_1690
				.method465(); var2 != null; var2 = (Class131_Sub22) aClass131_Sub4_Sub4_1686.aClass115_1690.method468())
			if ((var1 < 0) || (var1 == var2.anInt1332)) {
				if (null != var2.aClass131_Sub4_Sub1_1339) {
					var2.aClass131_Sub4_Sub1_1339.method801(Class17.anInt162 / 100);
					if (var2.aClass131_Sub4_Sub1_1339.method832())
						aClass131_Sub4_Sub4_1686.aClass131_Sub4_Sub2_1687.method839(var2.aClass131_Sub4_Sub1_1339);

					var2.method678();
				}

				if (var2.anInt1335 < 0)
					aClass131_Sub22ArrayArray1678[var2.anInt1332][var2.anInt1326] = null;

				var2.method501();
			}

	}

	void method897(final Class131_Sub22 var1, final boolean var2) {
		int var3 = var1.aClass131_Sub2_Sub1_1323.aByteArray1597.length;
		int var5;
		if (var2 && var1.aClass131_Sub2_Sub1_1323.aBool1600) {
			final int var4 = (var3 + var3) - var1.aClass131_Sub2_Sub1_1323.anInt1596;
			var5 = (int) (((long) anIntArray1660[var1.anInt1332] * (long) var4) >> 6);
			var3 <<= 8;
			if (var5 >= var3) {
				var5 = (var3 + var3) - 1 - var5;
				var1.aClass131_Sub4_Sub1_1339.method799(true);
			}
		} else
			var5 = (int) (((long) var3 * (long) anIntArray1660[var1.anInt1332]) >> 6);

		var1.aClass131_Sub4_Sub1_1339.method798(var5);
	}

	void method898(final int var1) {
		if ((anIntArray1673[var1] & 4) != 0)
			for (Class131_Sub22 var2 = (Class131_Sub22) aClass131_Sub4_Sub4_1686.aClass115_1690
					.method465(); null != var2; var2 = (Class131_Sub22) aClass131_Sub4_Sub4_1686.aClass115_1690
							.method468())
				if (var1 == var2.anInt1332)
					var2.anInt1338 = 0;

	}

	void method899(final int var1) {
		if ((anIntArray1673[var1] & 2) != 0)
			for (Class131_Sub22 var2 = (Class131_Sub22) aClass131_Sub4_Sub4_1686.aClass115_1690
					.method465(); var2 != null; var2 = (Class131_Sub22) aClass131_Sub4_Sub4_1686.aClass115_1690
							.method468())
				if ((var1 == var2.anInt1332) && (aClass131_Sub22ArrayArray1678[var1][var2.anInt1326] == null)
						&& (var2.anInt1335 < 0))
					var2.anInt1335 = 0;

	}

	void method900(final int var1, final int var2) {
		anIntArray1676[var1] = var2;
		anIntArray1677[var1] = (int) ((2097152.0D * Math.pow(2.0D, var2 * 5.4931640625E-4D)) + 0.5D);
	}

	int method901(final Class131_Sub22 var1) {
		int var2 = ((var1.anInt1337 * var1.anInt1321) >> 12) + var1.anInt1329;
		var2 += ((anIntArray1663[var1.anInt1332] - 8192) * anIntArray1674[var1.anInt1332]) >> 12;
		final Class118 var4 = var1.aClass118_1341;
		int var3;
		if ((var4.anInt853 > 0) && ((var4.anInt852 > 0) || (anIntArray1670[var1.anInt1332] > 0))) {
			var3 = var4.anInt852 << 2;
			final int var5 = var4.anInt854 << 1;
			if (var1.anInt1325 < var5)
				var3 = (var3 * var1.anInt1325) / var5;

			var3 += anIntArray1670[var1.anInt1332] >> 7;
			final double var6 = Math.sin((var1.anInt1333 & 511) * 0.01227184630308513D);
			var2 += (int) (var6 * var3);
		}

		var3 = (int) (((256 * var1.aClass131_Sub2_Sub1_1323.anInt1598 * Math.pow(2.0D, var2 * 3.255208333333333E-4D))
				/ Class17.anInt162) + 0.5D);
		return var3 < 1 ? 1 : var3;
	}

	void method902() {
		method896(-1);
		method895(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1)
			anIntArray1667[var1] = anIntArray1675[var1];

		for (var1 = 0; var1 < 16; ++var1)
			anIntArray1668[var1] = anIntArray1675[var1] & -128;

	}

	@Override
	protected synchronized Class131_Sub4 method539() {
		return aClass131_Sub4_Sub4_1686;
	}

	@Override
	protected synchronized Class131_Sub4 method543() {
		return null;
	}

	@Override
	protected synchronized int method538() {
		return 0;
	}

	@Override
	protected synchronized void method541(final int[] var1, int var2, int var3) {
		if (aClass111_1671.method451()) {
			final int var4 = (anInt1662 * aClass111_1671.anInt825) / Class17.anInt162;

			do {
				final long var5 = aLong1684 + ((long) var3 * (long) var4);
				if ((aLong1666 - var5) >= 0L) {
					aLong1684 = var5;
					break;
				}

				final int var7 = (int) (((var4 + (aLong1666 - aLong1684)) - 1L) / var4);
				aLong1684 += (long) var7 * (long) var4;
				aClass131_Sub4_Sub4_1686.method541(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				method903();
			} while (aClass111_1671.method451());
		}

		aClass131_Sub4_Sub4_1686.method541(var1, var2, var3);
	}

	@Override
	protected synchronized void method542(int var1) {
		if (aClass111_1671.method451()) {
			final int var3 = (aClass111_1671.anInt825 * anInt1662) / Class17.anInt162;

			do {
				final long var4 = aLong1684 + ((long) var3 * (long) var1);
				if ((aLong1666 - var4) >= 0L) {
					aLong1684 = var4;
					break;
				}

				final int var2 = (int) (((var3 + (aLong1666 - aLong1684)) - 1L) / var3);
				aLong1684 += (long) var3 * (long) var2;
				aClass131_Sub4_Sub4_1686.method542(var2);
				var1 -= var2;
				method903();
			} while (aClass111_1671.method451());
		}

		aClass131_Sub4_Sub4_1686.method542(var1);
	}

	void method903() {
		int var1 = anInt1682;
		int var4 = anInt1683;

		long var2;
		for (var2 = aLong1666; var4 == anInt1683; var2 = aClass111_1671.method449(var4)) {
			while (var4 == aClass111_1671.anIntArray824[var1]) {
				aClass111_1671.method446(var1);
				final int var5 = aClass111_1671.method441(var1);
				if (var5 == 1) {
					aClass111_1671.method439();
					aClass111_1671.method438(var1);
					if (aClass111_1671.method444()) {
						if (!aBool1681 || (var4 == 0)) {
							method902();
							aClass111_1671.method447();
							return;
						}

						aClass111_1671.method445(var2);
					}
					break;
				}

				if ((var5 & 128) != 0)
					method910(var5);

				aClass111_1671.method440(var1);
				aClass111_1671.method438(var1);
			}

			var1 = aClass111_1671.method450();
			var4 = aClass111_1671.anIntArray824[var1];
		}

		anInt1682 = var1;
		anInt1683 = var4;
		aLong1666 = var2;
	}

	boolean method904(final Class131_Sub22 var1, final int[] var2, final int var3, final int var4) {
		var1.anInt1340 = Class17.anInt162 / 100;
		if ((var1.anInt1335 < 0)
				|| ((var1.aClass131_Sub4_Sub1_1339 != null) && !var1.aClass131_Sub4_Sub1_1339.method819())) {
			int var6 = var1.anInt1337;
			if (var6 > 0) {
				var6 -= (int) ((16.0D * Math.pow(2.0D, 4.921259842519685E-4D * anIntArray1685[var1.anInt1332])) + 0.5D);
				if (var6 < 0)
					var6 = 0;

				var1.anInt1337 = var6;
			}

			var1.aClass131_Sub4_Sub1_1339.method829(method901(var1));
			final Class118 var5 = var1.aClass118_1341;
			boolean var7 = false;
			++var1.anInt1325;
			var1.anInt1333 += var5.anInt853;
			final double var8 = (((var1.anInt1321 * var1.anInt1337) >> 12) + ((var1.anInt1326 - 60) << 8))
					* 5.086263020833333E-6D;
			if (var5.anInt848 > 0)
				if (var5.anInt851 > 0)
					var1.anInt1328 += (int) ((128.0D * Math.pow(2.0D, var8 * var5.anInt851)) + 0.5D);
				else
					var1.anInt1328 += 128;

			if (null != var5.aByteArray855) {
				if (var5.anInt849 > 0)
					var1.anInt1331 += (int) ((128.0D * Math.pow(2.0D, var8 * var5.anInt849)) + 0.5D);
				else
					var1.anInt1331 += 128;

				while ((var1.anInt1334 < (var5.aByteArray855.length - 2))
						&& (var1.anInt1331 > ((var5.aByteArray855[var1.anInt1334 + 2] & 255) << 8)))
					var1.anInt1334 += 2;

				if ((var1.anInt1334 == (var5.aByteArray855.length - 2))
						&& (var5.aByteArray855[var1.anInt1334 + 1] == 0))
					var7 = true;
			}

			if ((var1.anInt1335 >= 0) && (null != var5.aByteArray847) && ((anIntArray1673[var1.anInt1332] & 1) == 0)
					&& ((var1.anInt1330 < 0)
							|| (aClass131_Sub22ArrayArray1679[var1.anInt1332][var1.anInt1330] != var1))) {
				if (var5.anInt850 > 0)
					var1.anInt1335 += (int) ((128.0D * Math.pow(2.0D, var8 * var5.anInt850)) + 0.5D);
				else
					var1.anInt1335 += 128;

				while ((var1.anInt1324 < (var5.aByteArray847.length - 2))
						&& (var1.anInt1335 > ((var5.aByteArray847[2 + var1.anInt1324] & 255) << 8)))
					var1.anInt1324 += 2;

				if (var1.anInt1324 == (var5.aByteArray847.length - 2))
					var7 = true;
			}

			if (var7) {
				var1.aClass131_Sub4_Sub1_1339.method801(var1.anInt1340);
				if (var2 != null)
					var1.aClass131_Sub4_Sub1_1339.method541(var2, var3, var4);
				else
					var1.aClass131_Sub4_Sub1_1339.method542(var4);

				if (var1.aClass131_Sub4_Sub1_1339.method832())
					aClass131_Sub4_Sub4_1686.aClass131_Sub4_Sub2_1687.method839(var1.aClass131_Sub4_Sub1_1339);

				var1.method678();
				if (var1.anInt1335 >= 0) {
					var1.method501();
					if ((var1.anInt1330 > 0) && (aClass131_Sub22ArrayArray1679[var1.anInt1332][var1.anInt1330] == var1))
						aClass131_Sub22ArrayArray1679[var1.anInt1332][var1.anInt1330] = null;
				}

				return true;
			} else {
				var1.aClass131_Sub4_Sub1_1339.method820(var1.anInt1340, method905(var1), method907(var1));
				return false;
			}
		} else {
			var1.method678();
			var1.method501();
			if ((var1.anInt1330 > 0) && (aClass131_Sub22ArrayArray1679[var1.anInt1332][var1.anInt1330] == var1))
				aClass131_Sub22ArrayArray1679[var1.anInt1332][var1.anInt1330] = null;

			return true;
		}
	}

	int method905(final Class131_Sub22 var1) {
		final Class118 var2 = var1.aClass118_1341;
		int var3 = (4096 + (anIntArray1669[var1.anInt1332] * anIntArray1665[var1.anInt1332])) >> 13;
		var3 = (16384 + (var3 * var3)) >> 15;
		var3 = ((var1.anInt1327 * var3) + 16384) >> 15;
		var3 = ((anInt1661 * var3) + 128) >> 8;
		if (var2.anInt848 > 0)
			var3 = (int) ((var3 * Math.pow(0.5D, var1.anInt1328 * 1.953125E-5D * var2.anInt848)) + 0.5D);

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.aByteArray855 != null) {
			var4 = var1.anInt1331;
			var5 = var2.aByteArray855[var1.anInt1334 + 1];
			if (var1.anInt1334 < (var2.aByteArray855.length - 2)) {
				var6 = (var2.aByteArray855[var1.anInt1334] & 255) << 8;
				var7 = (var2.aByteArray855[2 + var1.anInt1334] & 255) << 8;
				var5 += ((var4 - var6) * (var2.aByteArray855[3 + var1.anInt1334] - var5)) / (var7 - var6);
			}

			var3 = (32 + (var3 * var5)) >> 6;
		}

		if ((var1.anInt1335 > 0) && (null != var2.aByteArray847)) {
			var4 = var1.anInt1335;
			var5 = var2.aByteArray847[var1.anInt1324 + 1];
			if (var1.anInt1324 < (var2.aByteArray847.length - 2)) {
				var6 = (var2.aByteArray847[var1.anInt1324] & 255) << 8;
				var7 = (var2.aByteArray847[var1.anInt1324 + 2] & 255) << 8;
				var5 += ((var2.aByteArray847[var1.anInt1324 + 3] - var5) * (var4 - var6)) / (var7 - var6);
			}

			var3 = ((var5 * var3) + 32) >> 6;
		}

		return var3;
	}

	void method906() {
	}

	int method907(final Class131_Sub22 var1) {
		final int var2 = anIntArray1680[var1.anInt1332];
		return var2 < 8192 ? ((var1.anInt1336 * var2) + 32) >> 6
				: 16384 - ((32 + ((16384 - var2) * (128 - var1.anInt1336))) >> 6);
	}

	public Class131_Sub4_Sub3() {
		method902();
	}

	void method908(final int var1, final int var2) {
		final Class131_Sub22 var3 = aClass131_Sub22ArrayArray1678[var1][var2];
		if (null != var3) {
			aClass131_Sub22ArrayArray1678[var1][var2] = null;
			if ((anIntArray1673[var1] & 2) == 0)
				var3.anInt1335 = 0;
			else
				for (Class131_Sub22 var4 = (Class131_Sub22) aClass131_Sub4_Sub4_1686.aClass115_1690
						.method465(); null != var4; var4 = (Class131_Sub22) aClass131_Sub4_Sub4_1686.aClass115_1690
								.method468())
					if ((var3.anInt1332 == var4.anInt1332) && (var4.anInt1335 < 0) && (var4 != var3)) {
						var3.anInt1335 = 0;
						break;
					}

		}
	}

	boolean method909(final Class131_Sub22 var1) {
		if (var1.aClass131_Sub4_Sub1_1339 == null) {
			if (var1.anInt1335 >= 0) {
				var1.method501();
				if ((var1.anInt1330 > 0) && (aClass131_Sub22ArrayArray1679[var1.anInt1332][var1.anInt1330] == var1))
					aClass131_Sub22ArrayArray1679[var1.anInt1332][var1.anInt1330] = null;
			}

			return true;
		} else
			return false;
	}

	void method910(final int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var5 = (var1 >> 8) & 127;
			var4 = (var1 >> 16) & 127;
			method908(var3, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var5 = (var1 >> 8) & 127;
			var4 = (var1 >> 16) & 127;
			if (var4 > 0)
				method892(var3, var5, var4);
			else
				method908(var3, var5);

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var5 = (var1 >> 8) & 127;
			var4 = (var1 >> 16) & 127;
			method893();
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var5 = (var1 >> 8) & 127;
			var4 = (var1 >> 16) & 127;
			if (var5 == 0)
				anIntArray1668[var3] = (var4 << 14) + (anIntArray1668[var3] & -2080769);

			if (var5 == 32)
				anIntArray1668[var3] = (anIntArray1668[var3] & -16257) + (var4 << 7);

			if (var5 == 1)
				anIntArray1670[var3] = (var4 << 7) + (anIntArray1670[var3] & -16257);

			if (var5 == 33)
				anIntArray1670[var3] = (anIntArray1670[var3] & -128) + var4;

			if (var5 == 5)
				anIntArray1685[var3] = (anIntArray1685[var3] & -16257) + (var4 << 7);

			if (var5 == 37)
				anIntArray1685[var3] = var4 + (anIntArray1685[var3] & -128);

			if (var5 == 7)
				anIntArray1669[var3] = (anIntArray1669[var3] & -16257) + (var4 << 7);

			if (var5 == 39)
				anIntArray1669[var3] = var4 + (anIntArray1669[var3] & -128);

			if (var5 == 10)
				anIntArray1680[var3] = (var4 << 7) + (anIntArray1680[var3] & -16257);

			if (var5 == 42)
				anIntArray1680[var3] = var4 + (anIntArray1680[var3] & -128);

			if (var5 == 11)
				anIntArray1665[var3] = (var4 << 7) + (anIntArray1665[var3] & -16257);

			if (var5 == 43)
				anIntArray1665[var3] = (anIntArray1665[var3] & -128) + var4;

			if (var5 == 64)
				if (var4 >= 64)
					anIntArray1673[var3] |= 1;
				else
					anIntArray1673[var3] &= -2;

			if (var5 == 65)
				if (var4 >= 64)
					anIntArray1673[var3] |= 2;
				else {
					method899(var3);
					anIntArray1673[var3] &= -3;
				}

			if (var5 == 99)
				anIntArray1672[var3] = (anIntArray1672[var3] & 127) + (var4 << 7);

			if (var5 == 98)
				anIntArray1672[var3] = (anIntArray1672[var3] & 16256) + var4;

			if (var5 == 101)
				anIntArray1672[var3] = (var4 << 7) + 16384 + (anIntArray1672[var3] & 127);

			if (var5 == 100)
				anIntArray1672[var3] = var4 + (anIntArray1672[var3] & 16256) + 16384;

			if (var5 == 120)
				method896(var3);

			if (var5 == 121)
				method895(var3);

			if (var5 == 123)
				method882(var3);

			int var6;
			if (var5 == 6) {
				var6 = anIntArray1672[var3];
				if (var6 == 16384)
					anIntArray1674[var3] = (anIntArray1674[var3] & -16257) + (var4 << 7);
			}

			if (var5 == 38) {
				var6 = anIntArray1672[var3];
				if (var6 == 16384)
					anIntArray1674[var3] = var4 + (anIntArray1674[var3] & -128);
			}

			if (var5 == 16)
				anIntArray1660[var3] = (anIntArray1660[var3] & -16257) + (var4 << 7);

			if (var5 == 48)
				anIntArray1660[var3] = (anIntArray1660[var3] & -128) + var4;

			if (var5 == 81)
				if (var4 >= 64)
					anIntArray1673[var3] |= 4;
				else {
					method898(var3);
					anIntArray1673[var3] &= -5;
				}

			if (var5 == 17)
				method900(var3, (anIntArray1676[var3] & -16257) + (var4 << 7));

			if (var5 == 49)
				method900(var3, (anIntArray1676[var3] & -128) + var4);

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var5 = (var1 >> 8) & 127;
			method891(var3, anIntArray1668[var3] + var5);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var5 = (var1 >> 8) & 127;
			method906();
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var5 = ((var1 >> 8) & 127) + ((var1 >> 9) & 16256);
			method911(var3, var5);
		} else {
			var2 = var1 & 255;
			if (var2 == 255)
				method902();
		}
	}

	void method911(final int var1, final int var2) {
		anIntArray1663[var1] = var2;
	}

	public synchronized void method912(final int var1, final int var2) {
		method890(var1, var2);
	}
}
