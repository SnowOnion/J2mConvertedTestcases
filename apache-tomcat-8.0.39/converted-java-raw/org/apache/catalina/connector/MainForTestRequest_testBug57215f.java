package org.apache.catalina.connector;

import org.apache.catalina.connector.TestRequest;

public class MainForTestRequest_testBug57215f {
	public static void main(String[] args) {
		try {
			new TestRequest().testBug57215f();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}