public class Class131_Sub16 extends Class131 {
	int[] anIntArray1140 = new int[128];
	Class131_Sub2_Sub1[] aClass131_Sub2_Sub1Array1135 = new Class131_Sub2_Sub1[128];
	short[] aShortArray1138 = new short[128];
	byte[] aByteArray1136 = new byte[128];
	byte[] aByteArray1137 = new byte[128];
	Class118[] aClass118Array1134 = new Class118[128];
	byte[] aByteArray1141 = new byte[128];
	int anInt1139;

	void method658() {
		anIntArray1140 = null;
	}

	Class131_Sub16(final byte[] var1) {
		final DataBuffer var3 = new DataBuffer(var1);

		int var4;
		for (var4 = 0; var3.data[var3.pos + var4] != 0; ++var4)
			;

		final byte[] var5 = new byte[var4];

		int var6;
		for (var6 = 0; var6 < var4; ++var6)
			var5[var6] = var3.readByte();

		++var3.pos;
		++var4;
		var6 = var3.pos;
		var3.pos += var4;

		int var7;
		for (var7 = 0; var3.data[var3.pos + var7] != 0; ++var7)
			;

		final byte[] var12 = new byte[var7];

		int var13;
		for (var13 = 0; var13 < var7; ++var13)
			var12[var13] = var3.readByte();

		++var3.pos;
		++var7;
		var13 = var3.pos;
		var3.pos += var7;

		int var18;
		for (var18 = 0; var3.data[var18 + var3.pos] != 0; ++var18)
			;

		final byte[] var10 = new byte[var18];

		for (int var11 = 0; var11 < var18; ++var11)
			var10[var11] = var3.readByte();

		++var3.pos;
		++var18;
		final byte[] var22 = new byte[var18];
		int var23;
		int var24;
		if (var18 > 1) {
			var22[1] = 1;
			int var28 = 1;
			var23 = 2;

			for (var24 = 2; var24 < var18; ++var24) {
				int var25 = var3.readUByte();
				if (var25 == 0)
					var28 = var23++;
				else {
					if (var25 <= var28)
						--var25;

					var28 = var25;
				}

				var22[var24] = (byte) var28;
			}
		} else
			var23 = var18;

		final Class118[] var29 = new Class118[var23];

		Class118 var19;
		for (var24 = 0; var24 < var29.length; ++var24) {
			var19 = var29[var24] = new Class118();
			int var30 = var3.readUByte();
			if (var30 > 0)
				var19.aByteArray855 = new byte[var30 * 2];

			var30 = var3.readUByte();
			if (var30 > 0) {
				var19.aByteArray847 = new byte[(var30 * 2) + 2];
				var19.aByteArray847[1] = 64;
			}
		}

		var24 = var3.readUByte();
		final byte[] var44 = var24 > 0 ? new byte[2 * var24] : null;
		var24 = var3.readUByte();
		final byte[] var31 = var24 > 0 ? new byte[var24 * 2] : null;

		int var32;
		for (var32 = 0; var3.data[var3.pos + var32] != 0; ++var32)
			;

		final byte[] var33 = new byte[var32];

		int var2;
		for (var2 = 0; var2 < var32; ++var2)
			var33[var2] = var3.readByte();

		++var3.pos;
		++var32;
		var2 = 0;

		int var34;
		for (var34 = 0; var34 < 128; ++var34) {
			var2 += var3.readUByte();
			aShortArray1138[var34] = (short) var2;
		}

		var2 = 0;

		for (var34 = 0; var34 < 128; ++var34) {
			var2 += var3.readUByte();
			aShortArray1138[var34] = (short) (aShortArray1138[var34] + (var2 << 8));
		}

		var34 = 0;
		int var37 = 0;
		int var35 = 0;

		int var21;
		for (var21 = 0; var21 < 128; ++var21) {
			if (var34 == 0) {
				if (var37 < var33.length)
					var34 = var33[var37++];
				else
					var34 = -1;

				var35 = var3.method607();
			}

			aShortArray1138[var21] = (short) (aShortArray1138[var21] + (((var35 - 1) & 2) << 14));
			anIntArray1140[var21] = var35;
			--var34;
		}

		var34 = 0;
		var37 = 0;
		var21 = 0;

		int var38;
		for (var38 = 0; var38 < 128; ++var38)
			if (anIntArray1140[var38] != 0) {
				if (var34 == 0) {
					if (var37 < var5.length)
						var34 = var5[var37++];
					else
						var34 = -1;

					var21 = var3.data[var6++] - 1;
				}

				aByteArray1141[var38] = (byte) var21;
				--var34;
			}

		var34 = 0;
		var37 = 0;
		var38 = 0;

		for (int var40 = 0; var40 < 128; ++var40)
			if (anIntArray1140[var40] != 0) {
				if (var34 == 0) {
					if (var37 < var12.length)
						var34 = var12[var37++];
					else
						var34 = -1;

					var38 = (var3.data[var13++] + 16) << 2;
				}

				aByteArray1137[var40] = (byte) var38;
				--var34;
			}

		var34 = 0;
		var37 = 0;
		Class118 var9 = null;

		int var8;
		for (var8 = 0; var8 < 128; ++var8)
			if (anIntArray1140[var8] != 0) {
				if (var34 == 0) {
					var9 = var29[var22[var37]];
					if (var37 < var10.length)
						var34 = var10[var37++];
					else
						var34 = -1;
				}

				aClass118Array1134[var8] = var9;
				--var34;
			}

		var34 = 0;
		var37 = 0;
		var8 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			if (var34 == 0) {
				if (var37 < var33.length)
					var34 = var33[var37++];
				else
					var34 = -1;

				if (anIntArray1140[var20] > 0)
					var8 = var3.readUByte() + 1;
			}

			aByteArray1136[var20] = (byte) var8;
			--var34;
		}

		anInt1139 = var3.readUByte() + 1;

		int var14;
		Class118 var15;
		for (var20 = 0; var20 < var23; ++var20) {
			var15 = var29[var20];
			if (var15.aByteArray855 != null)
				for (var14 = 1; var14 < var15.aByteArray855.length; var14 += 2)
					var15.aByteArray855[var14] = var3.readByte();

			if (var15.aByteArray847 != null)
				for (var14 = 3; var14 < (var15.aByteArray847.length - 2); var14 += 2)
					var15.aByteArray847[var14] = var3.readByte();
		}

		if (null != var44)
			for (var20 = 1; var20 < var44.length; var20 += 2)
				var44[var20] = var3.readByte();

		if (null != var31)
			for (var20 = 1; var20 < var31.length; var20 += 2)
				var31[var20] = var3.readByte();

		for (var20 = 0; var20 < var23; ++var20) {
			var15 = var29[var20];
			if (null != var15.aByteArray847) {
				var2 = 0;

				for (var14 = 2; var14 < var15.aByteArray847.length; var14 += 2) {
					var2 = var2 + 1 + var3.readUByte();
					var15.aByteArray847[var14] = (byte) var2;
				}
			}
		}

		for (var20 = 0; var20 < var23; ++var20) {
			var15 = var29[var20];
			if (var15.aByteArray855 != null) {
				var2 = 0;

				for (var14 = 2; var14 < var15.aByteArray855.length; var14 += 2) {
					var2 = var2 + 1 + var3.readUByte();
					var15.aByteArray855[var14] = (byte) var2;
				}
			}
		}

		int var16;
		int var17;
		byte var26;
		int var36;
		int var41;
		int var43;
		byte var45;
		int var46;
		if (null != var44) {
			var2 = var3.readUByte();
			var44[0] = (byte) var2;

			for (var20 = 2; var20 < var44.length; var20 += 2) {
				var2 = 1 + var2 + var3.readUByte();
				var44[var20] = (byte) var2;
			}

			var45 = var44[0];
			byte var39 = var44[1];

			for (var14 = 0; var14 < var45; ++var14)
				aByteArray1136[var14] = (byte) (((aByteArray1136[var14] * var39) + 32) >> 6);

			for (var14 = 2; var14 < var44.length; var14 += 2) {
				var26 = var44[var14];
				final byte var27 = var44[var14 + 1];
				var41 = (var39 * (var26 - var45)) + ((var26 - var45) / 2);

				for (var36 = var45; var36 < var26; ++var36) {
					var43 = var26 - var45;
					var17 = var41 >>> 31;
					var16 = ((var41 + var17) / var43) - var17;
					aByteArray1136[var36] = (byte) ((32 + (aByteArray1136[var36] * var16)) >> 6);
					var41 += var27 - var39;
				}

				var45 = var26;
				var39 = var27;
			}

			for (var46 = var45; var46 < 128; ++var46)
				aByteArray1136[var46] = (byte) ((32 + (var39 * aByteArray1136[var46])) >> 6);

			var19 = null;
		}

		if (var31 != null) {
			var2 = var3.readUByte();
			var31[0] = (byte) var2;

			for (var20 = 2; var20 < var31.length; var20 += 2) {
				var2 = 1 + var2 + var3.readUByte();
				var31[var20] = (byte) var2;
			}

			var45 = var31[0];
			int var49 = var31[1] << 1;

			for (var14 = 0; var14 < var45; ++var14) {
				var46 = var49 + (aByteArray1137[var14] & 255);
				if (var46 < 0)
					var46 = 0;

				if (var46 > 128)
					var46 = 128;

				aByteArray1137[var14] = (byte) var46;
			}

			int var47;
			for (var14 = 2; var14 < var31.length; var14 += 2) {
				var26 = var31[var14];
				var47 = var31[var14 + 1] << 1;
				var41 = ((var26 - var45) / 2) + ((var26 - var45) * var49);

				for (var36 = var45; var36 < var26; ++var36) {
					var43 = var26 - var45;
					var17 = var41 >>> 31;
					var16 = ((var17 + var41) / var43) - var17;
					int var42 = (aByteArray1137[var36] & 255) + var16;
					if (var42 < 0)
						var42 = 0;

					if (var42 > 128)
						var42 = 128;

					aByteArray1137[var36] = (byte) var42;
					var41 += var47 - var49;
				}

				var45 = var26;
				var49 = var47;
			}

			for (var46 = var45; var46 < 128; ++var46) {
				var47 = var49 + (aByteArray1137[var46] & 255);
				if (var47 < 0)
					var47 = 0;

				if (var47 > 128)
					var47 = 128;

				aByteArray1137[var46] = (byte) var47;
			}
		}

		for (var20 = 0; var20 < var23; ++var20)
			var29[var20].anInt848 = var3.readUByte();

		for (var20 = 0; var20 < var23; ++var20) {
			var15 = var29[var20];
			if (null != var15.aByteArray855)
				var15.anInt849 = var3.readUByte();

			if (null != var15.aByteArray847)
				var15.anInt850 = var3.readUByte();

			if (var15.anInt848 > 0)
				var15.anInt851 = var3.readUByte();
		}

		for (var20 = 0; var20 < var23; ++var20)
			var29[var20].anInt853 = var3.readUByte();

		for (var20 = 0; var20 < var23; ++var20) {
			var15 = var29[var20];
			if (var15.anInt853 > 0)
				var15.anInt852 = var3.readUByte();
		}

		for (var20 = 0; var20 < var23; ++var20) {
			var15 = var29[var20];
			if (var15.anInt852 > 0)
				var15.anInt854 = var3.readUByte();
		}

	}

	boolean method659(final Class21 var1, final byte[] var2, final int[] var3) {
		boolean var4 = true;
		int var8 = 0;
		Class131_Sub2_Sub1 var5 = null;

		for (int var6 = 0; var6 < 128; ++var6)
			if ((var2 == null) || (var2[var6] != 0)) {
				int var7 = anIntArray1140[var6];
				if (var7 != 0) {
					if (var7 != var8) {
						var8 = var7--;
						if ((var7 & 1) == 0)
							var5 = var1.method101(var7 >> 2, var3);
						else
							var5 = var1.method103(var7 >> 2, var3);

						if (null == var5)
							var4 = false;
					}

					if (var5 != null) {
						aClass131_Sub2_Sub1Array1135[var6] = var5;
						anIntArray1140[var6] = 0;
					}
				}
			}

		return var4;
	}
}
