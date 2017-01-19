package org.apache.catalina.connector;

import org.apache.catalina.connector.TestOutputBuffer;

public class MainForTestOutputBuffer_testWriteSpeed {
    public static void main(String[] args) {
        try {
            TestOutputBuffer.setUpPerTestClass();
            TestOutputBuffer objTestOutputBuffer = new TestOutputBuffer();
            objTestOutputBuffer.setUp();
            objTestOutputBuffer.testWriteSpeed();
            objTestOutputBuffer.tearDown();
            TestOutputBuffer.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
