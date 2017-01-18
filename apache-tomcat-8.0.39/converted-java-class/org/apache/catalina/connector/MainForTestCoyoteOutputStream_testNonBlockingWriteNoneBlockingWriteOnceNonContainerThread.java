package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteOutputStream;

public class MainForTestCoyoteOutputStream_testNonBlockingWriteNoneBlockingWriteOnceNonContainerThread {
	public static void main(String[] args) {
		try {
			new TestCoyoteOutputStream().testNonBlockingWriteNoneBlockingWriteOnceNonContainerThread();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}