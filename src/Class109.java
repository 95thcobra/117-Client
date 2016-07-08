import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Class109 {
	static Class49 aClass49_813;
	static Class131_Sub20_Sub17_Sub3 aClass131_Sub20_Sub17_Sub3_814;

	static long method436() {
		try {
			final URL var0 = new URL(Class45.method226("services", false) + "m=accountappeal/login.ws");
			final URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			final OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			final InputStream var3 = var1.getInputStream();
			final DataBuffer var4 = new DataBuffer(new byte[1000]);

			do {
				final int var5 = var3.read(var4.data, var4.pos, 1000 - var4.pos);
				if (var5 == -1) {
					var4.pos = 0;
					final long var6 = var4.method600();
					return var6;
				}

				var4.pos += var5;
			} while (var4.pos < 1000);

			return 0L;
		} catch (final Exception var8) {
			return 0L;
		}
	}
}
