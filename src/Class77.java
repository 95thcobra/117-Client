import java.io.File;
import java.util.Hashtable;

public class Class77 {
	public static File aFile635;
	static byte[][] aByteArrayArray636;
	public static boolean aBool637 = false;
	static Hashtable aHashtable634 = new Hashtable(16);

	public static boolean method344(final int var0) {
		if (Class131_Sub18.aBoolArray1148[var0])
			return true;
		else if (!Class131_Sub18.aClass100_1206.method405(var0))
			return false;
		else {
			final int var1 = Class131_Sub18.aClass100_1206.method417(var0);
			if (var1 == 0) {
				Class131_Sub18.aBoolArray1148[var0] = true;
				return true;
			} else {
				if (Class131_Sub18.aClass131_Sub18ArrayArray1174[var0] == null)
					Class131_Sub18.aClass131_Sub18ArrayArray1174[var0] = new Class131_Sub18[var1];

				for (int var2 = 0; var2 < var1; ++var2)
					if (null == Class131_Sub18.aClass131_Sub18ArrayArray1174[var0][var2]) {
						final byte[] var3 = Class131_Sub18.aClass100_1206.method402(var0, var2);
						if (null != var3) {
							Class131_Sub18.aClass131_Sub18ArrayArray1174[var0][var2] = new Class131_Sub18();
							Class131_Sub18.aClass131_Sub18ArrayArray1174[var0][var2].anInt1272 = var2 + (var0 << 16);
							if (var3[0] == -1)
								Class131_Sub18.aClass131_Sub18ArrayArray1174[var0][var2]
										.method662(new DataBuffer(var3));
							else
								Class131_Sub18.aClass131_Sub18ArrayArray1174[var0][var2]
										.method667(new DataBuffer(var3));
						}
					}

				Class131_Sub18.aBoolArray1148[var0] = true;
				return true;
			}
		}
	}
}
