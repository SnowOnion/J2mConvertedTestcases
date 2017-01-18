package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testkDH {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testkDH();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}