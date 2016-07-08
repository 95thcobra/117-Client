public class Class98 {
	public static void method398() {
		try {
			if (Class113.anInt830 == 1) {
				int var0 = Class113.aClass131_Sub4_Sub3_832.method894();
				if ((var0 > 0) && Class113.aClass131_Sub4_Sub3_832.method889()) {
					var0 -= Class113.anInt834;
					if (var0 < 0)
						var0 = 0;

					Class113.aClass131_Sub4_Sub3_832.method883(var0);
					return;
				}

				Class113.aClass131_Sub4_Sub3_832.method888();
				Class113.aClass131_Sub4_Sub3_832.method886();
				if (Class50.aClass100_495 != null)
					Class113.anInt830 = 2;
				else
					Class113.anInt830 = 0;

				Class79.aClass131_Sub15_649 = null;
				Class36.aClass21_368 = null;
			}
		} catch (final Exception var2) {
			var2.printStackTrace();
			Class113.aClass131_Sub4_Sub3_832.method888();
			Class113.anInt830 = 0;
			Class79.aClass131_Sub15_649 = null;
			Class36.aClass21_368 = null;
			Class50.aClass100_495 = null;
		}

	}
}
