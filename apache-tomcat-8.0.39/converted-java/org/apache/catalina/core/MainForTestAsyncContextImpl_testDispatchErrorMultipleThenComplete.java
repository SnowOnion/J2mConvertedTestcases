package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchErrorMultipleThenComplete {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testDispatchErrorMultipleThenComplete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}