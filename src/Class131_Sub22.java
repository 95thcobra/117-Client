import java.util.Date;

public class Class131_Sub22 extends Class131 {
	int anInt1321;
	int anInt1324;
	int anInt1325;
	int anInt1326;
	int anInt1327;
	int anInt1328;
	int anInt1329;
	int anInt1330;
	int anInt1331;
	int anInt1332;
	int anInt1333;
	int anInt1334;
	int anInt1335;
	int anInt1336;
	int anInt1337;
	int anInt1338;
	int anInt1340;
	Class131_Sub16 aClass131_Sub16_1322;
	Class131_Sub2_Sub1 aClass131_Sub2_Sub1_1323;
	Class118 aClass118_1341;
	Class131_Sub4_Sub1 aClass131_Sub4_Sub1_1339;

	void method678() {
		aClass131_Sub16_1322 = null;
		aClass131_Sub2_Sub1_1323 = null;
		aClass118_1341 = null;
		aClass131_Sub4_Sub1_1339 = null;
	}

	public static String method679(final long var0) {
		Class64.aCalendar591.setTime(new Date(var0));
		final int var8 = Class64.aCalendar591.get(7);
		final int var3 = Class64.aCalendar591.get(5);
		final int var4 = Class64.aCalendar591.get(2);
		final int var5 = Class64.aCalendar591.get(1);
		final int var2 = Class64.aCalendar591.get(11);
		final int var7 = Class64.aCalendar591.get(12);
		final int var6 = Class64.aCalendar591.get(13);
		return Class64.aStringArray589[var8 - 1] + ", " + (var3 / 10) + (var3 % 10) + "-"
				+ Class64.aStringArrayArray593[0][var4] + "-" + var5 + " " + (var2 / 10) + (var2 % 10) + ":"
				+ (var7 / 10) + (var7 % 10) + ":" + (var6 / 10) + (var6 % 10) + " GMT";
	}
}
