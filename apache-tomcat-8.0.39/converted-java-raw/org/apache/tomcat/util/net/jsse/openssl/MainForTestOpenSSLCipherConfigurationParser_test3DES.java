package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_test3DES {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().test3DES();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}