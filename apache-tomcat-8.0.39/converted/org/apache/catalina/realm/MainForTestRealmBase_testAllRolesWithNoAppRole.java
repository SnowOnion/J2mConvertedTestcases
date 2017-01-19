package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testAllRolesWithNoAppRole {
    public static void main(String[] args) {
        try {
            TestRealmBase objTestRealmBase = new TestRealmBase();
            objTestRealmBase.testAllRolesWithNoAppRole();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
