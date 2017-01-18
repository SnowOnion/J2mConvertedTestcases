package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchErrorWithThreadMultipleThenComplete {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testDispatchErrorWithThreadMultipleThenComplete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}