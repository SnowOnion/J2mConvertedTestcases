package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testSimpleWithAll {
    public static void main(String[] args) {
        try {
            TestMediaType objTestMediaType = new TestMediaType();
            objTestMediaType.testSimpleWithAll();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
