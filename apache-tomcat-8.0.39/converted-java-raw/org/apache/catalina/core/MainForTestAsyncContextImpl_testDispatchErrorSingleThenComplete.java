package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchErrorSingleThenComplete {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testDispatchErrorSingleThenComplete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}