package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestCustomSsl;

public class MainForTestCustomSsl_testCustomTrustManager1 {
	public static void main(String[] args) {
		try {
			new TestCustomSsl().testCustomTrustManager1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}