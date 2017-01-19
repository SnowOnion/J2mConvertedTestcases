package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebXml;

public class MainForTestWebXml_testBug54387c {
    public static void main(String[] args) {
        try {
            TestWebXml objTestWebXml = new TestWebXml();
            objTestWebXml.testBug54387c();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
