package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestJspConfig;

public class MainForTestJspConfig_testServlet25NoEL {
    public static void main(String[] args) {
        try {
            TestJspConfig.setUpPerTestClass();
            TestJspConfig objTestJspConfig = new TestJspConfig();
            objTestJspConfig.setUp();
            objTestJspConfig.testServlet25NoEL();
            objTestJspConfig.tearDown();
            TestJspConfig.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
