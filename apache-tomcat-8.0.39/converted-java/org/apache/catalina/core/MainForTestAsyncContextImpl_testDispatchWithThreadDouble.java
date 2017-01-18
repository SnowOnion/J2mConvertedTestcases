package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchWithThreadDouble {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testDispatchWithThreadDouble();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}