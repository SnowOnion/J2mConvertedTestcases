package org.apache.catalina.nonblocking;

import org.apache.catalina.nonblocking.TestNonBlockingAPI;

public class MainForTestNonBlockingAPI_testNonBlockingRead {
	public static void main(String[] args) {
		try {
			new TestNonBlockingAPI().testNonBlockingRead();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}