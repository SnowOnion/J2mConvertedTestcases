package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestParameters;

public class MainForTestParameters_testNonExistantParameter {
	public static void main(String[] args) {
		try {
			new TestParameters().testNonExistantParameter();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}