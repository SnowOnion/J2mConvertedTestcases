package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testSHA1 {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testSHA1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}