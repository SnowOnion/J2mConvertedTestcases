package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestHexUtils;

public class MainForTestHexUtils_testRoundTrip01 {
	public static void main(String[] args) {
		try {
			new TestHexUtils().testRoundTrip01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}