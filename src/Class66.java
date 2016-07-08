import java.util.zip.Inflater;

public class Class66 {
	Inflater anInflater596;

	Class66(final int var1, final int var2, final int var3) {
	}

	public Class66() {
		this(-1, 1000000, 1000000);
	}

	public void method311(final DataBuffer var1, final byte[] var2) {
		if ((var1.data[var1.pos] == 31) && (var1.data[var1.pos + 1] == -117)) {
			if (anInflater596 == null)
				anInflater596 = new Inflater(true);

			try {
				anInflater596.setInput(var1.data, 10 + var1.pos,
						var1.data.length - (10 + var1.pos + 8));
				anInflater596.inflate(var2);
			} catch (final Exception var4) {
				anInflater596.reset();
				throw new RuntimeException("");
			}

			anInflater596.reset();
		} else
			throw new RuntimeException("");
	}

	static void method312(final int var0, final int var1, final int var2, final int var3) {
		for (Class131_Sub6 var4 = (Class131_Sub6) Class131_Sub6.aClass115_1013
				.method465(); var4 != null; var4 = (Class131_Sub6) Class131_Sub6.aClass115_1013.method468())
			if ((var4.anInt1015 != -1) || (var4.anIntArray1019 != null)) {
				int var5 = 0;
				if (var1 > var4.anInt1020)
					var5 += var1 - var4.anInt1020;
				else if (var1 < var4.anInt1010)
					var5 += var4.anInt1010 - var1;

				if (var2 > var4.anInt1021)
					var5 += var2 - var4.anInt1021;
				else if (var2 < var4.anInt1011)
					var5 += var4.anInt1011 - var2;

				if (((var5 - 64) <= var4.anInt1008) && (client.anInt2086 != 0) && (var0 == var4.anInt1009)) {
					var5 -= 64;
					if (var5 < 0)
						var5 = 0;

					final int var6 = ((var4.anInt1008 - var5) * client.anInt2086) / var4.anInt1008;
					if (var4.aClass131_Sub4_Sub1_1016 == null) {
						if (var4.anInt1015 >= 0) {
							final Class8 var10 = Class8.method41(Class78.aClass100_Sub1_648, var4.anInt1015, 0);
							if (var10 != null) {
								final Class131_Sub2_Sub1 var8 = var10.method38()
										.method788(Class131_Sub20_Sub19_Sub5.aClass18_1837);
								final Class131_Sub4_Sub1 var9 = Class131_Sub4_Sub1.method794(var8, 100, var6);
								var9.method802(-1);
								Class61.aClass131_Sub4_Sub2_578.method839(var9);
								var4.aClass131_Sub4_Sub1_1016 = var9;
							}
						}
					} else
						var4.aClass131_Sub4_Sub1_1016.method796(var6);

					if (null == var4.aClass131_Sub4_Sub1_1012) {
						if ((var4.anIntArray1019 != null) && ((var4.anInt1014 -= var3) <= 0)) {
							final int var11 = (int) (Math.random() * var4.anIntArray1019.length);
							final Class8 var12 = Class8.method41(Class78.aClass100_Sub1_648, var4.anIntArray1019[var11],
									0);
							if (null != var12) {
								final Class131_Sub2_Sub1 var13 = var12.method38()
										.method788(Class131_Sub20_Sub19_Sub5.aClass18_1837);
								final Class131_Sub4_Sub1 var7 = Class131_Sub4_Sub1.method794(var13, 100, var6);
								var7.method802(0);
								Class61.aClass131_Sub4_Sub2_578.method839(var7);
								var4.aClass131_Sub4_Sub1_1012 = var7;
								var4.anInt1014 = var4.anInt1017
										+ (int) (Math.random() * (var4.anInt1018 - var4.anInt1017));
							}
						}
					} else {
						var4.aClass131_Sub4_Sub1_1012.method796(var6);
						if (!var4.aClass131_Sub4_Sub1_1012.method500())
							var4.aClass131_Sub4_Sub1_1012 = null;
					}
				} else {
					if (null != var4.aClass131_Sub4_Sub1_1016) {
						Class61.aClass131_Sub4_Sub2_578.method833(var4.aClass131_Sub4_Sub1_1016);
						var4.aClass131_Sub4_Sub1_1016 = null;
					}

					if (null != var4.aClass131_Sub4_Sub1_1012) {
						Class61.aClass131_Sub4_Sub2_578.method833(var4.aClass131_Sub4_Sub1_1012);
						var4.aClass131_Sub4_Sub1_1012 = null;
					}
				}
			}

	}
}
