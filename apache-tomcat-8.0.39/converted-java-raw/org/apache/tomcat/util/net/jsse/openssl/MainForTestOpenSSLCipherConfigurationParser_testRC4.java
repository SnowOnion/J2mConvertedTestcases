package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testRC4 {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testRC4();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}