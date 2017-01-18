package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testTimeoutListenerCompleteNonAsyncDispatch {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testTimeoutListenerCompleteNonAsyncDispatch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}