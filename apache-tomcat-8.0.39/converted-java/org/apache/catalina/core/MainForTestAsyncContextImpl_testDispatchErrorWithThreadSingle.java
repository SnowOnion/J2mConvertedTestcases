package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchErrorWithThreadSingle {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testDispatchErrorWithThreadSingle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}