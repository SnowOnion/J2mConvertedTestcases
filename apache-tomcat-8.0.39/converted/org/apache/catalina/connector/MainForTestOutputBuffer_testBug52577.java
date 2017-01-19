package org.apache.catalina.connector;

import org.apache.catalina.connector.TestOutputBuffer;

public class MainForTestOutputBuffer_testBug52577 {
    public static void main(String[] args) {
        try {
            TestOutputBuffer.setUpPerTestClass();
            TestOutputBuffer objTestOutputBuffer = new TestOutputBuffer();
            objTestOutputBuffer.setUp();
            objTestOutputBuffer.testBug52577();
            objTestOutputBuffer.tearDown();
            TestOutputBuffer.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
