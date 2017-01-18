package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestUtf8;

public class MainForTestUtf8_testHarmonyDecoder {
	public static void main(String[] args) {
		try {
			new TestUtf8().testHarmonyDecoder();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}