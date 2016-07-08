public class Class84 {
	static Class100_Sub1 aClass100_Sub1_696;
	static int[] anIntArray697;
	static Class84 aClass84_695 = new Class84(0);
	public static Class84 aClass84_694 = new Class84(1);
	static Class84 aClass84_693 = new Class84(2);
	public int anInt698;

	public static void method365() {
		while (true) {
			final Class115 var0 = Class105.aClass115_807;
			Class131_Sub17 var1;
			synchronized (var0) {
				var1 = (Class131_Sub17) Class105.aClass115_805.method466();
			}

			if (var1 == null)
				return;

			var1.aClass100_Sub1_1145.method652(var1.aClass75_1144, (int) var1.aLong902, var1.aByteArray1142, false);
		}
	}

	public static synchronized long method366(final int var0) {
		final long var1 = System.currentTimeMillis();
		if (var1 < Class54.aLong503)
			Class54.aLong504 += Class54.aLong503 - var1;

		Class54.aLong503 = var1;
		return Class54.aLong504 + var1;
	}

	static void method367() {
		for (Class131_Sub7 var0 = (Class131_Sub7) client.aClass114_2184
				.method460(); null != var0; var0 = (Class131_Sub7) client.aClass114_2184.method458()) {
			final int var2 = var0.anInt1025;
			if (Class77.method344(var2)) {
				boolean var5 = true;
				final Class131_Sub18[] var4 = Class131_Sub18.aClass131_Sub18ArrayArray1174[var2];

				int var3;
				for (var3 = 0; var3 < var4.length; ++var3)
					if (null != var4[var3]) {
						var5 = var4[var3].aBool1263;
						break;
					}

				if (!var5) {
					var3 = (int) var0.aLong902;
					final Class131_Sub18 var1 = Class88.method377(var3);
					if (var1 != null)
						Class131_Sub20_Sub6.method734(var1);
				}
			}
		}

	}

	public static byte[] method368(final CharSequence var0) {
		final int var1 = var0.length();
		final byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			final char var4 = var0.charAt(var3);
			if (((var4 > 0) && (var4 < 128)) || ((var4 >= 160) && (var4 <= 255)))
				var2[var3] = (byte) var4;
			else if (var4 == 8364)
				var2[var3] = -128;
			else if (var4 == 8218)
				var2[var3] = -126;
			else if (var4 == 402)
				var2[var3] = -125;
			else if (var4 == 8222)
				var2[var3] = -124;
			else if (var4 == 8230)
				var2[var3] = -123;
			else if (var4 == 8224)
				var2[var3] = -122;
			else if (var4 == 8225)
				var2[var3] = -121;
			else if (var4 == 710)
				var2[var3] = -120;
			else if (var4 == 8240)
				var2[var3] = -119;
			else if (var4 == 352)
				var2[var3] = -118;
			else if (var4 == 8249)
				var2[var3] = -117;
			else if (var4 == 338)
				var2[var3] = -116;
			else if (var4 == 381)
				var2[var3] = -114;
			else if (var4 == 8216)
				var2[var3] = -111;
			else if (var4 == 8217)
				var2[var3] = -110;
			else if (var4 == 8220)
				var2[var3] = -109;
			else if (var4 == 8221)
				var2[var3] = -108;
			else if (var4 == 8226)
				var2[var3] = -107;
			else if (var4 == 8211)
				var2[var3] = -106;
			else if (var4 == 8212)
				var2[var3] = -105;
			else if (var4 == 732)
				var2[var3] = -104;
			else if (var4 == 8482)
				var2[var3] = -103;
			else if (var4 == 353)
				var2[var3] = -102;
			else if (var4 == 8250)
				var2[var3] = -101;
			else if (var4 == 339)
				var2[var3] = -100;
			else if (var4 == 382)
				var2[var3] = -98;
			else if (var4 == 376)
				var2[var3] = -97;
			else
				var2[var3] = 63;
		}

		return var2;
	}

	public static int method369(final int var0, final int var1) {
		final Class131_Sub20_Sub3 var2 = Class7.method34(var0);
		final int var3 = var2.anInt1429;
		final int var4 = var2.anInt1426;
		final int var6 = var2.anInt1427;
		final int var5 = Class96.anIntArray765[var6 - var4];
		return (Class96.anIntArray766[var3] >> var4) & var5;
	}

	public static void method370(final byte[] var0) {
		final DataBuffer var1 = new DataBuffer(var0);
		var1.pos = var0.length - 2;
		Class13.anInt116 = var1.readUShort();
		Class13.anIntArray114 = new int[Class13.anInt116];
		Class131_Sub20_Sub15.anIntArray1605 = new int[Class13.anInt116];
		Class131_Sub20_Sub19_Sub3.anIntArray1766 = new int[Class13.anInt116];
		NpcFlags.anIntArray54 = new int[Class13.anInt116];
		Class13.aByteArrayArray117 = new byte[Class13.anInt116][];
		var1.pos = var0.length - 7 - (Class13.anInt116 * 8);
		Class13.anInt113 = var1.readUShort();
		Class13.anInt115 = var1.readUShort();
		final int var5 = (var1.method595() & 255) + 1;

		int var4;
		for (var4 = 0; var4 < Class13.anInt116; ++var4)
			Class13.anIntArray114[var4] = var1.readUShort();

		for (var4 = 0; var4 < Class13.anInt116; ++var4)
			Class131_Sub20_Sub15.anIntArray1605[var4] = var1.readUShort();

		for (var4 = 0; var4 < Class13.anInt116; ++var4)
			Class131_Sub20_Sub19_Sub3.anIntArray1766[var4] = var1.readUShort();

		for (var4 = 0; var4 < Class13.anInt116; ++var4)
			NpcFlags.anIntArray54[var4] = var1.readUShort();

		var1.pos = var0.length - 7 - (Class13.anInt116 * 8) - ((var5 - 1) * 3);
		Class36.anIntArray370 = new int[var5];

		for (var4 = 1; var4 < var5; ++var4) {
			Class36.anIntArray370[var4] = var1.method598();
			if (Class36.anIntArray370[var4] == 0)
				Class36.anIntArray370[var4] = 1;
		}

		var1.pos = 0;

		for (var4 = 0; var4 < Class13.anInt116; ++var4) {
			final int var7 = Class131_Sub20_Sub19_Sub3.anIntArray1766[var4];
			final int var8 = NpcFlags.anIntArray54[var4];
			final int var6 = var7 * var8;
			final byte[] var2 = new byte[var6];
			Class13.aByteArrayArray117[var4] = var2;
			final int var10 = var1.method595();
			int var3;
			if (var10 == 0)
				for (var3 = 0; var3 < var6; ++var3)
					var2[var3] = var1.method584();
			else if (var10 == 1)
				for (var3 = 0; var3 < var7; ++var3)
					for (int var9 = 0; var9 < var8; ++var9)
						var2[var3 + (var7 * var9)] = var1.method584();
		}

	}

	Class84(final int var1) {
		anInt698 = var1;
	}
}
