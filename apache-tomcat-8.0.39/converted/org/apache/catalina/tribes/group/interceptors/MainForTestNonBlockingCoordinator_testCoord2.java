package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestNonBlockingCoordinator;

public class MainForTestNonBlockingCoordinator_testCoord2 {
    public static void main(String[] args) {
        try {
            TestNonBlockingCoordinator objTestNonBlockingCoordinator = new TestNonBlockingCoordinator();
            objTestNonBlockingCoordinator.setUp();
            objTestNonBlockingCoordinator.testCoord2();
            objTestNonBlockingCoordinator.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
