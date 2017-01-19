package org.apache.coyote.http11;

import org.apache.coyote.http11.TestInternalInputBuffer;

public class MainForTestInternalInputBuffer_testBug51557NoColon {
    public static void main(String[] args) {
        try {
            TestInternalInputBuffer.setUpPerTestClass();
            TestInternalInputBuffer objTestInternalInputBuffer = new TestInternalInputBuffer();
            objTestInternalInputBuffer.setUp();
            objTestInternalInputBuffer.testBug51557NoColon();
            objTestInternalInputBuffer.tearDown();
            TestInternalInputBuffer.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
