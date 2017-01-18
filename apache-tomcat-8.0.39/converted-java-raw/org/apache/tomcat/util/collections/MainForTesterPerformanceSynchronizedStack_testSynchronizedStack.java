package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TesterPerformanceSynchronizedStack;

public class MainForTesterPerformanceSynchronizedStack_testSynchronizedStack {
	public static void main(String[] args) {
		try {
			new TesterPerformanceSynchronizedStack().testSynchronizedStack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}