package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchErrorWithThreadMultiple {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testDispatchErrorWithThreadMultiple();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}