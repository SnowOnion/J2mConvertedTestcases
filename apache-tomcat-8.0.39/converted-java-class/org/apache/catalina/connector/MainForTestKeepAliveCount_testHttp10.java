package org.apache.catalina.connector;

import org.apache.catalina.connector.TestKeepAliveCount;

public class MainForTestKeepAliveCount_testHttp10 {
	public static void main(String[] args) {
		try {
			new TestKeepAliveCount().testHttp10();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}