package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testBug51197c {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testBug51197c();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}