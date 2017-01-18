package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testDEFAULT {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testDEFAULT();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}