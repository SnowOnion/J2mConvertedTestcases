package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_testNameOnlyAreDroppedRfc6265 {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.testNameOnlyAreDroppedRfc6265();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
