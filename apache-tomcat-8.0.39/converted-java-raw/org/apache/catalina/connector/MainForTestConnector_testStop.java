package org.apache.catalina.connector;

import org.apache.catalina.connector.TestConnector;

public class MainForTestConnector_testStop {
	public static void main(String[] args) {
		try {
			new TestConnector().testStop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}