package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testLOW {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testLOW();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}