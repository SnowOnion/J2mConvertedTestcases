package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testDigestMD5Prefix {
    public static void main(String[] args) {
        try {
            TestRealmBase objTestRealmBase = new TestRealmBase();
            objTestRealmBase.testDigestMD5Prefix();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
