package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TestSynchronizedStack;

public class MainForTestSynchronizedStack_testLimit {
    public static void main(String[] args) {
        try {
            TestSynchronizedStack objTestSynchronizedStack = new TestSynchronizedStack();
            objTestSynchronizedStack.testLimit();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
