package org.apache.catalina.connector;

import org.apache.catalina.connector.TestRequest;

public class MainForTestRequest_localeParsePerformance {
	public static void main(String[] args) {
		try {
			new TestRequest().localeParsePerformance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}