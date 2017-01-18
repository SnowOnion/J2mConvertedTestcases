package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testTLSv1 {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testTLSv1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}