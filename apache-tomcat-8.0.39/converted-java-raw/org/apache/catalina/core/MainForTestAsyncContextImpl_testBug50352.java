package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testBug50352 {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testBug50352();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}