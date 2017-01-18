package org.apache.tomcat.util.threads;

import org.apache.tomcat.util.threads.TestLimitLatch;

public class MainForTestLimitLatch_testOneThreadNoWait {
	public static void main(String[] args) {
		try {
			new TestLimitLatch().testOneThreadNoWait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}