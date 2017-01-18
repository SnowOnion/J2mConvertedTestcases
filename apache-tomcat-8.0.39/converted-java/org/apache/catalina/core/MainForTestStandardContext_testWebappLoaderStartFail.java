package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testWebappLoaderStartFail {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testWebappLoaderStartFail();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}