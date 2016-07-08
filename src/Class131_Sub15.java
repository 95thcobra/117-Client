public class Class131_Sub15 extends Class131 {
	byte[] aByteArray1122;
	Class114 aClass114_1121;

	Class131_Sub15(final DataBuffer var1) {
		var1.pos = var1.data.length - 3;
		final int var21 = var1.method595();
		final int var4 = var1.readUShort();
		int var19 = 14 + (var21 * 10);
		var1.pos = 0;
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		int var24 = 0;
		int var13 = 0;

		int var3;
		int var20;
		int var30;
		for (var30 = 0; var30 < var21; ++var30) {
			var20 = -1;

			while (true) {
				var3 = var1.method595();
				if (var3 != var20)
					++var19;

				var20 = var3 & 15;
				if (var3 == 7)
					break;

				if (var3 == 23)
					++var6;
				else if (var20 == 0)
					++var8;
				else if (var20 == 1)
					++var9;
				else if (var20 == 2)
					++var7;
				else if (var20 == 3)
					++var10;
				else if (var20 == 4)
					++var11;
				else if (var20 == 5)
					++var24;
				else {
					if (var20 != 6)
						throw new RuntimeException();

					++var13;
				}
			}
		}

		var19 += 5 * var6;
		var19 += 2 * (var8 + var9 + var7 + var10 + var24);
		var19 += var11 + var13;
		var30 = var1.pos;
		var20 = var21 + var6 + var7 + var8 + var9 + var10 + var11 + var24 + var13;

		for (var3 = 0; var3 < var20; ++var3)
			var1.method607();

		var19 += var1.pos - var30;
		var3 = var1.pos;
		int var5 = 0;
		int var40 = 0;
		int var43 = 0;
		int var46 = 0;
		int var35 = 0;
		int var36 = 0;
		int var23 = 0;
		int var27 = 0;
		int var32 = 0;
		int var37 = 0;
		int var38 = 0;
		int var33 = 0;
		int var14 = 0;

		int var12;
		for (var12 = 0; var12 < var7; ++var12) {
			var14 = (var14 + var1.method595()) & 127;
			if ((var14 != 0) && (var14 != 32)) {
				if (var14 == 1)
					++var5;
				else if (var14 == 33)
					++var40;
				else if (var14 == 7)
					++var43;
				else if (var14 == 39)
					++var46;
				else if (var14 == 10)
					++var35;
				else if (var14 == 42)
					++var36;
				else if (var14 == 99)
					++var23;
				else if (var14 == 98)
					++var27;
				else if (var14 == 101)
					++var32;
				else if (var14 == 100)
					++var37;
				else if ((var14 != 64) && (var14 != 65) && (var14 != 120) && (var14 != 121) && (var14 != 123))
					++var33;
				else
					++var38;
			} else
				++var13;
		}

		var12 = 0;
		int var47 = var1.pos;
		var1.pos += var38;
		int var48 = var1.pos;
		var1.pos += var24;
		int var34 = var1.pos;
		var1.pos += var11;
		int var31 = var1.pos;
		var1.pos += var10;
		int var60 = var1.pos;
		var1.pos += var5;
		int var28 = var1.pos;
		var1.pos += var43;
		int var2 = var1.pos;
		var1.pos += var35;
		int var53 = var1.pos;
		var1.pos += var8 + var9 + var24;
		int var42 = var1.pos;
		var1.pos += var8;
		int var55 = var1.pos;
		var1.pos += var33;
		int var56 = var1.pos;
		var1.pos += var9;
		int var57 = var1.pos;
		var1.pos += var40;
		int var66 = var1.pos;
		var1.pos += var46;
		int var64 = var1.pos;
		var1.pos += var36;
		int var17 = var1.pos;
		var1.pos += var13;
		int var26 = var1.pos;
		var1.pos += var10;
		int var50 = var1.pos;
		var1.pos += var23;
		int var44 = var1.pos;
		var1.pos += var27;
		int var51 = var1.pos;
		var1.pos += var32;
		int var52 = var1.pos;
		var1.pos += var37;
		int var59 = var1.pos;
		var1.pos += var6 * 3;
		aByteArray1122 = new byte[var19];
		final DataBuffer var16 = new DataBuffer(aByteArray1122);
		var16.writeInt(1297377380);
		var16.writeInt(6);
		var16.method586(var21 > 1 ? 1 : 0);
		var16.method586(var21);
		var16.method586(var4);
		var1.pos = var30;
		int var22 = 0;
		int var18 = 0;
		int var41 = 0;
		int var39 = 0;
		int var25 = 0;
		int var65 = 0;
		int var49 = 0;
		final int[] var61 = new int[128];
		var14 = 0;

		label367: for (int var45 = 0; var45 < var21; ++var45) {
			var16.writeInt(1297379947);
			var16.pos += 4;
			final int var63 = var16.pos;
			int var15 = -1;

			while (true)
				while (true) {
					final int var62 = var1.method607();
					var16.method594(var62);
					final int var58 = var1.data[var12++] & 255;
					final boolean var54 = var58 != var15;
					var15 = var58 & 15;
					if (var58 == 7) {
						if (var54)
							var16.writeByte(255);

						var16.writeByte(47);
						var16.writeByte(0);
						var16.method640(var16.pos - var63);
						continue label367;
					}

					if (var58 == 23) {
						if (var54)
							var16.writeByte(255);

						var16.writeByte(81);
						var16.writeByte(3);
						var16.writeByte(var1.data[var59++]);
						var16.writeByte(var1.data[var59++]);
						var16.writeByte(var1.data[var59++]);
					} else {
						var22 ^= var58 >> 4;
						if (var15 == 0) {
							if (var54)
								var16.writeByte(144 + var22);

							var18 += var1.data[var53++];
							var41 += var1.data[var42++];
							var16.writeByte(var18 & 127);
							var16.writeByte(var41 & 127);
						} else if (var15 == 1) {
							if (var54)
								var16.writeByte(128 + var22);

							var18 += var1.data[var53++];
							var39 += var1.data[var56++];
							var16.writeByte(var18 & 127);
							var16.writeByte(var39 & 127);
						} else if (var15 == 2) {
							if (var54)
								var16.writeByte(176 + var22);

							var14 = (var14 + var1.data[var3++]) & 127;
							var16.writeByte(var14);
							byte var29;
							if ((var14 != 0) && (var14 != 32)) {
								if (var14 == 1)
									var29 = var1.data[var60++];
								else if (var14 == 33)
									var29 = var1.data[var57++];
								else if (var14 == 7)
									var29 = var1.data[var28++];
								else if (var14 == 39)
									var29 = var1.data[var66++];
								else if (var14 == 10)
									var29 = var1.data[var2++];
								else if (var14 == 42)
									var29 = var1.data[var64++];
								else if (var14 == 99)
									var29 = var1.data[var50++];
								else if (var14 == 98)
									var29 = var1.data[var44++];
								else if (var14 == 101)
									var29 = var1.data[var51++];
								else if (var14 == 100)
									var29 = var1.data[var52++];
								else if ((var14 != 64) && (var14 != 65) && (var14 != 120) && (var14 != 121)
										&& (var14 != 123))
									var29 = var1.data[var55++];
								else
									var29 = var1.data[var47++];
							} else
								var29 = var1.data[var17++];

							final int var67 = var29 + var61[var14];
							var61[var14] = var67;
							var16.writeByte(var67 & 127);
						} else if (var15 == 3) {
							if (var54)
								var16.writeByte(224 + var22);

							var25 += var1.data[var26++];
							var25 += var1.data[var31++] << 7;
							var16.writeByte(var25 & 127);
							var16.writeByte((var25 >> 7) & 127);
						} else if (var15 == 4) {
							if (var54)
								var16.writeByte(208 + var22);

							var65 += var1.data[var34++];
							var16.writeByte(var65 & 127);
						} else if (var15 == 5) {
							if (var54)
								var16.writeByte(160 + var22);

							var18 += var1.data[var53++];
							var49 += var1.data[var48++];
							var16.writeByte(var18 & 127);
							var16.writeByte(var49 & 127);
						} else {
							if (var15 != 6)
								throw new RuntimeException();

							if (var54)
								var16.writeByte(192 + var22);

							var16.writeByte(var1.data[var17++]);
						}
					}
				}
		}

	}

	void method647() {
		if (aClass114_1121 == null) {
			aClass114_1121 = new Class114(16);
			final int[] var2 = new int[16];
			final int[] var1 = new int[16];
			var1[9] = 128;
			var2[9] = 128;
			final Class111 var6 = new Class111(aByteArray1122);
			final int var9 = var6.method442();

			int var7;
			for (var7 = 0; var7 < var9; ++var7) {
				var6.method446(var7);
				var6.method440(var7);
				var6.method438(var7);
			}

			label80: do
				while (true) {
					var7 = var6.method450();
					final int var8 = var6.anIntArray824[var7];

					while (var6.anIntArray824[var7] == var8) {
						var6.method446(var7);
						final int var3 = var6.method441(var7);
						if (var3 == 1) {
							var6.method439();
							var6.method438(var7);
							continue label80;
						}

						final int var13 = var3 & 240;
						int var4;
						int var12;
						int var14;
						if (var13 == 176) {
							var14 = var3 & 15;
							var12 = (var3 >> 8) & 127;
							var4 = (var3 >> 16) & 127;
							if (var12 == 0)
								var2[var14] = (var2[var14] & -2080769) + (var4 << 14);

							if (var12 == 32)
								var2[var14] = (var2[var14] & -16257) + (var4 << 7);
						}

						if (var13 == 192) {
							var14 = var3 & 15;
							var12 = (var3 >> 8) & 127;
							var1[var14] = var2[var14] + var12;
						}

						if (var13 == 144) {
							var14 = var3 & 15;
							var12 = (var3 >> 8) & 127;
							var4 = (var3 >> 16) & 127;
							if (var4 > 0) {
								final int var10 = var1[var14];
								Class131_Sub23 var11 = (Class131_Sub23) aClass114_1121.method457(var10);
								if (var11 == null) {
									var11 = new Class131_Sub23(new byte[128]);
									aClass114_1121.method461(var11, var10);
								}

								var11.aByteArray1342[var12] = 1;
							}
						}

						var6.method440(var7);
						var6.method438(var7);
					}
				}
			while (!var6.method444());

		}
	}

	void method648() {
		aClass114_1121 = null;
	}

	public static Class131_Sub15 method649(final Class100 var0, final int var1, final int var2) {
		final byte[] var3 = var0.method402(var1, var2);
		return var3 == null ? null : new Class131_Sub15(new DataBuffer(var3));
	}
}
