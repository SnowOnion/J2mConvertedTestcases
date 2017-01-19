package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestELParser;

public class MainForTestELParser_testVariable {
    public static void main(String[] args) {
        try {
            TestELParser objTestELParser = new TestELParser();
            objTestELParser.testVariable();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
