package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testCharsetQuoted {
    public static void main(String[] args) {
        try {
            TestMediaType objTestMediaType = new TestMediaType();
            objTestMediaType.testCharsetQuoted();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
