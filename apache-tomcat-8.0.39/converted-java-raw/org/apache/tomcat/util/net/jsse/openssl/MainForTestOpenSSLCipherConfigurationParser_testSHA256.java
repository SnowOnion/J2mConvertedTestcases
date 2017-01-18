package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testSHA256 {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testSHA256();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}