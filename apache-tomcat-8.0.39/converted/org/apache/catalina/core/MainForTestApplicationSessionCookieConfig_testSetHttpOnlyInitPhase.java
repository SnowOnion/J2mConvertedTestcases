package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationSessionCookieConfig;

public class MainForTestApplicationSessionCookieConfig_testSetHttpOnlyInitPhase {
    public static void main(String[] args) {
        try {
            TestApplicationSessionCookieConfig objTestApplicationSessionCookieConfig = new TestApplicationSessionCookieConfig();
            objTestApplicationSessionCookieConfig.setUp();
            objTestApplicationSessionCookieConfig.testSetHttpOnlyInitPhase();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
