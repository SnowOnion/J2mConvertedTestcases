package org.apache.jasper;

import org.apache.jasper.TestJspCompilationContext;

public class MainForTestJspCompilationContext_testModifiedTagFileInJar {
    public static void main(String[] args) {
        try {
            TestJspCompilationContext.setUpPerTestClass();
            TestJspCompilationContext objTestJspCompilationContext = new TestJspCompilationContext();
            objTestJspCompilationContext.setUp();
            objTestJspCompilationContext.testModifiedTagFileInJar();
            objTestJspCompilationContext.tearDown();
            TestJspCompilationContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
