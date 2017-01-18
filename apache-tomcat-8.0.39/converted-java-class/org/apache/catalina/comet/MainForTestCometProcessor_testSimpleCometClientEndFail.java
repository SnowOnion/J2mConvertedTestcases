package org.apache.catalina.comet;

import org.apache.catalina.comet.TestCometProcessor;

public class MainForTestCometProcessor_testSimpleCometClientEndFail {
	public static void main(String[] args) {
		try {
			new TestCometProcessor().testSimpleCometClientEndFail();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}