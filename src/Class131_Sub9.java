import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class131_Sub9 extends Class131 {
	int anInt1043;
	int anInt1045;
	int anInt1046;
	int anInt1047;
	int anInt1048;
	int anInt1049;
	int anInt1051;
	int anInt1052;
	int anInt1053;
	static int[] anIntArray1054;
	int anInt1055;
	int anInt1044 = 0;
	int anInt1050 = -1;

	public static void method562(final String[] var0, final short[] var1) {
		Class24.method113(var0, var1, 0, var0.length - 1);
	}

	public static File method563(final String var0) {
		if (!Class77.aBool637)
			throw new RuntimeException("");
		else {
			final File var1 = (File) Class77.aHashtable634.get(var0);
			if (var1 != null)
				return var1;
			else {
				final File var2 = new File(Class77.aFile635, var0);
				RandomAccessFile var3 = null;

				try {
					final File var4 = new File(var2.getParent());
					if (!var4.exists())
						throw new RuntimeException("");
					else {
						var3 = new RandomAccessFile(var2, "rw");
						final int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						Class77.aHashtable634.put(var0, var2);
						return var2;
					}
				} catch (final Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (final Exception var7) {
						;
					}

					throw new RuntimeException();
				}
			}
		}
	}

	static final void method564() {
		for (Class131_Sub20_Sub19_Sub1 var0 = (Class131_Sub20_Sub19_Sub1) client.aClass115_2160
				.method465(); null != var0; var0 = (Class131_Sub20_Sub19_Sub1) client.aClass115_2160.method468())
			if ((var0.anInt1693 == Class39.anInt410) && !var0.aBool1700) {
				if (client.anInt2038 >= var0.anInt1692) {
					var0.method916(client.anInt2103);
					if (var0.aBool1700)
						var0.method501();
					else
						Class65.aClass33_595.method155(var0.anInt1693, var0.anInt1694, var0.anInt1691, var0.anInt1696,
								60, var0, 0, -1, false);
				}
			} else
				var0.method501();

	}

	public static void method565(final Class100 var0) {
		Class131_Sub20_Sub3.aClass100_1425 = var0;
	}

	public static boolean method566(final Class100 var0, final Class100 var1, final Class100 var2,
			final Class131_Sub4_Sub3 var3) {
		Class113.aClass100_835 = var0;
		Class113.aClass100_829 = var1;
		Class113.aClass100_831 = var2;
		Class113.aClass131_Sub4_Sub3_832 = var3;
		return true;
	}

	static void method567(final int var0, final Class75 var1, final Class100_Sub1 var2) {
		final Class131_Sub17 var3 = new Class131_Sub17();
		var3.anInt1143 = 1;
		var3.aLong902 = var0;
		var3.aClass75_1144 = var1;
		var3.aClass100_Sub1_1145 = var2;
		final Class115 var4 = Class105.aClass115_807;
		synchronized (var4) {
			Class105.aClass115_807.method471(var3);
		}

		final Object var9 = Class105.anObject806;
		synchronized (var9) {
			if (Class105.anInt804 == 0)
				Class36.aClass78_371.method348(new Class105(), 5);

			Class105.anInt804 = 600;
		}
	}

	static Class28 method568() {
		Class143 var0 = null;
		Class28 var1 = new Class28();

		try {
			var0 = Class131_Sub20_Sub5.method726("", Class80.aClass73_665.aString623, false);
			final byte[] var2 = new byte[(int) var0.method522()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.method519(var2, var3, var2.length - var3);
				if (var4 == -1)
					throw new IOException();
			}

			var1 = new Class28(new DataBuffer(var2));
		} catch (final Exception var6) {
			;
		}

		try {
			if (var0 != null)
				var0.method521();
		} catch (final Exception var5) {
			;
		}

		return var1;
	}
}
