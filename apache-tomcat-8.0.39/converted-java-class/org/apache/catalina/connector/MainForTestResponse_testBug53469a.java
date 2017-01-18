package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponse;

public class MainForTestResponse_testBug53469a {
	public static void main(String[] args) {
		try {
			new TestResponse().testBug53469a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}