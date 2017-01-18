package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testAESCCM8 {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testAESCCM8();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}