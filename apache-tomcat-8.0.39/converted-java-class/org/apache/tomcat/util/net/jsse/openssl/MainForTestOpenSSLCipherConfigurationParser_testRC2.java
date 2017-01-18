package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testRC2 {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testRC2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}