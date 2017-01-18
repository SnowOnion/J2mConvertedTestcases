package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testForbiddenDispatching {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testForbiddenDispatching();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}