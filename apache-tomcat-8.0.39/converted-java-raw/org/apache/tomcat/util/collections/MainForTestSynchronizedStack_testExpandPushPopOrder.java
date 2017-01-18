package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TestSynchronizedStack;

public class MainForTestSynchronizedStack_testExpandPushPopOrder {
	public static void main(String[] args) {
		try {
			new TestSynchronizedStack().testExpandPushPopOrder();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}