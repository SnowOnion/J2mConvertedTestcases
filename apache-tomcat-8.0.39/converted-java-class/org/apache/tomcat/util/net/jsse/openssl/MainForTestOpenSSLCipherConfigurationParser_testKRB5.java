package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testKRB5 {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testKRB5();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}