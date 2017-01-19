package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParserNoStrictWhitespace;

public class MainForTestParserNoStrictWhitespace_testBug48668a {
    public static void main(String[] args) {
        try {
            TestParserNoStrictWhitespace.setUpPerTestClass();
            TestParserNoStrictWhitespace objTestParserNoStrictWhitespace = new TestParserNoStrictWhitespace();
            objTestParserNoStrictWhitespace.testBug48668a();
            objTestParserNoStrictWhitespace.tearDown();
            TestParserNoStrictWhitespace.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
