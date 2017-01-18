package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testTimeoutListenerCompleteNoDispatch {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testTimeoutListenerCompleteNoDispatch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}