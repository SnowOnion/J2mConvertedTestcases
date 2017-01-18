package org.apache.catalina.connector;

import org.apache.catalina.connector.TestKeepAliveCount;

public class MainForTestKeepAliveCount_testHttp11 {
	public static void main(String[] args) {
		try {
			new TestKeepAliveCount().testHttp11();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}