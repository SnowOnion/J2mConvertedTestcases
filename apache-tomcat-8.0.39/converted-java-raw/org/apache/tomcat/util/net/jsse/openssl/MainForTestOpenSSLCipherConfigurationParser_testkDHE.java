package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testkDHE {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testkDHE();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}