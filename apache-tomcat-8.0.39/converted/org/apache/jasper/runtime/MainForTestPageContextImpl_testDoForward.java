package org.apache.jasper.runtime;

import org.apache.jasper.runtime.TestPageContextImpl;

public class MainForTestPageContextImpl_testDoForward {
    public static void main(String[] args) {
        try {
            TestPageContextImpl.setUpPerTestClass();
            TestPageContextImpl objTestPageContextImpl = new TestPageContextImpl();
            objTestPageContextImpl.setUp();
            objTestPageContextImpl.testDoForward();
            objTestPageContextImpl.tearDown();
            TestPageContextImpl.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
