package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestOpenSSLCipherConfigurationParser;

public class MainForTestOpenSSLCipherConfigurationParser_testSHA384 {
	public static void main(String[] args) {
		try {
			new TestOpenSSLCipherConfigurationParser().testSHA384();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}