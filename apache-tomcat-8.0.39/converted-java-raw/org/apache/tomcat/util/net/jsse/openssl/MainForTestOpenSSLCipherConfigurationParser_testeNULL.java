package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testeNULL {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testeNULL();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}