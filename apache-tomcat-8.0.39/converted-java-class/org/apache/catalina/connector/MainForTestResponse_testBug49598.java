package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponse;

public class MainForTestResponse_testBug49598 {
	public static void main(String[] args) {
		try {
			new TestResponse().testBug49598();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}