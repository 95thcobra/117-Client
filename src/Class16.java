import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class Class16 {
	public int anInt150;
	int anInt151;
	public Image anImage152;
	public int[] anIntArray153;

	public abstract void method59(int var1, int var2, Component var3, byte var4);

	public final void method60() {
		Class131_Sub20_Sub17.method843(anIntArray153, anInt150, anInt151);
	}

	public abstract void method61(Graphics var1, int var2, int var3, int var4);

	public abstract void method62(Graphics var1, int var2, int var3, int var4, int var5, int var6);

	public static void method63(final DataBuffer var0) {
		final Class131_Sub24 var1 = new Class131_Sub24();
		var1.anInt1343 = var0.method595();
		var1.anInt1344 = var0.readIntV1();
		var1.anIntArray1345 = new int[var1.anInt1343];
		var1.anIntArray1350 = new int[var1.anInt1343];
		var1.aFieldArray1346 = new Field[var1.anInt1343];
		var1.anIntArray1347 = new int[var1.anInt1343];
		var1.aMethodArray1348 = new Method[var1.anInt1343];
		var1.aByteArrayArrayArray1349 = new byte[var1.anInt1343][][];

		for (int var2 = 0; var2 < var1.anInt1343; ++var2)
			try {
				final int var3 = var0.method595();
				String var4;
				String var5;
				int var6;
				if ((var3 != 0) && (var3 != 1) && (var3 != 2)) {
					if ((var3 == 3) || (var3 == 4)) {
						var4 = var0.method638();
						var5 = var0.method638();
						var6 = var0.method595();
						final String[] var7 = new String[var6];

						for (int var8 = 0; var8 < var6; ++var8)
							var7[var8] = var0.method638();

						final String var9 = var0.method638();
						final byte[][] var10 = new byte[var6][];
						int var12;
						if (var3 == 3)
							for (int var11 = 0; var11 < var6; ++var11) {
								var12 = var0.readIntV1();
								var10[var11] = new byte[var12];
								var0.method604(var10[var11], 0, var12);
							}

						var1.anIntArray1345[var2] = var3;
						final Class[] var13 = new Class[var6];

						for (var12 = 0; var12 < var6; ++var12)
							var13[var12] = Class131_Sub20_Sub6.method736(var7[var12]);

						final Class var14 = Class131_Sub20_Sub6.method736(var9);
						if (Class131_Sub20_Sub6.method736(var4).getClassLoader() == null)
							throw new SecurityException();

						final Method[] var15 = Class131_Sub20_Sub6.method736(var4).getDeclaredMethods();
						final Method[] var16 = var15;

						for (final Method var18 : var16) {
							if (var18.getName().equals(var5)) {
								final Class[] var19 = var18.getParameterTypes();
								if (var13.length == var19.length) {
									boolean var20 = true;

									for (int var21 = 0; var21 < var13.length; ++var21)
										if (var13[var21] != var19[var21]) {
											var20 = false;
											break;
										}

									if (var20 && (var14 == var18.getReturnType()))
										var1.aMethodArray1348[var2] = var18;
								}
							}
						}

						var1.aByteArrayArrayArray1349[var2] = var10;
					}
				} else {
					var4 = var0.method638();
					var5 = var0.method638();
					var6 = 0;
					if (var3 == 1)
						var6 = var0.readIntV1();

					var1.anIntArray1345[var2] = var3;
					var1.anIntArray1347[var2] = var6;
					if (Class131_Sub20_Sub6.method736(var4).getClassLoader() == null)
						throw new SecurityException();

					var1.aFieldArray1346[var2] = Class131_Sub20_Sub6.method736(var4).getDeclaredField(var5);
				}
			} catch (final ClassNotFoundException var23) {
				var1.anIntArray1350[var2] = -1;
			} catch (final SecurityException var24) {
				var1.anIntArray1350[var2] = -2;
			} catch (final NullPointerException var25) {
				var1.anIntArray1350[var2] = -3;
			} catch (final Exception var26) {
				var1.anIntArray1350[var2] = -4;
			} catch (final Throwable var27) {
				var1.anIntArray1350[var2] = -5;
			}

		Class135.aClass128_906.method494(var1);
	}

	static Class131_Sub20_Sub17_Sub3 method64() {
		final Class131_Sub20_Sub17_Sub3 var0 = new Class131_Sub20_Sub17_Sub3();
		var0.anInt1826 = Class13.anInt113;
		var0.anInt1828 = Class13.anInt115;
		var0.anInt1824 = Class13.anIntArray114[0];
		var0.anInt1825 = Class131_Sub20_Sub15.anIntArray1605[0];
		var0.anInt1822 = Class131_Sub20_Sub19_Sub3.anIntArray1766[0];
		var0.anInt1827 = NpcFlags.anIntArray54[0];
		final int var1 = var0.anInt1827 * var0.anInt1822;
		final byte[] var2 = Class13.aByteArrayArray117[0];
		var0.anIntArray1823 = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3)
			var0.anIntArray1823[var3] = Class36.anIntArray370[var2[var3] & 255];

		Class5.method28();
		return var0;
	}

	static int method65(final int var0, final int var1) {
		final Class131_Sub11 var2 = (Class131_Sub11) Class131_Sub11.aClass114_1074.method457(var0);
		return var2 != null ? ((var1 >= 0) && (var1 < var2.anIntArray1070.length) ? var2.anIntArray1070[var1] : -1)
				: -1;
	}
}
