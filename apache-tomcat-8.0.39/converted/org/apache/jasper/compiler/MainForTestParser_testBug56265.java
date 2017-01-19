package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParser;

public class MainForTestParser_testBug56265 {
    public static void main(String[] args) {
        try {
            TestParser.setUpPerTestClass();
            TestParser objTestParser = new TestParser();
            objTestParser.setUp();
            objTestParser.testBug56265();
            objTestParser.tearDown();
            TestParser.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
