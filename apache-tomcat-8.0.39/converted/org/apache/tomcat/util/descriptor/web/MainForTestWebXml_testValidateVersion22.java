package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebXml;

public class MainForTestWebXml_testValidateVersion22 {
    public static void main(String[] args) {
        try {
            TestWebXml objTestWebXml = new TestWebXml();
            objTestWebXml.testValidateVersion22();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
