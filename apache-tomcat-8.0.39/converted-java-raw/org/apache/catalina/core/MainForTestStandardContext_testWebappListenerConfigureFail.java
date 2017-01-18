package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testWebappListenerConfigureFail {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testWebappListenerConfigureFail();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}