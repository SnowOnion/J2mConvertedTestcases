package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testSSLv3 {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testSSLv3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}