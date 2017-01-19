package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testZeroLengthRequestBodyPostB {
    public static void main(String[] args) {
        try {
            TestAbstractAjpProcessor.setUpPerTestClass();
            TestAbstractAjpProcessor objTestAbstractAjpProcessor = new TestAbstractAjpProcessor();
            objTestAbstractAjpProcessor.setUp();
            objTestAbstractAjpProcessor.testZeroLengthRequestBodyPostB();
            objTestAbstractAjpProcessor.tearDown();
            TestAbstractAjpProcessor.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
