package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestServletDef;

public class MainForTestServletDef_testSetServletNameNull {
    public static void main(String[] args) {
        try {
            TestServletDef objTestServletDef = new TestServletDef();
            objTestServletDef.testSetServletNameNull();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
