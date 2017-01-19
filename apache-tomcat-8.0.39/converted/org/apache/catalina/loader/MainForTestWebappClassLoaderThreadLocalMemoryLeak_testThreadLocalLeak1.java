package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoaderThreadLocalMemoryLeak;

public class MainForTestWebappClassLoaderThreadLocalMemoryLeak_testThreadLocalLeak1 {
    public static void main(String[] args) {
        try {
            TestWebappClassLoaderThreadLocalMemoryLeak.setUpPerTestClass();
            TestWebappClassLoaderThreadLocalMemoryLeak objTestWebappClassLoaderThreadLocalMemoryLeak = new TestWebappClassLoaderThreadLocalMemoryLeak();
            objTestWebappClassLoaderThreadLocalMemoryLeak.setUp();
            objTestWebappClassLoaderThreadLocalMemoryLeak.testThreadLocalLeak1();
            objTestWebappClassLoaderThreadLocalMemoryLeak.tearDown();
            TestWebappClassLoaderThreadLocalMemoryLeak.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
