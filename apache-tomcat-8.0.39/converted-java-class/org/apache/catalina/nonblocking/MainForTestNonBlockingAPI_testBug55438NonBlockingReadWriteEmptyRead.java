package org.apache.catalina.nonblocking;

import org.apache.catalina.nonblocking.TestNonBlockingAPI;

public class MainForTestNonBlockingAPI_testBug55438NonBlockingReadWriteEmptyRead {
	public static void main(String[] args) {
		try {
			new TestNonBlockingAPI().testBug55438NonBlockingReadWriteEmptyRead();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}