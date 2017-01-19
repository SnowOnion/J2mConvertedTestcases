package org.apache.tomcat.util.scan;

import org.apache.tomcat.util.scan.TestJarScanner;

public class MainForTestJarScanner_testJarsToSkipFormat {
    public static void main(String[] args) {
        try {
            TestJarScanner.setUpPerTestClass();
            TestJarScanner objTestJarScanner = new TestJarScanner();
            objTestJarScanner.setUp();
            objTestJarScanner.testJarsToSkipFormat();
            objTestJarScanner.tearDown();
            TestJarScanner.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
