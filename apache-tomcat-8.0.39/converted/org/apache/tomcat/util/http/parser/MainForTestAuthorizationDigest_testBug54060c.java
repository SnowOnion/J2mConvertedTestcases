package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testBug54060c {
    public static void main(String[] args) {
        try {
            TestAuthorizationDigest objTestAuthorizationDigest = new TestAuthorizationDigest();
            objTestAuthorizationDigest.testBug54060c();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
