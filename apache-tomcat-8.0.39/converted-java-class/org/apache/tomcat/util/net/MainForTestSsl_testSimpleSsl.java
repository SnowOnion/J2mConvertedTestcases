package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestSsl;

public class MainForTestSsl_testSimpleSsl {
	public static void main(String[] args) {
		try {
			new TestSsl().testSimpleSsl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}