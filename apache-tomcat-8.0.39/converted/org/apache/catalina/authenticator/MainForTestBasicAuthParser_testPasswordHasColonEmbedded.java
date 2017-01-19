package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testPasswordHasColonEmbedded {
    public static void main(String[] args) {
        try {
            TestBasicAuthParser objTestBasicAuthParser = new TestBasicAuthParser();
            objTestBasicAuthParser.testPasswordHasColonEmbedded();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
