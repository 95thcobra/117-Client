public class Class105 implements Runnable {
	static int anInt808;
	public static int anInt804 = 0;
	static Class115 aClass115_807 = new Class115();
	static Class115 aClass115_805 = new Class115();
	public static Object anObject806 = new Object();

	@Override
	public void run() {
		try {
			while (true) {
				Class115 var1 = aClass115_807;
				Class131_Sub17 var2;
				synchronized (var1) {
					var2 = (Class131_Sub17) aClass115_807.method465();
				}

				Object var14;
				if (var2 != null) {
					if (var2.anInt1143 == 0) {
						var2.aClass75_1144.method338((int) var2.aLong902, var2.aByteArray1142,
								var2.aByteArray1142.length);
						var1 = aClass115_807;
						synchronized (var1) {
							var2.method501();
						}
					} else if (var2.anInt1143 == 1) {
						var2.aByteArray1142 = var2.aClass75_1144.method337((int) var2.aLong902);
						var1 = aClass115_807;
						synchronized (var1) {
							aClass115_805.method471(var2);
						}
					}

					var14 = anObject806;
					synchronized (var14) {
						if (anInt804 <= 1) {
							anInt804 = 0;
							anObject806.notifyAll();
							return;
						}

						anInt804 = 600;
					}
				} else {
					Class47.method237(100L);
					var14 = anObject806;
					synchronized (var14) {
						if (anInt804 <= 1) {
							anInt804 = 0;
							anObject806.notifyAll();
							return;
						}

						--anInt804;
					}
				}
			}
		} catch (final Exception var13) {
			Class131_Sub20_Sub7.method740((String) null, var13);
		}
	}
}
