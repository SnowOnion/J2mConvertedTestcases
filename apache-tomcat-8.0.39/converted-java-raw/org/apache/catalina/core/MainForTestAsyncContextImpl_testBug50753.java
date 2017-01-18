package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testBug50753 {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testBug50753();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}