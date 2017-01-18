package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testCHACHA20 {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testCHACHA20();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}