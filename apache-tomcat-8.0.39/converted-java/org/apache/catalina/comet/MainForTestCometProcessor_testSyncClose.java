package org.apache.catalina.comet;

import org.apache.catalina.comet.TestCometProcessor;

public class MainForTestCometProcessor_testSyncClose {
	public static void main(String[] args) {
		try {
			new TestCometProcessor().testSyncClose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}