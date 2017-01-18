package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testPSK {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testPSK();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}