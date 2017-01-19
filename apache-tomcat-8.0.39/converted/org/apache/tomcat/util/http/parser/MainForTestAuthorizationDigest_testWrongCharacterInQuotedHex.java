package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testWrongCharacterInQuotedHex {
    public static void main(String[] args) {
        try {
            TestAuthorizationDigest objTestAuthorizationDigest = new TestAuthorizationDigest();
            objTestAuthorizationDigest.testWrongCharacterInQuotedHex();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
