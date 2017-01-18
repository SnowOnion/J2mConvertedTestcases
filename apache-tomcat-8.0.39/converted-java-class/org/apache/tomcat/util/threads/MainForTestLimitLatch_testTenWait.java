package org.apache.tomcat.util.threads;

import org.apache.tomcat.util.threads.TestLimitLatch;

public class MainForTestLimitLatch_testTenWait {
	public static void main(String[] args) {
		try {
			new TestLimitLatch().testTenWait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}