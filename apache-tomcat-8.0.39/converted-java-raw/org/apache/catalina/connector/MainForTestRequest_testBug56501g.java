package org.apache.catalina.connector;

import org.apache.catalina.connector.TestRequest;

public class MainForTestRequest_testBug56501g {
	public static void main(String[] args) {
		try {
			new TestRequest().testBug56501g();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}