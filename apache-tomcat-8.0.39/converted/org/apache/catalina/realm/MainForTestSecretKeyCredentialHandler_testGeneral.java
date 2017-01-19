package org.apache.catalina.realm;

import org.apache.catalina.realm.TestSecretKeyCredentialHandler;

public class MainForTestSecretKeyCredentialHandler_testGeneral {
    public static void main(String[] args) {
        try {
            TestSecretKeyCredentialHandler objTestSecretKeyCredentialHandler = new TestSecretKeyCredentialHandler();
            objTestSecretKeyCredentialHandler.testGeneral();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
