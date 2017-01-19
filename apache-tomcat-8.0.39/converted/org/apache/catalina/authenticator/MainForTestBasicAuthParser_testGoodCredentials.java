package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testGoodCredentials {
    public static void main(String[] args) {
        try {
            TestBasicAuthParser objTestBasicAuthParser = new TestBasicAuthParser();
            objTestBasicAuthParser.testGoodCredentials();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
