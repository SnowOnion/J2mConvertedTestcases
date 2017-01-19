package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testTokenQop {
    public static void main(String[] args) {
        try {
            TestAuthorizationDigest objTestAuthorizationDigest = new TestAuthorizationDigest();
            objTestAuthorizationDigest.testTokenQop();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
