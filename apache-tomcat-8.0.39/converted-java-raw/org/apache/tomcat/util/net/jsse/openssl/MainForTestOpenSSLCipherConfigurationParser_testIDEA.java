package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testIDEA {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testIDEA();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}