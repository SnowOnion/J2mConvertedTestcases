package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testaECDSA {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testaECDSA();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}