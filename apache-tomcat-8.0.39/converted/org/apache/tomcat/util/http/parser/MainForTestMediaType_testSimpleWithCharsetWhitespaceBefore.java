package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testSimpleWithCharsetWhitespaceBefore {
    public static void main(String[] args) {
        try {
            TestMediaType objTestMediaType = new TestMediaType();
            objTestMediaType.testSimpleWithCharsetWhitespaceBefore();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
