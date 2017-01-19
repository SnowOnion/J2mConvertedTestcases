package org.apache.tomcat.util.net.jsse.openssl;

import org.apache.tomcat.util.net.jsse.openssl.TestCipher;

public class MainForTestCipher_testAllOpenSSLCiphersMapped {
    public static void main(String[] args) {
        try {
            TestCipher objTestCipher = new TestCipher();
            objTestCipher.testAllOpenSSLCiphersMapped();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
