public final class Class131_Sub12 extends Class131 {
	int anInt1075;
	Class131_Sub12 aClass131_Sub12_1076;
	boolean aBool1079;
	Class37 aClass37_1080;
	Class25 aClass25_1081;
	Class38 aClass38_1082;
	int anInt1083;
	Class31 aClass31_1084;
	Class22 aClass22_1085;
	Class29 aClass29_1089;
	boolean aBool1090;
	boolean aBool1091;
	int anInt1092;
	int anInt1093;
	int anInt1094;
	public static int anInt1095;
	int anInt1097;
	static int anInt1099;
	Class47[] aClass47Array1086 = new Class47[5];
	int[] anIntArray1087 = new int[5];
	int anInt1088 = 0;
	int anInt1077;
	int anInt1078;
	int anInt1098;
	int anInt1096;

	Class131_Sub12(final int var1, final int var2, final int var3) {
		anInt1078 = anInt1077 = var1;
		anInt1098 = var2;
		anInt1096 = var3;
	}

	public static void method577() {
		Class91.aClass121_739.method481();
	}

	static final int method578(final Class131_Sub18 var0, final int var1) {
		if ((var0.anIntArrayArray1269 != null) && (var1 < var0.anIntArrayArray1269.length))
			try {
				final int[] var2 = var0.anIntArrayArray1269[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					final int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0)
						return var3;

					if (var6 == 1)
						var7 = client.anIntArray2161[var2[var4++]];

					if (var6 == 2)
						var7 = client.anIntArray2162[var2[var4++]];

					if (var6 == 3)
						var7 = client.anIntArray2163[var2[var4++]];

					int var9;
					Class131_Sub18 var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = Class88.method377(var9);
						var11 = var2[var4++];
						if ((var11 != -1)
								&& (!Class79_Sub1.method645(var11, (short) 18781).aBool1403 || client.aBool2147))
							for (var12 = 0; var12 < var10.anIntArray1292.length; ++var12)
								if ((var11 + 1) == var10.anIntArray1292[var12])
									var7 += var10.anIntArray1154[var12];
					}

					if (var6 == 5)
						var7 = Class96.anIntArray766[var2[var4++]];

					if (var6 == 6)
						var7 = Class90.anIntArray728[client.anIntArray2162[var2[var4++]] - 1];

					if (var6 == 7)
						var7 = (Class96.anIntArray766[var2[var4++]] * 100) / '\ub71b';

					if (var6 == 8)
						var7 = Class131_Sub11.myPlayer.anInt1984;

					if (var6 == 9)
						for (var9 = 0; var9 < 25; ++var9)
							if (Class90.aBoolArray727[var9])
								var7 += client.anIntArray2162[var9];

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = Class88.method377(var9);
						var11 = var2[var4++];
						if ((var11 != -1)
								&& (!Class79_Sub1.method645(var11, (short) 15090).aBool1403 || client.aBool2147))
							for (var12 = 0; var12 < var10.anIntArray1292.length; ++var12)
								if ((1 + var11) == var10.anIntArray1292[var12]) {
									var7 = 999999999;
									break;
								}
					}

					if (var6 == 11)
						var7 = client.anInt2188;

					if (var6 == 12)
						var7 = client.anInt2189;

					if (var6 == 13) {
						var9 = Class96.anIntArray766[var2[var4++]];
						final int var13 = var2[var4++];
						var7 = (var9 & (1 << var13)) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = Class84.method369(var9, 1563638628);
					}

					if (var6 == 15)
						var8 = 1;

					if (var6 == 16)
						var8 = 2;

					if (var6 == 17)
						var8 = 3;

					if (var6 == 18)
						var7 = Class131_Sub20_Sub20.anInt1649
								+ (Class131_Sub11.myPlayer.anInt1718 >> 7);

					if (var6 == 19)
						var7 = (Class131_Sub11.myPlayer.anInt1759 >> 7) + Class50.anInt491;

					if (var6 == 20)
						var7 = var2[var4++];

					if (var8 == 0) {
						if (var5 == 0)
							var3 += var7;

						if (var5 == 1)
							var3 -= var7;

						if ((var5 == 2) && (var7 != 0))
							var3 /= var7;

						if (var5 == 3)
							var3 *= var7;

						var5 = 0;
					} else
						var5 = var8;
				}
			} catch (final Exception var14) {
				return -1;
			}
		else
			return -2;
	}
}
