package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestCustomSsl;

public class MainForTestCustomSsl_testCustomSslImplementation {
	public static void main(String[] args) {
		try {
			new TestCustomSsl().testCustomSslImplementation();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}