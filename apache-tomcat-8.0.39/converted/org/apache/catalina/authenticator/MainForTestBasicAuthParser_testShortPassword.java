package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testShortPassword {
    public static void main(String[] args) {
        try {
            TestBasicAuthParser objTestBasicAuthParser = new TestBasicAuthParser();
            objTestBasicAuthParser.testShortPassword();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
