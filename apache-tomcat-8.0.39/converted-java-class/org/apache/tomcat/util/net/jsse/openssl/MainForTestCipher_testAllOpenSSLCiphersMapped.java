package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestCipher;

public class MainForTestCipher_testAllOpenSSLCiphersMapped {
	public static void main(String[] args) {
		try {
			new TestCipher().testAllOpenSSLCiphersMapped();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}