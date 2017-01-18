package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testECDH {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testECDH();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}