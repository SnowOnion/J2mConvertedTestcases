package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TestSynchronizedQueue;

public class MainForTestSynchronizedQueue_testOfferPollOrder {
	public static void main(String[] args) {
		try {
			new TestSynchronizedQueue().testOfferPollOrder();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}