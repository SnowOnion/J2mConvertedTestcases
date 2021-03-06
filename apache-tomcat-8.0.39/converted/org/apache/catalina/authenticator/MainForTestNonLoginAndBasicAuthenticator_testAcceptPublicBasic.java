package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestNonLoginAndBasicAuthenticator;

public class MainForTestNonLoginAndBasicAuthenticator_testAcceptPublicBasic {
    public static void main(String[] args) {
        try {
            TestNonLoginAndBasicAuthenticator.setUpPerTestClass();
            TestNonLoginAndBasicAuthenticator objTestNonLoginAndBasicAuthenticator = new TestNonLoginAndBasicAuthenticator();
            objTestNonLoginAndBasicAuthenticator.testAcceptPublicBasic();
            objTestNonLoginAndBasicAuthenticator.tearDown();
            TestNonLoginAndBasicAuthenticator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
