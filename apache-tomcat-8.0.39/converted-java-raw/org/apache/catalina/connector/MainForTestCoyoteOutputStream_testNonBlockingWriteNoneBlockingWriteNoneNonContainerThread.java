package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteOutputStream;

public class MainForTestCoyoteOutputStream_testNonBlockingWriteNoneBlockingWriteNoneNonContainerThread {
	public static void main(String[] args) {
		try {
			new TestCoyoteOutputStream().testNonBlockingWriteNoneBlockingWriteNoneNonContainerThread();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}