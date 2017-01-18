package org.apache.catalina.nonblocking;

import org.apache.catalina.nonblocking.TestNonBlockingAPI;

public class MainForTestNonBlockingAPI_testNonBlockingReadIgnoreIsReady {
	public static void main(String[] args) {
		try {
			new TestNonBlockingAPI().testNonBlockingReadIgnoreIsReady();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}