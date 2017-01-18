package org.apache.catalina.nonblocking;

import org.apache.catalina.nonblocking.TestNonBlockingAPI;

public class MainForTestNonBlockingAPI_testNonBlockingWrite {
	public static void main(String[] args) {
		try {
			new TestNonBlockingAPI().testNonBlockingWrite();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}