package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testBug54178 {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testBug54178();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}