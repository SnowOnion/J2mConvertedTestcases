package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoaderExecutorMemoryLeak;

public class MainForTestWebappClassLoaderExecutorMemoryLeak_testTimerThreadLeak {
    public static void main(String[] args) {
        try {
            TestWebappClassLoaderExecutorMemoryLeak.setUpPerTestClass();
            TestWebappClassLoaderExecutorMemoryLeak objTestWebappClassLoaderExecutorMemoryLeak = new TestWebappClassLoaderExecutorMemoryLeak();
            objTestWebappClassLoaderExecutorMemoryLeak.setUp();
            objTestWebappClassLoaderExecutorMemoryLeak.testTimerThreadLeak();
            objTestWebappClassLoaderExecutorMemoryLeak.tearDown();
            TestWebappClassLoaderExecutorMemoryLeak.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
