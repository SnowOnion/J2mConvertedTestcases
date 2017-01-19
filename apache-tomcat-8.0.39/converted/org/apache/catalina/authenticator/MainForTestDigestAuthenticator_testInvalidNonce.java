package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testInvalidNonce {
    public static void main(String[] args) {
        try {
            TestDigestAuthenticator.setUpPerTestClass();
            TestDigestAuthenticator objTestDigestAuthenticator = new TestDigestAuthenticator();
            objTestDigestAuthenticator.testInvalidNonce();
            objTestDigestAuthenticator.tearDown();
            TestDigestAuthenticator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
