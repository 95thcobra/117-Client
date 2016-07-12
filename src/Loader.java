/**
 * Copyright (c) 2016 Kyle Fricilone
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;

/**
 * @author Kyle Fricilone
 * @date Jun 19, 2016
 */
public class Loader implements AppletStub {

	public static final boolean DO_RSA = false;
	
	/**
	 * The host address
	 */
	//private final String host = "oldschool6.runescape.com";
	private final String host = "127.0.0.1";
	
	/**
	 * The parameters of the client.
	 */
	private final Map<String, String> map = new HashMap<>();

	/**
	 * The main entry point of the current application.
	 *
	 * @param args
	 *            The command line arguments.
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	public static void main(final String[] args) throws Exception {
		final Loader applet = new Loader();
		applet.initialize();

		final Class<?> client = Class.forName("client");
		final Applet instance = (Applet) client.getConstructor().newInstance();
		
		final JFrame frame = new JFrame("OSRS #117");
		frame.add(instance);
		frame.setVisible(true);
		frame.setSize(781, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		client.getSuperclass().getMethod("setStub", AppletStub.class).invoke(instance, applet);
		client.getMethod("init").invoke(instance);
		client.getMethod("start").invoke(instance);
	}

	/**
	 * Reads the parameters text file, and stores the parameters.
	 *
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	private void initialize() throws MalformedURLException, IOException {
		map.put("initial_jar", "gamepack_7537386.jar");
		map.put("codebase", "http://oldschool6.runescape.com/");
		map.put("9", "true");
		map.put("8", "0");
		map.put("7", "true");
		map.put("6", "5627");
		map.put("5", "0");
		map.put("4", "0");
		map.put("3", "http://www.runescape.com/g=oldscape/slr.ws?order=LPWM");
		map.put("2", "0");
		map.put("15", "5");
		map.put("14", "true");
		map.put("13", "p1cxIGuofoIQPDzvIFDOawIZao205SgI4JDOroxQCWpmVFS9SHJwhA");
		map.put("12", "");
		map.put("11", ".runescape.com");
		map.put("10", "306");
		map.put("1", "1");
	}

	/* (non-Javadoc)
	 * @see java.applet.AppletStub#getParameter(java.lang.String)
	 */
	@Override
	public String getParameter(final String paramName) {
		return map.get(paramName);
	}

	/* (non-Javadoc)
	 * @see java.applet.AppletStub#getDocumentBase()
	 */
	@Override
	public URL getDocumentBase() {
		try {
			return new URL("http://" + host);
		} catch (final MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see java.applet.AppletStub#getCodeBase()
	 */
	@Override
	public URL getCodeBase() {
		try {
			return new URL("http://" + host);
		} catch (final MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see java.applet.AppletStub#isActive()
	 */
	@Override
	public boolean isActive() {
		return true;
	}

	/* (non-Javadoc)
	 * @see java.applet.AppletStub#getAppletContext()
	 */
	@Override
	public AppletContext getAppletContext() {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.applet.AppletStub#appletResize(int, int)
	 */
	@Override
	public void appletResize(int width, int height) { }

}
