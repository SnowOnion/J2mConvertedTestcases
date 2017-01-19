package org.apache.catalina.session;

import org.apache.catalina.session.TestStandardSession;

public class MainForTestStandardSession_testSerializationSimple03 {
    public static void main(String[] args) {
        try {
            TestStandardSession objTestStandardSession = new TestStandardSession();
            objTestStandardSession.testSerializationSimple03();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
