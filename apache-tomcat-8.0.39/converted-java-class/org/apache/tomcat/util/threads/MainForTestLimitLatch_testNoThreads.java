package org.apache.tomcat.util.threads;

import org.apache.tomcat.util.threads.TestLimitLatch;

public class MainForTestLimitLatch_testNoThreads {
	public static void main(String[] args) {
		try {
			new TestLimitLatch().testNoThreads();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}