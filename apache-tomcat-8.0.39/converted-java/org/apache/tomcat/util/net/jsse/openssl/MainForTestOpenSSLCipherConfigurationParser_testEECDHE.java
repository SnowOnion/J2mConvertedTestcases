package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testEECDHE {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testEECDHE();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}