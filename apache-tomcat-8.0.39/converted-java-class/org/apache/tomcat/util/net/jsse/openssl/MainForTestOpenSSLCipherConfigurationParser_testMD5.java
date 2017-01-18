package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testMD5 {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testMD5();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}