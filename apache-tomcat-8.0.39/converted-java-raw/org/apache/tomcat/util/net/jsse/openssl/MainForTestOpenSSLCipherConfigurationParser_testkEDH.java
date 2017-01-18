package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testkEDH {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testkEDH();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}