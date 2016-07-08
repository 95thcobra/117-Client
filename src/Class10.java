public class Class10 {
	int anInt98 = 2;
	int[] anIntArray90 = new int[2];
	int[] anIntArray99 = new int[2];
	int anInt89;
	int anInt92;
	int anInt93;
	int anInt95;
	int anInt96;
	int anInt97;
	int anInt94;
	int anInt91;

	Class10() {
		anIntArray90[0] = 0;
		anIntArray90[1] = '\uffff';
		anIntArray99[0] = 0;
		anIntArray99[1] = '\uffff';
	}

	final void method42(final DataBuffer var1) {
		anInt89 = var1.readUByte();
		anInt92 = var1.readIntV1();
		anInt93 = var1.readIntV1();
		method45(var1);
	}

	final void method43() {
		anInt95 = 0;
		anInt96 = 0;
		anInt97 = 0;
		anInt94 = 0;
		anInt91 = 0;
	}

	final int method44(final int var1) {
		if (anInt91 >= anInt95) {
			anInt94 = anIntArray99[anInt96++] << 15;
			if (anInt96 >= anInt98)
				anInt96 = anInt98 - 1;

			anInt95 = (int) ((anIntArray90[anInt96] / 65536.0D) * var1);
			if (anInt95 > anInt91)
				anInt97 = ((anIntArray99[anInt96] << 15) - anInt94) / (anInt95 - anInt91);
		}

		anInt94 += anInt97;
		++anInt91;
		return (anInt94 - anInt97) >> 15;
	}

	final void method45(final DataBuffer var1) {
		anInt98 = var1.readUByte();
		anIntArray90 = new int[anInt98];
		anIntArray99 = new int[anInt98];

		for (int var2 = 0; var2 < anInt98; ++var2) {
			anIntArray90[var2] = var1.readUShort();
			anIntArray99[var2] = var1.readUShort();
		}

	}
}
