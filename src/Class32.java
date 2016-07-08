import java.util.HashMap;
import java.util.Map;

public class Class32 {
	static Class100_Sub1 aClass100_Sub1_297;
	static Map aMap298 = new HashMap();
	static Class125 aClass125_301 = new Class125(1024);
	static Class124 aClass124_299 = new Class124();
	static int anInt300 = 0;

	static final void method139() {
		Class131_Sub20_Sub4.aClass121_1431.method481();
		Class83.method363();
		Class131_Sub20_Sub13.aClass121_1574.method481();
		Class131_Sub20_Sub9.aClass121_1504.method481();
		Class131_Sub20_Sub9.aClass121_1532.method481();
		Class131_Sub20_Sub9.aClass121_1506.method481();
		Class131_Sub20_Sub9.aClass121_1516.method481();
		Class69.method324();
		Class131_Sub20_Sub1.method688();
		Class131_Sub20_Sub1.aClass121_1367.method481();
		Class131_Sub20_Sub1.aClass121_1355.method481();
		Class131_Sub20_Sub6.method737();
		Class79_Sub1.method646();
		Class131_Sub20_Sub15.aClass121_1601.method481();
		Class131_Sub12.method577();
		Class131_Sub20_Sub19_Sub4.method955();
		((Class35) Class131_Sub20_Sub17_Sub1.anInterface3_1784).method201();
		Class131_Sub20_Sub18.aClass121_1641.method481();
		Class71.aClass100_Sub1_612.method411();
		Class84.aClass100_Sub1_696.method411();
		Class28.aClass100_Sub1_254.method411();
		Class78.aClass100_Sub1_648.method411();
		Class29.aClass100_Sub1_268.method411();
		Class44.aClass100_Sub1_446.method411();
		Class60.aClass100_Sub1_571.method411();
		Class51.aClass100_Sub1_502.method411();
		Class126_Sub1.aClass100_Sub1_953.method411();
		Class131_Sub20_Sub19_Sub1.aClass100_Sub1_1701.method411();
		Class82.aClass100_Sub1_686.method411();
		Class44.aClass100_Sub1_443.method411();
	}

	static void method140(final String var0) {
		client.aString2150 = var0;

		try {
			final String var1 = client.aclient2265.getParameter(Class119.aClass119_868.aString872);
			final String var2 = client.aclient2265.getParameter(Class119.aClass119_870.aString872);
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0)
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			else
				var3 = var3 + "; Expires=" + Class131_Sub22.method679(Class84.method366(780546663) + 94608000000L)
						+ "; Max-Age=" + 94608000L;

			Class76.method341(client.aclient2265, "document.cookie=\"" + var3 + "\"");
		} catch (final Throwable var4) {
			;
		}

	}

	static final boolean method141(final Class131_Sub18 var0) {
		final int var1 = var0.anInt1162;
		if (var1 == 205) {
			client.anInt2080 = 250;
			return true;
		} else {
			int var2;
			int var3;
			if ((var1 >= 300) && (var1 <= 313)) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				client.aClass91_2296.method386(var2, var3 == 1);
			}

			if ((var1 >= 314) && (var1 <= 323)) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				client.aClass91_2296.method381(var2, var3 == 1);
			}

			if (var1 == 324)
				client.aClass91_2296.method382(false);

			if (var1 == 325)
				client.aClass91_2296.method382(true);

			if (var1 == 326) {
				client.secureBuffer.method871(58);
				client.aClass91_2296.method383(client.secureBuffer);
				return true;
			} else
				return false;
		}
	}

	static void method142(final int var0) {
		if (var0 != client.anInt2036) {
			if (client.anInt2036 == 0)
				Class131_Sub11.method574();

			if ((var0 == 20) || (var0 == 40) || (var0 == 45)) {
				client.loginStage = 0;
				client.anInt2079 = 0;
				client.anInt2063 = 0;
			}

			if ((var0 != 20) && (var0 != 40) && (Class42.aClass86_421 != null)) {
				Class42.aClass86_421.method373();
				Class42.aClass86_421 = null;
			}

			if (client.anInt2036 == 25) {
				client.anInt2235 = 0;
				client.anInt2114 = 0;
				client.anInt2215 = 1;
				client.anInt2084 = 0;
				client.anInt2141 = 1;
			}

			if ((var0 != 5) && (var0 != 10)) {
				if (var0 == 20)
					Class131_Sub20_Sub5.method722(Class29.aCanvas271, Class131_Sub20_Sub19_Sub1.aClass100_Sub1_1701,
							Class51.aClass100_Sub1_502, true, client.anInt2036 == 11 ? 4 : 0);
				else if (var0 == 11)
					Class131_Sub20_Sub5.method722(Class29.aCanvas271, Class131_Sub20_Sub19_Sub1.aClass100_Sub1_1701,
							Class51.aClass100_Sub1_502, false, 4);
				else
					Class24.method116();
			} else
				Class131_Sub20_Sub5.method722(Class29.aCanvas271, Class131_Sub20_Sub19_Sub1.aClass100_Sub1_1701,
						Class51.aClass100_Sub1_502, true, 0);

			client.anInt2036 = var0;
		}
	}

	static final void method143(final int var0) {
		if (var0 >= 0) {
			final int var2 = client.anIntArray2171[var0];
			final int var4 = client.anIntArray2168[var0];
			final int var3 = client.anIntArray2066[var0];
			final int var5 = client.anIntArray2170[var0];
			final String var6 = client.aStringArray2195[var0];
			final String var1 = client.aStringArray2172[var0];
			Class131_Sub20_Sub19_Sub2_Sub1.method1063(var2, var4, var3, var5, var6, var1, Class81.anInt682,
					Class81.anInt680);
		}
	}

	static final void method144(final int var0, final int var1) {
		if ((Class105.anInt808 != var0) || (Class131_Sub10.anInt1061 != var1)) {
			Class105.anInt808 = var0;
			Class131_Sub10.anInt1061 = var1;
			method142(25);
			Class5.method26("Loading - please wait.", true);
			int var6 = Class131_Sub20_Sub20.anInt1649;
			int var5 = Class50.anInt491;
			Class131_Sub20_Sub20.anInt1649 = (var0 - 6) * 8;
			Class50.anInt491 = (var1 - 6) * 8;
			final int var4 = Class131_Sub20_Sub20.anInt1649 - var6;
			final int var10 = Class50.anInt491 - var5;
			var6 = Class131_Sub20_Sub20.anInt1649;
			var5 = Class50.anInt491;

			int var2;
			int var9;
			for (var2 = 0; var2 < '\u8000'; ++var2) {
				final Class131_Sub20_Sub19_Sub2_Sub1 var8 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var2];
				if (var8 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var8.anIntArray1755[var9] -= var4;
						var8.anIntArray1756[var9] -= var10;
					}

					var8.anInt1718 -= var4 * 128;
					var8.anInt1759 -= 128 * var10;
				}
			}

			for (var2 = 0; var2 < 2048; ++var2) {
				final Player var20 = client.playerArray[var2];
				if (var20 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var20.anIntArray1755[var9] -= var4;
						var20.anIntArray1756[var9] -= var10;
					}

					var20.anInt1718 -= var4 * 128;
					var20.anInt1759 -= 128 * var10;
				}
			}

			byte var19 = 0;
			byte var13 = 104;
			byte var21 = 1;
			if (var4 < 0) {
				var19 = 103;
				var13 = -1;
				var21 = -1;
			}

			byte var16 = 0;
			byte var17 = 104;
			byte var18 = 1;
			if (var10 < 0) {
				var16 = 103;
				var17 = -1;
				var18 = -1;
			}

			int var15;
			for (int var3 = var19; var13 != var3; var3 += var21)
				for (var15 = var16; var15 != var17; var15 += var18) {
					final int var11 = var3 + var4;
					final int var12 = var10 + var15;

					for (int var14 = 0; var14 < 4; ++var14)
						if ((var11 >= 0) && (var12 >= 0) && (var11 < 104) && (var12 < 104))
							client.aClass115ArrayArrayArray2306[var14][var3][var15] = client.aClass115ArrayArrayArray2306[var14][var11][var12];
						else
							client.aClass115ArrayArrayArray2306[var14][var3][var15] = null;
				}

			for (Class131_Sub9 var7 = (Class131_Sub9) client.aClass115_2158
					.method465(); null != var7; var7 = (Class131_Sub9) client.aClass115_2158.method468()) {
				var7.anInt1045 -= var4;
				var7.anInt1043 -= var10;
				if ((var7.anInt1045 < 0) || (var7.anInt1043 < 0) || (var7.anInt1045 >= 104) || (var7.anInt1043 >= 104))
					var7.method501();
			}

			if (client.anInt2218 != 0) {
				client.anInt2218 -= var4;
				client.anInt2258 -= var10;
			}

			client.anInt2289 = 0;
			client.aBool2271 = false;
			client.anInt2159 = -1;
			client.aClass115_2160.method462();
			client.aClass115_2284.method462();

			for (var15 = 0; var15 < 4; ++var15)
				client.aClass51Array2087[var15].method259();

		}
	}

	static final void method145(final Class131_Sub20_Sub19_Sub2 var0) {
		final int var1 = var0.anInt1704 - client.anInt2038;
		final int var3 = (var0.anInt1706 * 64) + (var0.anInt1742 * 128);
		final int var2 = (var0.anInt1706 * 64) + (var0.anInt1744 * 128);
		var0.anInt1718 += (var3 - var0.anInt1718) / var1;
		var0.anInt1759 += (var2 - var0.anInt1759) / var1;
		var0.anInt1745 = 0;
		var0.anInt1751 = var0.anInt1730;
	}
}
