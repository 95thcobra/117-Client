import java.awt.Component;

public class Class17_Sub1 extends Class17 {
	static Interface2 anInterface2_990;
	int anInt989;

	@Override
	void method71(final Component var1) throws Exception {
		anInterface2_990.method6(var1, anInt162, aBool166);
	}

	@Override
	int method80() {
		return anInterface2_990.method5();
	}

	@Override
	void method79() {
		anInterface2_990.method3();
	}

	@Override
	void method78() {
		anInterface2_990.method1();
	}

	@Override
	void method72(final int var1) throws Exception {
		if (var1 > '\u8000')
			throw new IllegalArgumentException();
		else {
			anInterface2_990.method2();
		}
	}

	@Override
	void method73() {
		anInterface2_990.method4(anInt989, anIntArray158);
	}

	Class17_Sub1(final Class78 var1, final int var2) {
		anInterface2_990 = var1.method350();
		anInt989 = var2;
	}
}
