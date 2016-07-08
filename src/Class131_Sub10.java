import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class131_Sub10 extends Class131 {
	Object[] anObjectArray1056;
	Class131_Sub18 aClass131_Sub18_1057;
	int anInt1058;
	int anInt1059;
	int anInt1060;
	static int anInt1061;
	boolean aBool1062;
	int anInt1063;
	int anInt1064;
	String aString1065;
	int anInt1066;
	static int anInt1067;
	Class131_Sub18 aClass131_Sub18_1068;
	static Class131_Sub20_Sub17_Sub2[] aClass131_Sub20_Sub17_Sub2Array1069;

	static final void method569(final int var0, final int var1, final int var2, final int var3, final int var4) {
		Class97.aClass131_Sub20_Sub17_Sub2Array771[0].method950(var0, var1);
		Class97.aClass131_Sub20_Sub17_Sub2Array771[1].method950(var0, (var3 + var1) - 16);
		Class131_Sub20_Sub17.method850(var0, var1 + 16, 16, var3 - 32, client.anInt2104);
		int var5 = ((var3 - 32) * var3) / var4;
		if (var5 < 8)
			var5 = 8;

		final int var6 = (var2 * (var3 - 32 - var5)) / (var4 - var3);
		Class131_Sub20_Sub17.method850(var0, var6 + 16 + var1, 16, var5, client.anInt2105);
		Class131_Sub20_Sub17.method863(var0, 16 + var1 + var6, var5, client.anInt2107);
		Class131_Sub20_Sub17.method863(var0 + 1, var1 + 16 + var6, var5, client.anInt2107);
		Class131_Sub20_Sub17.method860(var0, var6 + 16 + var1, 16, client.anInt2107);
		Class131_Sub20_Sub17.method860(var0, 17 + var1 + var6, 16, client.anInt2107);
		Class131_Sub20_Sub17.method863(15 + var0, var1 + 16 + var6, var5, client.anInt2101);
		Class131_Sub20_Sub17.method863(14 + var0, var1 + 17 + var6, var5 - 1, client.anInt2101);
		Class131_Sub20_Sub17.method860(var0, var6 + var1 + 15 + var5, 16, client.anInt2101);
		Class131_Sub20_Sub17.method860(1 + var0, var6 + 14 + var1 + var5, 15, client.anInt2101);
	}

	public static boolean method570(final int var0) {
		return ((var0 >> 28) & 1) != 0;
	}

	static void method571() {
		final int var0 = Applet_Sub1.anInt2015;
		final int var1 = Applet_Sub1.anInt2005;
		final int var2 = Class131_Sub20_Sub5.anInt1450 - Class2.anInt7 - var0;
		final int var3 = Class131_Sub20_Sub7.anInt1491 - Class88.anInt723 - var1;
		if ((var0 > 0) || (var2 > 0) || (var1 > 0) || (var3 > 0))
			try {
				final Container var4 = client.aclient2265.method1084();
				int var5 = 0;
				int var6 = 0;
				if (Class131_Sub5.aFrame1003 == var4) {
					final Insets var7 = Class131_Sub5.aFrame1003.getInsets();
					var5 = var7.left;
					var6 = var7.top;
				}

				final Graphics var9 = var4.getGraphics();
				var9.setColor(Color.black);
				if (var0 > 0)
					var9.fillRect(var5, var6, var0, Class131_Sub20_Sub7.anInt1491);

				if (var1 > 0)
					var9.fillRect(var5, var6, Class131_Sub20_Sub5.anInt1450, var1);

				if (var2 > 0)
					var9.fillRect((Class131_Sub20_Sub5.anInt1450 + var5) - var2, var6, var2,
							Class131_Sub20_Sub7.anInt1491);

				if (var3 > 0)
					var9.fillRect(var5, (Class131_Sub20_Sub7.anInt1491 + var6) - var3, Class131_Sub20_Sub5.anInt1450,
							var3);
			} catch (final Exception var8) {
				;
			}

	}

	static final Class131_Sub7 method572(final int var0, final int var1, final int var2) {
		final Class131_Sub7 var3 = new Class131_Sub7();
		var3.anInt1025 = var1;
		var3.anInt1024 = var2;
		client.aClass114_2184.method461(var3, var0);
		Class40.method216(var1);
		final Class131_Sub18 var4 = Class88.method377(var0);
		Class131_Sub20_Sub6.method734(var4);
		if (client.aClass131_Sub18_2049 != null) {
			Class131_Sub20_Sub6.method734(client.aClass131_Sub18_2049);
			client.aClass131_Sub18_2049 = null;
		}

		Class123.method484();
		Class16_Sub1.method547(Class131_Sub18.aClass131_Sub18ArrayArray1174[var0 >> 16], var4, false);
		Class93.method391(var1);
		if (client.anInt2128 != -1)
			Class131_Sub20_Sub19_Sub2_Sub1.method1065(client.anInt2128, 1);

		return var3;
	}
}
