package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testAsyncDispatchUrlWithSpaces {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testAsyncDispatchUrlWithSpaces();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}