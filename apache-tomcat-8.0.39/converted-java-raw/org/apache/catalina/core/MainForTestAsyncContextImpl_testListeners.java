package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testListeners {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testListeners();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}