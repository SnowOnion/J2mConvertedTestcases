package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testBug59219a {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testBug59219a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}