package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponse;

public class MainForTestResponse_testBug53469b {
	public static void main(String[] args) {
		try {
			new TestResponse().testBug53469b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}