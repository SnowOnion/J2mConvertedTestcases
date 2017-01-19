package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_testJsonInV1 {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.testJsonInV1();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
