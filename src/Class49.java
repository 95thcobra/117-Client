import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class49 {
	static int anInt478;
	static int[] anIntArray485;
	DataInputStream aDataInputStream480;
	int anInt486;
	int anInt482;
	byte[] aByteArray487;
	int anInt484;
	byte[] aByteArray481 = new byte[4];
	Class87 aClass87_483;
	long aLong479;

	static final void method253(final Class131_Sub18 var0, final int var1, final int var2) {
		if ((client.aClass131_Sub18_2165 == null) && !client.aBool2047)
			if (var0 != null) {
				Class131_Sub18 var4 = Class13.method52(var0);
				if (var4 == null)
					var4 = var0.aClass131_Sub18_1233;

				if (var4 != null) {
					client.aClass131_Sub18_2165 = var0;
					var4 = Class13.method52(var0);
					if (var4 == null)
						var4 = var0.aClass131_Sub18_1233;

					client.aClass131_Sub18_2035 = var4;
					client.anInt2045 = var1;
					client.anInt2280 = var2;
					Class12.anInt110 = 0;
					client.aBool2106 = false;
					if (client.anInt2166 > 0) {
						final int var3 = client.anInt2166 - 1;
						Class40.aClass2_418 = new Class2();
						Class40.aClass2_418.anInt10 = client.anIntArray2171[var3];
						Class40.aClass2_418.anInt4 = client.anIntArray2168[var3];
						Class40.aClass2_418.anInt5 = client.anIntArray2066[var3];
						Class40.aClass2_418.anInt3 = client.anIntArray2170[var3];
						Class40.aClass2_418.aString6 = client.aStringArray2195[var3];
					}

					return;
				}
			}
	}

	static int method254(final Class131_Sub18 var0) {
		final Class131_Sub21 var1 = (Class131_Sub21) client.aClass114_2225
				.method457(var0.anInt1159 + ((long) var0.anInt1272 << 32));
		return null == var1 ? var0.anInt1230 : var1.anInt1320;
	}

	static final String[] method255(final String[] var0) {
		final String[] var1 = new String[5];

		for (int var2 = 0; var2 < 5; ++var2) {
			var1[var2] = var2 + ": ";
			if ((var0 != null) && (null != var0[var2]))
				var1[var2] = var1[var2] + var0[var2];
		}

		return var1;
	}

	public static void method256(final Class100 var0, final Class100 var1, final boolean var2,
			final Class131_Sub20_Sub17_Sub4_Sub1 var3) {
		Class131_Sub20_Sub2.aClass100_1374 = var0;
		Class130.aClass100_899 = var1;
		Class71.aBool611 = var2;
		Class131_Sub7.anInt1031 = Class131_Sub20_Sub2.aClass100_1374.method417(10);
		Class131_Sub20_Sub2.aClass131_Sub20_Sub17_Sub4_Sub1_1380 = var3;
	}

	byte[] method257() throws IOException {
		if (Class84.method366(780546663) > aLong479)
			throw new IOException();
		else {
			if (anInt486 == 0) {
				if (aClass87_483.anInt714 == 2)
					throw new IOException();

				if (aClass87_483.anInt714 == 1) {
					aDataInputStream480 = (DataInputStream) aClass87_483.anObject716;
					anInt486 = 1;
				}
			}

			int var1;
			if (anInt486 == 1) {
				var1 = aDataInputStream480.available();
				if (var1 > 0) {
					if ((anInt482 + var1) > 4)
						var1 = 4 - anInt482;

					anInt482 += aDataInputStream480.read(aByteArray481, anInt482, var1);
					if (anInt482 == 4) {
						final int var2 = (new DataBuffer(aByteArray481)).readIntV1();
						aByteArray487 = new byte[var2];
						anInt486 = 2;
					}
				}
			}

			if (anInt486 == 2) {
				var1 = aDataInputStream480.available();
				if (var1 > 0) {
					if ((anInt484 + var1) > aByteArray487.length)
						var1 = aByteArray487.length - anInt484;

					anInt484 += aDataInputStream480.read(aByteArray487, anInt484, var1);
					if (aByteArray487.length == anInt484)
						return aByteArray487;
				}
			}

			return null;
		}
	}

	Class49(final Class78 var1, final URL var2) {
		aClass87_483 = var1.method349(var2);
		anInt486 = 0;
		aLong479 = Class84.method366(780546663) + 30000L;
	}
}
