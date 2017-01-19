package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_v1MismatchedQuotesOld {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.v1MismatchedQuotesOld();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
