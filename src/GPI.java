public class GPI {
	static Class131_Sub20_Sub17_Sub4_Sub1 aClass131_Sub20_Sub17_Sub4_Sub1_15;
	static byte[] skipFlags = new byte[2048];
	static byte[] aByteArray22 = new byte[2048];
	static DataBuffer[] cachedAppearances = new DataBuffer[2048];
	static int anInt11 = 0;
	static int[] anIntArray17 = new int[2048];
	static int globalPlayerCount = 0;
	static int[] globalPlayerIndices = new int[2048];
	static int[] cachedRegions = new int[2048];
	static int[] cachedDirections = new int[2048];
	static int[] cachedIndices = new int[2048];
	static int anInt21 = 0;
	static int[] anIntArray23 = new int[2048];
	static DataBuffer aClass131_Sub14_14 = new DataBuffer(new byte[5000]);

	static final void method22(final Class131_Sub18[] var0, final int var1) {
		for (final Class131_Sub18 var4 : var0) {
			if (null != var4) {
				if (var4.anInt1202 == 0) {
					if (var4.aClass131_Sub18Array1171 != null)
						method22(var4.aClass131_Sub18Array1171, var1);

					final Class131_Sub7 var3 = (Class131_Sub7) client.aClass114_2184.method457(var4.anInt1272);
					if (null != var3)
						Class131_Sub20_Sub19_Sub2_Sub1.method1065(var3.anInt1025, var1);
				}

				Class131_Sub10 var5;
				if ((var1 == 0) && (null != var4.anObjectArray1232)) {
					var5 = new Class131_Sub10();
					var5.aClass131_Sub18_1057 = var4;
					var5.anObjectArray1056 = var4.anObjectArray1232;
					NpcFlags.method24(var5, 200000);
				}

				if ((var1 == 1) && (var4.anObjectArray1265 != null)) {
					if (var4.anInt1159 >= 0) {
						final Class131_Sub18 var6 = Class88.method377(var4.anInt1272);
						if ((null == var6) || (var6.aClass131_Sub18Array1171 == null)
								|| (var4.anInt1159 >= var6.aClass131_Sub18Array1171.length)
								|| (var4 != var6.aClass131_Sub18Array1171[var4.anInt1159]))
							continue;
					}

					var5 = new Class131_Sub10();
					var5.aClass131_Sub18_1057 = var4;
					var5.anObjectArray1056 = var4.anObjectArray1265;
					NpcFlags.method24(var5, 200000);
				}
			}
		}

	}

	static final void thisIsActuallyMapRegion(final boolean instance) {
		client.aBool2088 = instance;
		int var1;
		int var2;
		int var3;
		int mapX;
		int mapZ;
		int var6;
		int var8;
		if (!client.aBool2088) {
			mapX = client.gameBuffer.readULEShortA();
			System.out.println("MapX:"+mapX);
			mapZ = client.gameBuffer.readUshortA();
			System.out.println("MapZ:"+mapZ);	
			var1 = client.gameBuffer.readUShort();
			System.out.println("var1:"+var1);//xtea count
			
			
			Class131_Sub20_Sub19_Sub2.anIntArrayArray1743 = new int[var1][4];

			// Xteas
			for (var6 = 0; var6 < var1; ++var6) {
				for (var2 = 0; var2 < 4; ++var2) {
					Class131_Sub20_Sub19_Sub2.anIntArrayArray1743[var6][var2] = client.gameBuffer.readIntV1();
					System.out.println("xtea:"+Class131_Sub20_Sub19_Sub2.anIntArrayArray1743[var6][var2]);
				}
			}

			Class131_Sub9.anIntArray1054 = new int[var1];
			Class103.anIntArray798 = new int[var1];
			Class131_Sub20_Sub21.anIntArray1655 = new int[var1];
			Class77.aByteArrayArray636 = new byte[var1][];
			Class28.aByteArrayArray261 = new byte[var1][];

			boolean var13 = false;
			if ((((mapX / 8) == 48) || ((mapX / 8) == 49)) && ((mapZ / 8) == 48))
				var13 = true;

			if (((mapX / 8) == 48) && ((mapZ / 8) == 148))
				var13 = true;

			var1 = 0;

			for (var2 = (mapX - 6) / 8; var2 <= ((mapX + 6) / 8); ++var2)
				for (var3 = (mapZ - 6) / 8; var3 <= ((6 + mapZ) / 8); ++var3) {
					var8 = var3 + (var2 << 8);
					if (!var13 || ((var3 != 49) && (var3 != 149) && (var3 != 147) && (var2 != 50)
							&& ((var2 != 49) || (var3 != 47)))) {
						Class131_Sub9.anIntArray1054[var1] = var8;
						Class103.anIntArray798[var1] = Class29.aClass100_Sub1_268.method413("m" + var2 + "_" + var3);
						Class131_Sub20_Sub21.anIntArray1655[var1] = Class29.aClass100_Sub1_268.method413("l" + var2 + "_" + var3);
						++var1;
					}
				}

			Class32.method144(mapX, mapZ);
		} else {
			mapX = client.gameBuffer.readUShort();
			mapZ = client.gameBuffer.readUShort();
			var1 = client.gameBuffer.readUShort();
			client.gameBuffer.bitAccess();

			for (var6 = 0; var6 < 4; ++var6)
				for (var2 = 0; var2 < 13; ++var2)
					for (var3 = 0; var3 < 13; ++var3) {
						var8 = client.gameBuffer.getBits(1);
						if (var8 == 1)
							client.anIntArrayArrayArray2089[var6][var2][var3] = client.gameBuffer.getBits(26);
						else
							client.anIntArrayArrayArray2089[var6][var2][var3] = -1;
					}

			client.gameBuffer.method876();
			Class131_Sub20_Sub19_Sub2.anIntArrayArray1743 = new int[var1][4];

			for (var6 = 0; var6 < var1; ++var6)
				for (var2 = 0; var2 < 4; ++var2)
					Class131_Sub20_Sub19_Sub2.anIntArrayArray1743[var6][var2] = client.gameBuffer.readIntV1();

			Class131_Sub9.anIntArray1054 = new int[var1];
			Class103.anIntArray798 = new int[var1];
			Class131_Sub20_Sub21.anIntArray1655 = new int[var1];
			Class77.aByteArrayArray636 = new byte[var1][];
			Class28.aByteArrayArray261 = new byte[var1][];
			var1 = 0;

			for (var6 = 0; var6 < 4; ++var6)
				for (var2 = 0; var2 < 13; ++var2)
					for (var3 = 0; var3 < 13; ++var3) {
						var8 = client.anIntArrayArrayArray2089[var6][var2][var3];
						if (var8 != -1) {
							final int var11 = (var8 >> 14) & 1023;
							final int var12 = (var8 >> 3) & 2047;
							int var9 = ((var11 / 8) << 8) + (var12 / 8);

							int var7;
							for (var7 = 0; var7 < var1; ++var7)
								if (var9 == Class131_Sub9.anIntArray1054[var7]) {
									var9 = -1;
									break;
								}

							if (var9 != -1) {
								Class131_Sub9.anIntArray1054[var1] = var9;
								var7 = (var9 >> 8) & 255;
								final int var10 = var9 & 255;
								Class103.anIntArray798[var1] = Class29.aClass100_Sub1_268
										.method413("m" + var7 + "_" + var10);
								Class131_Sub20_Sub21.anIntArray1655[var1] = Class29.aClass100_Sub1_268
										.method413("l" + var7 + "_" + var10);
								++var1;
							}
						}
					}

			Class32.method144(mapX, mapZ);
		}

	}
}
