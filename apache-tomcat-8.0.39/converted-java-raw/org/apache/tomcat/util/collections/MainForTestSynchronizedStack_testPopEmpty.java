package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TestSynchronizedStack;

public class MainForTestSynchronizedStack_testPopEmpty {
	public static void main(String[] args) {
		try {
			new TestSynchronizedStack().testPopEmpty();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}