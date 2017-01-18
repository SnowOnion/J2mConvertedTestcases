package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchErrorWithThreadDoubleThenComplete {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testDispatchErrorWithThreadDoubleThenComplete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}