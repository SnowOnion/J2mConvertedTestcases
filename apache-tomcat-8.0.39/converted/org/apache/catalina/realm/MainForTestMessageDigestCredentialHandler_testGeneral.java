package org.apache.catalina.realm;

import org.apache.catalina.realm.TestMessageDigestCredentialHandler;

public class MainForTestMessageDigestCredentialHandler_testGeneral {
    public static void main(String[] args) {
        try {
            TestMessageDigestCredentialHandler objTestMessageDigestCredentialHandler = new TestMessageDigestCredentialHandler();
            objTestMessageDigestCredentialHandler.testGeneral();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
