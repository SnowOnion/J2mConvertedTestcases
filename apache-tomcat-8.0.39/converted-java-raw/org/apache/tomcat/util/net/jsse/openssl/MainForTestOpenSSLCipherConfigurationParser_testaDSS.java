package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testaDSS {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testaDSS();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}