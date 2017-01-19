package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testAllAuthenticatedUsersAsAppRoleNoUser {
    public static void main(String[] args) {
        try {
            TestRealmBase objTestRealmBase = new TestRealmBase();
            objTestRealmBase.testAllAuthenticatedUsersAsAppRoleNoUser();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
