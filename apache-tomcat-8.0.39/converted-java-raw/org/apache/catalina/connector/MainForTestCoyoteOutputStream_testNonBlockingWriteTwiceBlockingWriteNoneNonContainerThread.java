package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteOutputStream;

public class MainForTestCoyoteOutputStream_testNonBlockingWriteTwiceBlockingWriteNoneNonContainerThread {
	public static void main(String[] args) {
		try {
			new TestCoyoteOutputStream().testNonBlockingWriteTwiceBlockingWriteNoneNonContainerThread();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}