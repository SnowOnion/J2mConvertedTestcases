package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testDispatchWithCustomRequestResponse {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testDispatchWithCustomRequestResponse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}