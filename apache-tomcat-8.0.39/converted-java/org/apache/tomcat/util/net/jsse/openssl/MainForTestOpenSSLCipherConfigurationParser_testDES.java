package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testDES {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testDES();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}