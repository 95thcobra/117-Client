import java.awt.Canvas;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.IOException;

public class Class131_Sub20_Sub2 extends Class131_Sub20 {
	static Class100 aClass100_1374;
	static Class131_Sub20_Sub17_Sub4_Sub1 aClass131_Sub20_Sub17_Sub4_Sub1_1380;
	static Class131_Sub18 aClass131_Sub18_1422;
	public int anInt1423;
	int anInt1378;
	public String aString1385 = "null";
	public int anInt1384 = 2000;
	public int anInt1376 = 0;
	public int anInt1386 = 0;
	public int anInt1390 = 0;
	public int anInt1389 = 0;
	public int anInt1408 = 0;
	public int anInt1391 = 1;
	public boolean aBool1403 = false;
	int anInt1392 = -1;
	int anInt1397 = 0;
	int anInt1396 = -1;
	int anInt1373 = -1;
	int anInt1383 = 0;
	int anInt1399 = -1;
	short[] aShortArray1413;
	short[] aShortArray1387;
	short[] aShortArray1382;
	short[] aShortArray1381;
	public boolean aBool1417 = false;
	int anInt1401 = -1;
	int anInt1394 = -1;
	int anInt1412 = -1;
	int anInt1402 = -1;
	int anInt1400 = -1;
	int anInt1379 = -1;
	public int anInt1388 = 0;
	public int anInt1409 = -1;
	public int anInt1410 = -1;
	int anInt1411 = 128;
	int[] anIntArray1407;
	int[] anIntArray1395;
	int anInt1405 = 128;
	int anInt1398 = 128;
	public int anInt1414 = 0;
	public int anInt1415 = 0;
	public int anInt1416 = 0;
	int anInt1418 = -1;
	int anInt1419 = -1;
	public int anInt1420 = -1;
	public int anInt1421 = -1;
	public String[] aStringArray1393 = new String[] { null, null, "Take", null, null };
	public String[] aStringArray1406 = new String[] { null, null, null, null, "Drop" };
	static Class121 aClass121_1375 = new Class121(64);
	static Class121 aClass121_1404 = new Class121(50);
	static Class121 aClass121_1377 = new Class121(200);

	void method690() {
	}

	void method691(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.readUByte();
			if (var2 == 0)
				return;

			method692(var1, var2);
		}
	}

	void method692(final DataBuffer var1, final int var2) {
		if (var2 == 1)
			anInt1378 = var1.readUShort();
		else if (var2 == 2)
			aString1385 = var1.readString();
		else if (var2 == 4)
			anInt1384 = var1.readUShort();
		else if (var2 == 5)
			anInt1376 = var1.readUShort();
		else if (var2 == 6)
			anInt1386 = var1.readUShort();
		else if (var2 == 7) {
			anInt1390 = var1.readUShort();
			if (anInt1390 > 32767)
				anInt1390 -= 65536;
		} else if (var2 == 8) {
			anInt1389 = var1.readUShort();
			if (anInt1389 > 32767)
				anInt1389 -= 65536;
		} else if (var2 == 11)
			anInt1408 = 1;
		else if (var2 == 12)
			anInt1391 = var1.readIntV1();
		else if (var2 == 16)
			aBool1403 = true;
		else if (var2 == 23) {
			anInt1392 = var1.readUShort();
			anInt1397 = var1.readUByte();
		} else if (var2 == 24)
			anInt1396 = var1.readUShort();
		else if (var2 == 25) {
			anInt1373 = var1.readUShort();
			anInt1383 = var1.readUByte();
		} else if (var2 == 26)
			anInt1399 = var1.readUShort();
		else if ((var2 >= 30) && (var2 < 35)) {
			aStringArray1393[var2 - 30] = var1.readString();
			if (aStringArray1393[var2 - 30].equalsIgnoreCase("Hidden"))
				aStringArray1393[var2 - 30] = null;
		} else if ((var2 >= 35) && (var2 < 40))
			aStringArray1406[var2 - 35] = var1.readString();
		else {
			int var3;
			int var4;
			if (var2 == 40) {
				var4 = var1.readUByte();
				aShortArray1413 = new short[var4];
				aShortArray1387 = new short[var4];

				for (var3 = 0; var3 < var4; ++var3) {
					aShortArray1413[var3] = (short) var1.readUShort();
					aShortArray1387[var3] = (short) var1.readUShort();
				}
			} else if (var2 == 41) {
				var4 = var1.readUByte();
				aShortArray1382 = new short[var4];
				aShortArray1381 = new short[var4];

				for (var3 = 0; var3 < var4; ++var3) {
					aShortArray1382[var3] = (short) var1.readUShort();
					aShortArray1381[var3] = (short) var1.readUShort();
				}
			} else if (var2 == 65)
				aBool1417 = true;
			else if (var2 == 78)
				anInt1401 = var1.readUShort();
			else if (var2 == 79)
				anInt1394 = var1.readUShort();
			else if (var2 == 90)
				anInt1412 = var1.readUShort();
			else if (var2 == 91)
				anInt1402 = var1.readUShort();
			else if (var2 == 92)
				anInt1400 = var1.readUShort();
			else if (var2 == 93)
				anInt1379 = var1.readUShort();
			else if (var2 == 95)
				anInt1388 = var1.readUShort();
			else if (var2 == 97)
				anInt1409 = var1.readUShort();
			else if (var2 == 98)
				anInt1410 = var1.readUShort();
			else if ((var2 >= 100) && (var2 < 110)) {
				if (anIntArray1407 == null) {
					anIntArray1407 = new int[10];
					anIntArray1395 = new int[10];
				}

				anIntArray1407[var2 - 100] = var1.readUShort();
				anIntArray1395[var2 - 100] = var1.readUShort();
			} else if (var2 == 110)
				anInt1411 = var1.readUShort();
			else if (var2 == 111)
				anInt1405 = var1.readUShort();
			else if (var2 == 112)
				anInt1398 = var1.readUShort();
			else if (var2 == 113)
				anInt1414 = var1.readByte();
			else if (var2 == 114)
				anInt1415 = var1.readByte() * 5;
			else if (var2 == 115)
				anInt1416 = var1.readUByte();
			else if (var2 == 139)
				anInt1418 = var1.readUShort();
			else if (var2 == 140)
				anInt1419 = var1.readUShort();
			else if (var2 == 148)
				anInt1420 = var1.readUShort();
			else if (var2 == 149)
				anInt1421 = var1.readUShort();
		}

	}

	void method693(final Class131_Sub20_Sub2 var1, final Class131_Sub20_Sub2 var2) {
		anInt1378 = var1.anInt1378;
		anInt1384 = var1.anInt1384;
		anInt1376 = var1.anInt1376;
		anInt1386 = var1.anInt1386;
		anInt1388 = var1.anInt1388;
		anInt1390 = var1.anInt1390;
		anInt1389 = var1.anInt1389;
		aShortArray1413 = var1.aShortArray1413;
		aShortArray1387 = var1.aShortArray1387;
		aShortArray1382 = var1.aShortArray1382;
		aShortArray1381 = var1.aShortArray1381;
		aString1385 = var2.aString1385;
		aBool1403 = var2.aBool1403;
		anInt1391 = var2.anInt1391;
		anInt1408 = 1;
	}

	void method694(final Class131_Sub20_Sub2 var1, final Class131_Sub20_Sub2 var2) {
		anInt1378 = var1.anInt1378;
		anInt1384 = var1.anInt1384;
		anInt1376 = var1.anInt1376;
		anInt1386 = var1.anInt1386;
		anInt1388 = var1.anInt1388;
		anInt1390 = var1.anInt1390;
		anInt1389 = var1.anInt1389;
		aShortArray1413 = var1.aShortArray1413;
		aShortArray1387 = var1.aShortArray1387;
		aShortArray1382 = var1.aShortArray1382;
		aShortArray1381 = var1.aShortArray1381;
		anInt1408 = var1.anInt1408;
		aString1385 = var2.aString1385;
		anInt1391 = 0;
		aBool1403 = false;
		aBool1417 = false;
	}

	public final Class131_Sub20_Sub19_Sub6 method695(final int var1) {
		int var2;
		if ((anIntArray1407 != null) && (var1 > 1)) {
			int var3 = -1;

			for (var2 = 0; var2 < 10; ++var2)
				if ((var1 >= anIntArray1395[var2]) && (anIntArray1395[var2] != 0))
					var3 = anIntArray1407[var2];

			if (var3 != -1)
				return Class79_Sub1.method645(var3, (short) 8119).method695(1);
		}

		final Class131_Sub20_Sub19_Sub6 var4 = Class131_Sub20_Sub19_Sub6.method993(Class130.aClass100_899, anInt1378,
				0);
		if (null == var4)
			return null;
		else {
			if ((anInt1411 != 128) || (anInt1405 != 128) || (anInt1398 != 128))
				var4.method997(anInt1411, anInt1405, anInt1398);

			if (aShortArray1413 != null)
				for (var2 = 0; var2 < aShortArray1413.length; ++var2)
					var4.method1010(aShortArray1413[var2], aShortArray1387[var2]);

			if (aShortArray1382 != null)
				for (var2 = 0; var2 < aShortArray1382.length; ++var2)
					var4.method1004(aShortArray1382[var2], aShortArray1381[var2]);

			return var4;
		}
	}

	public final boolean method696(final boolean var1) {
		int var2 = anInt1392;
		int var4 = anInt1396;
		int var5 = anInt1401;
		if (var1) {
			var2 = anInt1373;
			var4 = anInt1399;
			var5 = anInt1394;
		}

		if (var2 != -1) {
			boolean var3 = true;
			if (!Class130.aClass100_899.method404(var2, 0))
				var3 = false;

			if ((var4 != -1) && !Class130.aClass100_899.method404(var4, 0))
				var3 = false;

			if ((var5 != -1) && !Class130.aClass100_899.method404(var5, 0))
				var3 = false;

			return var3;
		} else
			return true;
	}

	public Class131_Sub20_Sub2 method697(final int var1) {
		if ((anIntArray1407 != null) && (var1 > 1)) {
			int var3 = -1;

			for (int var2 = 0; var2 < 10; ++var2)
				if ((var1 >= anIntArray1395[var2]) && (anIntArray1395[var2] != 0))
					var3 = anIntArray1407[var2];

			if (var3 != -1)
				return Class79_Sub1.method645(var3, (short) 19122);
		}

		return this;
	}

	public final Class131_Sub20_Sub19_Sub6 method698(final boolean var1) {
		int var2 = anInt1412;
		int var4 = anInt1400;
		if (var1) {
			var2 = anInt1402;
			var4 = anInt1379;
		}

		if (var2 == -1)
			return null;
		else {
			Class131_Sub20_Sub19_Sub6 var6 = Class131_Sub20_Sub19_Sub6.method993(Class130.aClass100_899, var2, 0);
			if (var4 != -1) {
				final Class131_Sub20_Sub19_Sub6 var5 = Class131_Sub20_Sub19_Sub6.method993(Class130.aClass100_899, var4,
						0);
				final Class131_Sub20_Sub19_Sub6[] var7 = new Class131_Sub20_Sub19_Sub6[] { var6, var5 };
				var6 = new Class131_Sub20_Sub19_Sub6(var7, 2);
			}

			int var3;
			if (aShortArray1413 != null)
				for (var3 = 0; var3 < aShortArray1413.length; ++var3)
					var6.method1010(aShortArray1413[var3], aShortArray1387[var3]);

			if (aShortArray1382 != null)
				for (var3 = 0; var3 < aShortArray1382.length; ++var3)
					var6.method1004(aShortArray1382[var3], aShortArray1381[var3]);

			return var6;
		}
	}

	public final boolean method699(final boolean var1) {
		int var2 = anInt1412;
		int var4 = anInt1400;
		if (var1) {
			var2 = anInt1402;
			var4 = anInt1379;
		}

		if (var2 == -1)
			return true;
		else {
			boolean var3 = true;
			if (!Class130.aClass100_899.method404(var2, 0))
				var3 = false;

			if ((var4 != -1) && !Class130.aClass100_899.method404(var4, 0))
				var3 = false;

			return var3;
		}
	}

	public final Class131_Sub20_Sub19_Sub7 method700(final int var1) {
		if ((anIntArray1407 != null) && (var1 > 1)) {
			int var3 = -1;

			for (int var4 = 0; var4 < 10; ++var4)
				if ((var1 >= anIntArray1395[var4]) && (anIntArray1395[var4] != 0))
					var3 = anIntArray1407[var4];

			if (var3 != -1)
				return Class79_Sub1.method645(var3, (short) 14934).method700(1);
		}

		Class131_Sub20_Sub19_Sub7 var6 = (Class131_Sub20_Sub19_Sub7) aClass121_1404.method482(anInt1423);
		if (var6 != null)
			return var6;
		else {
			final Class131_Sub20_Sub19_Sub6 var5 = Class131_Sub20_Sub19_Sub6.method993(Class130.aClass100_899,
					anInt1378, 0);
			if (var5 == null)
				return null;
			else {
				if ((anInt1411 != 128) || (anInt1405 != 128) || (anInt1398 != 128))
					var5.method997(anInt1411, anInt1405, anInt1398);

				int var2;
				if (aShortArray1413 != null)
					for (var2 = 0; var2 < aShortArray1413.length; ++var2)
						var5.method1010(aShortArray1413[var2], aShortArray1387[var2]);

				if (null != aShortArray1382)
					for (var2 = 0; var2 < aShortArray1382.length; ++var2)
						var5.method1004(aShortArray1382[var2], aShortArray1381[var2]);

				var6 = var5.method1001(64 + anInt1414, anInt1415 + 768, -50, -10, -50);
				var6.aBool1912 = true;
				aClass121_1404.method479(var6, anInt1423);
				return var6;
			}
		}
	}

	public final Class131_Sub20_Sub19_Sub6 method701(final boolean var1) {
		int var2 = anInt1392;
		int var4 = anInt1396;
		int var5 = anInt1401;
		if (var1) {
			var2 = anInt1373;
			var4 = anInt1399;
			var5 = anInt1394;
		}

		if (var2 == -1)
			return null;
		else {
			Class131_Sub20_Sub19_Sub6 var3 = Class131_Sub20_Sub19_Sub6.method993(Class130.aClass100_899, var2, 0);
			if (var4 != -1) {
				final Class131_Sub20_Sub19_Sub6 var7 = Class131_Sub20_Sub19_Sub6.method993(Class130.aClass100_899, var4,
						0);
				if (var5 != -1) {
					final Class131_Sub20_Sub19_Sub6 var8 = Class131_Sub20_Sub19_Sub6.method993(Class130.aClass100_899,
							var5, 0);
					final Class131_Sub20_Sub19_Sub6[] var9 = new Class131_Sub20_Sub19_Sub6[] { var3, var7, var8 };
					var3 = new Class131_Sub20_Sub19_Sub6(var9, 3);
				} else {
					final Class131_Sub20_Sub19_Sub6[] var10 = new Class131_Sub20_Sub19_Sub6[] { var3, var7 };
					var3 = new Class131_Sub20_Sub19_Sub6(var10, 2);
				}
			}

			if (!var1 && (anInt1397 != 0))
				var3.method1009(0, anInt1397, 0);

			if (var1 && (anInt1383 != 0))
				var3.method1009(0, anInt1383, 0);

			int var6;
			if (null != aShortArray1413)
				for (var6 = 0; var6 < aShortArray1413.length; ++var6)
					var3.method1010(aShortArray1413[var6], aShortArray1387[var6]);

			if (null != aShortArray1382)
				for (var6 = 0; var6 < aShortArray1382.length; ++var6)
					var3.method1004(aShortArray1382[var6], aShortArray1381[var6]);

			return var3;
		}
	}

	static int decodeSkipCount(final Class131_Sub14_Sub1 var0,BufferedWriter...bw) throws IOException {
		final int var1 = var0.readBits(2);
		//System.out.println("decodeskip: " + var1);
		
		if (bw.length > 0)
		bw[0].write("Skipcount : [2,"+var1+"]\n");
		int var2;
		if (var1 == 0)
			var2 = 0;
		else if (var1 == 1)
			var2 = var0.readBits(5);
		else if (var1 == 2)
			var2 = var0.readBits(8);
		else
			var2 = var0.readBits(11);

		return var2;
	}

	void method703(final Class131_Sub20_Sub2 var1, final Class131_Sub20_Sub2 var2) {
		anInt1378 = var1.anInt1378;
		anInt1384 = var1.anInt1384;
		anInt1376 = var1.anInt1376;
		anInt1386 = var1.anInt1386;
		anInt1388 = var1.anInt1388;
		anInt1390 = var1.anInt1390;
		anInt1389 = var1.anInt1389;
		aShortArray1413 = var2.aShortArray1413;
		aShortArray1387 = var2.aShortArray1387;
		aShortArray1382 = var2.aShortArray1382;
		aShortArray1381 = var2.aShortArray1381;
		aString1385 = var2.aString1385;
		aBool1403 = var2.aBool1403;
		anInt1408 = var2.anInt1408;
		anInt1392 = var2.anInt1392;
		anInt1396 = var2.anInt1396;
		anInt1401 = var2.anInt1401;
		anInt1373 = var2.anInt1373;
		anInt1399 = var2.anInt1399;
		anInt1394 = var2.anInt1394;
		anInt1412 = var2.anInt1412;
		anInt1400 = var2.anInt1400;
		anInt1402 = var2.anInt1402;
		anInt1379 = var2.anInt1379;
		anInt1416 = var2.anInt1416;
		aStringArray1393 = var2.aStringArray1393;
		aStringArray1406 = new String[5];
		if (var2.aStringArray1406 != null)
			for (int var3 = 0; var3 < 4; ++var3)
				aStringArray1406[var3] = var2.aStringArray1406[var3];

		aStringArray1406[4] = "Discard";
		anInt1391 = 0;
	}

	static void method704() {
		Class131_Sub20_Sub11.method766(Class29.aCanvas271);
		final Canvas var0 = Class29.aCanvas271;
		var0.removeMouseListener(Class81.aClass81_669);
		var0.removeMouseMotionListener(Class81.aClass81_669);
		var0.removeFocusListener(Class81.aClass81_669);
		Class81.anInt676 = 0;
		if (Class131_Sub14_Sub1.aClass71_1644 != null)
			Class131_Sub14_Sub1.aClass71_1644.method329(Class29.aCanvas271, -557998794);

		client.aclient2265.method1077();
		Class29.aCanvas271.setBackground(Color.black);
		Player1.method865(Class29.aCanvas271);
		Class24.method114(Class29.aCanvas271);
		if (null != Class131_Sub14_Sub1.aClass71_1644)
			Class131_Sub14_Sub1.aClass71_1644.method331(Class29.aCanvas271, (byte) 40);

		if (client.anInt2128 != -1)
			Class131_Sub20_Sub19_Sub2.method925(false);

		Applet_Sub1.aBool2019 = true;
	}
}
