package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_v1NameOnlyIsDroppedOld {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.v1NameOnlyIsDroppedOld();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
