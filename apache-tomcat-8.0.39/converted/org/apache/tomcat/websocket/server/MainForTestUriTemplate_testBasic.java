package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestUriTemplate;

public class MainForTestUriTemplate_testBasic {
    public static void main(String[] args) {
        try {
            TestUriTemplate objTestUriTemplate = new TestUriTemplate();
            objTestUriTemplate.testBasic();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
