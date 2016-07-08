public class Class131_Sub20_Sub8 extends Class131_Sub20 {
	static Class131_Sub13[] aClass131_Sub13Array1498;
	int anInt1499 = Class18.method83();
	int anInt1494;
	int anInt1500;
	String aString1495;
	String aString1496;
	String aString1497;

	public static int method745(final String var0) {
		return var0.length() + 2;
	}

	public static int method746(final CharSequence var0) {
		return Class63.method303(var0, 10, true);
	}

	public static byte[] method747(final Object var0, final boolean var1) {
		if (var0 == null)
			return null;
		else if (var0 instanceof byte[]) {
			final byte[] var3 = ((byte[]) var0);
			return var1 ? Class58.method281(var3) : var3;
		} else if (var0 instanceof Class56) {
			final Class56 var2 = (Class56) var0;
			return var2.method277(541753250);
		} else
			throw new IllegalArgumentException();
	}

	Class131_Sub20_Sub8(final int var1, final String var2, final String var3, final String var4) {
		anInt1494 = client.anInt2038;
		anInt1500 = var1;
		aString1495 = var2;
		aString1496 = var3;
		aString1497 = var4;
	}

	static final void method748() {
		client.secureBuffer.method871(114);
		client.secureBuffer.writeByte(0);
	}

	void method749(final int var1, final String var2, final String var3, final String var4) {
		anInt1499 = Class18.method83();
		anInt1494 = client.anInt2038;
		anInt1500 = var1;
		aString1495 = var2;
		aString1496 = var3;
		aString1497 = var4;
	}
}
