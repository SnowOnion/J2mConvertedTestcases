package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestGenerator;

public class MainForTestGenerator_testBug45015c {
    public static void main(String[] args) {
        try {
            TestGenerator.setUpPerTestClass();
            TestGenerator objTestGenerator = new TestGenerator();
            objTestGenerator.setUp();
            objTestGenerator.testBug45015c();
            objTestGenerator.tearDown();
            TestGenerator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
