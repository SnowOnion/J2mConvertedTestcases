package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testPasswordHasColonTrailing {
    public static void main(String[] args) {
        try {
            TestBasicAuthParser objTestBasicAuthParser = new TestBasicAuthParser();
            objTestBasicAuthParser.testPasswordHasColonTrailing();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
