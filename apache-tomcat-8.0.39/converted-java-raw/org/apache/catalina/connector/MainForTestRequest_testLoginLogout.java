package org.apache.catalina.connector;

import org.apache.catalina.connector.TestRequest;

public class MainForTestRequest_testLoginLogout {
	public static void main(String[] args) {
		try {
			new TestRequest().testLoginLogout();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}