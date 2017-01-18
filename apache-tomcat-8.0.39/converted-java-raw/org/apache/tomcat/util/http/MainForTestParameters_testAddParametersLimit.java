package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestParameters;

public class MainForTestParameters_testAddParametersLimit {
	public static void main(String[] args) {
		try {
			new TestParameters().testAddParametersLimit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}