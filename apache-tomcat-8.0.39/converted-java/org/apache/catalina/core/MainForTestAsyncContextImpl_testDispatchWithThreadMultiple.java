package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchWithThreadMultiple {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testDispatchWithThreadMultiple();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}