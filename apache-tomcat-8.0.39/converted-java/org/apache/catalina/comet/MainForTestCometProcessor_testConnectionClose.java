package org.apache.catalina.comet;

import org.apache.catalina.comet.TestCometProcessor;

public class MainForTestCometProcessor_testConnectionClose {
	public static void main(String[] args) {
		try {
			new TestCometProcessor().testConnectionClose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}