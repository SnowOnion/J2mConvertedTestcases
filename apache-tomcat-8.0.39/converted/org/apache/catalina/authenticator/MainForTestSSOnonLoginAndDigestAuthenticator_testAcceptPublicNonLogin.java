package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndDigestAuthenticator;

public class MainForTestSSOnonLoginAndDigestAuthenticator_testAcceptPublicNonLogin {
    public static void main(String[] args) {
        try {
            TestSSOnonLoginAndDigestAuthenticator.setUpPerTestClass();
            TestSSOnonLoginAndDigestAuthenticator objTestSSOnonLoginAndDigestAuthenticator = new TestSSOnonLoginAndDigestAuthenticator();
            objTestSSOnonLoginAndDigestAuthenticator.testAcceptPublicNonLogin();
            objTestSSOnonLoginAndDigestAuthenticator.tearDown();
            TestSSOnonLoginAndDigestAuthenticator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
