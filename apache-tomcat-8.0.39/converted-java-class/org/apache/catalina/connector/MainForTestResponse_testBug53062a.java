package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponse;

public class MainForTestResponse_testBug53062a {
	public static void main(String[] args) {
		try {
			new TestResponse().testBug53062a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}