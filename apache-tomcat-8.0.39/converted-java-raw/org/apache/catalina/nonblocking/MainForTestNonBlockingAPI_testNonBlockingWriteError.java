package org.apache.catalina.nonblocking;

import org.apache.catalina.nonblocking.TestNonBlockingAPI;

public class MainForTestNonBlockingAPI_testNonBlockingWriteError {
	public static void main(String[] args) {
		try {
			new TestNonBlockingAPI().testNonBlockingWriteError();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}