package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndBasicAuthenticator;

public class MainForTestSSOnonLoginAndBasicAuthenticator_testBasicAccessThenAcceptAuthWithUri {
    public static void main(String[] args) {
        try {
            TestSSOnonLoginAndBasicAuthenticator.setUpPerTestClass();
            TestSSOnonLoginAndBasicAuthenticator objTestSSOnonLoginAndBasicAuthenticator = new TestSSOnonLoginAndBasicAuthenticator();
            objTestSSOnonLoginAndBasicAuthenticator.testBasicAccessThenAcceptAuthWithUri();
            TestSSOnonLoginAndBasicAuthenticator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
