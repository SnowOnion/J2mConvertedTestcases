package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testaGOST {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testaGOST();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}