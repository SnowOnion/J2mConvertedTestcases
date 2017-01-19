package org.apache.catalina.security;

import org.apache.catalina.security.TestSecurityClassLoad;

public class MainForTestSecurityClassLoad_testLoad {
    public static void main(String[] args) {
        try {
            TestSecurityClassLoad objTestSecurityClassLoad = new TestSecurityClassLoad();
            objTestSecurityClassLoad.testLoad();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
