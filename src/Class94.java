import java.util.zip.CRC32;

public class Class94 {
	public static DataBuffer aClass131_Sub14_744;
	public static Class86 aClass86_754;
	public static DataBuffer aClass131_Sub14_758;
	public static int anInt756 = 0;
	public static Class114 aClass114_745 = new Class114(4096);
	public static int anInt761 = 0;
	public static Class114 aClass114_747 = new Class114(32);
	public static int anInt746 = 0;
	public static Class116 aClass116_749 = new Class116();
	static Class114 aClass114_750 = new Class114(4096);
	public static int anInt751 = 0;
	public static Class114 aClass114_752 = new Class114(4096);
	public static int anInt753 = 0;
	public static DataBuffer aClass131_Sub14_755 = new DataBuffer(8);
	public static int anInt743 = 0;
	public static CRC32 aCRC32_757 = new CRC32();
	public static Class100_Sub1[] aClass100_Sub1Array759 = new Class100_Sub1[256];
	public static byte aByte760 = 0;
	public static int anInt762 = 0;
	public static int anInt748 = 0;

	static Class131_Sub20_Sub18 method394(final int var0) {
		Class131_Sub20_Sub18 var1 = (Class131_Sub20_Sub18) Class131_Sub20_Sub18.aClass121_1641.method482(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var5 = Class44.aClass100_Sub1_443.method402(var0, 0);
			if (null == var5)
				return null;
			else {
				var1 = new Class131_Sub20_Sub18();
				final DataBuffer var2 = new DataBuffer(var5);
				var2.pos = var2.data.length - 12;
				final int var6 = var2.readIntV1();
				var1.anInt1634 = var2.readUShort();
				var1.anInt1638 = var2.readUShort();
				var1.anInt1639 = var2.readUShort();
				var1.anInt1640 = var2.readUShort();
				var2.pos = 0;
				var2.method601();
				var1.anIntArray1635 = new int[var6];
				var1.anIntArray1636 = new int[var6];
				var1.aStringArray1642 = new String[var6];

				int var4;
				for (int var3 = 0; var2.pos < (var2.data.length
						- 12); var1.anIntArray1635[var3++] = var4) {
					var4 = var2.readUShort();
					if (var4 == 3)
						var1.aStringArray1642[var3] = var2.method638();
					else if ((var4 < 100) && (var4 != 21) && (var4 != 38) && (var4 != 39))
						var1.anIntArray1636[var3] = var2.readIntV1();
					else
						var1.anIntArray1636[var3] = var2.method595();
				}

				Class131_Sub20_Sub18.aClass121_1641.method479(var1, var0);
				return var1;
			}
		}
	}
}
