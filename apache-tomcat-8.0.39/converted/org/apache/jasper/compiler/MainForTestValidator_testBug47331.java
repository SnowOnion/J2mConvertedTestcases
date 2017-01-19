package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestValidator;

public class MainForTestValidator_testBug47331 {
    public static void main(String[] args) {
        try {
            TestValidator.setUpPerTestClass();
            TestValidator objTestValidator = new TestValidator();
            objTestValidator.setUp();
            objTestValidator.testBug47331();
            objTestValidator.tearDown();
            TestValidator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
