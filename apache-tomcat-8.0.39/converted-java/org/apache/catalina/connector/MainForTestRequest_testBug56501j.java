package org.apache.catalina.connector;

import org.apache.catalina.connector.TestRequest;

public class MainForTestRequest_testBug56501j {
	public static void main(String[] args) {
		try {
			new TestRequest().testBug56501j();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}