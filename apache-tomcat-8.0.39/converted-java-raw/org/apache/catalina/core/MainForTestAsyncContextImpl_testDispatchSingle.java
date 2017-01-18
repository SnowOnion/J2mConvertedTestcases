package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchSingle {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testDispatchSingle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}