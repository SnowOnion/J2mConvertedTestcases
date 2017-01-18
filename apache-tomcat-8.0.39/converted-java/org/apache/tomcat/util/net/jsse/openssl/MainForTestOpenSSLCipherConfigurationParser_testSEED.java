package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testSEED {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testSEED();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}