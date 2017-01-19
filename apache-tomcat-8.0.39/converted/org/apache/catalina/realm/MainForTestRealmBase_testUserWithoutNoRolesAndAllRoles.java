package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testUserWithoutNoRolesAndAllRoles {
    public static void main(String[] args) {
        try {
            TestRealmBase objTestRealmBase = new TestRealmBase();
            objTestRealmBase.testUserWithoutNoRolesAndAllRoles();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
