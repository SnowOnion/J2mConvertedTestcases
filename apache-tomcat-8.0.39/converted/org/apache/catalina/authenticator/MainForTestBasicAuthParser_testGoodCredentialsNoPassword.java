package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testGoodCredentialsNoPassword {
    public static void main(String[] args) {
        try {
            TestBasicAuthParser objTestBasicAuthParser = new TestBasicAuthParser();
            objTestBasicAuthParser.testGoodCredentialsNoPassword();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
