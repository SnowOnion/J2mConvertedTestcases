package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponse;

public class MainForTestResponse_testBug53062b {
	public static void main(String[] args) {
		try {
			new TestResponse().testBug53062b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}