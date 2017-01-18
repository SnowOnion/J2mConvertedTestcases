package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteOutputStream;

public class MainForTestCoyoteOutputStream_testNonBlockingWriteOnceBlockingWriteNoneContainerThread {
	public static void main(String[] args) {
		try {
			new TestCoyoteOutputStream().testNonBlockingWriteOnceBlockingWriteNoneContainerThread();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}