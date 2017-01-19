package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testHttpConstraint {
    public static void main(String[] args) {
        try {
            TestRealmBase objTestRealmBase = new TestRealmBase();
            objTestRealmBase.testHttpConstraint();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
