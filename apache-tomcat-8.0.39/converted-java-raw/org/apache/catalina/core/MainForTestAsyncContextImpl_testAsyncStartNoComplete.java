package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testAsyncStartNoComplete {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testAsyncStartNoComplete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}