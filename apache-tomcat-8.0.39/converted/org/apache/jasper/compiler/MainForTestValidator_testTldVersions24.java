package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestValidator;

public class MainForTestValidator_testTldVersions24 {
    public static void main(String[] args) {
        try {
            TestValidator.setUpPerTestClass();
            TestValidator objTestValidator = new TestValidator();
            objTestValidator.setUp();
            objTestValidator.testTldVersions24();
            objTestValidator.tearDown();
            TestValidator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
