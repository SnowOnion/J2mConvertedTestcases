package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestB2CConverter;

public class MainForTestB2CConverter_testManyMessage {
	public static void main(String[] args) {
		try {
			new TestB2CConverter().testManyMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}