package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebXml;

public class MainForTestWebXml_testValidateVersion24 {
    public static void main(String[] args) {
        try {
            TestWebXml objTestWebXml = new TestWebXml();
            objTestWebXml.testValidateVersion24();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
