package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteOutputStream;

public class MainForTestCoyoteOutputStream_testNonBlockingWriteTwiceBlockingWriteNoneContainerThread {
	public static void main(String[] args) {
		try {
			new TestCoyoteOutputStream().testNonBlockingWriteTwiceBlockingWriteNoneContainerThread();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}