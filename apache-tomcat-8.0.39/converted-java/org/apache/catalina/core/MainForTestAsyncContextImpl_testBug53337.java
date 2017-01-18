package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testBug53337 {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testBug53337();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}