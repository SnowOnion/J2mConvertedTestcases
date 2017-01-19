package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TestSynchronizedQueue;

public class MainForTestSynchronizedQueue_testExpandOfferPollOrder2 {
    public static void main(String[] args) {
        try {
            TestSynchronizedQueue objTestSynchronizedQueue = new TestSynchronizedQueue();
            objTestSynchronizedQueue.testExpandOfferPollOrder2();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
