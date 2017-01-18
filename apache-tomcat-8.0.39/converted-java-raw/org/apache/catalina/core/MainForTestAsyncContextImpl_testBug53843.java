package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testBug53843 {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testBug53843();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}