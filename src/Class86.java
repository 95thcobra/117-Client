import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class Class86 implements Runnable {
	boolean aBool705 = false;
	Class87 aClass87_707;
	boolean aBool710 = false;
	byte[] aByteArray702;
	int anInt709 = 0;
	int anInt708 = 0;
	Class78 aClass78_706;
	Socket aSocket704;
	InputStream anInputStream711;
	OutputStream anOutputStream703;

	public int available() throws IOException {
		return aBool705 ? 0 : anInputStream711.available();
	}

	public void method373() {
		if (!aBool705) {
			synchronized (this) {
				aBool705 = true;
				notifyAll();
			}

			if (aClass87_707 != null) {
				while (aClass87_707.anInt714 == 0)
					Class47.method237(1L);

				if (aClass87_707.anInt714 == 1)
					try {
						((Thread) aClass87_707.anObject716).join();
					} catch (final InterruptedException var3) {
						;
					}
			}

			aClass87_707 = null;
		}
	}

	public int read() throws IOException {
		return !aBool705 ? anInputStream711.read() : 0;
	}

	public void write(final byte[] var1, final int var2, final int var3) throws IOException {
		if (!aBool705)
			if (aBool710) {
				aBool710 = false;
				throw new IOException();
			} else {
				if (aByteArray702 == null)
					aByteArray702 = new byte[5000];

				synchronized (this) {
					for (int var5 = 0; var5 < var3; ++var5) {
						aByteArray702[anInt709] = var1[var5 + var2];
						anInt709 = (1 + anInt709) % 5000;
						if (((4900 + anInt708) % 5000) == anInt709)
							throw new IOException();
					}

					if (null == aClass87_707)
						aClass87_707 = aClass78_706.method348(this, 3);

					notifyAll();
				}
			}
	}

	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					int var3;
					int var4;
					synchronized (this) {
						if (anInt709 == anInt708) {
							if (aBool705)
								break label80;

							try {
								this.wait();
							} catch (final InterruptedException var10) {
								;
							}
						}

						var3 = anInt708;
						if (anInt709 >= anInt708)
							var4 = anInt709 - anInt708;
						else
							var4 = 5000 - anInt708;
					}

					if (var4 <= 0)
						continue;

					try {
						anOutputStream703.write(aByteArray702, var3, var4);
					} catch (final IOException var9) {
						aBool710 = true;
					}

					anInt708 = (var4 + anInt708) % 5000;

					try {
						if (anInt708 == anInt709)
							anOutputStream703.flush();
					} catch (final IOException var8) {
						aBool710 = true;
					}
					continue;
				}

				try {
					if (null != anInputStream711)
						anInputStream711.close();

					if (anOutputStream703 != null)
						anOutputStream703.close();

					if (aSocket704 != null)
						aSocket704.close();
				} catch (final IOException var7) {
					;
				}

				aByteArray702 = null;
				break;
			}
		} catch (final Exception var12) {
			Class131_Sub20_Sub7.method740((String) null, var12);
		}

	}

	public void read(final byte[] var1, int var2, int var3) throws IOException {
		if (!aBool705)
			while (var3 > 0) {
				final int var4 = anInputStream711.read(var1, var2, var3);
				if (var4 <= 0)
					throw new EOFException();

				var2 += var4;
				var3 -= var4;
			}
	}

	public Class86(final Socket var1, final Class78 var2) throws IOException {
		aClass78_706 = var2;
		aSocket704 = var1;
		aSocket704.setSoTimeout(30000);
		aSocket704.setTcpNoDelay(true);
		aSocket704.setReceiveBufferSize(16384);
		aSocket704.setSendBufferSize(16384);
		anInputStream711 = aSocket704.getInputStream();
		anOutputStream703 = aSocket704.getOutputStream();
	}

	@Override
	protected void finalize() {
		method373();
	}
}
