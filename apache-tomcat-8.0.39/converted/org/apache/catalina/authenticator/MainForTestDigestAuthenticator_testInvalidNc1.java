package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testInvalidNc1 {
    public static void main(String[] args) {
        try {
            TestDigestAuthenticator.setUpPerTestClass();
            TestDigestAuthenticator objTestDigestAuthenticator = new TestDigestAuthenticator();
            objTestDigestAuthenticator.testInvalidNc1();
            objTestDigestAuthenticator.tearDown();
            TestDigestAuthenticator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
