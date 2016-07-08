import java.io.EOFException;
import java.io.IOException;

public class Class140 {
	static int anInt929;
	int anInt921;
	long aLong923;
	long aLong920 = -1L;
	long aLong925;
	long aLong919;
	long aLong922 = -1L;
	int anInt924 = 0;
	Class143 aClass143_926;
	long aLong927;
	byte[] aByteArray928;
	byte[] aByteArray918;

	void method509() throws IOException {
		anInt921 = 0;
		if (aLong925 != aLong923) {
			aClass143_926.method520(aLong925);
			aLong923 = aLong925;
		}

		int var1;
		for (aLong920 = aLong925; anInt921 < aByteArray928.length; anInt921 += var1) {
			var1 = aClass143_926.method519(aByteArray928, anInt921, aByteArray928.length - anInt921);
			if (var1 == -1)
				break;

			aLong923 += var1;
		}

	}

	public void method510(final long var1) throws IOException {
		if (var1 < 0L)
			throw new IOException("");
		else
			aLong925 = var1;
	}

	public void method511(final byte[] var1) throws IOException {
		method512(var1, 0, var1.length);
	}

	public void method512(final byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((var3 + var2) > var1.length)
				throw new ArrayIndexOutOfBoundsException((var2 + var3) - var1.length);

			if ((-1L != aLong922) && (aLong925 >= aLong922) && ((var3 + aLong925) <= (anInt924 + aLong922))) {
				System.arraycopy(aByteArray918, (int) (aLong925 - aLong922), var1, var2, var3);
				aLong925 += var3;
				return;
			}

			final long var4 = aLong925;
			final int var7 = var3;
			int var8;
			if ((aLong925 >= aLong920) && (aLong925 < (aLong920 + anInt921))) {
				var8 = (int) (anInt921 - (aLong925 - aLong920));
				if (var8 > var3)
					var8 = var3;

				System.arraycopy(aByteArray928, (int) (aLong925 - aLong920), var1, var2, var8);
				aLong925 += var8;
				var2 += var8;
				var3 -= var8;
			}

			if (var3 > aByteArray928.length) {
				aClass143_926.method520(aLong925);

				for (aLong923 = aLong925; var3 > 0; var3 -= var8) {
					var8 = aClass143_926.method519(var1, var2, var3);
					if (var8 == -1)
						break;

					aLong923 += var8;
					aLong925 += var8;
					var2 += var8;
				}
			} else if (var3 > 0) {
				method509();
				var8 = var3;
				if (var3 > anInt921)
					var8 = anInt921;

				System.arraycopy(aByteArray928, 0, var1, var2, var8);
				var2 += var8;
				var3 -= var8;
				aLong925 += var8;
			}

			if (-1L != aLong922) {
				if ((aLong922 > aLong925) && (var3 > 0)) {
					var8 = var2 + (int) (aLong922 - aLong925);
					if (var8 > (var3 + var2))
						var8 = var2 + var3;

					while (var2 < var8) {
						var1[var2++] = 0;
						--var3;
						++aLong925;
					}
				}

				long var9 = -1L;
				long var11 = -1L;
				if ((aLong922 >= var4) && (aLong922 < (var4 + var7)))
					var9 = aLong922;
				else if ((var4 >= aLong922) && (var4 < (anInt924 + aLong922)))
					var9 = var4;

				if (((aLong922 + anInt924) > var4) && ((anInt924 + aLong922) <= (var7 + var4)))
					var11 = aLong922 + anInt924;
				else if (((var4 + var7) > aLong922) && ((var4 + var7) <= (aLong922 + anInt924)))
					var11 = var4 + var7;

				if ((var9 > -1L) && (var11 > var9)) {
					final int var13 = (int) (var11 - var9);
					System.arraycopy(aByteArray918, (int) (var9 - aLong922), var1, (int) (var9 - var4) + var2, var13);
					if (var11 > aLong925) {
						var3 = (int) (var3 - (var11 - aLong925));
						aLong925 = var11;
					}
				}
			}
		} catch (final IOException var15) {
			aLong923 = -1L;
			throw var15;
		}

		if (var3 > 0)
			throw new EOFException();
	}

	void method513() throws IOException {
		if (-1L != aLong922) {
			if (aLong923 != aLong922) {
				aClass143_926.method520(aLong922);
				aLong923 = aLong922;
			}

			aClass143_926.method523(aByteArray918, 0, anInt924);
			aLong923 += 1643985421L * anInt924 * 406496453;
			if (aLong923 > aLong919)
				aLong919 = aLong923;

			long var1 = -1L;
			long var3 = -1L;
			if ((aLong922 >= aLong920) && (aLong922 < (aLong920 + anInt921)))
				var1 = aLong922;
			else if ((aLong920 >= aLong922) && (aLong920 < (anInt924 + aLong922)))
				var1 = aLong920;

			if (((aLong922 + anInt924) > aLong920) && ((aLong922 + anInt924) <= (aLong920 + anInt921)))
				var3 = aLong922 + anInt924;
			else if (((aLong920 + anInt921) > aLong922) && ((aLong920 + anInt921) <= (aLong922 + anInt924)))
				var3 = anInt921 + aLong920;

			if ((var1 > -1L) && (var3 > var1)) {
				final int var5 = (int) (var3 - var1);
				System.arraycopy(aByteArray918, (int) (var1 - aLong922), aByteArray928, (int) (var1 - aLong920), var5);
			}

			aLong922 = -1L;
			anInt924 = 0;
		}

	}

	public Class140(final Class143 var1, final int var2, final int var3) throws IOException {
		aClass143_926 = var1;
		final long var10003 = var1.method522();
		aLong919 = var10003 * -6817503244510771231L;
		aLong927 = var10003;
		aByteArray928 = new byte[var2];
		aByteArray918 = new byte[var3];
		aLong925 = 0L;
	}

	public void method514() throws IOException {
		method513();
		aClass143_926.method521();
	}

	public long method515() {
		return aLong927;
	}

	public void method516(final byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((var3 + aLong925) > aLong927)
				aLong927 = aLong925 + var3;

			if ((aLong922 != -1L) && ((aLong925 < aLong922) || (aLong925 > (anInt924 + aLong922))))
				method513();

			if ((-1L != aLong922) && ((aLong925 + var3) > (aByteArray918.length + aLong922))) {
				final int var4 = (int) (aByteArray918.length - (aLong925 - aLong922));
				System.arraycopy(var1, var2, aByteArray918, (int) (aLong925 - aLong922), var4);
				aLong925 += var4;
				var2 += var4;
				var3 -= var4;
				anInt924 = aByteArray918.length;
				method513();
			}

			if (var3 <= aByteArray918.length) {
				if (var3 > 0) {
					if (-1L == aLong922)
						aLong922 = aLong925;

					System.arraycopy(var1, var2, aByteArray918, (int) (aLong925 - aLong922), var3);
					aLong925 += var3;
					if ((aLong925 - aLong922) > anInt924)
						anInt924 = (int) (aLong925 - aLong922);

				}
			} else {
				if (aLong925 != aLong923) {
					aClass143_926.method520(aLong925);
					aLong923 = aLong925;
				}

				aClass143_926.method523(var1, var2, var3);
				aLong923 += var3;
				if (aLong923 > aLong919)
					aLong919 = aLong923;

				long var5 = -1L;
				long var7 = -1L;
				if ((aLong925 >= aLong920) && (aLong925 < (aLong920 + anInt921)))
					var5 = aLong925;
				else if ((aLong920 >= aLong925) && (aLong920 < (aLong925 + var3)))
					var5 = aLong920;

				if (((var3 + aLong925) > aLong920) && ((var3 + aLong925) <= (anInt921 + aLong920)))
					var7 = aLong925 + var3;
				else if (((anInt921 + aLong920) > aLong925) && ((aLong920 + anInt921) <= (aLong925 + var3)))
					var7 = anInt921 + aLong920;

				if ((var5 > -1L) && (var7 > var5)) {
					final int var9 = (int) (var7 - var5);
					System.arraycopy(var1, (int) ((var2 + var5) - aLong925), aByteArray928, (int) (var5 - aLong920),
							var9);
				}

				aLong925 += var3;
			}
		} catch (final IOException var11) {
			aLong923 = -1L;
			throw var11;
		}
	}
}
