package org.apache.catalina.session;

import org.apache.catalina.session.TestStandardSession;

public class MainForTestStandardSession_serializeSkipsNonSerializableAttributes {
    public static void main(String[] args) {
        try {
            TestStandardSession objTestStandardSession = new TestStandardSession();
            objTestStandardSession.serializeSkipsNonSerializableAttributes();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
