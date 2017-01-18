package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestCipher;

public class MainForTestCipher_testNames {
	public static void main(String[] args) {
		try {
			new TestCipher().testNames();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}