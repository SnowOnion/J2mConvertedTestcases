package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestCompiler;

public class MainForTestCompiler_testBug51584 {
    public static void main(String[] args) {
        try {
            TestCompiler.setUpPerTestClass();
            TestCompiler objTestCompiler = new TestCompiler();
            objTestCompiler.setUp();
            objTestCompiler.testBug51584();
            objTestCompiler.tearDown();
            TestCompiler.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
