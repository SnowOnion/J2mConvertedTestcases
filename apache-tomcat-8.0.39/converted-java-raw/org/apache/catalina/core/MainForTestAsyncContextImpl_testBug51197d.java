package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testBug51197d {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testBug51197d();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}