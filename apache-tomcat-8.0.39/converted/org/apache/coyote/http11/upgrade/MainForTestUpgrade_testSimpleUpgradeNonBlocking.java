package org.apache.coyote.http11.upgrade;

import org.apache.coyote.http11.upgrade.TestUpgrade;

public class MainForTestUpgrade_testSimpleUpgradeNonBlocking {
    public static void main(String[] args) {
        try {
            TestUpgrade.setUpPerTestClass();
            TestUpgrade objTestUpgrade = new TestUpgrade();
            objTestUpgrade.setUp();
            objTestUpgrade.testSimpleUpgradeNonBlocking();
            objTestUpgrade.tearDown();
            TestUpgrade.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
