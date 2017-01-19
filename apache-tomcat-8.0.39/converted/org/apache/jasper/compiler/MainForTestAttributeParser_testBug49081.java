package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestAttributeParser;

public class MainForTestAttributeParser_testBug49081 {
    public static void main(String[] args) {
        try {
            TestAttributeParser objTestAttributeParser = new TestAttributeParser();
            objTestAttributeParser.testBug49081();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
