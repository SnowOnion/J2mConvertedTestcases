package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testAsyncContextListenerClearing {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testAsyncContextListenerClearing();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}