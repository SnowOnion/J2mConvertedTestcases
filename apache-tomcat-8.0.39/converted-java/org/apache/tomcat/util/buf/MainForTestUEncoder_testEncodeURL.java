package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestUEncoder;

public class MainForTestUEncoder_testEncodeURL {
	public static void main(String[] args) {
		try {
			new TestUEncoder().testEncodeURL();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}