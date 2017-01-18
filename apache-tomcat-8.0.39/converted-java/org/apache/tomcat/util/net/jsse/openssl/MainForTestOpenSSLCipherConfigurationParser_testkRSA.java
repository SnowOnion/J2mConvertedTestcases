package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testkRSA {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testkRSA();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}