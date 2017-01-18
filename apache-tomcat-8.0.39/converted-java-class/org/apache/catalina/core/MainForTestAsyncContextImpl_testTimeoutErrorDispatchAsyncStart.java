package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testTimeoutErrorDispatchAsyncStart {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testTimeoutErrorDispatchAsyncStart();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}