package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndBasicAuthenticator;

public class MainForTestSSOnonLoginAndBasicAuthenticator_testBasicLoginThenRejectWithoutCookie {
    public static void main(String[] args) {
        try {
            TestSSOnonLoginAndBasicAuthenticator.setUpPerTestClass();
            TestSSOnonLoginAndBasicAuthenticator objTestSSOnonLoginAndBasicAuthenticator = new TestSSOnonLoginAndBasicAuthenticator();
            objTestSSOnonLoginAndBasicAuthenticator.testBasicLoginThenRejectWithoutCookie();
            TestSSOnonLoginAndBasicAuthenticator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
