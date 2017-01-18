package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testFlagFailCtxIfServletStartFails {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testFlagFailCtxIfServletStartFails();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}