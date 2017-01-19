package org.apache.catalina.ha.context;

import org.apache.catalina.ha.context.TestReplicatedContext;

public class MainForTestReplicatedContext_testBug57425 {
    public static void main(String[] args) {
        try {
            TestReplicatedContext.setUpPerTestClass();
            TestReplicatedContext objTestReplicatedContext = new TestReplicatedContext();
            objTestReplicatedContext.setUp();
            objTestReplicatedContext.testBug57425();
            objTestReplicatedContext.tearDown();
            TestReplicatedContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
