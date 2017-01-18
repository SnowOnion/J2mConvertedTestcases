package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testDHE {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testDHE();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}