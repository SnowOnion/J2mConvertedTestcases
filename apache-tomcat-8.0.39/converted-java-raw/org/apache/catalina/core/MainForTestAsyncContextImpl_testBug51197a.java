package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testBug51197a {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testBug51197a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}