package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParserNoStrictWhitespace;

public class MainForTestParserNoStrictWhitespace_testBug49297NoSpaceNotStrict {
    public static void main(String[] args) {
        try {
            TestParserNoStrictWhitespace.setUpPerTestClass();
            TestParserNoStrictWhitespace objTestParserNoStrictWhitespace = new TestParserNoStrictWhitespace();
            objTestParserNoStrictWhitespace.testBug49297NoSpaceNotStrict();
            objTestParserNoStrictWhitespace.tearDown();
            TestParserNoStrictWhitespace.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
