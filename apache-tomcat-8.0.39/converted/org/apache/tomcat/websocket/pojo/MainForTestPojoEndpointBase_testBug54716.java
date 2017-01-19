package org.apache.tomcat.websocket.pojo;

import org.apache.tomcat.websocket.pojo.TestPojoEndpointBase;

public class MainForTestPojoEndpointBase_testBug54716 {
    public static void main(String[] args) {
        try {
            TestPojoEndpointBase.setUpPerTestClass();
            TestPojoEndpointBase objTestPojoEndpointBase = new TestPojoEndpointBase();
            objTestPojoEndpointBase.setUp();
            objTestPojoEndpointBase.testBug54716();
            objTestPojoEndpointBase.tearDown();
            TestPojoEndpointBase.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
