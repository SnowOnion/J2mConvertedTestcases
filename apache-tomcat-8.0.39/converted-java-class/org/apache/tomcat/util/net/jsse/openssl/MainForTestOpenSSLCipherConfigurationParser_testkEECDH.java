package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testkEECDH {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testkEECDH();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}