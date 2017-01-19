package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TestSynchronizedStack;

public class MainForTestSynchronizedStack_testExpandPushPopOrder {
    public static void main(String[] args) {
        try {
            TestSynchronizedStack objTestSynchronizedStack = new TestSynchronizedStack();
            objTestSynchronizedStack.testExpandPushPopOrder();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
