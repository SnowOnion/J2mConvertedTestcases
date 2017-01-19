package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testPasswordHasColonLeading {
    public static void main(String[] args) {
        try {
            TestBasicAuthParser objTestBasicAuthParser = new TestBasicAuthParser();
            objTestBasicAuthParser.testPasswordHasColonLeading();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
