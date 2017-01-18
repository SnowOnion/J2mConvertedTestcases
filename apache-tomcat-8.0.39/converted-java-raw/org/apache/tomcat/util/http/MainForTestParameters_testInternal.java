package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestParameters;

public class MainForTestParameters_testInternal {
	public static void main(String[] args) {
		try {
			new TestParameters().testInternal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}