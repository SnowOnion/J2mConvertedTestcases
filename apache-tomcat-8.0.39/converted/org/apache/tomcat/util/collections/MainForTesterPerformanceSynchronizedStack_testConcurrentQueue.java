package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TesterPerformanceSynchronizedStack;

public class MainForTesterPerformanceSynchronizedStack_testConcurrentQueue {
    public static void main(String[] args) {
        try {
            TesterPerformanceSynchronizedStack objTesterPerformanceSynchronizedStack = new TesterPerformanceSynchronizedStack();
            objTesterPerformanceSynchronizedStack.testConcurrentQueue();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
