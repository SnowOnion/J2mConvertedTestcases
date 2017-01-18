package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestCipher;

public class MainForTestCipher_testOpenSSLCipherAvailability {
	public static void main(String[] args) {
		try {
			new TestCipher().testOpenSSLCipherAvailability();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}