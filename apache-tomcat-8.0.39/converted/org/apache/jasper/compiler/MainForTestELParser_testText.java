package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestELParser;

public class MainForTestELParser_testText {
    public static void main(String[] args) {
        try {
            TestELParser objTestELParser = new TestELParser();
            objTestELParser.testText();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
