package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testALL {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testALL();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}