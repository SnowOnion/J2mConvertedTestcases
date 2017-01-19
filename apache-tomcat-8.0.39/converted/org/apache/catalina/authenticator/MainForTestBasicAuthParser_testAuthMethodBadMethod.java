package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testAuthMethodBadMethod {
    public static void main(String[] args) {
        try {
            TestBasicAuthParser objTestBasicAuthParser = new TestBasicAuthParser();
            objTestBasicAuthParser.testAuthMethodBadMethod();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
