package org.apache.coyote.http11;

import org.apache.coyote.http11.TestInternalInputBuffer;

public class MainForTestInternalInputBuffer_testNewLines {
    public static void main(String[] args) {
        try {
            TestInternalInputBuffer.setUpPerTestClass();
            TestInternalInputBuffer objTestInternalInputBuffer = new TestInternalInputBuffer();
            objTestInternalInputBuffer.setUp();
            objTestInternalInputBuffer.testNewLines();
            objTestInternalInputBuffer.tearDown();
            TestInternalInputBuffer.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
