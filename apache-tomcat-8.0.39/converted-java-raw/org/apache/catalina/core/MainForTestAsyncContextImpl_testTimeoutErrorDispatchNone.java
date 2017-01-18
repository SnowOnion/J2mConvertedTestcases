package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testTimeoutErrorDispatchNone {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testTimeoutErrorDispatchNone();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}