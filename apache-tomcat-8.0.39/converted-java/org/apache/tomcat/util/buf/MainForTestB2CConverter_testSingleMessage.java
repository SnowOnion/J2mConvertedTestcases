package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestB2CConverter;

public class MainForTestB2CConverter_testSingleMessage {
	public static void main(String[] args) {
		try {
			new TestB2CConverter().testSingleMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}