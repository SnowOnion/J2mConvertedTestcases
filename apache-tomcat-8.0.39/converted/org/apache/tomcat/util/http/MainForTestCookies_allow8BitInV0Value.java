package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_allow8BitInV0Value {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.allow8BitInV0Value();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
