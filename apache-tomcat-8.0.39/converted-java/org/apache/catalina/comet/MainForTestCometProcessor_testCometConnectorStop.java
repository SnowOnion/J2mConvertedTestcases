package org.apache.catalina.comet;

import org.apache.catalina.comet.TestCometProcessor;

public class MainForTestCometProcessor_testCometConnectorStop {
	public static void main(String[] args) {
		try {
			new TestCometProcessor().testCometConnectorStop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}