package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testDigestMD5 {
    public static void main(String[] args) {
        try {
            TestRealmBase objTestRealmBase = new TestRealmBase();
            objTestRealmBase.testDigestMD5();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
