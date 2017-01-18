package org.apache.catalina.comet;

import org.apache.catalina.comet.TestCometProcessor;

public class MainForTestCometProcessor_testSimpleCometClientReadFail {
	public static void main(String[] args) {
		try {
			new TestCometProcessor().testSimpleCometClientReadFail();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}