package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParser;

public class MainForTestParser_testBug48668a {
    public static void main(String[] args) {
        try {
            TestParser.setUpPerTestClass();
            TestParser objTestParser = new TestParser();
            objTestParser.setUp();
            objTestParser.testBug48668a();
            objTestParser.tearDown();
            TestParser.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
