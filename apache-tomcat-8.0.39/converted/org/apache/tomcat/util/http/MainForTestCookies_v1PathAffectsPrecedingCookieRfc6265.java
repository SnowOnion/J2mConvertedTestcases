package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_v1PathAffectsPrecedingCookieRfc6265 {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.v1PathAffectsPrecedingCookieRfc6265();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
