package org.apache.catalina.realm;

import org.apache.catalina.realm.TestJNDIRealm;

public class MainForTestJNDIRealm_testAuthenticateWithUserPassword {
    public static void main(String[] args) {
        try {
            TestJNDIRealm.setupClass();
            TestJNDIRealm objTestJNDIRealm = new TestJNDIRealm();
            objTestJNDIRealm.testAuthenticateWithUserPassword();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
