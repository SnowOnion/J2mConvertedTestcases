package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_disallowControlInV0Value {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.disallowControlInV0Value();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
