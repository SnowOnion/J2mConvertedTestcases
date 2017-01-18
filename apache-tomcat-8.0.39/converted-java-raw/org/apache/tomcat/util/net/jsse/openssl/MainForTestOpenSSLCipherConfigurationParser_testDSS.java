package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testDSS {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testDSS();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}