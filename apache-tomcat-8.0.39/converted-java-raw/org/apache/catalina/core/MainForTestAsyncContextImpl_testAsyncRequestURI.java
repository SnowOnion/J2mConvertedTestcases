package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testAsyncRequestURI {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testAsyncRequestURI();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}