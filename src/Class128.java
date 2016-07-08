import java.util.Iterator;

public class Class128 implements Iterable {
	Class131 aClass131_892 = new Class131();

	@Override
	public Iterator iterator() {
		return new Class110(this);
	}

	public Class128() {
		aClass131_892.aClass131_903 = aClass131_892;
		aClass131_892.aClass131_904 = aClass131_892;
	}

	public Class131 method492() {
		return method493((Class131) null);
	}

	Class131 method493(final Class131 var1) {
		Class131 var2;
		if (var1 != null)
			var2 = var1;
		else
			var2 = aClass131_892.aClass131_903;

		return var2 == aClass131_892 ? null : var2;
	}

	public void method494(final Class131 var1) {
		if (var1.aClass131_904 != null)
			var1.method501();

		var1.aClass131_904 = aClass131_892.aClass131_904;
		var1.aClass131_903 = aClass131_892;
		var1.aClass131_904.aClass131_903 = var1;
		var1.aClass131_903.aClass131_904 = var1;
	}
}
