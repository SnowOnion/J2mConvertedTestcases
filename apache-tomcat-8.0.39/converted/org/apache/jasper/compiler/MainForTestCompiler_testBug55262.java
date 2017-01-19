package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestCompiler;

public class MainForTestCompiler_testBug55262 {
    public static void main(String[] args) {
        try {
            TestCompiler.setUpPerTestClass();
            TestCompiler objTestCompiler = new TestCompiler();
            objTestCompiler.setUp();
            objTestCompiler.testBug55262();
            objTestCompiler.tearDown();
            TestCompiler.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
