package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testAsyncStartWithComplete {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testAsyncStartWithComplete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}