package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoaderMemoryLeak;

public class MainForTestWebappClassLoaderMemoryLeak_testTimerThreadLeak {
    public static void main(String[] args) {
        try {
            TestWebappClassLoaderMemoryLeak.setUpPerTestClass();
            TestWebappClassLoaderMemoryLeak objTestWebappClassLoaderMemoryLeak = new TestWebappClassLoaderMemoryLeak();
            objTestWebappClassLoaderMemoryLeak.setUp();
            objTestWebappClassLoaderMemoryLeak.testTimerThreadLeak();
            objTestWebappClassLoaderMemoryLeak.tearDown();
            TestWebappClassLoaderMemoryLeak.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
