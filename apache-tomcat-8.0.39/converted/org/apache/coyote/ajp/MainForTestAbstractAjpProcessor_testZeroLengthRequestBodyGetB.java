package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testZeroLengthRequestBodyGetB {
    public static void main(String[] args) {
        try {
            TestAbstractAjpProcessor.setUpPerTestClass();
            TestAbstractAjpProcessor objTestAbstractAjpProcessor = new TestAbstractAjpProcessor();
            objTestAbstractAjpProcessor.setUp();
            objTestAbstractAjpProcessor.testZeroLengthRequestBodyGetB();
            objTestAbstractAjpProcessor.tearDown();
            TestAbstractAjpProcessor.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
