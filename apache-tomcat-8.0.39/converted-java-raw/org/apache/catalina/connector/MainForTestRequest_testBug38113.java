package org.apache.catalina.connector;

import org.apache.catalina.connector.TestRequest;

public class MainForTestRequest_testBug38113 {
	public static void main(String[] args) {
		try {
			new TestRequest().testBug38113();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}