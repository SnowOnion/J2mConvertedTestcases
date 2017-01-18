package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestParameters;

public class MainForTestParameters_testAddParameters {
	public static void main(String[] args) {
		try {
			new TestParameters().testAddParameters();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}