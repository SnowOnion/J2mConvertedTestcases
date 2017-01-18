package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchMultiple {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testDispatchMultiple();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}