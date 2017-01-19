package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testPostWithContinuePostRedirectNoServerCookies {
    public static void main(String[] args) {
        try {
            TestFormAuthenticator.setUpPerTestClass();
            TestFormAuthenticator objTestFormAuthenticator = new TestFormAuthenticator();
            objTestFormAuthenticator.setUp();
            objTestFormAuthenticator.testPostWithContinuePostRedirectNoServerCookies();
            objTestFormAuthenticator.tearDown();
            TestFormAuthenticator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
