package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testNoChangedSessidWithCookies {
    public static void main(String[] args) {
        try {
            TestFormAuthenticator.setUpPerTestClass();
            TestFormAuthenticator objTestFormAuthenticator = new TestFormAuthenticator();
            objTestFormAuthenticator.setUp();
            objTestFormAuthenticator.testNoChangedSessidWithCookies();
            objTestFormAuthenticator.tearDown();
            TestFormAuthenticator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
