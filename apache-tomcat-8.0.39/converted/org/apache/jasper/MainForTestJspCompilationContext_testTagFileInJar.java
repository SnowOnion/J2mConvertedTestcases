package org.apache.jasper;

import org.apache.jasper.TestJspCompilationContext;

public class MainForTestJspCompilationContext_testTagFileInJar {
    public static void main(String[] args) {
        try {
            TestJspCompilationContext.setUpPerTestClass();
            TestJspCompilationContext objTestJspCompilationContext = new TestJspCompilationContext();
            objTestJspCompilationContext.setUp();
            objTestJspCompilationContext.testTagFileInJar();
            objTestJspCompilationContext.tearDown();
            TestJspCompilationContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
