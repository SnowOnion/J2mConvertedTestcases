package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testkPSK {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testkPSK();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}