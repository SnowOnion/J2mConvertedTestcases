package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testAuthMethodExtraLeadingSpace {
    public static void main(String[] args) {
        try {
            TestBasicAuthParser objTestBasicAuthParser = new TestBasicAuthParser();
            objTestBasicAuthParser.testAuthMethodExtraLeadingSpace();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
