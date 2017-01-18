package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteOutputStream;

public class MainForTestCoyoteOutputStream_testNonBlockingWriteOnceBlockingWriteOnceNonContainerThread {
	public static void main(String[] args) {
		try {
			new TestCoyoteOutputStream().testNonBlockingWriteOnceBlockingWriteOnceNonContainerThread();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}