package org.apache.catalina.session;

import org.apache.catalina.session.TestPersistentManagerIntegration;

public class MainForTestPersistentManagerIntegration_noSessionCreate_57637 {
    public static void main(String[] args) {
        try {
            TestPersistentManagerIntegration.setUpPerTestClass();
            TestPersistentManagerIntegration objTestPersistentManagerIntegration = new TestPersistentManagerIntegration();
            objTestPersistentManagerIntegration.setActivityCheck();
            objTestPersistentManagerIntegration.setUp();
            objTestPersistentManagerIntegration.noSessionCreate_57637();
            objTestPersistentManagerIntegration.resetActivityCheck();
            objTestPersistentManagerIntegration.tearDown();
            TestPersistentManagerIntegration.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
