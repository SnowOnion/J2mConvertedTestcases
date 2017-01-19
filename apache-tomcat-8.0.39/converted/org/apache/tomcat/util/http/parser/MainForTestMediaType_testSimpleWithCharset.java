package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testSimpleWithCharset {
    public static void main(String[] args) {
        try {
            TestMediaType objTestMediaType = new TestMediaType();
            objTestMediaType.testSimpleWithCharset();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
