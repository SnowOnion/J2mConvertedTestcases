package org.apache.tomcat.util.threads;

import org.apache.tomcat.util.threads.TestLimitLatch;

public class MainForTestLimitLatch_testOneRelease {
	public static void main(String[] args) {
		try {
			new TestLimitLatch().testOneRelease();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}