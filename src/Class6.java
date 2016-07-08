import java.io.File;

public class Class6 {
	public static File aFile66;
	static int anInt67;
	Class131_Sub20_Sub8[] aClass131_Sub20_Sub8Array64 = new Class131_Sub20_Sub8[100];
	int anInt65;

	Class131_Sub20_Sub8 method30(final int var1) {
		return (var1 >= 0) && (var1 < anInt65) ? aClass131_Sub20_Sub8Array64[var1] : null;
	}

	int method31() {
		return anInt65;
	}

	Class131_Sub20_Sub8 method32(final int var1, final String var2, final String var3, final String var4) {
		Class131_Sub20_Sub8 var5 = aClass131_Sub20_Sub8Array64[99];

		for (int var6 = anInt65; var6 > 0; --var6)
			if (var6 != 100)
				aClass131_Sub20_Sub8Array64[var6] = aClass131_Sub20_Sub8Array64[var6 - 1];

		if (null == var5)
			var5 = new Class131_Sub20_Sub8(var1, var2, var4, var3);
		else {
			var5.method501();
			var5.method677();
			var5.method749(var1, var2, var4, var3);
		}

		aClass131_Sub20_Sub8Array64[0] = var5;
		if (anInt65 < 100)
			++anInt65;

		return var5;
	}
}
