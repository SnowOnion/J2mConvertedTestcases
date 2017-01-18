package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testMEDIUM {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testMEDIUM();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}