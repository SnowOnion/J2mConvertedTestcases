package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoaderWeaving;

public class MainForTestWebappClassLoaderWeaving_testCopiedClassLoaderExcludesResourcesAndTransformers {
    public static void main(String[] args) {
        try {
            TestWebappClassLoaderWeaving.setUpClass();
            TestWebappClassLoaderWeaving.setUpPerTestClass();
            TestWebappClassLoaderWeaving objTestWebappClassLoaderWeaving = new TestWebappClassLoaderWeaving();
            objTestWebappClassLoaderWeaving.setUp();
            objTestWebappClassLoaderWeaving.testCopiedClassLoaderExcludesResourcesAndTransformers();
            objTestWebappClassLoaderWeaving.tearDown();
            TestWebappClassLoaderWeaving.tearDownClass();
            TestWebappClassLoaderWeaving.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
