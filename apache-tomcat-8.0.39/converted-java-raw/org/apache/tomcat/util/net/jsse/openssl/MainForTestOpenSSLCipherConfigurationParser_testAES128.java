package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testAES128 {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testAES128();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}