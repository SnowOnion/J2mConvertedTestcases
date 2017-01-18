package org.apache.catalina.connector;

import org.apache.catalina.connector.TestRequest;

public class MainForTestRequest_testBug56501e {
	public static void main(String[] args) {
		try {
			new TestRequest().testBug56501e();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}