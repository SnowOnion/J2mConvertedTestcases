package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationSessionCookieConfig;

public class MainForTestApplicationSessionCookieConfig_testSetPathInitPhase {
    public static void main(String[] args) {
        try {
            TestApplicationSessionCookieConfig objTestApplicationSessionCookieConfig = new TestApplicationSessionCookieConfig();
            objTestApplicationSessionCookieConfig.setUp();
            objTestApplicationSessionCookieConfig.testSetPathInitPhase();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
