package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testGetRequestISE {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testGetRequestISE();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}