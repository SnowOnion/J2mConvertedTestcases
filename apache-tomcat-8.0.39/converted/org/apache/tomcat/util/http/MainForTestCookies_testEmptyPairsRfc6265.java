package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_testEmptyPairsRfc6265 {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.testEmptyPairsRfc6265();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
