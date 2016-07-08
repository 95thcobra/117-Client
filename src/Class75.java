import java.io.EOFException;
import java.io.IOException;

public final class Class75 {
	static int anInt633;
	static byte[] aByteArray632 = new byte[520];
	Class140 aClass140_629 = null;
	Class140 aClass140_630 = null;
	int anInt628 = '\ufde8';
	int anInt631;

	public byte[] method337(final int var1) {
		final Class140 var2 = aClass140_629;
		synchronized (var2) {
			try {
				if (aClass140_630.method515() < 6 + (var1 * 6))
					return null;
				else {
					aClass140_630.method510(var1 * 6);
					aClass140_630.method512(aByteArray632, 0, 6);
					final int var3 = (aByteArray632[2] & 255) + ((aByteArray632[1] & 255) << 8)
							+ ((aByteArray632[0] & 255) << 16);
					int var4 = (aByteArray632[5] & 255) + ((aByteArray632[3] & 255) << 16)
							+ ((aByteArray632[4] & 255) << 8);
					if ((var3 < 0) || (var3 > anInt628))
						return null;
					else if ((var4 <= 0) || (var4 > (aClass140_629.method515() / 520L)))
						return null;
					else {
						final byte[] var5 = new byte[var3];
						int var6 = 0;

						for (int var7 = 0; var6 < var3; ++var7) {
							if (var4 == 0)
								return null;

							aClass140_629.method510(var4 * 520);
							int var8 = var3 - var6;
							if (var8 > 512)
								var8 = 512;

							aClass140_629.method512(aByteArray632, 0, var8 + 8);
							final int var9 = (aByteArray632[1] & 255) + ((aByteArray632[0] & 255) << 8);
							final int var10 = (aByteArray632[3] & 255) + ((aByteArray632[2] & 255) << 8);
							final int var11 = ((aByteArray632[5] & 255) << 8) + ((aByteArray632[4] & 255) << 16)
									+ (aByteArray632[6] & 255);
							final int var12 = aByteArray632[7] & 255;
							if ((var9 != var1) || (var10 != var7) || (var12 != anInt631))
								return null;

							if ((var11 < 0) || (var11 > (aClass140_629.method515() / 520L)))
								return null;

							for (int var13 = 0; var13 < var8; ++var13)
								var5[var6++] = aByteArray632[var13 + 8];

							var4 = var11;
						}

						final byte[] var10000 = var5;
						return var10000;
					}
				}
			} catch (final IOException var16) {
				return null;
			}
		}
	}

	public boolean method338(final int var1, final byte[] var2, final int var3) {
		final Class140 var4 = aClass140_629;
		synchronized (var4) {
			if ((var3 >= 0) && (var3 <= anInt628)) {
				boolean var5 = method339(var1, var2, var3, true);
				if (!var5)
					var5 = method339(var1, var2, var3, false);

				return var5;
			} else
				throw new IllegalArgumentException();
		}
	}

	boolean method339(final int var1, final byte[] var2, final int var3, boolean var4) {
		final Class140 var5 = aClass140_629;
		synchronized (var5) {
			boolean var10000;
			try {
				int var6;
				if (var4) {
					if (aClass140_630.method515() < 6 + (6 * var1))
						return false;

					aClass140_630.method510(6 * var1);
					aClass140_630.method512(aByteArray632, 0, 6);
					var6 = (aByteArray632[5] & 255) + ((aByteArray632[3] & 255) << 16)
							+ ((aByteArray632[4] & 255) << 8);
					if ((var6 <= 0) || (var6 > (aClass140_629.method515() / 520L)))
						return false;
				} else {
					var6 = (int) ((aClass140_629.method515() + 519L) / 520L);
					if (var6 == 0)
						var6 = 1;
				}

				aByteArray632[0] = (byte) (var3 >> 16);
				aByteArray632[1] = (byte) (var3 >> 8);
				aByteArray632[2] = (byte) var3;
				aByteArray632[3] = (byte) (var6 >> 16);
				aByteArray632[4] = (byte) (var6 >> 8);
				aByteArray632[5] = (byte) var6;
				aClass140_630.method510(var1 * 6);
				aClass140_630.method516(aByteArray632, 0, 6);
				int var7 = 0;

				for (int var8 = 0; var7 < var3; ++var8) {
					int var9 = 0;
					int var11;
					if (var4) {
						aClass140_629.method510(520 * var6);

						try {
							aClass140_629.method512(aByteArray632, 0, 8);
						} catch (final EOFException var16) {
							break;
						}

						var11 = ((aByteArray632[0] & 255) << 8) + (aByteArray632[1] & 255);
						final int var12 = ((aByteArray632[2] & 255) << 8) + (aByteArray632[3] & 255);
						var9 = ((aByteArray632[4] & 255) << 16) + ((aByteArray632[5] & 255) << 8)
								+ (aByteArray632[6] & 255);
						final int var13 = aByteArray632[7] & 255;
						if ((var11 != var1) || (var8 != var12) || (var13 != anInt631))
							return false;

						if ((var9 < 0) || (var9 > (aClass140_629.method515() / 520L)))
							return false;
					}

					if (var9 == 0) {
						var4 = false;
						var9 = (int) ((aClass140_629.method515() + 519L) / 520L);
						if (var9 == 0)
							++var9;

						if (var9 == var6)
							++var9;
					}

					if ((var3 - var7) <= 512)
						var9 = 0;

					aByteArray632[0] = (byte) (var1 >> 8);
					aByteArray632[1] = (byte) var1;
					aByteArray632[2] = (byte) (var8 >> 8);
					aByteArray632[3] = (byte) var8;
					aByteArray632[4] = (byte) (var9 >> 16);
					aByteArray632[5] = (byte) (var9 >> 8);
					aByteArray632[6] = (byte) var9;
					aByteArray632[7] = (byte) anInt631;
					aClass140_629.method510(var6 * 520);
					aClass140_629.method516(aByteArray632, 0, 8);
					var11 = var3 - var7;
					if (var11 > 512)
						var11 = 512;

					aClass140_629.method516(var2, var7, var11);
					var7 += var11;
					var6 = var9;
				}

				var10000 = true;
			} catch (final IOException var17) {
				return false;
			}

			return var10000;
		}
	}

	public Class75(final int var1, final Class140 var2, final Class140 var3, final int var4) {
		anInt631 = var1;
		aClass140_629 = var2;
		aClass140_630 = var3;
		anInt628 = var4;
	}

	public static boolean method340(final int var0) {
		return ((var0 >> 20) & 1) != 0;
	}
}
