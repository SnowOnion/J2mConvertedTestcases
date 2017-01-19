package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndDigestAuthenticator;

public class MainForTestSSOnonLoginAndDigestAuthenticator_testRejectProtectedNonLogin {
    public static void main(String[] args) {
        try {
            TestSSOnonLoginAndDigestAuthenticator.setUpPerTestClass();
            TestSSOnonLoginAndDigestAuthenticator objTestSSOnonLoginAndDigestAuthenticator = new TestSSOnonLoginAndDigestAuthenticator();
            objTestSSOnonLoginAndDigestAuthenticator.testRejectProtectedNonLogin();
            objTestSSOnonLoginAndDigestAuthenticator.tearDown();
            TestSSOnonLoginAndDigestAuthenticator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
