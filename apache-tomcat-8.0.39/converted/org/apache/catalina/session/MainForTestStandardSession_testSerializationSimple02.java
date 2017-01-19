package org.apache.catalina.session;

import org.apache.catalina.session.TestStandardSession;

public class MainForTestStandardSession_testSerializationSimple02 {
    public static void main(String[] args) {
        try {
            TestStandardSession objTestStandardSession = new TestStandardSession();
            objTestStandardSession.testSerializationSimple02();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
