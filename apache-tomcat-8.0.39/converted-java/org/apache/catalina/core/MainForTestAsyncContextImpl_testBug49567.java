package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testBug49567 {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testBug49567();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}