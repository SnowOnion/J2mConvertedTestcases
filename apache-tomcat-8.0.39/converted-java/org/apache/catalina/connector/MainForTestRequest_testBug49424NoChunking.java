package org.apache.catalina.connector;

import org.apache.catalina.connector.TestRequest;

public class MainForTestRequest_testBug49424NoChunking {
	public static void main(String[] args) {
		try {
			new TestRequest().testBug49424NoChunking();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}