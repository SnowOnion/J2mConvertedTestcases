package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testBug59219b {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testBug59219b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}