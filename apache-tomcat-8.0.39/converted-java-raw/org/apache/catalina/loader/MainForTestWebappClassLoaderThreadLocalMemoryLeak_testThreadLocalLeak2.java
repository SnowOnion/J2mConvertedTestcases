package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoaderThreadLocalMemoryLeak;

public class MainForTestWebappClassLoaderThreadLocalMemoryLeak_testThreadLocalLeak2 {
	public static void main(String[] args) {
		try {
			new TestWebappClassLoaderThreadLocalMemoryLeak().testThreadLocalLeak2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}