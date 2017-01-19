package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_testQuotedValueOld {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.testQuotedValueOld();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
