package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParser;

public class MainForTestParser_testBug49297NoSpaceStrict {
    public static void main(String[] args) {
        try {
            TestParser.setUpPerTestClass();
            TestParser objTestParser = new TestParser();
            objTestParser.setUp();
            objTestParser.testBug49297NoSpaceStrict();
            objTestParser.tearDown();
            TestParser.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
