package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TestSynchronizedQueue;

public class MainForTestSynchronizedQueue_testOfferPollOrder {
    public static void main(String[] args) {
        try {
            TestSynchronizedQueue objTestSynchronizedQueue = new TestSynchronizedQueue();
            objTestSynchronizedQueue.testOfferPollOrder();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
