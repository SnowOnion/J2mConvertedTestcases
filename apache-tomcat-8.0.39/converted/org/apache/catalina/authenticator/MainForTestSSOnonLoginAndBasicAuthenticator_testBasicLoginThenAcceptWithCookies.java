package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndBasicAuthenticator;

public class MainForTestSSOnonLoginAndBasicAuthenticator_testBasicLoginThenAcceptWithCookies {
    public static void main(String[] args) {
        try {
            TestSSOnonLoginAndBasicAuthenticator.setUpPerTestClass();
            TestSSOnonLoginAndBasicAuthenticator objTestSSOnonLoginAndBasicAuthenticator = new TestSSOnonLoginAndBasicAuthenticator();
            objTestSSOnonLoginAndBasicAuthenticator.testBasicLoginThenAcceptWithCookies();
            TestSSOnonLoginAndBasicAuthenticator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
