package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationHttpRequest;

public class MainForTestApplicationHttpRequest_testParameterImmutability {
	public static void main(String[] args) {
		try {
			new TestApplicationHttpRequest().testParameterImmutability();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}