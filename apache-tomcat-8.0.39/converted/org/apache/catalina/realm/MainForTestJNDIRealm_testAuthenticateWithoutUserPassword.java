package org.apache.catalina.realm;

import org.apache.catalina.realm.TestJNDIRealm;

public class MainForTestJNDIRealm_testAuthenticateWithoutUserPassword {
    public static void main(String[] args) {
        try {
            TestJNDIRealm.setupClass();
            TestJNDIRealm objTestJNDIRealm = new TestJNDIRealm();
            objTestJNDIRealm.testAuthenticateWithoutUserPassword();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
