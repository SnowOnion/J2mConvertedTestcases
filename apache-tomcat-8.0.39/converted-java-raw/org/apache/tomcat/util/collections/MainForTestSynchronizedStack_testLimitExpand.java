package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TestSynchronizedStack;

public class MainForTestSynchronizedStack_testLimitExpand {
	public static void main(String[] args) {
		try {
			new TestSynchronizedStack().testLimitExpand();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}