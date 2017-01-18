package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testDH {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testDH();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}