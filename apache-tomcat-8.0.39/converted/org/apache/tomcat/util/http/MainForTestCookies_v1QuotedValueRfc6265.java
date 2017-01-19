package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_v1QuotedValueRfc6265 {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.v1QuotedValueRfc6265();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
