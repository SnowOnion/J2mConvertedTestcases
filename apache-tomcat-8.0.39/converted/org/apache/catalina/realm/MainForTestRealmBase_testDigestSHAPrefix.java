package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testDigestSHAPrefix {
    public static void main(String[] args) {
        try {
            TestRealmBase objTestRealmBase = new TestRealmBase();
            objTestRealmBase.testDigestSHAPrefix();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
