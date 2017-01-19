package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestELParser;

public class MainForTestELParser_testLiteral {
    public static void main(String[] args) {
        try {
            TestELParser objTestELParser = new TestELParser();
            objTestELParser.testLiteral();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
