package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_disallowControlInName {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.disallowControlInName();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
