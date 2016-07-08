import java.io.IOException;

public final class Class92 {
	static int anInt740;
	static Class100 aClass100_741;

	public static void method389(final boolean var0) {
		if (Class94.aClass86_754 != null)
			try {
				final DataBuffer var1 = new DataBuffer(4);
				var1.writeByte(var0 ? 2 : 3);
				var1.method587(0);
				Class94.aClass86_754.write(var1.data, 0, 4);
			} catch (final IOException var4) {
				try {
					Class94.aClass86_754.method373();
				} catch (final Exception var3) {
					;
				}

				++Class94.anInt748;
				Class94.aClass86_754 = null;
			}
	}
}
