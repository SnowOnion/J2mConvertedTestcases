package org.apache.catalina.session;

import org.apache.catalina.session.TestStandardSession;

public class MainForTestStandardSession_testSerializationEmpty {
    public static void main(String[] args) {
        try {
            TestStandardSession objTestStandardSession = new TestStandardSession();
            objTestStandardSession.testSerializationEmpty();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
