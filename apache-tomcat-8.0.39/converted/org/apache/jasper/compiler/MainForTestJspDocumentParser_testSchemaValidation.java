package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestJspDocumentParser;

public class MainForTestJspDocumentParser_testSchemaValidation {
    public static void main(String[] args) {
        try {
            TestJspDocumentParser.setUpPerTestClass();
            TestJspDocumentParser objTestJspDocumentParser = new TestJspDocumentParser();
            objTestJspDocumentParser.setUp();
            objTestJspDocumentParser.testSchemaValidation();
            objTestJspDocumentParser.tearDown();
            TestJspDocumentParser.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
