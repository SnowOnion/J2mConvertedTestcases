package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testGetResponseISE {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testGetResponseISE();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}