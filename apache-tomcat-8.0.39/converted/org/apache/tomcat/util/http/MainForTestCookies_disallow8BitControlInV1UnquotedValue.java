package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_disallow8BitControlInV1UnquotedValue {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.disallow8BitControlInV1UnquotedValue();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
