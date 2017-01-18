package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponse;

public class MainForTestResponse_testBug53062h {
	public static void main(String[] args) {
		try {
			new TestResponse().testBug53062h();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}