package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoaderThreadLocalMemoryLeak;

public class MainForTestWebappClassLoaderThreadLocalMemoryLeak_testThreadLocalLeak1 {
	public static void main(String[] args) {
		try {
			new TestWebappClassLoaderThreadLocalMemoryLeak().testThreadLocalLeak1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}