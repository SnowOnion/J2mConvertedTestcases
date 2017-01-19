package org.apache.tomcat.websocket.pojo;

import org.apache.tomcat.websocket.pojo.TestPojoMethodMapping;

public class MainForTestPojoMethodMapping_test {
    public static void main(String[] args) {
        try {
            TestPojoMethodMapping.setUpPerTestClass();
            TestPojoMethodMapping objTestPojoMethodMapping = new TestPojoMethodMapping();
            objTestPojoMethodMapping.setUp();
            objTestPojoMethodMapping.test();
            objTestPojoMethodMapping.tearDown();
            TestPojoMethodMapping.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
