package org.apache.tomcat.util.collections;

import org.apache.tomcat.util.collections.TestSynchronizedStack;

public class MainForTestSynchronizedStack_testPopEmpty {
    public static void main(String[] args) {
        try {
            TestSynchronizedStack objTestSynchronizedStack = new TestSynchronizedStack();
            objTestSynchronizedStack.testPopEmpty();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
