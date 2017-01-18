package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchErrorWithThreadSingleThenComplete {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testDispatchErrorWithThreadSingleThenComplete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}