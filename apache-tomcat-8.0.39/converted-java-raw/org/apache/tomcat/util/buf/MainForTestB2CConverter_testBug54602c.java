package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestB2CConverter;

public class MainForTestB2CConverter_testBug54602c {
	public static void main(String[] args) {
		try {
			new TestB2CConverter().testBug54602c();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}