package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_v1MismatchedQuotesRfc6265 {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.v1MismatchedQuotesRfc6265();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
