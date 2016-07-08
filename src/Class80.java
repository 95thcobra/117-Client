import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public final class Class80 implements KeyListener, FocusListener {
	static int anInt664;
	static Class73 aClass73_665;
	public static int anInt660 = 0;
	public static int anInt651 = 0;
	public static volatile int anInt662 = 0;
	public static Class80 aClass80_655 = new Class80();
	public static boolean[] aBoolArray652 = new boolean[112];
	public static int[] anIntArray658 = new int[128];
	public static int anInt661 = 0;
	static char[] aCharArray656 = new char[128];
	static int[] anIntArray657 = new int[128];
	public static int[] anIntArray654 = new int[128];
	public static int anInt659 = 0;
	public static int anInt653 = 0;
	public static int anInt663 = 0;
	public static int[] anIntArray650 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81,
			82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1,
			-1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34,
			51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228,
			231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
			-1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@Override
	public final void keyTyped(final KeyEvent var1) {
		if (null != aClass80_655) {
			final char var2 = var1.getKeyChar();
			if ((var2 != 0) && (var2 != '\uffff') && Class64.method307(var2)) {
				final int var3 = (1 + anInt660) & 127;
				if (var3 != anInt653) {
					anIntArray657[anInt660] = -1;
					aCharArray656[anInt660] = var2;
					anInt660 = var3;
				}
			}
		}

		var1.consume();
	}

	@Override
	public final void focusGained(final FocusEvent var1) {
	}

	@Override
	public final synchronized void focusLost(final FocusEvent var1) {
		if (aClass80_655 != null)
			anInt651 = -1;

	}

	@Override
	public final synchronized void keyReleased(final KeyEvent var1) {
		if (aClass80_655 != null) {
			anInt662 = 0;
			int var2 = var1.getKeyCode();
			if ((var2 >= 0) && (var2 < anIntArray650.length))
				var2 = anIntArray650[var2] & -129;
			else
				var2 = -1;

			if ((anInt651 >= 0) && (var2 >= 0)) {
				anIntArray658[anInt651] = ~var2;
				anInt651 = (anInt651 + 1) & 127;
				if (anInt661 == anInt651)
					anInt651 = -1;
			}
		}

		var1.consume();
	}

	@Override
	public final synchronized void keyPressed(final KeyEvent var1) {
		if (null != aClass80_655) {
			anInt662 = 0;
			int var2 = var1.getKeyCode();
			if ((var2 >= 0) && (var2 < anIntArray650.length)) {
				var2 = anIntArray650[var2];
				if ((var2 & 128) != 0)
					var2 = -1;
			} else
				var2 = -1;

			if ((anInt651 >= 0) && (var2 >= 0)) {
				anIntArray658[anInt651] = var2;
				anInt651 = (anInt651 + 1) & 127;
				if (anInt661 == anInt651)
					anInt651 = -1;
			}

			int var3;
			if (var2 >= 0) {
				var3 = (anInt660 + 1) & 127;
				if (anInt653 != var3) {
					anIntArray657[anInt660] = var2;
					aCharArray656[anInt660] = 0;
					anInt660 = var3;
				}
			}

			var3 = var1.getModifiers();
			if (((var3 & 10) != 0) || (var2 == 85) || (var2 == 10))
				var1.consume();
		}

	}

	public static final Class131_Sub20_Sub17_Sub3 method356(final int var0, final int var1, final int var2,
			final int var3, int var4, final boolean var5) {
		if (var1 == -1)
			var4 = 0;
		else if ((var4 == 2) && (var1 != 1))
			var4 = 1;

		final long var7 = ((long) var4 << 40) + var0 + ((long) var1 << 16) + ((long) var2 << 38) + ((long) var3 << 42);
		Class131_Sub20_Sub17_Sub3 var9;
		if (!var5) {
			var9 = (Class131_Sub20_Sub17_Sub3) Class131_Sub20_Sub2.aClass121_1377.method482(var7);
			if (null != var9)
				return var9;
		}

		Class131_Sub20_Sub2 var12 = Class79_Sub1.method645(var0, (short) 32484);
		if ((var1 > 1) && (null != var12.anIntArray1407)) {
			int var11 = -1;

			for (int var6 = 0; var6 < 10; ++var6)
				if ((var1 >= var12.anIntArray1395[var6]) && (var12.anIntArray1395[var6] != 0))
					var11 = var12.anIntArray1407[var6];

			if (var11 != -1)
				var12 = Class79_Sub1.method645(var11, (short) 28215);
		}

		final Class131_Sub20_Sub19_Sub7 var10 = var12.method700(1);
		if (var10 == null)
			return null;
		else {
			Class131_Sub20_Sub17_Sub3 var13 = null;
			if (var12.anInt1410 != -1) {
				var13 = method356(var12.anInt1409, 10, 1, 0, 0, true);
				if (null == var13)
					return null;
			} else if (var12.anInt1419 != -1) {
				var13 = method356(var12.anInt1418, var1, var2, var3, 0, false);
				if (var13 == null)
					return null;
			} else if (var12.anInt1421 != -1) {
				var13 = method356(var12.anInt1420, var1, 0, 0, 0, false);
				if (var13 == null)
					return null;
			}

			final int[] var14 = Class131_Sub20_Sub17.anIntArray1629;
			final int var20 = Class131_Sub20_Sub17.anInt1627;
			final int var15 = Class131_Sub20_Sub17.anInt1633;
			final int[] var17 = new int[4];
			Class131_Sub20_Sub17.method847(var17);
			var9 = new Class131_Sub20_Sub17_Sub3(36, 32);
			Class131_Sub20_Sub17.method843(var9.anIntArray1823, 36, 32);
			Class131_Sub20_Sub17.method848();
			Class131_Sub20_Sub17_Sub1.method934();
			Class131_Sub20_Sub17_Sub1.method931(16, 16);
			Class131_Sub20_Sub17_Sub1.aBool1778 = false;
			if (var12.anInt1421 != -1)
				var13.method968(0, 0);

			int var16 = var12.anInt1384;
			if (var5)
				var16 = (int) (var16 * 1.5D);
			else if (var2 == 2)
				var16 = (int) (var16 * 1.04D);

			final int var18 = (Class131_Sub20_Sub17_Sub1.anIntArray1787[var12.anInt1376] * var16) >> 16;
			final int var19 = (Class131_Sub20_Sub17_Sub1.anIntArray1770[var12.anInt1376] * var16) >> 16;
			var10.method1015();
			var10.method1021(0, var12.anInt1386, var12.anInt1388, var12.anInt1376, var12.anInt1390,
					var12.anInt1389 + var18 + (var10.anInt1643 / 2), var12.anInt1389 + var19);
			if (var12.anInt1419 != -1)
				var13.method968(0, 0);

			if (var2 >= 1)
				var9.method970(1);

			if (var2 >= 2)
				var9.method970(16777215);

			if (var3 != 0)
				var9.method965(var3);

			Class131_Sub20_Sub17.method843(var9.anIntArray1823, 36, 32);
			if (var12.anInt1410 != -1)
				var13.method968(0, 0);

			if ((var4 == 1) || ((var4 == 2) && (var12.anInt1408 == 1))) {
				final Class131_Sub20_Sub17_Sub4_Sub1 var22 = Class131_Sub20_Sub2.aClass131_Sub20_Sub17_Sub4_Sub1_1380;
				String var21;
				if (var1 < 100000)
					var21 = "<col=ffff00>" + var1 + "</col>";
				else if (var1 < 10000000)
					var21 = "<col=ffffff>" + (var1 / 1000) + "K" + "</col>";
				else
					var21 = "<col=00ff80>" + (var1 / 1000000) + "M" + "</col>";

				var22.method1053(var21, 0, 9, 16776960, 1);
			}

			if (!var5)
				Class131_Sub20_Sub2.aClass121_1377.method479(var9, var7);

			Class131_Sub20_Sub17.method843(var14, var20, var15);
			Class131_Sub20_Sub17.method851(var17);
			Class131_Sub20_Sub17_Sub1.method934();
			Class131_Sub20_Sub17_Sub1.aBool1778 = true;
			return var9;
		}
	}

	public static void method357(final Class86 var0, final boolean var1) {
		if (null != Class94.aClass86_754) {
			try {
				Class94.aClass86_754.method373();
			} catch (final Exception var6) {
				;
			}

			Class94.aClass86_754 = null;
		}

		Class94.aClass86_754 = var0;
		Class92.method389(var1);
		Class94.aClass131_Sub14_755.pos = 0;
		Class89.aClass131_Sub20_Sub20_725 = null;
		Class94.aClass131_Sub14_744 = null;
		Class94.anInt743 = 0;

		while (true) {
			Class131_Sub20_Sub20 var2 = (Class131_Sub20_Sub20) Class94.aClass114_747.method460();
			if (null == var2)
				while (true) {
					var2 = (Class131_Sub20_Sub20) Class94.aClass114_752.method460();
					if (var2 == null) {
						if (Class94.aByte760 != 0)
							try {
								final DataBuffer var7 = new DataBuffer(4);
								var7.writeByte(4);
								var7.writeByte(Class94.aByte760);
								var7.method586(0);
								Class94.aClass86_754.write(var7.data, 0, 4);
							} catch (final IOException var5) {
								try {
									Class94.aClass86_754.method373();
								} catch (final Exception var4) {
									;
								}

								++Class94.anInt748;
								Class94.aClass86_754 = null;
							}

						Class94.anInt756 = 0;
						Class56.aLong507 = Class84.method366(780546663);
						return;
					}

					Class94.aClass116_749.method475(var2);
					Class94.aClass114_750.method461(var2, var2.aLong902);
					++Class94.anInt751;
					--Class94.anInt753;
				}

			Class94.aClass114_745.method461(var2, var2.aLong902);
			++Class94.anInt761;
			--Class94.anInt746;
		}
	}
}
