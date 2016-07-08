import java.util.Iterator;

public class Class127 implements Iterator {
	Class131 aClass131_888;
	int anInt890;
	Class131 aClass131_891 = null;
	Class125 aClass125_889;

	void method491() {
		aClass131_888 = aClass125_889.aClass131Array883[0].aClass131_903;
		anInt890 = 1;
		aClass131_891 = null;
	}

	@Override
	public Object next() {
		Class131 var1;
		if (aClass131_888 != aClass125_889.aClass131Array883[anInt890 - 1]) {
			var1 = aClass131_888;
			aClass131_888 = var1.aClass131_903;
			aClass131_891 = var1;
			return var1;
		} else {
			do {
				if (anInt890 >= aClass125_889.anInt884)
					return null;

				var1 = aClass125_889.aClass131Array883[anInt890++].aClass131_903;
			} while (var1 == aClass125_889.aClass131Array883[anInt890 - 1]);

			aClass131_888 = var1.aClass131_903;
			aClass131_891 = var1;
			return var1;
		}
	}

	@Override
	public void remove() {
		if (aClass131_891 == null)
			throw new IllegalStateException();
		else {
			aClass131_891.method501();
			aClass131_891 = null;
		}
	}

	@Override
	public boolean hasNext() {
		if (aClass131_888 != aClass125_889.aClass131Array883[anInt890 - 1])
			return true;
		else {
			while (anInt890 < aClass125_889.anInt884) {
				if (aClass125_889.aClass131Array883[anInt890++].aClass131_903 != aClass125_889.aClass131Array883[anInt890
						- 1]) {
					aClass131_888 = aClass125_889.aClass131Array883[anInt890 - 1].aClass131_903;
					return true;
				}

				aClass131_888 = aClass125_889.aClass131Array883[anInt890 - 1];
			}

			return false;
		}
	}

	Class127(final Class125 var1) {
		aClass125_889 = var1;
		method491();
	}
}
