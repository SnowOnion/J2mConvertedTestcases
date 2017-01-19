package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationSessionCookieConfig;

public class MainForTestApplicationSessionCookieConfig_testSetNameNotInitPhase {
    public static void main(String[] args) {
        try {
            TestApplicationSessionCookieConfig objTestApplicationSessionCookieConfig = new TestApplicationSessionCookieConfig();
            objTestApplicationSessionCookieConfig.setUp();
            objTestApplicationSessionCookieConfig.testSetNameNotInitPhase();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
