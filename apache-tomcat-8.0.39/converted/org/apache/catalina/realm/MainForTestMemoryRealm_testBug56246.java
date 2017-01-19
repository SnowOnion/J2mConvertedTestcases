package org.apache.catalina.realm;

import org.apache.catalina.realm.TestMemoryRealm;

public class MainForTestMemoryRealm_testBug56246 {
    public static void main(String[] args) {
        try {
            TestMemoryRealm objTestMemoryRealm = new TestMemoryRealm();
            objTestMemoryRealm.testBug56246();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
