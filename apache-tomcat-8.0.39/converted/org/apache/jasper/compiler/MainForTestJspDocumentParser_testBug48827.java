package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestJspDocumentParser;

public class MainForTestJspDocumentParser_testBug48827 {
    public static void main(String[] args) {
        try {
            TestJspDocumentParser.setUpPerTestClass();
            TestJspDocumentParser objTestJspDocumentParser = new TestJspDocumentParser();
            objTestJspDocumentParser.setUp();
            objTestJspDocumentParser.testBug48827();
            objTestJspDocumentParser.tearDown();
            TestJspDocumentParser.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
