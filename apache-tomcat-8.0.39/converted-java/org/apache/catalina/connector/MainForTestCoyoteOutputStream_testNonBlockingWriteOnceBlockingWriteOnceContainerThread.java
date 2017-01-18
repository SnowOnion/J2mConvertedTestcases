package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteOutputStream;

public class MainForTestCoyoteOutputStream_testNonBlockingWriteOnceBlockingWriteOnceContainerThread {
	public static void main(String[] args) {
		try {
			new TestCoyoteOutputStream().testNonBlockingWriteOnceBlockingWriteOnceContainerThread();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}