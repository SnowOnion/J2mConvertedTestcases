package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TestSynchronizedQueue;

public class MainForTestSynchronizedQueue_testExpandOfferPollOrder {
	public static void main(String[] args) {
		try {
			new TestSynchronizedQueue().testExpandOfferPollOrder();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}