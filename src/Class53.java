import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class53 {
	static void method273() {
		NpcFlags.username = NpcFlags.username.trim();
		if (NpcFlags.username.length() == 0)
			Class64.method306("Please enter your username.", "If you created your account after November",
					"2010, this will be the creation email address.");
		else {
			final long var0 = Class109.method436();
			byte var2;
			if (var0 == 0L)
				var2 = 5;
			else {
				final String var3 = NpcFlags.username;
				final Random var4 = new Random();
				final DataBuffer var5 = new DataBuffer(128);
				final DataBuffer var6 = new DataBuffer(128);
				final int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
				var5.writeByte(10);

				int var8;
				for (var8 = 0; var8 < 4; ++var8)
					var5.writeInt(var4.nextInt());

				var5.writeInt(var7[0]);
				var5.writeInt(var7[1]);
				var5.method635(var0);
				var5.method635(0L);

				for (var8 = 0; var8 < 4; ++var8)
					var5.writeInt(var4.nextInt());

				var5.doRsa(Class42.aBigInteger420, Class42.aBigInteger422);
				var6.writeByte(10);

				for (var8 = 0; var8 < 3; ++var8)
					var6.writeInt(var4.nextInt());

				var6.method635(var4.nextLong());
				var6.method603(var4.nextLong());
				final byte[] var9 = new byte[24];

				try {
					Class72.aClass140_617.method510(0L);
					Class72.aClass140_617.method511(var9);

					int var10;
					for (var10 = 0; (var10 < 24) && (var9[var10] == 0); ++var10)
						;

					if (var10 >= 24)
						throw new IOException();
				} catch (final Exception var23) {
					for (int var12 = 0; var12 < 24; ++var12)
						var9[var12] = -1;
				}

				var6.writeBytes(var9, 0, 24);
				var6.method635(var4.nextLong());
				var6.doRsa(Class42.aBigInteger420, Class42.aBigInteger422);
				var8 = Class131_Sub6.method554(var3);
				if ((var8 % 8) != 0)
					var8 += 8 - (var8 % 8);

				final DataBuffer var11 = new DataBuffer(var8);
				var11.writeStr(var3);
				var11.pos = var8;
				var11.method608(var7);
				DataBuffer var13 = new DataBuffer(var11.pos + var5.pos + 5 + var6.pos);
				var13.writeByte(2);
				var13.writeByte(var5.pos);
				var13.writeBytes(var5.data, 0, var5.pos);
				var13.writeByte(var6.pos);
				var13.writeBytes(var6.data, 0, var6.pos);
				var13.method586(var11.pos);
				var13.writeBytes(var11.data, 0, var11.pos);
				final String var14 = Class27.method122(var13.data);

				byte var20;
				try {
					final URL var15 = new URL(Class45.method226("services", false) + "m=accountappeal/login.ws");
					final URLConnection var16 = var15.openConnection();
					var16.setDoInput(true);
					var16.setDoOutput(true);
					var16.setConnectTimeout(5000);
					final OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
					var17.write(
							"data2=" + Class52.method272(var14) + "&dest=" + Class52.method272("passwordchoice.ws"));
					var17.flush();
					final InputStream var18 = var16.getInputStream();
					var13 = new DataBuffer(new byte[1000]);

					while (true) {
						final int var19 = var18.read(var13.data, var13.pos, 1000 - var13.pos);
						if (var19 == -1) {
							var17.close();
							var18.close();
							String var21 = new String(var13.data);
							if (var21.startsWith("OFFLINE"))
								var20 = 4;
							else if (var21.startsWith("WRONG"))
								var20 = 7;
							else if (var21.startsWith("RELOAD"))
								var20 = 3;
							else if (var21.startsWith("Not permitted for social network accounts."))
								var20 = 6;
							else {
								var13.method632(var7);

								while ((var13.pos > 0) && (var13.data[var13.pos - 1] == 0))
									--var13.pos;

								var21 = new String(var13.data, 0, var13.pos);
								if (Class1.method13(var21)) {
									Class131_Sub20_Sub19_Sub1.method918(var21, true, false);
									var20 = 2;
								} else
									var20 = 5;
							}
							break;
						}

						var13.pos += var19;
						if (var13.pos >= 1000) {
							var20 = 5;
							break;
						}
					}
				} catch (final Throwable var22) {
					var22.printStackTrace();
					var20 = 5;
				}

				var2 = var20;
			}

			switch (var2) {
			case 2:
				Class64.method306("", "Page has opened in a new window.", "(Please check your popup blocker.)");
				NpcFlags.anInt35 = 6;
				break;
			case 3:
				Class64.method306("", "Error connecting to server.", "");
				break;
			case 4:
				Class64.method306("The part of the website you are trying", "to connect to is offline at the moment.",
						"Please try again later.");
				break;
			case 5:
				Class64.method306("Sorry, there was an error trying to", "log you in to this part of the website.",
						"Please try again later.");
				break;
			case 6:
				Class64.method306("", "Error connecting to server.", "");
				break;
			case 7:
				Class64.method306("You must enter a valid login to proceed. For accounts",
						"created after 24th November 2010, please use your",
						"email address. Otherwise please use your username.");
			}

		}
	}

	public static boolean method274(final int var0) {
		return (var0 & 1) != 0;
	}
}
