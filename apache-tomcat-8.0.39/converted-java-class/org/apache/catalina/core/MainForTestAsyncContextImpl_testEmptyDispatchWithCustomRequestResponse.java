package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testEmptyDispatchWithCustomRequestResponse {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testEmptyDispatchWithCustomRequestResponse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}