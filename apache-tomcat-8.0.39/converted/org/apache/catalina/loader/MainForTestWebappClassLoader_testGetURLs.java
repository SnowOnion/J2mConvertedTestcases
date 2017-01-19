package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoader;

public class MainForTestWebappClassLoader_testGetURLs {
    public static void main(String[] args) {
        try {
            TestWebappClassLoader.setUpPerTestClass();
            TestWebappClassLoader objTestWebappClassLoader = new TestWebappClassLoader();
            objTestWebappClassLoader.setUp();
            objTestWebappClassLoader.testGetURLs();
            objTestWebappClassLoader.tearDown();
            TestWebappClassLoader.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
