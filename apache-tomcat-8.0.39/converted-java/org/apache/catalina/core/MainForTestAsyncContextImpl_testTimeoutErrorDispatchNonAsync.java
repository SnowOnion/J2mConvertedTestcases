package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testTimeoutErrorDispatchNonAsync {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testTimeoutErrorDispatchNonAsync();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}