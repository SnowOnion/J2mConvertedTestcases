package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testaGOST01 {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testaGOST01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}