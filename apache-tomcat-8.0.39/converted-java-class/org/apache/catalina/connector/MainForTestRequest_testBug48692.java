package org.apache.catalina.connector;

import org.apache.catalina.connector.TestRequest;

public class MainForTestRequest_testBug48692 {
	public static void main(String[] args) {
		try {
			new TestRequest().testBug48692();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}