package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestAttributeParser;

public class MainForTestAttributeParser_testBug44994 {
    public static void main(String[] args) {
        try {
            TestAttributeParser objTestAttributeParser = new TestAttributeParser();
            objTestAttributeParser.testBug44994();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
