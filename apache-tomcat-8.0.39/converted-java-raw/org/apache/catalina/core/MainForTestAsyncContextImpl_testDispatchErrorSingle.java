package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchErrorSingle {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testDispatchErrorSingle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}