package org.apache.catalina.comet;

import org.apache.catalina.comet.TestCometProcessor;

public class MainForTestCometProcessor_testAsyncClose {
	public static void main(String[] args) {
		try {
			new TestCometProcessor().testAsyncClose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}