package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TesterPerformanceSynchronizedQueue;

public class MainForTesterPerformanceSynchronizedQueue_testConcurrentQueue {
	public static void main(String[] args) {
		try {
			new TesterPerformanceSynchronizedQueue().testConcurrentQueue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}