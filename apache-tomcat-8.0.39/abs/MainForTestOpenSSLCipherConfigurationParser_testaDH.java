package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testADH {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testADH();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}