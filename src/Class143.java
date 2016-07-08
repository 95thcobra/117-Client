import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class143 {
	long aLong946;
	RandomAccessFile aRandomAccessFile948;
	long aLong947;

	public final int method519(final byte[] var1, final int var2, final int var3) throws IOException {
		final int var4 = aRandomAccessFile948.read(var1, var2, var3);
		if (var4 > 0)
			aLong946 += var4;

		return var4;
	}

	final void method520(final long var1) throws IOException {
		aRandomAccessFile948.seek(var1);
		aLong946 = var1;
	}

	public final void method521() throws IOException {
		if (aRandomAccessFile948 != null) {
			aRandomAccessFile948.close();
			aRandomAccessFile948 = null;
		}

	}

	public final long method522() throws IOException {
		return aRandomAccessFile948.length();
	}

	@Override
	protected void finalize() throws Throwable {
		if (aRandomAccessFile948 != null) {
			System.out.println("");
			method521();
		}

	}

	public Class143(final File var1, final String var2, long var3) throws IOException {
		if (var3 == -1L)
			var3 = Long.MAX_VALUE;

		if (var1.length() >= var3)
			var1.delete();

		aRandomAccessFile948 = new RandomAccessFile(var1, var2);
		aLong947 = var3;
		aLong946 = 0L;
		final int var5 = aRandomAccessFile948.read();
		if ((var5 != -1) && !var2.equals("r")) {
			aRandomAccessFile948.seek(0L);
			aRandomAccessFile948.write(var5);
		}

		aRandomAccessFile948.seek(0L);
	}

	public final void method523(final byte[] var1, final int var2, final int var3) throws IOException {
		if ((var3 + aLong946) > aLong947) {
			aRandomAccessFile948.seek(1L + aLong947);
			aRandomAccessFile948.write(1);
			throw new EOFException();
		} else {
			aRandomAccessFile948.write(var1, var2, var3);
			aLong946 += var3;
		}
	}
}
