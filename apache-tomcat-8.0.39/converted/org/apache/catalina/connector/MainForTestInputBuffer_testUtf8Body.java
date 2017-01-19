package org.apache.catalina.connector;

import org.apache.catalina.connector.TestInputBuffer;

public class MainForTestInputBuffer_testUtf8Body {
    public static void main(String[] args) {
        try {
            TestInputBuffer.setUpPerTestClass();
            TestInputBuffer objTestInputBuffer = new TestInputBuffer();
            objTestInputBuffer.setUp();
            objTestInputBuffer.testUtf8Body();
            objTestInputBuffer.tearDown();
            TestInputBuffer.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
