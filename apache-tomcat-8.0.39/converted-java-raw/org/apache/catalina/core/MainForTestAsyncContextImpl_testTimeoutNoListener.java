package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testTimeoutNoListener {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testTimeoutNoListener();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}