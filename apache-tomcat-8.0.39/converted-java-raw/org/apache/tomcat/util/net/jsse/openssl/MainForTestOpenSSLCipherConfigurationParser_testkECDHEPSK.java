package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testkECDHEPSK {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testkECDHEPSK();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}