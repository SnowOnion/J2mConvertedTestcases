package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testBadBase64InlineEquals {
    public static void main(String[] args) {
        try {
            TestBasicAuthParser objTestBasicAuthParser = new TestBasicAuthParser();
            objTestBasicAuthParser.testBadBase64InlineEquals();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
