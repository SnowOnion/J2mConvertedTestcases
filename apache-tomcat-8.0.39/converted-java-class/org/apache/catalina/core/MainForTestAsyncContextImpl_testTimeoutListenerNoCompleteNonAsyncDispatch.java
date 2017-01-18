package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testTimeoutListenerNoCompleteNonAsyncDispatch {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testTimeoutListenerNoCompleteNonAsyncDispatch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}