package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParser;

public class MainForTestParser_testBug49297Tag {
    public static void main(String[] args) {
        try {
            TestParser.setUpPerTestClass();
            TestParser objTestParser = new TestParser();
            objTestParser.setUp();
            objTestParser.testBug49297Tag();
            objTestParser.tearDown();
            TestParser.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
