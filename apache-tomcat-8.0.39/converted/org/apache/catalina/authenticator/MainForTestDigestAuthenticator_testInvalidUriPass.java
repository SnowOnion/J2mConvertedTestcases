package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testInvalidUriPass {
    public static void main(String[] args) {
        try {
            TestDigestAuthenticator.setUpPerTestClass();
            TestDigestAuthenticator objTestDigestAuthenticator = new TestDigestAuthenticator();
            objTestDigestAuthenticator.testInvalidUriPass();
            objTestDigestAuthenticator.tearDown();
            TestDigestAuthenticator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
