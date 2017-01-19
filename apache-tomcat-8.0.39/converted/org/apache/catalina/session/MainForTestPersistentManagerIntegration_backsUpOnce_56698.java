package org.apache.catalina.session;

import org.apache.catalina.session.TestPersistentManagerIntegration;

public class MainForTestPersistentManagerIntegration_backsUpOnce_56698 {
    public static void main(String[] args) {
        try {
            TestPersistentManagerIntegration.setUpPerTestClass();
            TestPersistentManagerIntegration objTestPersistentManagerIntegration = new TestPersistentManagerIntegration();
            objTestPersistentManagerIntegration.setActivityCheck();
            objTestPersistentManagerIntegration.setUp();
            objTestPersistentManagerIntegration.backsUpOnce_56698();
            objTestPersistentManagerIntegration.resetActivityCheck();
            objTestPersistentManagerIntegration.tearDown();
            TestPersistentManagerIntegration.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
