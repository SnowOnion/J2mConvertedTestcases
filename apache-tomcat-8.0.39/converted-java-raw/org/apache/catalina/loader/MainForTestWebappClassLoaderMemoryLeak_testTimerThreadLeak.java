package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoaderMemoryLeak;

public class MainForTestWebappClassLoaderMemoryLeak_testTimerThreadLeak {
	public static void main(String[] args) {
		try {
			new TestWebappClassLoaderMemoryLeak().testTimerThreadLeak();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}