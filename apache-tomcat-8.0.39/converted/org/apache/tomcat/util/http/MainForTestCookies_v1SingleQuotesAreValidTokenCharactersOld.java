package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_v1SingleQuotesAreValidTokenCharactersOld {
    public static void main(String[] args) {
        try {
            TestCookies objTestCookies = new TestCookies();
            objTestCookies.v1SingleQuotesAreValidTokenCharactersOld();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
