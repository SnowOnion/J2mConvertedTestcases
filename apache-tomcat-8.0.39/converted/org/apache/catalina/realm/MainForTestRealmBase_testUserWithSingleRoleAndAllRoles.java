package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testUserWithSingleRoleAndAllRoles {
    public static void main(String[] args) {
        try {
            TestRealmBase objTestRealmBase = new TestRealmBase();
            objTestRealmBase.testUserWithSingleRoleAndAllRoles();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
