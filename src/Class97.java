import java.awt.Canvas;
import java.awt.Container;
import java.awt.Insets;

public class Class97 implements Interface4 {
	static Class131_Sub20_Sub17_Sub2[] aClass131_Sub20_Sub17_Sub2Array771;
	static Class131_Sub20_Sub17_Sub2 aClass131_Sub20_Sub17_Sub2_775;
	public static Class97 aClass97_773 = new Class97(2, 0);
	public static Class97 aClass97_774 = new Class97(3, 1);
	public static Class97 aClass97_768 = new Class97(1, 2);
	public static Class97 aClass97_769 = new Class97(0, 3);
	public int anInt770;
	int anInt772;

	static void method396() {
		final client var0 = client.aclient2265;
		synchronized (var0) {
			final Container var1 = client.aclient2265.method1084();
			if (var1 != null) {
				Class131_Sub20_Sub5.anInt1450 = Math.max(var1.getSize().width, NpcFlags.anInt57);
				Class131_Sub20_Sub7.anInt1491 = Math.max(var1.getSize().height, Class70.anInt609);
				if (Class131_Sub5.aFrame1003 == var1) {
					final Insets var2 = Class131_Sub5.aFrame1003.getInsets();
					Class131_Sub20_Sub5.anInt1450 -= var2.right + var2.left;
					Class131_Sub20_Sub7.anInt1491 -= var2.top + var2.bottom;
				}

				if (Class131_Sub20_Sub5.anInt1450 <= 0)
					Class131_Sub20_Sub5.anInt1450 = 1;

				if (Class131_Sub20_Sub7.anInt1491 <= 0)
					Class131_Sub20_Sub7.anInt1491 = 1;

				final int var3 = client.aBool2237 ? 2 : 1;
				if (var3 == 1) {
					Class2.anInt7 = client.anInt2238;
					Class88.anInt723 = client.anInt2118;
				} else {
					Class2.anInt7 = Math.min(Class131_Sub20_Sub5.anInt1450, 7680);
					Class88.anInt723 = Math.min(Class131_Sub20_Sub7.anInt1491, 2160);
				}

				Applet_Sub1.anInt2015 = (Class131_Sub20_Sub5.anInt1450 - Class2.anInt7) / 2;
				Applet_Sub1.anInt2005 = 0;
				Class29.aCanvas271.setSize(Class2.anInt7, Class88.anInt723);
				final int var4 = Class2.anInt7;
				final int var5 = Class88.anInt723;
				final Canvas var6 = Class29.aCanvas271;

				Object var8;
				try {
					final Class16_Sub2 var7 = new Class16_Sub2();
					var7.method59(var4, var5, var6, (byte) -33);
					var8 = var7;
				} catch (final Throwable var11) {
					final Class16_Sub1 var9 = new Class16_Sub1();
					var9.method59(var4, var5, var6, (byte) -39);
					var8 = var9;
				}

				Class131_Sub20_Sub19_Sub5.aClass16_1839 = (Class16) var8;
				if (Class131_Sub5.aFrame1003 == var1) {
					final Insets var13 = Class131_Sub5.aFrame1003.getInsets();
					Class29.aCanvas271.setLocation(var13.left + Applet_Sub1.anInt2015,
							Applet_Sub1.anInt2005 + var13.top);
				} else
					Class29.aCanvas271.setLocation(Applet_Sub1.anInt2015, Applet_Sub1.anInt2005);

				Class48.method251();
				if (client.anInt2128 != -1)
					Class131_Sub20_Sub19_Sub2.method925(true);

				Class131_Sub10.method571();
			}
		}
	}

	@Override
	public int method11(final byte var1) {
		return anInt772;
	}

	Class97(final int var1, final int var2) {
		anInt770 = var1;
		anInt772 = var2;
	}

	public static int method397(final CharSequence var0) {
		final int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3)
			var2 = ((var2 << 5) - var2) + var0.charAt(var3);

		return var2;
	}
}
