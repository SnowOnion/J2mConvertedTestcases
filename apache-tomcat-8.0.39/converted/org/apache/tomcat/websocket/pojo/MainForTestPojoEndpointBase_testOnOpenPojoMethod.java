package org.apache.tomcat.websocket.pojo;

import org.apache.tomcat.websocket.pojo.TestPojoEndpointBase;

public class MainForTestPojoEndpointBase_testOnOpenPojoMethod {
    public static void main(String[] args) {
        try {
            TestPojoEndpointBase.setUpPerTestClass();
            TestPojoEndpointBase objTestPojoEndpointBase = new TestPojoEndpointBase();
            objTestPojoEndpointBase.setUp();
            objTestPojoEndpointBase.testOnOpenPojoMethod();
            objTestPojoEndpointBase.tearDown();
            TestPojoEndpointBase.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
