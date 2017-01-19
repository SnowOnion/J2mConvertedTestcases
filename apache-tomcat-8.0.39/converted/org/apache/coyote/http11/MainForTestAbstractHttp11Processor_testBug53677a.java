package org.apache.coyote.http11;

import org.apache.coyote.http11.TestAbstractHttp11Processor;

public class MainForTestAbstractHttp11Processor_testBug53677a {
    public static void main(String[] args) {
        try {
            TestAbstractHttp11Processor.setUpPerTestClass();
            TestAbstractHttp11Processor objTestAbstractHttp11Processor = new TestAbstractHttp11Processor();
            objTestAbstractHttp11Processor.setUp();
            objTestAbstractHttp11Processor.testBug53677a();
            objTestAbstractHttp11Processor.tearDown();
            TestAbstractHttp11Processor.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
