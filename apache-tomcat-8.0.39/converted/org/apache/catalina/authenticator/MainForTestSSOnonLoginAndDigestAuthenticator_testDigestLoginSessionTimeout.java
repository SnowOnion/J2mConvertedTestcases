package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndDigestAuthenticator;

public class MainForTestSSOnonLoginAndDigestAuthenticator_testDigestLoginSessionTimeout {
    public static void main(String[] args) {
        try {
            TestSSOnonLoginAndDigestAuthenticator.setUpPerTestClass();
            TestSSOnonLoginAndDigestAuthenticator objTestSSOnonLoginAndDigestAuthenticator = new TestSSOnonLoginAndDigestAuthenticator();
            objTestSSOnonLoginAndDigestAuthenticator.testDigestLoginSessionTimeout();
            objTestSSOnonLoginAndDigestAuthenticator.tearDown();
            TestSSOnonLoginAndDigestAuthenticator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
