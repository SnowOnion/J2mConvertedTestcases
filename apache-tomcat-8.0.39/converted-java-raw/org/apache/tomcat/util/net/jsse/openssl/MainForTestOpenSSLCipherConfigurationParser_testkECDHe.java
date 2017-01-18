package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testkECDHE {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testkECDHE();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}