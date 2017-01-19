package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testNoAuthConstraint {
    public static void main(String[] args) {
        try {
            TestRealmBase objTestRealmBase = new TestRealmBase();
            objTestRealmBase.testNoAuthConstraint();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
