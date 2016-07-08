public class Class44 {
	String aString437;
	int anInt438;
	boolean aBool439;
	boolean aBool440;
	static int anInt441;
	String aString442;
	public static Class140[] aClass140Array444;
	int anInt445;
	static Class100_Sub1 aClass100_Sub1_446;
	static Class100_Sub1 aClass100_Sub1_443;

	static final boolean method222(final Class131_Sub18 var0) {
		if (var0.anIntArray1270 == null)
			return false;
		else {
			for (int var3 = 0; var3 < var0.anIntArray1270.length; ++var3) {
				final int var1 = Class131_Sub12.method578(var0, var3);
				final int var2 = var0.anIntArray1271[var3];
				if (var0.anIntArray1270[var3] == 2) {
					if (var1 >= var2)
						return false;
				} else if (var0.anIntArray1270[var3] == 3) {
					if (var1 <= var2)
						return false;
				} else if (var0.anIntArray1270[var3] == 4) {
					if (var1 == var2)
						return false;
				} else if (var2 != var1)
					return false;
			}

			return true;
		}
	}

	static final void method223(final Class131_Sub20_Sub19_Sub2 var0) {
		var0.anInt1729 = var0.anInt1707;
		if (var0.anInt1754 == 0)
			var0.anInt1745 = 0;
		else {
			if ((var0.anInt1703 != -1) && (var0.anInt1735 == 0)) {
				final Class131_Sub20_Sub1 var2 = Class131_Sub20_Sub19_Sub2_Sub1.method1066(var0.anInt1703);
				if ((var0.anInt1758 > 0) && (var2.anInt1362 == 0)) {
					++var0.anInt1745;
					return;
				}

				if ((var0.anInt1758 <= 0) && (var2.anInt1351 == 0)) {
					++var0.anInt1745;
					return;
				}
			}

			final int var7 = var0.anInt1718;
			final int var5 = var0.anInt1759;
			final int var4 = (var0.anInt1706 * 64) + (var0.anIntArray1755[var0.anInt1754 - 1] * 128);
			final int var1 = (var0.anInt1706 * 64) + (var0.anIntArray1756[var0.anInt1754 - 1] * 128);
			if (var7 < var4) {
				if (var5 < var1)
					var0.anInt1751 = 1280;
				else if (var5 > var1)
					var0.anInt1751 = 1792;
				else
					var0.anInt1751 = 1536;
			} else if (var7 > var4) {
				if (var5 < var1)
					var0.anInt1751 = 768;
				else if (var5 > var1)
					var0.anInt1751 = 256;
				else
					var0.anInt1751 = 512;
			} else if (var5 < var1)
				var0.anInt1751 = 1024;
			else if (var5 > var1)
				var0.anInt1751 = 0;

			final byte var9 = var0.aByteArray1709[var0.anInt1754 - 1];
			if (((var4 - var7) <= 256) && ((var4 - var7) >= -256) && ((var1 - var5) <= 256)
					&& ((var1 - var5) >= -256)) {
				int var8 = (var0.anInt1751 - var0.anInt1762) & 2047;
				if (var8 > 1024)
					var8 -= 2048;

				int var3 = var0.anInt1711;
				if ((var8 >= -256) && (var8 <= 256))
					var3 = var0.anInt1710;
				else if ((var8 >= 256) && (var8 < 768))
					var3 = var0.anInt1713;
				else if ((var8 >= -768) && (var8 <= -256))
					var3 = var0.anInt1712;

				if (var3 == -1)
					var3 = var0.anInt1710;

				var0.anInt1729 = var3;
				int var6 = 4;
				boolean var10 = true;
				if (var0 instanceof Class131_Sub20_Sub19_Sub2_Sub1)
					var10 = ((Class131_Sub20_Sub19_Sub2_Sub1) var0).aClass131_Sub20_Sub6_1978.aBool1489;

				if (var10) {
					if ((var0.anInt1762 != var0.anInt1751) && (var0.anInt1726 == -1) && (var0.anInt1753 != 0))
						var6 = 2;

					if (var0.anInt1754 > 2)
						var6 = 6;

					if (var0.anInt1754 > 3)
						var6 = 8;

					if ((var0.anInt1745 > 0) && (var0.anInt1754 > 1)) {
						var6 = 8;
						--var0.anInt1745;
					}
				} else {
					if (var0.anInt1754 > 1)
						var6 = 6;

					if (var0.anInt1754 > 2)
						var6 = 8;

					if ((var0.anInt1745 > 0) && (var0.anInt1754 > 1)) {
						var6 = 8;
						--var0.anInt1745;
					}
				}

				if (var9 == 2)
					var6 <<= 1;

				if ((var6 >= 8) && (var0.anInt1729 == var0.anInt1710) && (var0.anInt1714 != -1))
					var0.anInt1729 = var0.anInt1714;

				if ((var4 != var7) || (var5 != var1)) {
					if (var7 < var4) {
						var0.anInt1718 += var6;
						if (var0.anInt1718 > var4)
							var0.anInt1718 = var4;
					} else if (var7 > var4) {
						var0.anInt1718 -= var6;
						if (var0.anInt1718 < var4)
							var0.anInt1718 = var4;
					}

					if (var5 < var1) {
						var0.anInt1759 += var6;
						if (var0.anInt1759 > var1)
							var0.anInt1759 = var1;
					} else if (var5 > var1) {
						var0.anInt1759 -= var6;
						if (var0.anInt1759 < var1)
							var0.anInt1759 = var1;
					}
				}

				if ((var0.anInt1718 == var4) && (var1 == var0.anInt1759)) {
					--var0.anInt1754;
					if (var0.anInt1758 > 0)
						--var0.anInt1758;
				}

			} else {
				var0.anInt1718 = var4;
				var0.anInt1759 = var1;
				--var0.anInt1754;
				if (var0.anInt1758 > 0)
					--var0.anInt1758;

			}
		}
	}

	static void method224() {
		int var0;
		if (client.anInt2057 == 0) {
			Class65.aClass33_595 = new Class33(4, 104, 104, Class26.anIntArrayArrayArray239);

			for (var0 = 0; var0 < 4; ++var0)
				client.aClass51Array2087[var0] = new Class51(104, 104);

			Class95.aClass131_Sub20_Sub17_Sub3_763 = new Class131_Sub20_Sub17_Sub3(512, 512);
			NpcFlags.aString51 = "Starting game engine...";
			NpcFlags.anInt39 = 5;
			client.anInt2057 = 20;
		} else {
			int var2;
			int var3;
			int var4;
			int var5;
			if (client.anInt2057 == 20) {
				final int[] var16 = new int[9];

				for (var2 = 0; var2 < 9; ++var2) {
					var3 = (32 * var2) + 128 + 15;
					var5 = 600 + (var3 * 3);
					var4 = Class131_Sub20_Sub17_Sub1.anIntArray1787[var3];
					var16[var2] = (var4 * var5) >> 16;
				}

				Class33.method153(var16, 500, 800, 512, 334);
				NpcFlags.aString51 = "Prepared visibility map";
				NpcFlags.anInt39 = 10;
				client.anInt2057 = 30;
			} else if (client.anInt2057 == 30) {
				Class71.aClass100_Sub1_612 = Class16_Sub1.method549(0, false, true, true);
				Class84.aClass100_Sub1_696 = Class16_Sub1.method549(1, false, true, true);
				Class32.aClass100_Sub1_297 = Class16_Sub1.method549(2, true, false, true);
				Class28.aClass100_Sub1_254 = Class16_Sub1.method549(3, false, true, true);
				Class78.aClass100_Sub1_648 = Class16_Sub1.method549(4, false, true, true);
				Class29.aClass100_Sub1_268 = Class16_Sub1.method549(5, true, true, true);
				aClass100_Sub1_446 = Class16_Sub1.method549(6, true, true, false);
				Class60.aClass100_Sub1_571 = Class16_Sub1.method549(7, false, true, true);
				Class51.aClass100_Sub1_502 = Class16_Sub1.method549(8, false, true, true);
				Class126_Sub1.aClass100_Sub1_953 = Class16_Sub1.method549(9, false, true, true);
				Class131_Sub20_Sub19_Sub1.aClass100_Sub1_1701 = Class16_Sub1.method549(10, false, true, true);
				Class82.aClass100_Sub1_686 = Class16_Sub1.method549(11, false, true, true);
				aClass100_Sub1_443 = Class16_Sub1.method549(12, false, true, true);
				Class131_Sub4_Sub4.aClass100_Sub1_1689 = Class16_Sub1.method549(13, true, false, true);
				Applet_Sub1.aClass100_Sub1_2023 = Class16_Sub1.method549(14, false, true, false);
				NpcFlags.aClass100_Sub1_55 = Class16_Sub1.method549(15, false, true, true);
				NpcFlags.aString51 = "Connecting to update server";
				NpcFlags.anInt39 = 20;
				client.anInt2057 = 40;
			} else if (client.anInt2057 == 40) {
				final byte var19 = 0;
				var0 = var19 + ((Class71.aClass100_Sub1_612.method650() * 4) / 100);
				var0 += (Class84.aClass100_Sub1_696.method650() * 4) / 100;
				var0 += (Class32.aClass100_Sub1_297.method650() * 2) / 100;
				var0 += (Class28.aClass100_Sub1_254.method650() * 2) / 100;
				var0 += (Class78.aClass100_Sub1_648.method650() * 6) / 100;
				var0 += (Class29.aClass100_Sub1_268.method650() * 4) / 100;
				var0 += (aClass100_Sub1_446.method650() * 2) / 100;
				var0 += (Class60.aClass100_Sub1_571.method650() * 60) / 100;
				var0 += (Class51.aClass100_Sub1_502.method650() * 2) / 100;
				var0 += (Class126_Sub1.aClass100_Sub1_953.method650() * 2) / 100;
				var0 += (Class131_Sub20_Sub19_Sub1.aClass100_Sub1_1701.method650() * 2) / 100;
				var0 += (Class82.aClass100_Sub1_686.method650() * 2) / 100;
				var0 += (aClass100_Sub1_443.method650() * 2) / 100;
				var0 += (Class131_Sub4_Sub4.aClass100_Sub1_1689.method650() * 2) / 100;
				var0 += (Applet_Sub1.aClass100_Sub1_2023.method650() * 2) / 100;
				var0 += (NpcFlags.aClass100_Sub1_55.method650() * 2) / 100;
				if (var0 != 100) {
					if (var0 != 0)
						NpcFlags.aString51 = "Checking for updates - " + var0 + "%";

					NpcFlags.anInt39 = 30;
				} else {
					NpcFlags.aString51 = "Loaded update list";
					NpcFlags.anInt39 = 30;
					client.anInt2057 = 45;
				}
			} else if (client.anInt2057 == 45) {
				Class131_Sub20_Sub12.method774(22050, !client.aBool2033, 2);
				final Class131_Sub4_Sub3 var15 = new Class131_Sub4_Sub3();
				var15.method912(9, 128);
				Class131_Sub20_Sub6.aClass17_1480 = Class46.method234(Class36.aClass78_371, Class29.aCanvas271, 0,
						22050);
				Class131_Sub20_Sub6.aClass17_1480.method67(var15);
				Class131_Sub9.method566(NpcFlags.aClass100_Sub1_55, Applet_Sub1.aClass100_Sub1_2023,
						Class78.aClass100_Sub1_648, var15);
				Class131_Sub20_Sub19_Sub4.aClass17_1817 = Class46.method234(Class36.aClass78_371, Class29.aCanvas271, 1,
						2048);
				Class61.aClass131_Sub4_Sub2_578 = new Class131_Sub4_Sub2();
				Class131_Sub20_Sub19_Sub4.aClass17_1817.method67(Class61.aClass131_Sub4_Sub2_578);
				Class131_Sub20_Sub19_Sub5.aClass18_1837 = new Class18(22050, Class17.anInt162);
				NpcFlags.aString51 = "Prepared sound engine";
				NpcFlags.anInt39 = 35;
				client.anInt2057 = 50;
			} else if (client.anInt2057 == 50) {
				var0 = 0;
				if (NpcFlags.aClass131_Sub20_Sub17_Sub4_Sub1_48 == null)
					NpcFlags.aClass131_Sub20_Sub17_Sub4_Sub1_48 = Class131_Sub20_Sub15.method791(
							Class51.aClass100_Sub1_502, Class131_Sub4_Sub4.aClass100_Sub1_1689, "p11_full", "");
				else
					++var0;

				if (null == Class7.aClass131_Sub20_Sub17_Sub4_Sub1_79)
					Class7.aClass131_Sub20_Sub17_Sub4_Sub1_79 = Class131_Sub20_Sub15.method791(
							Class51.aClass100_Sub1_502, Class131_Sub4_Sub4.aClass100_Sub1_1689, "p12_full", "");
				else
					++var0;

				if (GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15 == null)
					GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15 = Class131_Sub20_Sub15.method791(
							Class51.aClass100_Sub1_502, Class131_Sub4_Sub4.aClass100_Sub1_1689, "b12_full", "");
				else
					++var0;

				if (var0 < 3) {
					NpcFlags.aString51 = "Loading fonts - " + ((var0 * 100) / 3) + "%";
					NpcFlags.anInt39 = 40;
				} else {
					Class131_Sub20_Sub4.myMachine = new Class131_Sub19(true);
					NpcFlags.aString51 = "Loaded fonts";
					NpcFlags.anInt39 = 40;
					client.anInt2057 = 60;
				}
			} else {
				Class100_Sub1 var9;
				Class100_Sub1 var18;
				if (client.anInt2057 == 60) {
					var18 = Class131_Sub20_Sub19_Sub1.aClass100_Sub1_1701;
					var9 = Class51.aClass100_Sub1_502;
					var5 = 0;
					if (var18.method422("title.jpg", ""))
						++var5;

					if (var9.method422("logo", ""))
						++var5;

					if (var9.method422("logo_deadman_mode", ""))
						++var5;

					if (var9.method422("titlebox", ""))
						++var5;

					if (var9.method422("titlebutton", ""))
						++var5;

					if (var9.method422("runes", ""))
						++var5;

					if (var9.method422("title_mute", ""))
						++var5;

					if (var9.method419("options_radio_buttons,0"))
						++var5;

					if (var9.method419("options_radio_buttons,2"))
						++var5;

					var9.method422("sl_back", "");
					var9.method422("sl_flags", "");
					var9.method422("sl_arrows", "");
					var9.method422("sl_stars", "");
					var9.method422("sl_button", "");
					final byte var17 = 9;
					if (var5 < var17) {
						NpcFlags.aString51 = "Loading title screen - " + ((var5 * 100) / var17) + "%";
						NpcFlags.anInt39 = 50;
					} else {
						NpcFlags.aString51 = "Loaded title screen";
						NpcFlags.anInt39 = 50;
						Class32.method142(5);
						client.anInt2057 = 70;
					}
				} else if (client.anInt2057 == 70) {
					if (!Class32.aClass100_Sub1_297.method406()) {
						NpcFlags.aString51 = "Loading config - " + Class32.aClass100_Sub1_297.method655() + "%";
						NpcFlags.anInt39 = 60;
					} else {
						Class131_Sub20_Sub19_Sub5.method987(Class32.aClass100_Sub1_297);
						final Class100_Sub1 var14 = Class32.aClass100_Sub1_297;
						Class131_Sub20_Sub5.aClass100_1448 = var14;
						Class47.method239(Class32.aClass100_Sub1_297, Class60.aClass100_Sub1_571);
						Class64.method305(Class32.aClass100_Sub1_297, Class60.aClass100_Sub1_571, client.aBool2033);
						Class67.method313(Class32.aClass100_Sub1_297, Class60.aClass100_Sub1_571);
						Class49.method256(Class32.aClass100_Sub1_297, Class60.aClass100_Sub1_571, client.aBool2147,
								NpcFlags.aClass131_Sub20_Sub17_Sub4_Sub1_48);
						var18 = Class32.aClass100_Sub1_297;
						var9 = Class71.aClass100_Sub1_612;
						final Class100_Sub1 var6 = Class84.aClass100_Sub1_696;
						Class131_Sub20_Sub1.aClass100_1365 = var18;
						Class131_Sub20_Sub1.aClass100_1352 = var9;
						Class131_Sub20_Sub1.aClass100_1354 = var6;
						final Class100_Sub1 var10 = Class32.aClass100_Sub1_297;
						final Class100_Sub1 var11 = Class60.aClass100_Sub1_571;
						Class131_Sub20_Sub14.aClass100_1595 = var10;
						Class131_Sub20_Sub14.aClass100_1580 = var11;
						Class131_Sub9.method565(Class32.aClass100_Sub1_297);
						Class16_Sub1.method546(Class32.aClass100_Sub1_297);
						Class131_Sub20_Sub4.method713(Class28.aClass100_Sub1_254, Class60.aClass100_Sub1_571,
								Class51.aClass100_Sub1_502, Class131_Sub4_Sub4.aClass100_Sub1_1689);
						Class21.method105(Class32.aClass100_Sub1_297);
						final Class100_Sub1 var12 = Class32.aClass100_Sub1_297;
						Class131_Sub20_Sub12.aClass100_1561 = var12;
						Class131_Sub20_Sub19_Sub2.method923(Class32.aClass100_Sub1_297);
						Class36.method207(Class32.aClass100_Sub1_297);
						Class131_Sub7.aClass48_1026 = new Class48();
						NpcFlags.aString51 = "Loaded config";
						NpcFlags.anInt39 = 60;
						client.anInt2057 = 80;
					}
				} else if (client.anInt2057 != 80) {
					if (client.anInt2057 == 90) {
						if (!Class126_Sub1.aClass100_Sub1_953.method406()) {
							NpcFlags.aString51 = "Loading textures - " + Class126_Sub1.aClass100_Sub1_953.method655()
									+ "%";
							NpcFlags.anInt39 = 90;
						} else {
							final Class35 var13 = new Class35(Class126_Sub1.aClass100_Sub1_953,
									Class51.aClass100_Sub1_502, 20, 0.8D, client.aBool2033 ? 64 : 128);
							Class131_Sub20_Sub17_Sub1.method947(var13);
							Class131_Sub20_Sub17_Sub1.method944(0.8D);
							NpcFlags.aString51 = "Loaded textures";
							NpcFlags.anInt39 = 90;
							client.anInt2057 = 110;
						}
					} else if (client.anInt2057 == 110) {
						client.aClass40_2209 = new Class40();
						Class36.aClass78_371.method348(client.aClass40_2209, 10);
						NpcFlags.aString51 = "Loaded input handler";
						NpcFlags.anInt39 = 94;
						client.anInt2057 = 120;
					} else if (client.anInt2057 == 120) {
						if (!Class131_Sub20_Sub19_Sub1.aClass100_Sub1_1701.method422("huffman", "")) {
							NpcFlags.aString51 = "Loading wordpack - " + 0 + "%";
							NpcFlags.anInt39 = 96;
						} else {
							final Class60 var1 = new Class60(
									Class131_Sub20_Sub19_Sub1.aClass100_Sub1_1701.method415("huffman", ""));
							Class136.aClass60_908 = var1;
							NpcFlags.aString51 = "Loaded wordpack";
							NpcFlags.anInt39 = 96;
							client.anInt2057 = 130;
						}
					} else if (client.anInt2057 == 130) {
						if (!Class28.aClass100_Sub1_254.method406()) {
							NpcFlags.aString51 = "Loading interfaces - "
									+ ((Class28.aClass100_Sub1_254.method655() * 4) / 5) + "%";
							NpcFlags.anInt39 = 100;
						} else if (!aClass100_Sub1_443.method406()) {
							NpcFlags.aString51 = "Loading interfaces - " + (80 + (aClass100_Sub1_443.method655() / 6))
									+ "%";
							NpcFlags.anInt39 = 100;
						} else if (!Class131_Sub4_Sub4.aClass100_Sub1_1689.method406()) {
							NpcFlags.aString51 = "Loading interfaces - "
									+ (96 + (Class131_Sub4_Sub4.aClass100_Sub1_1689.method655() / 20)) + "%";
							NpcFlags.anInt39 = 100;
						} else {
							NpcFlags.aString51 = "Loaded interfaces";
							NpcFlags.anInt39 = 100;
							client.anInt2057 = 140;
						}
					} else if (client.anInt2057 == 140)
						Class32.method142(10);
				} else {
					var0 = 0;
					Class131_Sub20_Sub17_Sub3 var7;
					if (null == Class42.aClass131_Sub20_Sub17_Sub3_425) {
						var9 = Class51.aClass100_Sub1_502;
						var5 = var9.method413("compass");
						var4 = var9.method414(var5, "");
						var7 = Class131_Sub20_Sub4.method716(var9, var5, var4);
						Class42.aClass131_Sub20_Sub17_Sub3_425 = var7;
					} else
						++var0;

					if (null == Class109.aClass131_Sub20_Sub17_Sub3_814) {
						var9 = Class51.aClass100_Sub1_502;
						var5 = var9.method413("mapedge");
						var4 = var9.method414(var5, "");
						var7 = Class131_Sub20_Sub4.method716(var9, var5, var4);
						Class109.aClass131_Sub20_Sub17_Sub3_814 = var7;
					} else
						++var0;

					if (Class39.aClass131_Sub20_Sub17_Sub2Array409 == null)
						Class39.aClass131_Sub20_Sub17_Sub2Array409 = client.method1095(Class51.aClass100_Sub1_502,
								"mapscene", "");
					else
						++var0;

					if (Class28.aClass131_Sub20_Sub17_Sub3Array255 == null)
						Class28.aClass131_Sub20_Sub17_Sub3Array255 = Class28.method127(Class51.aClass100_Sub1_502,
								"mapfunction", "");
					else
						++var0;

					if (Class85.aClass131_Sub20_Sub17_Sub3Array701 == null)
						Class85.aClass131_Sub20_Sub17_Sub3Array701 = Class28.method127(Class51.aClass100_Sub1_502,
								"hitmarks", "");
					else
						++var0;

					if (null == Class93.aClass131_Sub20_Sub17_Sub3Array742)
						Class93.aClass131_Sub20_Sub17_Sub3Array742 = Class28.method127(Class51.aClass100_Sub1_502,
								"headicons_pk", "");
					else
						++var0;

					if (null == Class25.aClass131_Sub20_Sub17_Sub3Array221)
						Class25.aClass131_Sub20_Sub17_Sub3Array221 = Class28.method127(Class51.aClass100_Sub1_502,
								"headicons_prayer", "");
					else
						++var0;

					if (null == Class42.aClass131_Sub20_Sub17_Sub3Array424)
						Class42.aClass131_Sub20_Sub17_Sub3Array424 = Class28.method127(Class51.aClass100_Sub1_502,
								"headicons_hint", "");
					else
						++var0;

					if (Class26.aClass131_Sub20_Sub17_Sub3Array243 == null)
						Class26.aClass131_Sub20_Sub17_Sub3Array243 = Class28.method127(Class51.aClass100_Sub1_502,
								"mapmarker", "");
					else
						++var0;

					if (null == Class2.aClass131_Sub20_Sub17_Sub3Array9)
						Class2.aClass131_Sub20_Sub17_Sub3Array9 = Class28.method127(Class51.aClass100_Sub1_502, "cross",
								"");
					else
						++var0;

					if (null == Class64.aClass131_Sub20_Sub17_Sub3Array588)
						Class64.aClass131_Sub20_Sub17_Sub3Array588 = Class28.method127(Class51.aClass100_Sub1_502,
								"mapdots", "");
					else
						++var0;

					if (null == Class97.aClass131_Sub20_Sub17_Sub2Array771)
						Class97.aClass131_Sub20_Sub17_Sub2Array771 = client.method1095(Class51.aClass100_Sub1_502,
								"scrollbar", "");
					else
						++var0;

					if (Class64.aClass131_Sub20_Sub17_Sub2Array590 == null)
						Class64.aClass131_Sub20_Sub17_Sub2Array590 = client.method1095(Class51.aClass100_Sub1_502,
								"mod_icons", "");
					else
						++var0;

					if (var0 < 13) {
						NpcFlags.aString51 = "Loading sprites - " + ((100 * var0) / 13) + "%";
						NpcFlags.anInt39 = 70;
					} else {
						Class131_Sub20_Sub17_Sub4.aClass131_Sub20_Sub17_Sub2Array1965 = Class64.aClass131_Sub20_Sub17_Sub2Array590;
						Class109.aClass131_Sub20_Sub17_Sub3_814.method979();
						var2 = (int) (Math.random() * 21.0D) - 10;
						var3 = (int) (Math.random() * 21.0D) - 10;
						var5 = (int) (Math.random() * 21.0D) - 10;
						var4 = (int) (Math.random() * 41.0D) - 20;

						for (final Class131_Sub20_Sub17_Sub3 element : Class28.aClass131_Sub20_Sub17_Sub3Array255)
							element.method981(var2 + var4, var4 + var3, var5 + var4);

						Class39.aClass131_Sub20_Sub17_Sub2Array409[0].method948(var4 + var2, var3 + var4, var5 + var4);
						NpcFlags.aString51 = "Loaded sprites";
						NpcFlags.anInt39 = 70;
						client.anInt2057 = 90;
					}
				}
			}
		}
	}
}
