package org.apache.catalina.loader;

import org.apache.catalina.loader.TestVirtualContext;

public class MainForTestVirtualContext_testAdditionalWebInfClassesPaths {
    public static void main(String[] args) {
        try {
            TestVirtualContext.setUpPerTestClass();
            TestVirtualContext objTestVirtualContext = new TestVirtualContext();
            objTestVirtualContext.testAdditionalWebInfClassesPaths();
            objTestVirtualContext.tearDown();
            TestVirtualContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
