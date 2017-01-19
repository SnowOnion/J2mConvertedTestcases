package org.apache.catalina.tribes.membership;

import org.apache.catalina.tribes.membership.TestMemberImplSerialization;

public class MainForTestMemberImplSerialization_testCompare {
    public static void main(String[] args) {
        try {
            TestMemberImplSerialization objTestMemberImplSerialization = new TestMemberImplSerialization();
            objTestMemberImplSerialization.setUp();
            objTestMemberImplSerialization.testCompare();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
