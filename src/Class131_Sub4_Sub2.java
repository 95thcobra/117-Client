public class Class131_Sub4_Sub2 extends Class131_Sub4 {
	int anInt1624 = -1;
	int anInt1623 = 0;
	Class115 aClass115_1621 = new Class115();
	Class115 aClass115_1622 = new Class115();

	public final synchronized void method833(final Class131_Sub4 var1) {
		var1.method501();
	}

	void method834() {
		if (anInt1623 > 0) {
			for (Class131_Sub3 var1 = (Class131_Sub3) aClass115_1622
					.method465(); var1 != null; var1 = (Class131_Sub3) aClass115_1622.method468())
				var1.anInt992 -= anInt1623;

			anInt1624 -= anInt1623;
			anInt1623 = 0;
		}

	}

	void method835(Class131 var1, final Class131_Sub3 var2) {
		while ((var1 != aClass115_1622.aClass131_843) && (((Class131_Sub3) var1).anInt992 <= var2.anInt992))
			var1 = var1.aClass131_903;

		Class115.method470(var2, var1);
		anInt1624 = ((Class131_Sub3) aClass115_1622.aClass131_843.aClass131_903).anInt992;
	}

	@Override
	protected Class131_Sub4 method539() {
		return (Class131_Sub4) aClass115_1621.method465();
	}

	@Override
	protected Class131_Sub4 method543() {
		return (Class131_Sub4) aClass115_1621.method468();
	}

	void method836(final Class131_Sub3 var1) {
		var1.method501();
		var1.method535();
		final Class131 var2 = aClass115_1622.aClass131_843.aClass131_903;
		if (var2 == aClass115_1622.aClass131_843)
			anInt1624 = -1;
		else
			anInt1624 = ((Class131_Sub3) var2).anInt992;

	}

	void method837(final int[] var1, final int var2, final int var3) {
		for (Class131_Sub4 var4 = (Class131_Sub4) aClass115_1621
				.method465(); var4 != null; var4 = (Class131_Sub4) aClass115_1621.method468())
			var4.method540(var1, var2, var3);

	}

	@Override
	public final synchronized void method542(int var1) {
		do {
			if (anInt1624 < 0) {
				method838(var1);
				return;
			}

			if ((anInt1623 + var1) < anInt1624) {
				anInt1623 += var1;
				method838(var1);
				return;
			}

			final int var2 = anInt1624 - anInt1623;
			method838(var2);
			var1 -= var2;
			anInt1623 += var2;
			method834();
			final Class131_Sub3 var3 = (Class131_Sub3) aClass115_1622.method465();
			synchronized (var3) {
				final int var5 = var3.method536(this);
				if (var5 < 0) {
					var3.anInt992 = 0;
					method836(var3);
				} else {
					var3.anInt992 = var5;
					method835(var3.aClass131_903, var3);
				}
			}
		} while (var1 != 0);

	}

	void method838(final int var1) {
		for (Class131_Sub4 var2 = (Class131_Sub4) aClass115_1621
				.method465(); var2 != null; var2 = (Class131_Sub4) aClass115_1621.method468())
			var2.method542(var1);

	}

	@Override
	public final synchronized void method541(final int[] var1, int var2, int var3) {
		do {
			if (anInt1624 < 0) {
				method837(var1, var2, var3);
				return;
			}

			if ((anInt1623 + var3) < anInt1624) {
				anInt1623 += var3;
				method837(var1, var2, var3);
				return;
			}

			final int var4 = anInt1624 - anInt1623;
			method837(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			anInt1623 += var4;
			method834();
			final Class131_Sub3 var5 = (Class131_Sub3) aClass115_1622.method465();
			synchronized (var5) {
				final int var7 = var5.method536(this);
				if (var7 < 0) {
					var5.anInt992 = 0;
					method836(var5);
				} else {
					var5.anInt992 = var7;
					method835(var5.aClass131_903, var5);
				}
			}
		} while (var3 != 0);

	}

	@Override
	protected int method538() {
		return 0;
	}

	public final synchronized void method839(final Class131_Sub4 var1) {
		aClass115_1621.method464(var1);
	}
}
