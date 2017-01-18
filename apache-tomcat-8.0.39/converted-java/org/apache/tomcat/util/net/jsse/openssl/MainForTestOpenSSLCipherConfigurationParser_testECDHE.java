package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testECDHE {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testECDHE();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}