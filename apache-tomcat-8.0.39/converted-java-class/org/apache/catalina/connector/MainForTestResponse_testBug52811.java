package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponse;

public class MainForTestResponse_testBug52811 {
	public static void main(String[] args) {
		try {
			new TestResponse().testBug52811();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}