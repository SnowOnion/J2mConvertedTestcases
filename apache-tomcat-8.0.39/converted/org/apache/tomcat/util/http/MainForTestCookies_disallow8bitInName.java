package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_disallow8bitInName {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.disallow8bitInName();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
