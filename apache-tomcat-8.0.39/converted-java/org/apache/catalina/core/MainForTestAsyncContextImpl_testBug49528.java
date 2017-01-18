package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testBug49528 {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testBug49528();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}