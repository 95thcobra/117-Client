public class Class51 {
	static Class100_Sub1 aClass100_Sub1_502;
	int anInt498 = 0;
	int anInt499 = 0;
	int anInt497;
	int anInt500;
	public int[][] anIntArrayArray501;

	public Class51(final int var1, final int var2) {
		anInt497 = var1;
		anInt500 = var2;
		anIntArrayArray501 = new int[anInt497][anInt500];
		method259();
	}

	public void method259() {
		for (int var1 = 0; var1 < anInt497; ++var1)
			for (int var2 = 0; var2 < anInt500; ++var2)
				if ((var1 != 0) && (var2 != 0) && (var1 < (anInt497 - 5)) && (var2 < (anInt500 - 5)))
					anIntArrayArray501[var1][var2] = 16777216;
				else
					anIntArrayArray501[var1][var2] = 16777215;

	}

	public void method260(int var1, int var2, final int var3, final int var4, final boolean var5) {
		var1 -= anInt498;
		var2 -= anInt499;
		if (var3 == 0) {
			if (var4 == 0) {
				method267(var1, var2, 128);
				method267(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				method267(var1, var2, 2);
				method267(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				method267(var1, var2, 8);
				method267(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				method267(var1, var2, 32);
				method267(var1, var2 - 1, 2);
			}
		}

		if ((var3 == 1) || (var3 == 3)) {
			if (var4 == 0) {
				method267(var1, var2, 1);
				method267(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				method267(var1, var2, 4);
				method267(1 + var1, var2 + 1, 64);
			}

			if (var4 == 2) {
				method267(var1, var2, 16);
				method267(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				method267(var1, var2, 64);
				method267(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				method267(var1, var2, 130);
				method267(var1 - 1, var2, 8);
				method267(var1, 1 + var2, 32);
			}

			if (var4 == 1) {
				method267(var1, var2, 10);
				method267(var1, 1 + var2, 32);
				method267(1 + var1, var2, 128);
			}

			if (var4 == 2) {
				method267(var1, var2, 40);
				method267(1 + var1, var2, 128);
				method267(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				method267(var1, var2, 160);
				method267(var1, var2 - 1, 2);
				method267(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					method267(var1, var2, 65536);
					method267(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					method267(var1, var2, 1024);
					method267(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					method267(var1, var2, 4096);
					method267(1 + var1, var2, 65536);
				}

				if (var4 == 3) {
					method267(var1, var2, 16384);
					method267(var1, var2 - 1, 1024);
				}
			}

			if ((var3 == 1) || (var3 == 3)) {
				if (var4 == 0) {
					method267(var1, var2, 512);
					method267(var1 - 1, 1 + var2, 8192);
				}

				if (var4 == 1) {
					method267(var1, var2, 2048);
					method267(1 + var1, var2 + 1, '\u8000');
				}

				if (var4 == 2) {
					method267(var1, var2, 8192);
					method267(1 + var1, var2 - 1, 512);
				}

				if (var4 == 3) {
					method267(var1, var2, '\u8000');
					method267(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					method267(var1, var2, 66560);
					method267(var1 - 1, var2, 4096);
					method267(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					method267(var1, var2, 5120);
					method267(var1, 1 + var2, 16384);
					method267(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					method267(var1, var2, 20480);
					method267(1 + var1, var2, 65536);
					method267(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					method267(var1, var2, 81920);
					method267(var1, var2 - 1, 1024);
					method267(var1 - 1, var2, 4096);
				}
			}
		}

	}

	public void method261(int var1, int var2) {
		var1 -= anInt498;
		var2 -= anInt499;
		anIntArrayArray501[var1][var2] |= 262144;
	}

	public void method262(int var1, int var2) {
		var1 -= anInt498;
		var2 -= anInt499;
		anIntArrayArray501[var1][var2] |= 2097152;
	}

	void method263(final int var1, final int var2, final int var3) {
		anIntArrayArray501[var1][var2] &= ~var3;
	}

	public void method264(int var1, int var2) {
		var1 -= anInt498;
		var2 -= anInt499;
		anIntArrayArray501[var1][var2] &= -262145;
	}

	public void method265(int var1, int var2, final int var3, final int var4, final boolean var5) {
		var1 -= anInt498;
		var2 -= anInt499;
		if (var3 == 0) {
			if (var4 == 0) {
				method263(var1, var2, 128);
				method263(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				method263(var1, var2, 2);
				method263(var1, 1 + var2, 32);
			}

			if (var4 == 2) {
				method263(var1, var2, 8);
				method263(1 + var1, var2, 128);
			}

			if (var4 == 3) {
				method263(var1, var2, 32);
				method263(var1, var2 - 1, 2);
			}
		}

		if ((var3 == 1) || (var3 == 3)) {
			if (var4 == 0) {
				method263(var1, var2, 1);
				method263(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				method263(var1, var2, 4);
				method263(1 + var1, 1 + var2, 64);
			}

			if (var4 == 2) {
				method263(var1, var2, 16);
				method263(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				method263(var1, var2, 64);
				method263(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				method263(var1, var2, 130);
				method263(var1 - 1, var2, 8);
				method263(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				method263(var1, var2, 10);
				method263(var1, var2 + 1, 32);
				method263(1 + var1, var2, 128);
			}

			if (var4 == 2) {
				method263(var1, var2, 40);
				method263(var1 + 1, var2, 128);
				method263(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				method263(var1, var2, 160);
				method263(var1, var2 - 1, 2);
				method263(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					method263(var1, var2, 65536);
					method263(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					method263(var1, var2, 1024);
					method263(var1, 1 + var2, 16384);
				}

				if (var4 == 2) {
					method263(var1, var2, 4096);
					method263(1 + var1, var2, 65536);
				}

				if (var4 == 3) {
					method263(var1, var2, 16384);
					method263(var1, var2 - 1, 1024);
				}
			}

			if ((var3 == 1) || (var3 == 3)) {
				if (var4 == 0) {
					method263(var1, var2, 512);
					method263(var1 - 1, 1 + var2, 8192);
				}

				if (var4 == 1) {
					method263(var1, var2, 2048);
					method263(var1 + 1, var2 + 1, '\u8000');
				}

				if (var4 == 2) {
					method263(var1, var2, 8192);
					method263(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					method263(var1, var2, '\u8000');
					method263(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					method263(var1, var2, 66560);
					method263(var1 - 1, var2, 4096);
					method263(var1, 1 + var2, 16384);
				}

				if (var4 == 1) {
					method263(var1, var2, 5120);
					method263(var1, var2 + 1, 16384);
					method263(1 + var1, var2, 65536);
				}

				if (var4 == 2) {
					method263(var1, var2, 20480);
					method263(1 + var1, var2, 65536);
					method263(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					method263(var1, var2, 81920);
					method263(var1, var2 - 1, 1024);
					method263(var1 - 1, var2, 4096);
				}
			}
		}

	}

	public void method266(int var1, int var2, int var3, int var4, final int var5, final boolean var6) {
		int var7 = 256;
		if (var6)
			var7 += 131072;

		var1 -= anInt498;
		var2 -= anInt499;
		int var8;
		if ((var5 == 1) || (var5 == 3)) {
			var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (var8 = var1; var8 < (var3 + var1); ++var8)
			if ((var8 >= 0) && (var8 < anInt497))
				for (int var9 = var2; var9 < (var4 + var2); ++var9)
					if ((var9 >= 0) && (var9 < anInt500))
						method263(var8, var9, var7);

	}

	void method267(final int var1, final int var2, final int var3) {
		anIntArrayArray501[var1][var2] |= var3;
	}

	public void method268(int var1, int var2, final int var3, final int var4, final boolean var5) {
		int var6 = 256;
		if (var5)
			var6 += 131072;

		var1 -= anInt498;
		var2 -= anInt499;

		for (int var7 = var1; var7 < (var3 + var1); ++var7)
			if ((var7 >= 0) && (var7 < anInt497))
				for (int var8 = var2; var8 < (var4 + var2); ++var8)
					if ((var8 >= 0) && (var8 < anInt500))
						method267(var7, var8, var6);

	}

	static final void method269(final Class131_Sub18 var0, final int var1, final int var2) {
		final Class131_Sub20_Sub21 var3 = var0.method670(false);
		if (var3 != null)
			if (client.anInt2259 < 3)
				Class42.aClass131_Sub20_Sub17_Sub3_425.method975(var1, var2, var3.anInt1658, var3.anInt1659, 25, 25,
						client.anInt2111, 256, var3.anIntArray1656, var3.anIntArray1657);
			else
				Class131_Sub20_Sub17.method858(var1, var2, 0, var3.anIntArray1656, var3.anIntArray1657);
	}

	public static boolean method270(final int var0) {
		return ((var0 >> 31) & 1) != 0;
	}
}
