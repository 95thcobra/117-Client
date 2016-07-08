import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public final class Class131_Sub20_Sub19_Sub1 extends Class131_Sub20_Sub19 {
	static Class100_Sub1 aClass100_Sub1_1701;
	int anInt1699 = 0;
	int anInt1698 = 0;
	boolean aBool1700 = false;
	int anInt1695;
	int anInt1693;
	int anInt1694;
	int anInt1691;
	int anInt1696;
	int anInt1692;
	Class131_Sub20_Sub1 aClass131_Sub20_Sub1_1697;

	final void method916(final int var1) {
		if (!aBool1700) {
			anInt1699 += var1;

			while (anInt1699 > aClass131_Sub20_Sub1_1697.anIntArray1358[anInt1698]) {
				anInt1699 -= aClass131_Sub20_Sub1_1697.anIntArray1358[anInt1698];
				++anInt1698;
				if (anInt1698 >= aClass131_Sub20_Sub1_1697.anIntArray1353.length) {
					aBool1700 = true;
					break;
				}
			}

		}
	}

	@Override
	protected final Class131_Sub20_Sub19_Sub7 method868(final short var1) {
		final Class131_Sub20_Sub14 var2 = Class46.method235(anInt1695);
		Class131_Sub20_Sub19_Sub7 var3;
		if (!aBool1700)
			var3 = var2.method786(anInt1698);
		else
			var3 = var2.method786(-1);

		return null == var3 ? null : var3;
	}

	Class131_Sub20_Sub19_Sub1(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7) {
		anInt1695 = var1;
		anInt1693 = var2;
		anInt1694 = var3;
		anInt1691 = var4;
		anInt1696 = var5;
		anInt1692 = var7 + var6;
		final int var8 = Class46.method235(anInt1695).anInt1579;
		if (var8 != -1) {
			aBool1700 = false;
			aClass131_Sub20_Sub1_1697 = Class131_Sub20_Sub19_Sub2_Sub1.method1066(var8);
		} else
			aBool1700 = true;

	}

	static void method917() {
		if (Class131_Sub6.method550())
			NpcFlags.aBool33 = true;

	}

	public static void method918(final String var0, final boolean var1, final boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE))
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (final Exception var4) {
					;
				}

			if (Class85.aString699.startsWith("win"))
				client.method1094(var0, 0, "openjs");
			else if (Class85.aString699.startsWith("mac"))
				client.method1094(var0, 1, "openjs");
			else
				client.method1094(var0, 2, "openjs");
		} else
			client.method1094(var0, 3, "openjs");

	}
}
