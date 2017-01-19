package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TesterPerformanceSynchronizedQueue;

public class MainForTesterPerformanceSynchronizedQueue_testSynchronizedQueue {
    public static void main(String[] args) {
        try {
            TesterPerformanceSynchronizedQueue objTesterPerformanceSynchronizedQueue = new TesterPerformanceSynchronizedQueue();
            objTesterPerformanceSynchronizedQueue.testSynchronizedQueue();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
