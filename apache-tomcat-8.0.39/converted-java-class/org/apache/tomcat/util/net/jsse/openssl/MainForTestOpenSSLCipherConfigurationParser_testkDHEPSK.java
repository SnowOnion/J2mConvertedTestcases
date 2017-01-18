package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testkDHEPSK {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testkDHEPSK();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}