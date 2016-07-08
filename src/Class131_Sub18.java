public class Class131_Sub18 extends Class131 {
	public static boolean[] aBoolArray1148;
	public Object[] anObjectArray1149;
	static Class100 aClass100_1151;
	public Object[] anObjectArray1155;
	public Object[] anObjectArray1170;
	public Class131_Sub18[] aClass131_Sub18Array1171;
	public static Class131_Sub18[][] aClass131_Sub18ArrayArray1174;
	public Object[] anObjectArray1195;
	public static Class100 aClass100_1206;
	public Object[] anObjectArray1232;
	public Object[] anObjectArray1242;
	public Object[] anObjectArray1259;
	public Object[] anObjectArray1260;
	public Object[] anObjectArray1265;
	public Object[] anObjectArray1267;
	static Class100 aClass100_1285;
	static Class131_Sub18[] aClass131_Sub18Array1293;
	public boolean aBool1238;
	public boolean aBool1263 = false;
	public int anInt1202;
	public int anInt1162 = 0;
	public int anInt1167 = 0;
	public int anInt1157 = 0;
	public int anInt1229 = 0;
	public int anInt1266 = 0;
	public int anInt1165 = 0;
	public int anInt1166 = 0;
	public int anInt1163 = 0;
	public int anInt1261 = 0;
	public int anInt1177 = -1;
	public boolean aBool1178 = false;
	public int anInt1181 = 0;
	public int anInt1182 = 0;
	public int anInt1193;
	public int anInt1280;
	public boolean aBool1290;
	public int anInt1201;
	public int anInt1172;
	public boolean aBool1196;
	public int anInt1189;
	public int anInt1197;
	public int anInt1205;
	public int anInt1207;
	public int anInt1208;
	public int anInt1209;
	public int anInt1210;
	public int anInt1150;
	public int anInt1277;
	public int anInt1160;
	public int anInt1217;
	public String aString1218;
	public int anInt1220;
	public int anInt1221;
	public int anInt1222;
	public int anInt1183 = 0;
	public boolean aBool1158;
	public int anInt1191;
	public int anInt1230;
	public String aString1237;
	public boolean aBool1215;
	public boolean aBool1223;
	public boolean aBool1245 = false;
	public String[] aStringArray1257;
	public int anInt1234;
	public int anInt1235;
	public boolean aBool1241;
	public int anInt1213;
	public boolean aBool1192;
	public boolean aBool1236;
	public String aString1199;
	public Object[] anObjectArray1239;
	public Object[] anObjectArray1244;
	public Object[] anObjectArray1278;
	public Object[] anObjectArray1249;
	public Object[] anObjectArray1248;
	public Object[] anObjectArray1250;
	public Object[] anObjectArray1268;
	public Object[] anObjectArray1254;
	public Object[] anObjectArray1256;
	public Object[] anObjectArray1262;
	public Object[] anObjectArray1169;
	public Object[] anObjectArray1240;
	public Object[] anObjectArray1275;
	public Object[] anObjectArray1176;
	public Object[] anObjectArray1284;
	public Object[] anObjectArray1246;
	public Object[] anObjectArray1247;
	public Object[] anObjectArray1258;
	public int[] anIntArray1251;
	public int[] anIntArray1253;
	public int[] anIntArray1255;
	public static boolean aBool1156 = false;
	public int anInt1161 = 0;
	public int anInt1231;
	public int[] anIntArray1270;
	public int[] anIntArray1271;
	public int[][] anIntArrayArray1269;
	public int[] anIntArray1292;
	public int[] anIntArray1154;
	public int anInt1224;
	public int anInt1225;
	public int[] anIntArray1226;
	public int[] anIntArray1227;
	public int[] anIntArray1228;
	public String aString1219;
	public String[] aStringArray1200;
	public int anInt1184 = 0;
	public int anInt1185 = 0;
	public int anInt1186 = 0;
	public int anInt1194;
	int anInt1203;
	int anInt1204;
	public int anInt1187;
	public String aString1273;
	public String aString1274;
	static Class121 aClass121_1152 = new Class121(200);
	static Class121 aClass121_1153 = new Class121(50);
	static Class121 aClass121_1164 = new Class121(20);
	static Class121 aClass121_1264 = new Class121(8);
	public int anInt1272 = -1;
	public int anInt1159 = -1;
	public int anInt1276 = 0;
	public int anInt1211 = 0;
	public int anInt1173 = 0;
	public int anInt1291 = 0;
	public int anInt1179 = 1;
	public int anInt1175 = 1;
	public int anInt1281 = 0;
	public int anInt1180 = 0;
	public Class27 aClass27_1188;
	public int anInt1243;
	public int anInt1214;
	public int anInt1216;
	public Class131_Sub18 aClass131_Sub18_1233;
	public int anInt1168;
	public int anInt1198;
	public int anInt1279;
	public int anInt1147;
	public boolean aBool1282;
	public boolean aBool1283;
	public int anInt1212;
	public int anInt1190;
	public int anInt1286;
	public int anInt1287;
	public int anInt1288;
	public int anInt1289;
	public boolean aBool1252;

	Object[] method661(final DataBuffer var1) {
		final int var2 = var1.readUByte();
		if (var2 == 0)
			return null;
		else {
			final Object[] var5 = new Object[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				final int var3 = var1.readUByte();
				if (var3 == 0)
					var5[var4] = new Integer(var1.readIntV1());
				else if (var3 == 1)
					var5[var4] = var1.readString();
			}

			aBool1238 = true;
			return var5;
		}
	}

	void method662(final DataBuffer var1) {
		var1.readUByte();
		aBool1263 = true;
		anInt1202 = var1.readUByte();
		anInt1162 = var1.readUShort();
		anInt1167 = var1.readShort();
		anInt1157 = var1.readShort();
		anInt1229 = var1.readUShort();
		if (anInt1202 == 9)
			anInt1266 = var1.readShort();
		else
			anInt1266 = var1.readUShort();

		anInt1165 = var1.readByte();
		anInt1166 = var1.readByte();
		anInt1163 = var1.readByte();
		anInt1261 = var1.readByte();
		anInt1177 = var1.readUShort();
		if (anInt1177 == '\uffff')
			anInt1177 = -1;
		else
			anInt1177 += anInt1272 & -65536;

		aBool1178 = var1.readUByte() == 1;
		if (anInt1202 == 0) {
			anInt1181 = var1.readUShort();
			anInt1182 = var1.readUShort();
			aBool1290 = var1.readUByte() == 1;
		}

		if (anInt1202 == 5) {
			anInt1193 = var1.readIntV1();
			anInt1280 = var1.readUShort();
			aBool1196 = var1.readUByte() == 1;
			anInt1189 = var1.readUByte();
			anInt1197 = var1.readUByte();
			anInt1205 = var1.readIntV1();
			aBool1158 = var1.readUByte() == 1;
			aBool1241 = var1.readUByte() == 1;
		}

		if (anInt1202 == 6) {
			anInt1201 = 1;
			anInt1172 = var1.readUShort();
			if (anInt1172 == '\uffff')
				anInt1172 = -1;

			anInt1207 = var1.readShort();
			anInt1208 = var1.readShort();
			anInt1209 = var1.readUShort();
			anInt1210 = var1.readUShort();
			anInt1150 = var1.readUShort();
			anInt1277 = var1.readUShort();
			anInt1160 = var1.readUShort();
			if (anInt1160 == '\uffff')
				anInt1160 = -1;

			aBool1215 = var1.readUByte() == 1;
			var1.readUShort();
			if (anInt1165 != 0)
				anInt1213 = var1.readUShort();

			if (anInt1166 != 0)
				var1.readUShort();
		}

		if (anInt1202 == 4) {
			anInt1217 = var1.readUShort();
			if (anInt1217 == '\uffff')
				anInt1217 = -1;

			aString1218 = var1.readString();
			anInt1220 = var1.readUByte();
			anInt1221 = var1.readUByte();
			anInt1222 = var1.readUByte();
			aBool1223 = var1.readUByte() == 1;
			anInt1183 = var1.readIntV1();
		}

		if (anInt1202 == 3) {
			anInt1183 = var1.readIntV1();
			aBool1245 = var1.readUByte() == 1;
			anInt1189 = var1.readUByte();
		}

		if (anInt1202 == 9) {
			anInt1191 = var1.readUByte();
			anInt1183 = var1.readIntV1();
			aBool1192 = var1.readUByte() == 1;
		}

		anInt1230 = var1.method598();
		aString1237 = var1.readString();
		final int var3 = var1.readUByte();
		if (var3 > 0) {
			aStringArray1257 = new String[var3];

			for (int var2 = 0; var2 < var3; ++var2)
				aStringArray1257[var2] = var1.readString();
		}

		anInt1234 = var1.readUByte();
		anInt1235 = var1.readUByte();
		aBool1236 = var1.readUByte() == 1;
		aString1199 = var1.readString();
		anObjectArray1239 = method661(var1);
		anObjectArray1244 = method661(var1);
		anObjectArray1278 = method661(var1);
		anObjectArray1249 = method661(var1);
		anObjectArray1248 = method661(var1);
		anObjectArray1250 = method661(var1);
		anObjectArray1268 = method661(var1);
		anObjectArray1254 = method661(var1);
		anObjectArray1256 = method661(var1);
		anObjectArray1262 = method661(var1);
		anObjectArray1169 = method661(var1);
		anObjectArray1240 = method661(var1);
		anObjectArray1275 = method661(var1);
		anObjectArray1176 = method661(var1);
		anObjectArray1284 = method661(var1);
		anObjectArray1246 = method661(var1);
		anObjectArray1247 = method661(var1);
		anObjectArray1258 = method661(var1);
		anIntArray1251 = method663(var1);
		anIntArray1253 = method663(var1);
		anIntArray1255 = method663(var1);
	}

	int[] method663(final DataBuffer var1) {
		final int var2 = var1.readUByte();
		if (var2 == 0)
			return null;
		else {
			final int[] var3 = new int[var2];

			for (int var4 = 0; var4 < var2; ++var4)
				var3[var4] = var1.readIntV1();

			return var3;
		}
	}

	public Class131_Sub20_Sub17_Sub3 method664(final boolean var1) {
		aBool1156 = false;
		int var3;
		if (var1)
			var3 = anInt1194;
		else
			var3 = anInt1193;

		if (var3 == -1)
			return null;
		else {
			final long var4 = ((aBool1241 ? 1L : 0L) << 39) + ((aBool1158 ? 1L : 0L) << 38) + ((long) anInt1197 << 36)
					+ var3 + ((long) anInt1205 << 40);
			Class131_Sub20_Sub17_Sub3 var2 = (Class131_Sub20_Sub17_Sub3) aClass121_1152.method482(var4);
			if (null != var2)
				return var2;
			else {
				var2 = Class131_Sub20_Sub4.method716(aClass100_1151, var3, 0);
				if (var2 == null) {
					aBool1156 = true;
					return null;
				} else {
					if (aBool1158)
						var2.method974();

					if (aBool1241)
						var2.method964();

					if (anInt1197 > 0)
						var2.method963(anInt1197);

					if (anInt1197 >= 1)
						var2.method970(1);

					if (anInt1197 >= 2)
						var2.method970(16777215);

					if (anInt1205 != 0)
						var2.method965(anInt1205);

					aClass121_1152.method479(var2, var4);
					return var2;
				}
			}
		}
	}

	public Class131_Sub20_Sub17_Sub4_Sub1 method665() {
		aBool1156 = false;
		if (anInt1217 == -1)
			return null;
		else {
			Class131_Sub20_Sub17_Sub4_Sub1 var1 = (Class131_Sub20_Sub17_Sub4_Sub1) aClass121_1164.method482(anInt1217);
			if (null != var1)
				return var1;
			else {
				var1 = Class68.method321(aClass100_1151, Class92.aClass100_741, anInt1217, 0);
				if (null != var1)
					aClass121_1164.method479(var1, anInt1217);
				else
					aBool1156 = true;

				return var1;
			}
		}
	}

	public Class131_Sub20_Sub17_Sub3 method666(final int var1) {
		aBool1156 = false;
		if ((var1 >= 0) && (var1 < anIntArray1228.length)) {
			final int var3 = anIntArray1228[var1];
			if (var3 == -1)
				return null;
			else {
				Class131_Sub20_Sub17_Sub3 var2 = (Class131_Sub20_Sub17_Sub3) aClass121_1152.method482(var3);
				if (var2 != null)
					return var2;
				else {
					var2 = Class131_Sub20_Sub4.method716(aClass100_1151, var3, 0);
					if (var2 != null)
						aClass121_1152.method479(var2, var3);
					else
						aBool1156 = true;

					return var2;
				}
			}
		} else
			return null;
	}

	void method667(final DataBuffer var1) {
		aBool1263 = false;
		anInt1202 = var1.readUByte();
		anInt1161 = var1.readUByte();
		anInt1162 = var1.readUShort();
		anInt1167 = var1.readShort();
		anInt1157 = var1.readShort();
		anInt1229 = var1.readUShort();
		anInt1266 = var1.readUShort();
		anInt1189 = var1.readUByte();
		anInt1177 = var1.readUShort();
		if (anInt1177 == '\uffff')
			anInt1177 = -1;
		else
			anInt1177 += anInt1272 & -65536;

		anInt1231 = var1.readUShort();
		if (anInt1231 == '\uffff')
			anInt1231 = -1;

		final int var5 = var1.readUByte();
		int var7;
		if (var5 > 0) {
			anIntArray1270 = new int[var5];
			anIntArray1271 = new int[var5];

			for (var7 = 0; var7 < var5; ++var7) {
				anIntArray1270[var7] = var1.readUByte();
				anIntArray1271[var7] = var1.readUShort();
			}
		}

		var7 = var1.readUByte();
		int var2;
		int var3;
		int var9;
		if (var7 > 0) {
			anIntArrayArray1269 = new int[var7][];

			for (var2 = 0; var2 < var7; ++var2) {
				var3 = var1.readUShort();
				anIntArrayArray1269[var2] = new int[var3];

				for (var9 = 0; var9 < var3; ++var9) {
					anIntArrayArray1269[var2][var9] = var1.readUShort();
					if (anIntArrayArray1269[var2][var9] == '\uffff')
						anIntArrayArray1269[var2][var9] = -1;
				}
			}
		}

		if (anInt1202 == 0) {
			anInt1182 = var1.readUShort();
			aBool1178 = var1.readUByte() == 1;
		}

		if (anInt1202 == 1) {
			var1.readUShort();
			var1.readUByte();
		}

		if (anInt1202 == 2) {
			anIntArray1292 = new int[anInt1229 * anInt1266];
			anIntArray1154 = new int[anInt1229 * anInt1266];
			var2 = var1.readUByte();
			if (var2 == 1)
				anInt1230 |= 268435456;

			var3 = var1.readUByte();
			if (var3 == 1)
				anInt1230 |= 1073741824;

			var9 = var1.readUByte();
			if (var9 == 1)
				anInt1230 |= Integer.MIN_VALUE;

			final int var10 = var1.readUByte();
			if (var10 == 1)
				anInt1230 |= 536870912;

			anInt1224 = var1.readUByte();
			anInt1225 = var1.readUByte();
			anIntArray1226 = new int[20];
			anIntArray1227 = new int[20];
			anIntArray1228 = new int[20];

			int var4;
			for (var4 = 0; var4 < 20; ++var4) {
				final int var11 = var1.readUByte();
				if (var11 == 1) {
					anIntArray1226[var4] = var1.readShort();
					anIntArray1227[var4] = var1.readShort();
					anIntArray1228[var4] = var1.readIntV1();
				} else
					anIntArray1228[var4] = -1;
			}

			aStringArray1200 = new String[5];

			for (var4 = 0; var4 < 5; ++var4) {
				final String var8 = var1.readString();
				if (var8.length() > 0) {
					aStringArray1200[var4] = var8;
					anInt1230 |= 1 << (23 + var4);
				}
			}
		}

		if (anInt1202 == 3)
			aBool1245 = var1.readUByte() == 1;

		if ((anInt1202 == 4) || (anInt1202 == 1)) {
			anInt1221 = var1.readUByte();
			anInt1222 = var1.readUByte();
			anInt1220 = var1.readUByte();
			anInt1217 = var1.readUShort();
			if (anInt1217 == '\uffff')
				anInt1217 = -1;

			aBool1223 = var1.readUByte() == 1;
		}

		if (anInt1202 == 4) {
			aString1218 = var1.readString();
			aString1219 = var1.readString();
		}

		if ((anInt1202 == 1) || (anInt1202 == 3) || (anInt1202 == 4))
			anInt1183 = var1.readIntV1();

		if ((anInt1202 == 3) || (anInt1202 == 4)) {
			anInt1184 = var1.readIntV1();
			anInt1185 = var1.readIntV1();
			anInt1186 = var1.readIntV1();
		}

		if (anInt1202 == 5) {
			anInt1193 = var1.readIntV1();
			anInt1194 = var1.readIntV1();
		}

		if (anInt1202 == 6) {
			anInt1201 = 1;
			anInt1172 = var1.readUShort();
			if (anInt1172 == '\uffff')
				anInt1172 = -1;

			anInt1203 = 1;
			anInt1204 = var1.readUShort();
			if (anInt1204 == '\uffff')
				anInt1204 = -1;

			anInt1160 = var1.readUShort();
			if (anInt1160 == '\uffff')
				anInt1160 = -1;

			anInt1187 = var1.readUShort();
			if (anInt1187 == '\uffff')
				anInt1187 = -1;

			anInt1277 = var1.readUShort();
			anInt1209 = var1.readUShort();
			anInt1210 = var1.readUShort();
		}

		if (anInt1202 == 7) {
			anIntArray1292 = new int[anInt1266 * anInt1229];
			anIntArray1154 = new int[anInt1229 * anInt1266];
			anInt1221 = var1.readUByte();
			anInt1217 = var1.readUShort();
			if (anInt1217 == '\uffff')
				anInt1217 = -1;

			aBool1223 = var1.readUByte() == 1;
			anInt1183 = var1.readIntV1();
			anInt1224 = var1.readShort();
			anInt1225 = var1.readShort();
			var2 = var1.readUByte();
			if (var2 == 1)
				anInt1230 |= 1073741824;

			aStringArray1200 = new String[5];

			for (var3 = 0; var3 < 5; ++var3) {
				final String var6 = var1.readString();
				if (var6.length() > 0) {
					aStringArray1200[var3] = var6;
					anInt1230 |= 1 << (23 + var3);
				}
			}
		}

		if (anInt1202 == 8)
			aString1218 = var1.readString();

		if ((anInt1161 == 2) || (anInt1202 == 2)) {
			aString1199 = var1.readString();
			aString1273 = var1.readString();
			var2 = var1.readUShort() & 63;
			anInt1230 |= var2 << 11;
		}

		if ((anInt1161 == 1) || (anInt1161 == 4) || (anInt1161 == 5) || (anInt1161 == 6)) {
			aString1274 = var1.readString();
			if (aString1274.length() == 0) {
				if (anInt1161 == 1)
					aString1274 = "Ok";

				if (anInt1161 == 4)
					aString1274 = "Select";

				if (anInt1161 == 5)
					aString1274 = "Select";

				if (anInt1161 == 6)
					aString1274 = "Continue";
			}
		}

		if ((anInt1161 == 1) || (anInt1161 == 4) || (anInt1161 == 5))
			anInt1230 |= 4194304;

		if (anInt1161 == 6)
			anInt1230 |= 1;

	}

	public void method668(final int var1, final String var2) {
		if ((null == aStringArray1257) || (aStringArray1257.length <= var1)) {
			final String[] var3 = new String[var1 + 1];
			if (null != aStringArray1257)
				for (int var4 = 0; var4 < aStringArray1257.length; ++var4)
					var3[var4] = aStringArray1257[var4];

			aStringArray1257 = var3;
		}

		aStringArray1257[var1] = var2;
	}

	public Class131_Sub18() {
		aClass27_1188 = Class27.aClass27_246;
		anInt1189 = 0;
		anInt1243 = 0;
		anInt1191 = 1;
		aBool1192 = false;
		anInt1193 = -1;
		anInt1194 = -1;
		anInt1280 = 0;
		aBool1196 = false;
		anInt1197 = 0;
		anInt1205 = 0;
		anInt1201 = 1;
		anInt1172 = -1;
		anInt1203 = 1;
		anInt1204 = -1;
		anInt1160 = -1;
		anInt1187 = -1;
		anInt1207 = 0;
		anInt1208 = 0;
		anInt1209 = 0;
		anInt1210 = 0;
		anInt1150 = 0;
		anInt1277 = 100;
		anInt1213 = 0;
		anInt1214 = 0;
		aBool1215 = false;
		anInt1216 = 2;
		anInt1217 = -1;
		aString1218 = "";
		aString1219 = "";
		anInt1220 = 0;
		anInt1221 = 0;
		anInt1222 = 0;
		aBool1223 = false;
		anInt1224 = 0;
		anInt1225 = 0;
		anInt1230 = 0;
		aString1237 = "";
		aClass131_Sub18_1233 = null;
		anInt1234 = 0;
		anInt1235 = 0;
		aBool1236 = false;
		aString1199 = "";
		aBool1238 = false;
		anInt1231 = -1;
		aString1273 = "";
		aString1274 = "Ok";
		anInt1168 = -1;
		anInt1198 = 0;
		anInt1279 = 0;
		anInt1147 = 0;
		aBool1282 = false;
		aBool1283 = false;
		anInt1212 = -1;
		anInt1190 = 0;
		anInt1286 = 0;
		anInt1287 = 0;
		anInt1288 = -1;
		anInt1289 = -1;
		aBool1290 = false;
		aBool1252 = false;
	}

	public void method669(final int var1, final int var2) {
		int var3 = anIntArray1292[var2];
		anIntArray1292[var2] = anIntArray1292[var1];
		anIntArray1292[var1] = var3;
		var3 = anIntArray1154[var2];
		anIntArray1154[var2] = anIntArray1154[var1];
		anIntArray1154[var1] = var3;
	}

	public Class131_Sub20_Sub21 method670(boolean var1) {
		if (anInt1194 == -1)
			var1 = false;

		final int var4 = var1 ? anInt1194 : anInt1193;
		if (var4 == -1)
			return null;
		else {
			final long var6 = ((long) anInt1205 << 40) + ((aBool1241 ? 1L : 0L) << 39) + var4 + ((long) anInt1197 << 36)
					+ ((aBool1158 ? 1L : 0L) << 38);
			Class131_Sub20_Sub21 var8 = (Class131_Sub20_Sub21) aClass121_1264.method482(var6);
			if (null != var8)
				return var8;
			else {
				final Class131_Sub20_Sub17_Sub3 var9 = method664(var1);
				if (null == var9)
					return null;
				else {
					final Class131_Sub20_Sub17_Sub3 var3 = var9.method961();
					final int[] var11 = new int[var3.anInt1827];
					final int[] var13 = new int[var3.anInt1827];

					for (int var12 = 0; var12 < var3.anInt1827; ++var12) {
						int var5 = 0;
						int var10 = var3.anInt1822;

						int var2;
						for (var2 = 0; var2 < var3.anInt1822; ++var2)
							if (var3.anIntArray1823[(var3.anInt1822 * var12) + var2] == 0) {
								var5 = var2;
								break;
							}

						for (var2 = var3.anInt1822 - 1; var2 >= var5; --var2)
							if (var3.anIntArray1823[(var12 * var3.anInt1822) + var2] == 0) {
								var10 = var2 + 1;
								break;
							}

						var11[var12] = var5;
						var13[var12] = var10 - var5;
					}

					var8 = new Class131_Sub20_Sub21(var3.anInt1822, var3.anInt1827, var13, var11, var4);
					aClass121_1264.method479(var8, var6);
					return var8;
				}
			}
		}
	}

	public Class131_Sub20_Sub19_Sub7 method671(final Class131_Sub20_Sub1 var1, final int var2, final boolean var3,
			final Class91 var4) {
		aBool1156 = false;
		int var5;
		int var6;
		if (var3) {
			var5 = anInt1203;
			var6 = anInt1204;
		} else {
			var5 = anInt1201;
			var6 = anInt1172;
		}

		if (var5 == 0)
			return null;
		else if ((var5 == 1) && (var6 == -1))
			return null;
		else {
			Class131_Sub20_Sub19_Sub7 var8 = (Class131_Sub20_Sub19_Sub7) aClass121_1153.method482((var5 << 16) + var6);
			if (null == var8) {
				Class131_Sub20_Sub19_Sub6 var7;
				if (var5 == 1) {
					var7 = Class131_Sub20_Sub19_Sub6.method993(aClass100_1285, var6, 0);
					if (null == var7) {
						aBool1156 = true;
						return null;
					}

					var8 = var7.method1001(64, 768, -50, -10, -50);
				}

				if (var5 == 2) {
					var7 = Class131_Sub20_Sub20.method879(var6).method730();
					if (null == var7) {
						aBool1156 = true;
						return null;
					}

					var8 = var7.method1001(64, 768, -50, -10, -50);
				}

				if (var5 == 3) {
					if (var4 == null)
						return null;

					var7 = var4.method387();
					if (var7 == null) {
						aBool1156 = true;
						return null;
					}

					var8 = var7.method1001(64, 768, -50, -10, -50);
				}

				if (var5 == 4) {
					final Class131_Sub20_Sub2 var9 = Class79_Sub1.method645(var6, (short) 26671);
					var7 = var9.method695(10);
					if (var7 == null) {
						aBool1156 = true;
						return null;
					}

					var8 = var7.method1001(64 + var9.anInt1414, var9.anInt1415 + 768, -50, -10, -50);
				}

				aClass121_1153.method479(var8, var6 + (var5 << 16));
			}

			if (null != var1)
				var8 = var1.method684(var8, var2);

			return var8;
		}
	}
}
