package org.apache.jasper.servlet;

import org.apache.jasper.servlet.TestTldScanner;

public class MainForTestTldScanner_testBug55807 {
    public static void main(String[] args) {
        try {
            TestTldScanner.setUpPerTestClass();
            TestTldScanner objTestTldScanner = new TestTldScanner();
            objTestTldScanner.setUp();
            objTestTldScanner.testBug55807();
            objTestTldScanner.tearDown();
            TestTldScanner.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
