package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoaderThreadLocalMemoryLeak;

public class MainForTestWebappClassLoaderThreadLocalMemoryLeak_testThreadLocalLeak2 {
    public static void main(String[] args) {
        try {
            TestWebappClassLoaderThreadLocalMemoryLeak.setUpPerTestClass();
            TestWebappClassLoaderThreadLocalMemoryLeak objTestWebappClassLoaderThreadLocalMemoryLeak = new TestWebappClassLoaderThreadLocalMemoryLeak();
            objTestWebappClassLoaderThreadLocalMemoryLeak.setUp();
            objTestWebappClassLoaderThreadLocalMemoryLeak.testThreadLocalLeak2();
            objTestWebappClassLoaderThreadLocalMemoryLeak.tearDown();
            TestWebappClassLoaderThreadLocalMemoryLeak.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
