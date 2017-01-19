package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationSessionCookieConfig;

public class MainForTestApplicationSessionCookieConfig_testSetSecureInitPhase {
    public static void main(String[] args) {
        try {
            TestApplicationSessionCookieConfig objTestApplicationSessionCookieConfig = new TestApplicationSessionCookieConfig();
            objTestApplicationSessionCookieConfig.setUp();
            objTestApplicationSessionCookieConfig.testSetSecureInitPhase();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
