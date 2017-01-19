package org.apache.catalina.session;

import org.apache.catalina.session.TestPersistentManager;

public class MainForTestPersistentManager_testMinIdleSwap {
    public static void main(String[] args) {
        try {
            TestPersistentManager objTestPersistentManager = new TestPersistentManager();
            objTestPersistentManager.testMinIdleSwap();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
