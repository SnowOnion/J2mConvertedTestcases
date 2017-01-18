package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteOutputStream;

public class MainForTestCoyoteOutputStream_testNonBlockingWriteNoneBlockingWriteNoneContainerThread {
	public static void main(String[] args) {
		try {
			new TestCoyoteOutputStream().testNonBlockingWriteNoneBlockingWriteNoneContainerThread();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}