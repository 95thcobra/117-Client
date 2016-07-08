public class Class72 {
	public static String[] aStringArray615;
	public static String aString616;
	static int anInt618;
	public static Class140 aClass140_617 = null;
	public static Class140 aClass140_614 = null;
	public static Class140 aClass140_613 = null;

	static final void method332() {
		for (Class131_Sub9 var0 = (Class131_Sub9) client.aClass115_2158
				.method465(); null != var0; var0 = (Class131_Sub9) client.aClass115_2158.method468())
			if (var0.anInt1050 != -1)
				var0.method501();
			else {
				var0.anInt1044 = 0;
				Class131_Sub6.method552(var0);
			}

	}

	static final void method333(final Class131_Sub18 var0, final int var1, final int var2, final int var3,
			final int var4, final int var5, final int var6) {
		if (client.aBool2272)
			client.anInt2109 = 32;
		else
			client.anInt2109 = 0;

		client.aBool2272 = false;
		int var7;
		if ((Class81.anInt666 == 1) || (!RuntimeException_Sub1.aBool1954 && (Class81.anInt666 == 4)))
			if ((var5 >= var1) && (var5 < (var1 + 16)) && (var6 >= var2) && (var6 < (var2 + 16))) {
				var0.anInt1180 -= 4;
				Class131_Sub20_Sub6.method734(var0);
			} else if ((var5 >= var1) && (var5 < (var1 + 16)) && (var6 >= ((var3 + var2) - 16))
					&& (var6 < (var2 + var3))) {
				var0.anInt1180 += 4;
				Class131_Sub20_Sub6.method734(var0);
			} else if ((var5 >= (var1 - client.anInt2109)) && (var5 < (var1 + 16 + client.anInt2109))
					&& (var6 >= (var2 + 16)) && (var6 < ((var3 + var2) - 16))) {
				var7 = ((var3 - 32) * var3) / var4;
				if (var7 < 8)
					var7 = 8;

				final int var8 = var6 - var2 - 16 - (var7 / 2);
				final int var9 = var3 - 32 - var7;
				var0.anInt1180 = (var8 * (var4 - var3)) / var9;
				Class131_Sub20_Sub6.method734(var0);
				client.aBool2272 = true;
			}

		if (client.anInt2221 != 0) {
			var7 = var0.anInt1173;
			if ((var5 >= (var1 - var7)) && (var6 >= var2) && (var5 < (var1 + 16)) && (var6 <= (var3 + var2))) {
				var0.anInt1180 += client.anInt2221 * 45;
				Class131_Sub20_Sub6.method734(var0);
			}
		}

	}
}
