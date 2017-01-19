package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestHttpParser;

public class MainForTestHttpParser_testTokenDel {
    public static void main(String[] args) {
        try {
            TestHttpParser objTestHttpParser = new TestHttpParser();
            objTestHttpParser.testTokenDel();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
