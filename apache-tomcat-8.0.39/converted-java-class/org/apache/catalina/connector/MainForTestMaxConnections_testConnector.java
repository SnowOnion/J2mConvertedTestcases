package org.apache.catalina.connector;

import org.apache.catalina.connector.TestMaxConnections;

public class MainForTestMaxConnections_testConnector {
	public static void main(String[] args) {
		try {
			new TestMaxConnections().testConnector();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}