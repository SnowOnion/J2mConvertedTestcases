package org.apache.catalina.comet;

import org.apache.catalina.comet.TestCometProcessor;

public class MainForTestCometProcessor_testSimpleCometClientBeginFail {
	public static void main(String[] args) {
		try {
			new TestCometProcessor().testSimpleCometClientBeginFail();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}