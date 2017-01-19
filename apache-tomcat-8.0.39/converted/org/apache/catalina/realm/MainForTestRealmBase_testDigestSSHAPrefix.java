package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testDigestSSHAPrefix {
    public static void main(String[] args) {
        try {
            TestRealmBase objTestRealmBase = new TestRealmBase();
            objTestRealmBase.testDigestSSHAPrefix();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
