package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testGOST89MAC {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testGOST89MAC();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}