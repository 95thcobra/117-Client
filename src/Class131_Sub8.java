public class Class131_Sub8 extends Class131 {
	int[] anIntArray1040;
	static int[] anIntArray1042;
	boolean aBool1041 = false;
	int anInt1033;
	boolean aBool1034;
	int[] anIntArray1039;
	int[] anIntArray1035;
	int[] anIntArray1036;
	int[] anIntArray1037;
	int anInt1038;
	int anInt1032;

	void method559() {
		anIntArray1040 = null;
	}

	boolean method560(final double var1, final int var3, final Class100 var4) {
		int var5;
		for (var5 = 0; var5 < anIntArray1039.length; ++var5)
			if (var4.method421(anIntArray1039[var5]) == null)
				return false;

		var5 = var3 * var3;
		anIntArray1040 = new int[var5];

		for (int var9 = 0; var9 < anIntArray1039.length; ++var9) {
			final int var10 = anIntArray1039[var9];
			byte[] var11 = var4.method407(var10);
			boolean var13;
			if (var11 == null)
				var13 = false;
			else {
				Class84.method370(var11);
				var13 = true;
			}

			Class131_Sub20_Sub17_Sub2 var14;
			if (!var13)
				var14 = null;
			else {
				final Class131_Sub20_Sub17_Sub2 var6 = new Class131_Sub20_Sub17_Sub2();
				var6.anInt1788 = Class13.anInt113;
				var6.anInt1794 = Class13.anInt115;
				var6.anInt1795 = Class13.anIntArray114[0];
				var6.anInt1793 = Class131_Sub20_Sub15.anIntArray1605[0];
				var6.anInt1790 = Class131_Sub20_Sub19_Sub3.anIntArray1766[0];
				var6.anInt1791 = NpcFlags.anIntArray54[0];
				var6.anIntArray1789 = Class36.anIntArray370;
				var6.aByteArray1792 = Class13.aByteArrayArray117[0];
				Class5.method28();
				var14 = var6;
			}

			var14.method951();
			var11 = var14.aByteArray1792;
			final int[] var18 = var14.anIntArray1789;
			final int var17 = anIntArray1037[var9];
			if ((var17 & -16777216) == 16777216)
				;

			if ((var17 & -16777216) == 33554432)
				;

			int var7;
			int var8;
			int var12;
			int var16;
			if ((var17 & -16777216) == 50331648) {
				var8 = var17 & 16711935;
				var12 = (var17 >> 8) & 255;

				for (var7 = 0; var7 < var18.length; ++var7) {
					var16 = var18[var7];
					if ((var16 & '\uffff') == (var16 >> 8)) {
						var16 &= 255;
						var18[var7] = (((var8 * var16) >> 8) & 16711935) | ((var12 * var16) & '\uff00');
					}
				}
			}

			for (var8 = 0; var8 < var18.length; ++var8)
				var18[var8] = Class131_Sub20_Sub17_Sub1.method941(var18[var8], var1);

			if (var9 == 0)
				var8 = 0;
			else
				var8 = anIntArray1035[var9 - 1];

			if (var9 == 0)
				;

			if (var8 == 0)
				if (var14.anInt1790 == var3)
					for (var12 = 0; var12 < var5; ++var12)
						anIntArray1040[var12] = var18[var11[var12] & 255];
				else if ((var14.anInt1790 == 64) && (var3 == 128)) {
					var12 = 0;

					for (var7 = 0; var7 < var3; ++var7)
						for (var16 = 0; var16 < var3; ++var16)
							anIntArray1040[var12++] = var18[var11[(var16 >> 1) + ((var7 >> 1) << 6)] & 255];
				} else {
					if ((var14.anInt1790 != 128) || (var3 != 64))
						throw new RuntimeException();

					var12 = 0;

					for (var7 = 0; var7 < var3; ++var7)
						for (var16 = 0; var16 < var3; ++var16)
							anIntArray1040[var12++] = var18[var11[(var16 << 1) + (var7 << 1 << 7)] & 255];
				}

			if (var8 == 1)
				;

			if (var8 == 2)
				;

			if (var8 == 3)
				;
		}

		return true;
	}

	void method561(final int var1) {
		if (anIntArray1040 != null) {
			int var2;
			short var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var8;
			if ((anInt1038 == 1) || (anInt1038 == 3)) {
				if ((anIntArray1042 == null) || (anIntArray1042.length < anIntArray1040.length))
					anIntArray1042 = new int[anIntArray1040.length];

				if (anIntArray1040.length == 4096)
					var3 = 64;
				else
					var3 = 128;

				var4 = anIntArray1040.length;
				var2 = var3 * var1 * anInt1032;
				var5 = var4 - 1;
				if (anInt1038 == 1)
					var2 = -var2;

				for (var6 = 0; var6 < var4; ++var6) {
					var7 = (var6 + var2) & var5;
					anIntArray1042[var6] = anIntArray1040[var7];
				}

				var8 = anIntArray1040;
				anIntArray1040 = anIntArray1042;
				anIntArray1042 = var8;
			}

			if ((anInt1038 == 2) || (anInt1038 == 4)) {
				if ((anIntArray1042 == null) || (anIntArray1042.length < anIntArray1040.length))
					anIntArray1042 = new int[anIntArray1040.length];

				if (anIntArray1040.length == 4096)
					var3 = 64;
				else
					var3 = 128;

				var4 = anIntArray1040.length;
				var2 = var1 * anInt1032;
				var5 = var3 - 1;
				if (anInt1038 == 2)
					var2 = -var2;

				for (var6 = 0; var6 < var4; var6 += var3)
					for (var7 = 0; var7 < var3; ++var7) {
						final int var9 = var6 + var7;
						final int var10 = var6 + ((var7 + var2) & var5);
						anIntArray1042[var9] = anIntArray1040[var10];
					}

				var8 = anIntArray1040;
				anIntArray1040 = anIntArray1042;
				anIntArray1042 = var8;
			}

		}
	}

	Class131_Sub8(final DataBuffer var1) {
		anInt1033 = var1.readUShort();
		aBool1034 = var1.readUByte() == 1;
		final int var3 = var1.readUByte();
		if ((var3 >= 1) && (var3 <= 4)) {
			anIntArray1039 = new int[var3];

			int var2;
			for (var2 = 0; var2 < var3; ++var2)
				anIntArray1039[var2] = var1.readUShort();

			if (var3 > 1) {
				anIntArray1035 = new int[var3 - 1];

				for (var2 = 0; var2 < (var3 - 1); ++var2)
					anIntArray1035[var2] = var1.readUByte();
			}

			if (var3 > 1) {
				anIntArray1036 = new int[var3 - 1];

				for (var2 = 0; var2 < (var3 - 1); ++var2)
					anIntArray1036[var2] = var1.readUByte();
			}

			anIntArray1037 = new int[var3];

			for (var2 = 0; var2 < var3; ++var2)
				anIntArray1037[var2] = var1.readIntV1();

			anInt1038 = var1.readUByte();
			anInt1032 = var1.readUByte();
			anIntArray1040 = null;
		} else
			throw new RuntimeException();
	}
}
