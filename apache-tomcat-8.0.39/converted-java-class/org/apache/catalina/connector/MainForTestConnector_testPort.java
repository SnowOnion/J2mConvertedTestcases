package org.apache.catalina.connector;

import org.apache.catalina.connector.TestConnector;

public class MainForTestConnector_testPort {
	public static void main(String[] args) {
		try {
			new TestConnector().testPort();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}