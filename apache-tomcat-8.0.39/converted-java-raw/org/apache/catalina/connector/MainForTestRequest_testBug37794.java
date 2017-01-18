package org.apache.catalina.connector;

import org.apache.catalina.connector.TestRequest;

public class MainForTestRequest_testBug37794 {
	public static void main(String[] args) {
		try {
			new TestRequest().testBug37794();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}