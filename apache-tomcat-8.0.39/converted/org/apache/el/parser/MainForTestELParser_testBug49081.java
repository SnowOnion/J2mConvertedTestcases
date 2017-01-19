package org.apache.el.parser;

import org.apache.el.parser.TestELParser;

public class MainForTestELParser_testBug49081 {
    public static void main(String[] args) {
        try {
            TestELParser objTestELParser = new TestELParser();
            objTestELParser.testBug49081();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
