package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testErrorHandling {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testErrorHandling();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}