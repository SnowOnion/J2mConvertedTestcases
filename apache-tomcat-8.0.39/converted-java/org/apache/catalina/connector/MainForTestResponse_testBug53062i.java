package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponse;

public class MainForTestResponse_testBug53062i {
	public static void main(String[] args) {
		try {
			new TestResponse().testBug53062i();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}