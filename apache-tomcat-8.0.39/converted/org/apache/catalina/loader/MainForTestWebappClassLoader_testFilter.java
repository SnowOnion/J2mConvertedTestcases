package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoader;

public class MainForTestWebappClassLoader_testFilter {
    public static void main(String[] args) {
        try {
            TestWebappClassLoader.setUpPerTestClass();
            TestWebappClassLoader objTestWebappClassLoader = new TestWebappClassLoader();
            objTestWebappClassLoader.setUp();
            objTestWebappClassLoader.testFilter();
            objTestWebappClassLoader.tearDown();
            TestWebappClassLoader.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
