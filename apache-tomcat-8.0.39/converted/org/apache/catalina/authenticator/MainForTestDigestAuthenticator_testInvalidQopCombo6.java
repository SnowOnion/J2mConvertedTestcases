package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testInvalidQopCombo6 {
    public static void main(String[] args) {
        try {
            TestDigestAuthenticator.setUpPerTestClass();
            TestDigestAuthenticator objTestDigestAuthenticator = new TestDigestAuthenticator();
            objTestDigestAuthenticator.testInvalidQopCombo6();
            objTestDigestAuthenticator.tearDown();
            TestDigestAuthenticator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
