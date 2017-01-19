package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestAttributeParser;

public class MainForTestAttributeParser_testBug42565 {
    public static void main(String[] args) {
        try {
            TestAttributeParser objTestAttributeParser = new TestAttributeParser();
            objTestAttributeParser.testBug42565();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
