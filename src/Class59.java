public final class Class59 {
	static PacketDecoder aClass57_567 = new PacketDecoder();

	public static int method283(final byte[] var0, int var1, final byte[] var2, final int var3, final int var4) {
		final PacketDecoder var5 = aClass57_567;
		synchronized (var5) {
			aClass57_567.aByteArray535 = var2;
			aClass57_567.anInt526 = var4;
			aClass57_567.aByteArray524 = var0;
			aClass57_567.anInt518 = 0;
			aClass57_567.anInt519 = var1;
			aClass57_567.anInt515 = 0;
			aClass57_567.anInt523 = 0;
			aClass57_567.anInt514 = 0;
			aClass57_567.anInt520 = 0;
			method290(aClass57_567);
			var1 -= aClass57_567.anInt519;
			aClass57_567.aByteArray535 = null;
			aClass57_567.aByteArray524 = null;
			return var1;
		}
	}

	static byte method284(final PacketDecoder var0) {
		return (byte) method285(1, var0);
	}

	static int method285(final int var0, final PacketDecoder var1) {
		while (var1.anInt515 < var0) {
			var1.anInt523 = (var1.anInt523 << 8) | (var1.aByteArray535[var1.anInt526] & 255);
			var1.anInt515 += 8;
			++var1.anInt526;
			++var1.anInt514;
			if (var1.anInt514 == 0)
				;
		}

		final int var3 = (var1.anInt523 >> (var1.anInt515 - var0)) & ((1 << var0) - 1);
		var1.anInt515 -= var0;
		return var3;
	}

	static void method286(final PacketDecoder var0) {
		var0.anInt530 = 0;

		for (int var1 = 0; var1 < 256; ++var1)
			if (var0.aBoolArray545[var1]) {
				var0.aByteArray533[var0.anInt530] = (byte) var1;
				++var0.anInt530;
			}

	}

	static void method287(final int[] var0, final int[] var1, final int[] var2, final byte[] var3, final int var4,
			final int var5, final int var6) {
		int var7 = 0;

		int var8;
		for (var8 = var4; var8 <= var5; ++var8)
			for (int var9 = 0; var9 < var6; ++var9)
				if (var3[var9] == var8) {
					var2[var7] = var9;
					++var7;
				}

		for (var8 = 0; var8 < 23; ++var8)
			var1[var8] = 0;

		for (var8 = 0; var8 < var6; ++var8)
			++var1[var3[var8] + 1];

		for (var8 = 1; var8 < 23; ++var8)
			var1[var8] += var1[var8 - 1];

		for (var8 = 0; var8 < 23; ++var8)
			var0[var8] = 0;

		int var10 = 0;

		for (var8 = var4; var8 <= var5; ++var8) {
			var10 += var1[var8 + 1] - var1[var8];
			var0[var8] = var10 - 1;
			var10 <<= 1;
		}

		for (var8 = var4 + 1; var8 <= var5; ++var8)
			var1[var8] = ((var0[var8 - 1] + 1) << 1) - var1[var8];

	}

	static byte method288(final PacketDecoder var0) {
		return (byte) method285(8, var0);
	}

	static void method289(final PacketDecoder var0) {
		byte var1 = var0.aByte521;
		int var8 = var0.anInt508;
		int var9 = var0.anInt529;
		int var4 = var0.anInt527;
		final int[] var10 = Class108.anIntArray812;
		int var12 = var0.anInt531;
		final byte[] var5 = var0.aByteArray524;
		int var3 = var0.anInt518;
		int var2 = var0.anInt519;
		final int var7 = var0.anInt542 + 1;

		label113: while (true) {
			if (var8 > 0)
				while (true) {
					if (var2 == 0)
						break label113;

					if (var8 == 1) {
						if (var2 == 0) {
							var8 = 1;
							break label113;
						}

						var5[var3] = var1;
						++var3;
						--var2;
						break;
					}

					var5[var3] = var1;
					--var8;
					++var3;
					--var2;
				}

			boolean var11 = true;

			byte var13;
			while (var11) {
				var11 = false;
				if (var9 == var7) {
					var8 = 0;
					break label113;
				}

				var1 = (byte) var4;
				var12 = var10[var12];
				var13 = (byte) (var12 & 255);
				var12 >>= 8;
				++var9;
				if (var13 != var4) {
					var4 = var13;
					if (var2 == 0) {
						var8 = 1;
						break label113;
					}

					var5[var3] = var1;
					++var3;
					--var2;
					var11 = true;
				} else if (var9 == var7) {
					if (var2 == 0) {
						var8 = 1;
						break label113;
					}

					var5[var3] = var1;
					++var3;
					--var2;
					var11 = true;
				}
			}

			var8 = 2;
			var12 = var10[var12];
			var13 = (byte) (var12 & 255);
			var12 >>= 8;
			++var9;
			if (var9 != var7)
				if (var13 != var4)
					var4 = var13;
				else {
					var8 = 3;
					var12 = var10[var12];
					var13 = (byte) (var12 & 255);
					var12 >>= 8;
					++var9;
					if (var9 != var7)
						if (var13 != var4)
							var4 = var13;
						else {
							var12 = var10[var12];
							var13 = (byte) (var12 & 255);
							var12 >>= 8;
							++var9;
							var8 = (var13 & 255) + 4;
							var12 = var10[var12];
							var4 = (byte) (var12 & 255);
							var12 >>= 8;
							++var9;
						}
				}
		}

		final int var14 = var0.anInt520;
		var0.anInt520 += var2 - var2;
		if (var0.anInt520 < var14)
			;

		var0.aByte521 = var1;
		var0.anInt508 = var8;
		var0.anInt529 = var9;
		var0.anInt527 = var4;
		Class108.anIntArray812 = var10;
		var0.anInt531 = var12;
		var0.aByteArray524 = var5;
		var0.anInt518 = var3;
		var0.anInt519 = var2;
	}

	static void method290(final PacketDecoder var0) {
		int var15 = 0;
		int[] var20 = null;
		int[] var11 = null;
		int[] var16 = null;
		var0.anInt525 = 1;
		if (Class108.anIntArray812 == null)
			Class108.anIntArray812 = new int[var0.anInt525 * 100000];

		boolean var18 = true;

		while (true) {
			while (var18) {
				byte var9 = method288(var0);
				if (var9 == 23)
					return;

				var9 = method288(var0);
				var9 = method288(var0);
				var9 = method288(var0);
				var9 = method288(var0);
				var9 = method288(var0);
				var9 = method288(var0);
				var9 = method288(var0);
				var9 = method288(var0);
				var9 = method288(var0);
				var9 = method284(var0);
				if (var9 != 0)
					;

				var0.anInt516 = 0;
				var9 = method288(var0);
				var0.anInt516 = (var0.anInt516 << 8) | (var9 & 255);
				var9 = method288(var0);
				var0.anInt516 = (var0.anInt516 << 8) | (var9 & 255);
				var9 = method288(var0);
				var0.anInt516 = (var0.anInt516 << 8) | (var9 & 255);

				int var36;
				for (var36 = 0; var36 < 16; ++var36) {
					var9 = method284(var0);
					if (var9 == 1)
						var0.aBoolArray543[var36] = true;
					else
						var0.aBoolArray543[var36] = false;
				}

				for (var36 = 0; var36 < 256; ++var36)
					var0.aBoolArray545[var36] = false;

				int var52;
				for (var36 = 0; var36 < 16; ++var36)
					if (var0.aBoolArray543[var36])
						for (var52 = 0; var52 < 16; ++var52) {
							var9 = method284(var0);
							if (var9 == 1)
								var0.aBoolArray545[(var36 * 16) + var52] = true;
						}

				method286(var0);
				final int var38 = var0.anInt530 + 2;
				final int var39 = method285(3, var0);
				final int var40 = method285(15, var0);

				for (var36 = 0; var36 < var40; ++var36) {
					var52 = 0;

					while (true) {
						var9 = method284(var0);
						if (var9 == 0) {
							var0.aByteArray537[var36] = (byte) var52;
							break;
						}

						++var52;
					}
				}

				final byte[] var22 = new byte[6];

				byte var21;
				for (var21 = 0; var21 < var39; var22[var21] = var21++)
					;

				for (var36 = 0; var36 < var40; ++var36) {
					var21 = var0.aByteArray537[var36];

					byte var17;
					for (var17 = var22[var21]; var21 > 0; --var21)
						var22[var21] = var22[var21 - 1];

					var22[0] = var17;
					var0.aByteArray536[var36] = var17;
				}

				int var37;
				for (var37 = 0; var37 < var39; ++var37) {
					int var51 = method285(5, var0);

					for (var36 = 0; var36 < var38; ++var36)
						while (true) {
							var9 = method284(var0);
							if (var9 == 0) {
								var0.aByteArrayArray522[var37][var36] = (byte) var51;
								break;
							}

							var9 = method284(var0);
							if (var9 == 0)
								++var51;
							else
								--var51;
						}
				}

				for (var37 = 0; var37 < var39; ++var37) {
					byte var26 = 32;
					byte var33 = 0;

					for (var36 = 0; var36 < var38; ++var36) {
						if (var0.aByteArrayArray522[var37][var36] > var33)
							var33 = var0.aByteArrayArray522[var37][var36];

						if (var0.aByteArrayArray522[var37][var36] < var26)
							var26 = var0.aByteArrayArray522[var37][var36];
					}

					method287(var0.anIntArrayArray539[var37], var0.anIntArrayArray532[var37],
							var0.anIntArrayArray540[var37], var0.aByteArrayArray522[var37], var26, var33, var38);
					var0.anIntArray541[var37] = var26;
				}

				final int var41 = var0.anInt530 + 1;
				int var42 = -1;
				byte var43 = 0;

				for (var36 = 0; var36 <= 255; ++var36)
					var0.anIntArray528[var36] = 0;

				int var50 = 4095;

				int var13;
				int var48;
				for (var13 = 15; var13 >= 0; --var13) {
					for (var48 = 15; var48 >= 0; --var48) {
						var0.aByteArray534[var50] = (byte) ((var13 * 16) + var48);
						--var50;
					}

					var0.anIntArray510[var13] = var50 + 1;
				}

				int var46 = 0;
				byte var45;
				if (var43 == 0) {
					++var42;
					var43 = 50;
					var45 = var0.aByteArray536[var42];
					var15 = var0.anIntArray541[var45];
					var20 = var0.anIntArrayArray539[var45];
					var16 = var0.anIntArrayArray540[var45];
					var11 = var0.anIntArrayArray532[var45];
				}

				int var44 = var43 - 1;
				int var54 = var15;

				byte var47;
				int var49;
				for (var49 = method285(var15, var0); var49 > var20[var54]; var49 = (var49 << 1) | var47) {
					++var54;
					var47 = method284(var0);
				}

				int var53 = var16[var49 - var11[var54]];

				while (true) {
					while (var53 != var41)
						if ((var53 != 0) && (var53 != 1)) {
							int var31 = var53 - 1;
							int var27;
							if (var31 < 16) {
								var27 = var0.anIntArray510[0];

								for (var9 = var0.aByteArray534[var27 + var31]; var31 > 3; var31 -= 4) {
									final int var29 = var27 + var31;
									var0.aByteArray534[var29] = var0.aByteArray534[var29 - 1];
									var0.aByteArray534[var29 - 1] = var0.aByteArray534[var29 - 2];
									var0.aByteArray534[var29 - 2] = var0.aByteArray534[var29 - 3];
									var0.aByteArray534[var29 - 3] = var0.aByteArray534[var29 - 4];
								}

								while (var31 > 0) {
									var0.aByteArray534[var27 + var31] = var0.aByteArray534[(var27 + var31) - 1];
									--var31;
								}

								var0.aByteArray534[var27] = var9;
							} else {
								int var34 = var31 / 16;
								final int var32 = var31 % 16;
								var27 = var0.anIntArray510[var34] + var32;

								for (var9 = var0.aByteArray534[var27]; var27 > var0.anIntArray510[var34]; --var27)
									var0.aByteArray534[var27] = var0.aByteArray534[var27 - 1];

								++var0.anIntArray510[var34];

								while (var34 > 0) {
									--var0.anIntArray510[var34];
									var0.aByteArray534[var0.anIntArray510[var34]] = var0.aByteArray534[(var0.anIntArray510[var34
											- 1] + 16) - 1];
									--var34;
								}

								--var0.anIntArray510[0];
								var0.aByteArray534[var0.anIntArray510[0]] = var9;
								if (var0.anIntArray510[0] == 0) {
									var50 = 4095;

									for (var13 = 15; var13 >= 0; --var13) {
										for (var48 = 15; var48 >= 0; --var48) {
											var0.aByteArray534[var50] = var0.aByteArray534[var0.anIntArray510[var13]
													+ var48];
											--var50;
										}

										var0.anIntArray510[var13] = var50 + 1;
									}
								}
							}

							++var0.anIntArray528[var0.aByteArray533[var9 & 255] & 255];
							Class108.anIntArray812[var46] = var0.aByteArray533[var9 & 255] & 255;
							++var46;
							if (var44 == 0) {
								++var42;
								var44 = 50;
								var45 = var0.aByteArray536[var42];
								var15 = var0.anIntArray541[var45];
								var20 = var0.anIntArrayArray539[var45];
								var16 = var0.anIntArrayArray540[var45];
								var11 = var0.anIntArrayArray532[var45];
							}

							--var44;
							var54 = var15;

							for (var49 = method285(var15, var0); var49 > var20[var54]; var49 = (var49 << 1) | var47) {
								++var54;
								var47 = method284(var0);
							}

							var53 = var16[var49 - var11[var54]];
						} else {
							int var55 = -1;
							int var56 = 1;

							do {
								if (var53 == 0)
									var55 += var56;
								else if (var53 == 1)
									var55 += 2 * var56;

								var56 *= 2;
								if (var44 == 0) {
									++var42;
									var44 = 50;
									var45 = var0.aByteArray536[var42];
									var15 = var0.anIntArray541[var45];
									var20 = var0.anIntArrayArray539[var45];
									var16 = var0.anIntArrayArray540[var45];
									var11 = var0.anIntArrayArray532[var45];
								}

								--var44;
								var54 = var15;

								for (var49 = method285(var15, var0); var49 > var20[var54]; var49 = (var49 << 1)
										| var47) {
									++var54;
									var47 = method284(var0);
								}

								var53 = var16[var49 - var11[var54]];
							} while ((var53 == 0) || (var53 == 1));

							++var55;
							var9 = var0.aByteArray533[var0.aByteArray534[var0.anIntArray510[0]] & 255];

							for (var0.anIntArray528[var9 & 255] += var55; var55 > 0; --var55) {
								Class108.anIntArray812[var46] = var9 & 255;
								++var46;
							}
						}

					var0.anInt508 = 0;
					var0.aByte521 = 0;
					var0.anIntArray538[0] = 0;

					for (var36 = 1; var36 <= 256; ++var36)
						var0.anIntArray538[var36] = var0.anIntArray528[var36 - 1];

					for (var36 = 1; var36 <= 256; ++var36)
						var0.anIntArray538[var36] += var0.anIntArray538[var36 - 1];

					for (var36 = 0; var36 < var46; ++var36) {
						var9 = (byte) (Class108.anIntArray812[var36] & 255);
						Class108.anIntArray812[var0.anIntArray538[var9 & 255]] |= var36 << 8;
						++var0.anIntArray538[var9 & 255];
					}

					var0.anInt531 = Class108.anIntArray812[var0.anInt516] >> 8;
					var0.anInt529 = 0;
					var0.anInt531 = Class108.anIntArray812[var0.anInt531];
					var0.anInt527 = (byte) (var0.anInt531 & 255);
					var0.anInt531 >>= 8;
					++var0.anInt529;
					var0.anInt542 = var46;
					method289(var0);
					if ((var0.anInt529 == (var0.anInt542 + 1)) && (var0.anInt508 == 0)) {
						var18 = true;
						break;
					}

					var18 = false;
					break;
				}
			}

			return;
		}
	}
}
