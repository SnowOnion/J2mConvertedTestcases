package org.apache.catalina.comet;

import org.apache.catalina.comet.TestCometProcessor;

public class MainForTestCometProcessor_testSimpleCometClient {
	public static void main(String[] args) {
		try {
			new TestCometProcessor().testSimpleCometClient();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}