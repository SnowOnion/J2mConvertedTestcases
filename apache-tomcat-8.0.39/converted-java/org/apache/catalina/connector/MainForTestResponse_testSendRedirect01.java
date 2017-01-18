package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponse;

public class MainForTestResponse_testSendRedirect01 {
	public static void main(String[] args) {
		try {
			new TestResponse().testSendRedirect01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}