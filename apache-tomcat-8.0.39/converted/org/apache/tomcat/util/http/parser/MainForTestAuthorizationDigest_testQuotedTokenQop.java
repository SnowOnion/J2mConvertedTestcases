package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testQuotedTokenQop {
    public static void main(String[] args) {
        try {
            TestAuthorizationDigest objTestAuthorizationDigest = new TestAuthorizationDigest();
            objTestAuthorizationDigest.testQuotedTokenQop();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
