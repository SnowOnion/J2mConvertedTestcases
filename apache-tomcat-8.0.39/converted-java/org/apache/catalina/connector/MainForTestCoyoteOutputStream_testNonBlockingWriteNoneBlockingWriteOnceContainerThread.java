package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteOutputStream;

public class MainForTestCoyoteOutputStream_testNonBlockingWriteNoneBlockingWriteOnceContainerThread {
	public static void main(String[] args) {
		try {
			new TestCoyoteOutputStream().testNonBlockingWriteNoneBlockingWriteOnceContainerThread();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}