package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestUDecoder;

public class MainForTestUDecoder_testURLDecodeStringInvalid {
	public static void main(String[] args) {
		try {
			new TestUDecoder().testURLDecodeStringInvalid();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}