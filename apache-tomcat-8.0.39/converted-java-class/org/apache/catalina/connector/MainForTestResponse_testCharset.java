package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponse;

public class MainForTestResponse_testCharset {
	public static void main(String[] args) {
		try {
			new TestResponse().testCharset();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}