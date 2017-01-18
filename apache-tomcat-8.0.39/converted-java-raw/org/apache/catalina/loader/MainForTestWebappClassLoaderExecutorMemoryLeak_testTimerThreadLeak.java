package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoaderExecutorMemoryLeak;

public class MainForTestWebappClassLoaderExecutorMemoryLeak_testTimerThreadLeak {
	public static void main(String[] args) {
		try {
			new TestWebappClassLoaderExecutorMemoryLeak().testTimerThreadLeak();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}