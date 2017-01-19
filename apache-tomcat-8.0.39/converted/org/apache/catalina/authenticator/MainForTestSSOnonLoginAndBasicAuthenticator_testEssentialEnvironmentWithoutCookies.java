package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndBasicAuthenticator;

public class MainForTestSSOnonLoginAndBasicAuthenticator_testEssentialEnvironmentWithoutCookies {
    public static void main(String[] args) {
        try {
            TestSSOnonLoginAndBasicAuthenticator.setUpPerTestClass();
            TestSSOnonLoginAndBasicAuthenticator objTestSSOnonLoginAndBasicAuthenticator = new TestSSOnonLoginAndBasicAuthenticator();
            objTestSSOnonLoginAndBasicAuthenticator.testEssentialEnvironmentWithoutCookies();
            TestSSOnonLoginAndBasicAuthenticator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
