package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testaRSA {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testaRSA();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}