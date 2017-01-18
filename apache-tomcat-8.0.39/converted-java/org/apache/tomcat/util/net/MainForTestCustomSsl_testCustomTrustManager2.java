package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestCustomSsl;

public class MainForTestCustomSsl_testCustomTrustManager2 {
	public static void main(String[] args) {
		try {
			new TestCustomSsl().testCustomTrustManager2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}