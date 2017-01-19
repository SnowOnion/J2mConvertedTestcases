package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testUserWithSingleRole {
    public static void main(String[] args) {
        try {
            TestRealmBase objTestRealmBase = new TestRealmBase();
            objTestRealmBase.testUserWithSingleRole();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
