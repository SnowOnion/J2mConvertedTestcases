package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchDouble {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testDispatchDouble();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}