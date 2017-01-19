package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_v1DomainIsParsedOld {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.v1DomainIsParsedOld();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
