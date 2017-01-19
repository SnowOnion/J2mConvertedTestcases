package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testUserWithNoRoles {
    public static void main(String[] args) {
        try {
            TestRealmBase objTestRealmBase = new TestRealmBase();
            objTestRealmBase.testUserWithNoRoles();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
