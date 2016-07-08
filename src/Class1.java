import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;

public class Class1 {
	static int anInt1;
	static Class131_Sub20_Sub17_Sub2[] aClass131_Sub20_Sub17_Sub2Array2;

	static final void method12(final int var0, final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < client.anInt2226; ++var4)
			if (((client.anIntArray2233[var4] + client.anIntArray2231[var4]) > var0)
					&& (client.anIntArray2231[var4] < (var0 + var2))
					&& ((client.anIntArray2232[var4] + client.anIntArray2234[var4]) > var1)
					&& (client.anIntArray2232[var4] < (var1 + var3)))
				client.aBoolArray2252[var4] = true;

	}

	static boolean method13(final String var0) {
		if (null == var0)
			return false;
		else
			try {
				new URL(var0);
				return true;
			} catch (final MalformedURLException var2) {
				return false;
			}
	}

	public static final boolean method14(final String var0, final String var1, final String var2, final String var3) {
		return (null != var0) && (var2 != null)
				? (!var0.startsWith("#") && !var2.startsWith("#") ? var1.equals(var3) : var0.equals(var2)) : false;
	}

	public static void method15(final Applet var0, final String var1) {
		Class85.anApplet700 = var0;
		Class85.aString699 = var1;
	}

	static final void method16() {
		if (client.anInt2131 == 1)
			Class2.aClass131_Sub20_Sub17_Sub3Array9[client.anInt2247 / 100].method968(client.anInt2083 - 8,
					client.anInt2135 - 8);

		if (client.anInt2131 == 2)
			Class2.aClass131_Sub20_Sub17_Sub3Array9[(client.anInt2247 / 100) + 4].method968(client.anInt2083 - 8,
					client.anInt2135 - 8);

		client.anInt2146 = 0;
		final int var0 = (Class131_Sub11.myPlayer.anInt1718 >> 7)
				+ Class131_Sub20_Sub20.anInt1649;
		final int var1 = Class50.anInt491 + (Class131_Sub11.myPlayer.anInt1759 >> 7);
		if ((var0 >= 3053) && (var0 <= 3156) && (var1 >= 3056) && (var1 <= 3136))
			client.anInt2146 = 1;

		if ((var0 >= 3072) && (var0 <= 3118) && (var1 >= 9492) && (var1 <= 9535))
			client.anInt2146 = 1;

		if ((client.anInt2146 == 1) && (var0 >= 3139) && (var0 <= 3199) && (var1 >= 3008) && (var1 <= 3062))
			client.anInt2146 = 0;

	}

	static void method17(final int var0, final int var1, final int var2, final int var3) {
		Class131_Sub11 var4 = (Class131_Sub11) Class131_Sub11.aClass114_1074.method457(var0);
		if (null == var4) {
			var4 = new Class131_Sub11();
			Class131_Sub11.aClass114_1074.method461(var4, var0);
		}

		if (var4.anIntArray1070.length <= var1) {
			final int[] var6 = new int[var1 + 1];
			final int[] var7 = new int[var1 + 1];

			int var5;
			for (var5 = 0; var5 < var4.anIntArray1070.length; ++var5) {
				var6[var5] = var4.anIntArray1070[var5];
				var7[var5] = var4.anIntArray1071[var5];
			}

			for (var5 = var4.anIntArray1070.length; var5 < var1; ++var5) {
				var6[var5] = -1;
				var7[var5] = 0;
			}

			var4.anIntArray1070 = var6;
			var4.anIntArray1071 = var7;
		}

		var4.anIntArray1070[var1] = var2;
		var4.anIntArray1071[var1] = var3;
	}

	static void method18(final int var0, final int var1) {
		client.secureBuffer.method871(89);
		client.secureBuffer.method627(var0);
		client.secureBuffer.method586(var1);
	}

	static final int method19(final int var0, final int var1, final int var2, final int var3) {
		final int var4 = (65536 - Class131_Sub20_Sub17_Sub1.anIntArray1770[(1024 * var2) / var3]) >> 1;
		return (((65536 - var4) * var0) >> 16) + ((var1 * var4) >> 16);
	}
}
