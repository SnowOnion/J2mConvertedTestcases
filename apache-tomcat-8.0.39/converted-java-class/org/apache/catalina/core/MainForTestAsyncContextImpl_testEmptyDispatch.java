package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testEmptyDispatch {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testEmptyDispatch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}