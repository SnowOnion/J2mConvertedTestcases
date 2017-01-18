package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testAES {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testAES();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}