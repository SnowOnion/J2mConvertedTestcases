package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testAllAuthenticatedUsers {
    public static void main(String[] args) {
        try {
            TestRealmBase objTestRealmBase = new TestRealmBase();
            objTestRealmBase.testAllAuthenticatedUsers();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
