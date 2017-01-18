package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testEDH {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testEDH();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}