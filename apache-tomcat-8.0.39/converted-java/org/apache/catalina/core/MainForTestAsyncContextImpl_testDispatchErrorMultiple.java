package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchErrorMultiple {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testDispatchErrorMultiple();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}