package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestAttributeParser;

public class MainForTestAttributeParser_testBug45451 {
    public static void main(String[] args) {
        try {
            TestAttributeParser objTestAttributeParser = new TestAttributeParser();
            objTestAttributeParser.testBug45451();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
