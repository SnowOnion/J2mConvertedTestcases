package org.apache.catalina.loader;

import org.apache.catalina.loader.TestVirtualWebappLoader;

public class MainForTestVirtualWebappLoader_testModified {
    public static void main(String[] args) {
        try {
            TestVirtualWebappLoader.setUpPerTestClass();
            TestVirtualWebappLoader objTestVirtualWebappLoader = new TestVirtualWebappLoader();
            objTestVirtualWebappLoader.setUp();
            objTestVirtualWebappLoader.testModified();
            objTestVirtualWebappLoader.tearDown();
            TestVirtualWebappLoader.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
