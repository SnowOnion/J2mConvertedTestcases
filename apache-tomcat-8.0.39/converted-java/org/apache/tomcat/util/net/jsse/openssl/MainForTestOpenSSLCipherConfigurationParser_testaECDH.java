package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testAECDH {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testAECDH();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}