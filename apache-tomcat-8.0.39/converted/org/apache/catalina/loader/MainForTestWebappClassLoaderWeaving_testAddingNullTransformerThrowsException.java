package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoaderWeaving;

public class MainForTestWebappClassLoaderWeaving_testAddingNullTransformerThrowsException {
    public static void main(String[] args) {
        try {
            TestWebappClassLoaderWeaving.setUpClass();
            TestWebappClassLoaderWeaving.setUpPerTestClass();
            TestWebappClassLoaderWeaving objTestWebappClassLoaderWeaving = new TestWebappClassLoaderWeaving();
            objTestWebappClassLoaderWeaving.setUp();
            objTestWebappClassLoaderWeaving.testAddingNullTransformerThrowsException();
            objTestWebappClassLoaderWeaving.tearDown();
            TestWebappClassLoaderWeaving.tearDownClass();
            TestWebappClassLoaderWeaving.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
