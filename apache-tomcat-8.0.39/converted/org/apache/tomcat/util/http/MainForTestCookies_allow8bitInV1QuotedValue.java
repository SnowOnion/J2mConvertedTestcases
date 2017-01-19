package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_allow8bitInV1QuotedValue {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.allow8bitInV1QuotedValue();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
