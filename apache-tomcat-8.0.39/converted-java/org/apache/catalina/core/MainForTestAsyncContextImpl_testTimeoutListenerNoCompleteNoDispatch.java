package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testTimeoutListenerNoCompleteNoDispatch {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testTimeoutListenerNoCompleteNoDispatch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}