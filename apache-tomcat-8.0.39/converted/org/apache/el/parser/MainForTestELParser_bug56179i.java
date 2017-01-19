package org.apache.el.parser;

import org.apache.el.parser.TestELParser;

public class MainForTestELParser_bug56179i {
    public static void main(String[] args) {
        try {
            TestELParser objTestELParser = new TestELParser();
            objTestELParser.bug56179i();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
