package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testRSA {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testRSA();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}