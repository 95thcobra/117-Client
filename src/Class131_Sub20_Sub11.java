import java.awt.Component;
import java.io.IOException;

public class Class131_Sub20_Sub11 extends Class131_Sub20 {
	public int anInt1555 = 0;
	public static Class121 aClass121_1556 = new Class121(64);

	public static void method766(final Component var0) {
		var0.removeKeyListener(Class80.aClass80_655);
		var0.removeFocusListener(Class80.aClass80_655);
		Class80.anInt651 = -1;
	}

	public void method767(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method595();
			if (var2 == 0)
				return;

			method768(var1, var2);
		}
	}

	void method768(final DataBuffer var1, final int var2) {
		if (var2 == 2)
			anInt1555 = var1.readUShort();

	}

	static void method769(final int var0, final int var1, final int var2, final boolean var3, final int var4,
			final boolean var5) {
		if (var0 < var1) {
			final int var8 = (var1 + var0) / 2;
			int var7 = var0;
			final Class30 var6 = Class30.aClass30Array273[var8];
			Class30.aClass30Array273[var8] = Class30.aClass30Array273[var1];
			Class30.aClass30Array273[var1] = var6;

			for (int var10 = var0; var10 < var1; ++var10)
				if (Class50.method258(Class30.aClass30Array273[var10], var6, var2, var3, var4, var5) <= 0) {
					final Class30 var9 = Class30.aClass30Array273[var10];
					Class30.aClass30Array273[var10] = Class30.aClass30Array273[var7];
					Class30.aClass30Array273[var7++] = var9;
				}

			Class30.aClass30Array273[var1] = Class30.aClass30Array273[var7];
			Class30.aClass30Array273[var7] = var6;
			method769(var0, var7 - 1, var2, var3, var4, var5);
			method769(1 + var7, var1, var2, var3, var4, var5);
		}

	}

	static void method770(final Class100_Sub1 var0, final int var1, final int var2, final int var3, final byte var4,
			final boolean var5) {
		final long var6 = (var1 << 16) + var2;
		Class131_Sub20_Sub20 var8 = (Class131_Sub20_Sub20) Class94.aClass114_745.method457(var6);
		if (var8 == null) {
			var8 = (Class131_Sub20_Sub20) Class94.aClass114_747.method457(var6);
			if (null == var8) {
				var8 = (Class131_Sub20_Sub20) Class94.aClass114_750.method457(var6);
				if (var8 != null) {
					if (var5) {
						var8.method677();
						Class94.aClass114_745.method461(var8, var6);
						--Class94.anInt751;
						++Class94.anInt761;
					}

				} else {
					if (!var5) {
						var8 = (Class131_Sub20_Sub20) Class94.aClass114_752.method457(var6);
						if (null != var8)
							return;
					}

					var8 = new Class131_Sub20_Sub20();
					var8.aClass100_Sub1_1653 = var0;
					var8.anInt1650 = var3;
					var8.aByte1651 = var4;
					if (var5) {
						Class94.aClass114_745.method461(var8, var6);
						++Class94.anInt761;
					} else {
						Class94.aClass116_749.method474(var8);
						Class94.aClass114_750.method461(var8, var6);
						++Class94.anInt751;
					}

				}
			}
		}
	}

	static final void method771(final boolean var0) {
		Class28.method123();
		++client.anInt2076;
		if ((client.anInt2076 >= 50) || var0) {
			client.anInt2076 = 0;
			if (!client.aBool2098 && (Class131_Sub20_Sub20.loginConnection != null)) {
				client.secureBuffer.method871(144);

				try {
					Class131_Sub20_Sub20.loginConnection.write(client.secureBuffer.data, 0,
							client.secureBuffer.pos);
					client.secureBuffer.pos = 0;
				} catch (final IOException var2) {
					client.aBool2098 = true;
				}
			}

		}
	}
}
