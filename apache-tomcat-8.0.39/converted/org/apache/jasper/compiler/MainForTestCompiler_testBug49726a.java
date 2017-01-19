package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestCompiler;

public class MainForTestCompiler_testBug49726a {
    public static void main(String[] args) {
        try {
            TestCompiler.setUpPerTestClass();
            TestCompiler objTestCompiler = new TestCompiler();
            objTestCompiler.setUp();
            objTestCompiler.testBug49726a();
            objTestCompiler.tearDown();
            TestCompiler.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
