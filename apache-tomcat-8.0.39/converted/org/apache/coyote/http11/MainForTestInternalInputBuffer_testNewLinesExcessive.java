package org.apache.coyote.http11;

import org.apache.coyote.http11.TestInternalInputBuffer;

public class MainForTestInternalInputBuffer_testNewLinesExcessive {
    public static void main(String[] args) {
        try {
            TestInternalInputBuffer.setUpPerTestClass();
            TestInternalInputBuffer objTestInternalInputBuffer = new TestInternalInputBuffer();
            objTestInternalInputBuffer.setUp();
            objTestInternalInputBuffer.testNewLinesExcessive();
            objTestInternalInputBuffer.tearDown();
            TestInternalInputBuffer.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
