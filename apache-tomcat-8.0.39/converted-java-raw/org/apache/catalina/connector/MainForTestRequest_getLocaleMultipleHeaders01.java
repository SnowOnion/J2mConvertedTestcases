package org.apache.catalina.connector;

import org.apache.catalina.connector.TestRequest;

public class MainForTestRequest_getLocaleMultipleHeaders01 {
	public static void main(String[] args) {
		try {
			new TestRequest().getLocaleMultipleHeaders01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}