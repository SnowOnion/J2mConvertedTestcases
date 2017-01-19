package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchErrorDoubleThenComplete {
    public static void main(String[] args) {
        try {
            TestAsyncContextImpl.setUpPerTestClass();
            TestAsyncContextImpl objTestAsyncContextImpl = new TestAsyncContextImpl();
            objTestAsyncContextImpl.setUp();
            objTestAsyncContextImpl.testDispatchErrorDoubleThenComplete();
            objTestAsyncContextImpl.tearDown();
            TestAsyncContextImpl.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
