package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponse;

public class MainForTestResponse_testBug53062n {
	public static void main(String[] args) {
		try {
			new TestResponse().testBug53062n();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}