package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TestSynchronizedStack;

public class MainForTestSynchronizedStack_testPushPopOrder {
	public static void main(String[] args) {
		try {
			new TestSynchronizedStack().testPushPopOrder();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}