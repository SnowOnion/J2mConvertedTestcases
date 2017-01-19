package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestGenerator;

public class MainForTestGenerator_testBug45015b {
    public static void main(String[] args) {
        try {
            TestGenerator.setUpPerTestClass();
            TestGenerator objTestGenerator = new TestGenerator();
            objTestGenerator.setUp();
            objTestGenerator.testBug45015b();
            objTestGenerator.tearDown();
            TestGenerator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
