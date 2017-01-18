package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testAES256 {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testAES256();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}