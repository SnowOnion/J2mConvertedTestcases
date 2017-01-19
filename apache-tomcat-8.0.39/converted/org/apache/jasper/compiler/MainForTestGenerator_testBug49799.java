package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestGenerator;

public class MainForTestGenerator_testBug49799 {
    public static void main(String[] args) {
        try {
            TestGenerator.setUpPerTestClass();
            TestGenerator objTestGenerator = new TestGenerator();
            objTestGenerator.setUp();
            objTestGenerator.testBug49799();
            objTestGenerator.tearDown();
            TestGenerator.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
