package org.apache.catalina.connector;

import org.apache.catalina.connector.TestRequest;

public class MainForTestRequest_testBug49424WithChunking {
	public static void main(String[] args) {
		try {
			new TestRequest().testBug49424WithChunking();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}