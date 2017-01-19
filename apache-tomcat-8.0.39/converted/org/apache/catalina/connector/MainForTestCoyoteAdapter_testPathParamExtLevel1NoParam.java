package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteAdapter;

public class MainForTestCoyoteAdapter_testPathParamExtLevel1NoParam {
    public static void main(String[] args) {
        try {
            TestCoyoteAdapter.setUpPerTestClass();
            TestCoyoteAdapter objTestCoyoteAdapter = new TestCoyoteAdapter();
            objTestCoyoteAdapter.setUp();
            objTestCoyoteAdapter.testPathParamExtLevel1NoParam();
            objTestCoyoteAdapter.tearDown();
            TestCoyoteAdapter.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
