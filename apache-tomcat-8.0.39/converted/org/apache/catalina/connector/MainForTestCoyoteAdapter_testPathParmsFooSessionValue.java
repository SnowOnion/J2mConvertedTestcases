package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteAdapter;

public class MainForTestCoyoteAdapter_testPathParmsFooSessionValue {
    public static void main(String[] args) {
        try {
            TestCoyoteAdapter.setUpPerTestClass();
            TestCoyoteAdapter objTestCoyoteAdapter = new TestCoyoteAdapter();
            objTestCoyoteAdapter.setUp();
            objTestCoyoteAdapter.testPathParmsFooSessionValue();
            objTestCoyoteAdapter.tearDown();
            TestCoyoteAdapter.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
