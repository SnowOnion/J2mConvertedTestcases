package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testECDSA {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testECDSA();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}