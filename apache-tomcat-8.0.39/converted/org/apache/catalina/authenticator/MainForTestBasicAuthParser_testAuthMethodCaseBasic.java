package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testAuthMethodCaseBasic {
    public static void main(String[] args) {
        try {
            TestBasicAuthParser objTestBasicAuthParser = new TestBasicAuthParser();
            objTestBasicAuthParser.testAuthMethodCaseBasic();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
