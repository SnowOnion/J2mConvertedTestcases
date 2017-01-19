package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testAllAuthenticatedUsersAsAppRoleWithUser {
    public static void main(String[] args) {
        try {
            TestRealmBase objTestRealmBase = new TestRealmBase();
            objTestRealmBase.testAllAuthenticatedUsersAsAppRoleWithUser();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
