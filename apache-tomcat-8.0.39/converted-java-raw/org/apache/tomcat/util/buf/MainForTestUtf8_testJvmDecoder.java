package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestUtf8;

public class MainForTestUtf8_testJvmDecoder {
	public static void main(String[] args) {
		try {
			new TestUtf8().testJvmDecoder();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}