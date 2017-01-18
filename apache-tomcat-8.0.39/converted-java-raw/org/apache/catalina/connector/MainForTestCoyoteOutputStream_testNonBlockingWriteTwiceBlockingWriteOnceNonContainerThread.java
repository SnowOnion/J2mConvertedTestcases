package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteOutputStream;

public class MainForTestCoyoteOutputStream_testNonBlockingWriteTwiceBlockingWriteOnceNonContainerThread {
	public static void main(String[] args) {
		try {
			new TestCoyoteOutputStream().testNonBlockingWriteTwiceBlockingWriteOnceNonContainerThread();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}