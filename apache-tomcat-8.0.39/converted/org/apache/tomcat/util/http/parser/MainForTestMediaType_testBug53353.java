package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testBug53353 {
    public static void main(String[] args) {
        try {
            TestMediaType objTestMediaType = new TestMediaType();
            objTestMediaType.testBug53353();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
