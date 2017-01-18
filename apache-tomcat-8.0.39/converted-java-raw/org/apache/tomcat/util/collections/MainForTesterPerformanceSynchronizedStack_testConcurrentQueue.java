package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TesterPerformanceSynchronizedStack;

public class MainForTesterPerformanceSynchronizedStack_testConcurrentQueue {
	public static void main(String[] args) {
		try {
			new TesterPerformanceSynchronizedStack().testConcurrentQueue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}