package org.apache.catalina.loader;

import org.apache.catalina.loader.TestVirtualContext;

public class MainForTestVirtualContext_testVirtualClassLoader {
    public static void main(String[] args) {
        try {
            TestVirtualContext.setUpPerTestClass();
            TestVirtualContext objTestVirtualContext = new TestVirtualContext();
            objTestVirtualContext.testVirtualClassLoader();
            objTestVirtualContext.tearDown();
            TestVirtualContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
