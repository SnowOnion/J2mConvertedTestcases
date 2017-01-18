package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testaPSK {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testaPSK();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}