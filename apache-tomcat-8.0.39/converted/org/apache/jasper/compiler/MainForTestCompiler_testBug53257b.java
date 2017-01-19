package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestCompiler;

public class MainForTestCompiler_testBug53257b {
    public static void main(String[] args) {
        try {
            TestCompiler.setUpPerTestClass();
            TestCompiler objTestCompiler = new TestCompiler();
            objTestCompiler.setUp();
            objTestCompiler.testBug53257b();
            objTestCompiler.tearDown();
            TestCompiler.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
