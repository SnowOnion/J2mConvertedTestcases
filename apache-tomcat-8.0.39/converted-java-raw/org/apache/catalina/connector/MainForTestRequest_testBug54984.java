package org.apache.catalina.connector;

import org.apache.catalina.connector.TestRequest;

public class MainForTestRequest_testBug54984 {
	public static void main(String[] args) {
		try {
			new TestRequest().testBug54984();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}