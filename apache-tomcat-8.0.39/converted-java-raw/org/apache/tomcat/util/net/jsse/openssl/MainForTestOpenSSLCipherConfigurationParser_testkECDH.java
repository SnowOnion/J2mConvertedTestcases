package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testkECDH {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testkECDH();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}